package net.minecraft.src;

import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import net.minecraft.server.MinecraftServer;

public class FCAddOnHandler
{
    public static List m_ModList = new LinkedList();
    public static boolean m_bModsInitialized = false;
    public static final Logger m_Logger = Logger.getLogger("BetterThanWolves");
    private static final File m_LogFile = new File(new File("."), "BTWLog.txt");
    private static FileHandler m_LogFileHandler = null;

    public static void AddMod(FCAddOn var0)
    {
        m_ModList.add(var0);
    }

    public static void InitializeMods()
    {
        if (!m_bModsInitialized)
        {
            InitializeLogger();
            LogMessage("...Add-On Handler Initializing...");
            PreInitializeMods();
            Iterator var0 = m_ModList.iterator();

            while (var0.hasNext())
            {
                FCAddOn var1 = (FCAddOn)var0.next();
                var1.Initialize();
            }

            PostInitializeMods();
            m_bModsInitialized = true;
            OnLanguageLoaded(StringTranslate.getInstance());
            LogMessage("...Add-On Handler Initialization Complete...");
        }
    }

    public static void InitializeLogger()
    {
        try
        {
            if ((m_LogFile.exists() || m_LogFile.createNewFile()) && m_LogFile.canWrite())
            {
                m_LogFileHandler = new FileHandler(m_LogFile.getPath());
                m_LogFileHandler.setFormatter(new SimpleFormatter());
                m_Logger.addHandler(m_LogFileHandler);
                m_Logger.setLevel(Level.FINE);
            }
        }
        catch (Throwable var1)
        {
            throw new RuntimeException(var1);
        }
    }

    public static void LogMessage(String var0)
    {
        System.out.println(var0);

        if (MinecraftServer.getServer() != null)
        {
            MinecraftServer.getServer().getLogAgent().func_98233_a(var0);
        }

        m_Logger.fine(var0);
    }

    public static void LogWarning(String var0)
    {
        System.out.println(var0);

        if (MinecraftServer.getServer() != null)
        {
            MinecraftServer.getServer().getLogAgent().func_98236_b(var0);
        }

        m_Logger.fine(var0);
    }

    public static void PreInitializeMods()
    {
        Iterator var0 = m_ModList.iterator();

        while (var0.hasNext())
        {
            FCAddOn var1 = (FCAddOn)var0.next();
            var1.PreInitialize();
        }
    }

    public static void PostInitializeMods()
    {
        Iterator var0 = m_ModList.iterator();

        while (var0.hasNext())
        {
            FCAddOn var1 = (FCAddOn)var0.next();
            var1.PostInitialize();
        }
    }

    public static void OnLanguageLoaded(StringTranslate var0)
    {
        if (m_bModsInitialized)
        {
            Iterator var1 = m_ModList.iterator();

            while (var1.hasNext())
            {
                FCAddOn var2 = (FCAddOn)var1.next();
                var2.OnLanguageLoaded(var0);
                String var3 = var2.GetLanguageFilePrefix();

                if (var3 != null)
                {
                    LogMessage("...Add-On Handler Loading Custom Language File With Prefix: " + var3 + "...");
                    var0.LoadAddonLanguageExtension(var3);
                }
            }
        }
    }
}
