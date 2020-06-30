package net.minecraft.src;

public class FCBlockChunkOreStorageGold extends FCBlockChunkOreStorage
{
    protected FCBlockChunkOreStorageGold(int var1)
    {
        super(var1);
        this.setUnlocalizedName("fcBlockChunkOreStorageGold");
    }

    public boolean DropComponentItemsOnBadBreak(World var1, int var2, int var3, int var4, int var5, float var6)
    {
        this.DropItemsIndividualy(var1, var2, var3, var4, FCBetterThanWolves.fcItemChunkGoldOre.itemID, 9, 0, var6);
        return true;
    }

    public int GetItemIndexDroppedWhenCookedByKiln(IBlockAccess var1, int var2, int var3, int var4)
    {
        return Item.ingotGold.itemID;
    }
}
