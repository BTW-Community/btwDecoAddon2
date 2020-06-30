package net.minecraft.src;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.server.MinecraftServer;

public class FCBetterThanWolves extends FCAddOn
{
    public static final String fcVersionString = "4.B0000002";
    public static FCBetterThanWolves m_instance = new FCBetterThanWolves();
    public static final Material fcMaterialCement = new FCMaterialCement(MapColor.stoneColor);
    public static final Material fcMaterialSoulforgedSteel = new FCMaterialSoulforgedSteel(MapColor.ironColor);
    public static final Material fcMaterialNetherGrowth = (new FCMaterialNetherGrowth(MapColor.foliageColor)).SetMobsCantSpawnOn();
    public static final Material fcMaterialCandle = (new MaterialLogic(MapColor.airColor)).setNoPushMobility();
    public static final Material fcMaterialMiscellaneous = new Material(MapColor.dirtColor);
    public static final Material fcMaterialLog = (new Material(MapColor.woodColor)).setBurning().setRequiresTool().SetMobsCantSpawnOn();
    public static final Material fcMaterialPlanks = (new Material(MapColor.woodColor)).setBurning().setRequiresTool().SetMobsCantSpawnOn();
    public static final Material fcMaterialAsh = (new MaterialLogic(MapColor.stoneColor)).setReplaceable().setTranslucent().setRequiresTool().setNoPushMobility();
    public static final Material fcMaterialNaturalClay = (new Material(MapColor.clayColor)).setRequiresTool();
    public static final Material fcMaterialWicker = (new Material(MapColor.woodColor)).setBurning().SetAxesEfficientOn();
    public static final Material fcMaterialBasket = (new Material(MapColor.woodColor)).setNoPushMobility();
    public static final Material fcMaterialMilk = (new MaterialLogic(MapColor.snowColor)).setReplaceable().setTranslucent().setRequiresTool().setNoPushMobility();
    public static final Material fcMaterialNetherRock = (new Material(MapColor.stoneColor)).setRequiresTool().SetNetherMobsCanSpawnOn();
    public static Block fcBlockSlabSandAndGravel;
    public static Block fcBlockArcaneVessel;
    public static Block fcBlockAxlePowerSource;
    public static Block fcBlockSidingAndCornerBlackStone;
    public static Block fcBlockMouldingAndDecorativeBlackStone;
    public static Block fcBlockAestheticOpaqueEarth;
    public static Block fcBlockCandle;
    public static Block fcBlockSandstoneSidingAndCorner;
    public static Block fcBlockSandstoneMouldingAndDecorative;
    public static Block fcBlockWoodOakSidingAndCorner;
    public static Block fcBlockSmoothStoneSidingAndCorner;
    public static Block fcBlockBrickSidingAndCorner;
    public static Block fcBlockBrickMouldingAndDecorative;
    public static Block fcBlockNetherBrickSidingAndCorner;
    public static Block fcBlockNetherBrickMouldingAndDecorative;
    public static Block fcBlockWhiteStoneStairs;
    public static Block fcBlockWhiteStoneSidingAndCorner;
    public static Block fcBlockWhiteStoneMouldingAndDecorative;
    public static Block fcBlockStakeString;
    public static Block fcBlockStake;
    public static Block fcBlockScrewPump;
    public static Block fcBlockWoodSpruceSidingAndCorner;
    public static Block fcBlockWoodSpruceMouldingAndDecorative;
    public static Block fcBlockWoodBirchSidingAndCorner;
    public static Block fcBlockWoodBirchMouldingAndDecorative;
    public static Block fcBlockWoodJungleSidingAndCorner;
    public static Block fcBlockWoodJungleMouldingAndDecorative;
    public static Block fcBlockStoneBrickSidingAndCorner;
    public static Block fcBlockStoneBrickMouldingAndDecorative;
    public static Block fcBlockFarmlandLegacyFertilized;
    public static Block fcBlockWoolSlabTop;
    public static FCBlockDirtSlab fcBlockDirtSlab;
    public static Block fcBlockBloodMoss;
    public static Block fcInfernalEnchanter;
    public static Block fcSoulforgedSteelBlock;
    public static Block fcBlockDetectorGlowingLogic;
    public static Block fcBlockBloodLeaves;
    public static Block fcBloodWood;
    public static Block fcAestheticVegetation;
    public static Block fcBlockSmoothStoneMouldingAndDecorative;
    public static Block fcAestheticOpaque;
    public static Block fcAestheticNonOpaque;
    public static Block fcBlockMiningCharge;
    public static Block fcBuddyBlock;
    public static FCBlockKiln fcKiln;
    public static Block fcWoolSlab;
    public static Block fcAnvil;
    public static Block fcLightBulbOff;
    public static Block fcLightBulbOn;
    public static FCBlockBBQ fcBBQ;
    public static Block fcHopper;
    public static Block fcSaw;
    public static Block fcPlatform;
    public static Block fcCement;
    public static Block fcPulley;
    public static Block fcBlockPressurePlateSoulforgedSteel;
    public static Block fcBlockWoodOakMouldingAndDecorative;
    public static Block fcBlockLegacySmoothstoneAndOakCorner;
    public static FCBlockBlockDispenser fcBlockDispenser;
    public static Block fcCauldron;
    public static Block fcDetectorRailWood;
    public static Block fcBlockDetectorRailSoulforgedSteel;
    public static Block fcCompanionCube;
    public static Block fcBlockDetector;
    public static Block fcBlockDetectorLogic;
    public static Block fcLens;
    public static Block fcBlockHempCrop;
    public static Block fcHandCrank;
    public static Block fcMillStone;
    public static Block fcAnchor;
    public static Block fcRopeBlock;
    public static Block fcBlockLegacySmoothstoneAndOakSiding;
    public static Block fcBlockAxle;
    public static FCBlockRedstoneClutch fcBlockRedstoneClutch;
    public static Block fcTurntable;
    public static Block fcBellows;
    public static Block fcBlockFireStoked;
    public static Block fcUnfiredPottery;
    public static Block fcCrucible;
    public static Block fcPlanter;
    public static Block fcVase;
    public static Block fcBlockRottenFlesh;
    public static Block fcBlockShaft;
    public static Block fcBlockSoulforgeDormant;
    public static Block fcBlockSmoothstoneStairs;
    public static Block fcBlockRottenFleshSlab;
    public static Block fcBlockBoneSlab;
    public static Block fcBlockPumpkinFresh;
    public static Block fcBlockWoodBloodSidingAndCorner;
    public static Block fcBlockWoodBloodMouldingAndDecorative;
    public static Block fcBlockWoodBloodStairs;
    public static FCBlockLogDamaged fcBlockLogDamaged;
    public static Block fcBlockDirtLoose;
    public static Block fcBlockDirtLooseSlab;
    public static FCBlockCampfire fcBlockCampfireUnlit;
    public static FCBlockCampfire fcBlockCampfireSmall;
    public static FCBlockCampfire fcBlockCampfireMedium;
    public static FCBlockCampfire fcBlockCampfireLarge;
    public static FCBlockUnfiredBrick fcBlockUnfiredBrick;
    public static Block fcBlockCookedBrick;
    public static Block fcBlockBrickLoose;
    public static Block fcBlockBrickLooseSlab;
    public static Block fcBlockCobblestoneLoose;
    public static Block fcBlockCobblestoneLooseSlab;
    public static Block fcBlockFurnaceBrickIdle;
    public static Block fcBlockFurnaceBrickBurning;
    public static Block fcBlockTorchFiniteUnlit;
    public static Block fcBlockTorchFiniteBurning;
    public static Block fcBlockStoneRough;
    public static Block fcBlockStoneRoughMidStrata;
    public static Block fcBlockStoneRoughDeepStrata;
    public static Block fcBlockWorkStump;
    public static FCBlockBasketWicker fcBlockBasketWicker;
    public static FCBlockLogSpike fcBlockLogSpike;
    public static Block fcBlockTorchNetherUnlit;
    public static Block fcBlockWorkbench;
    public static Block fcBlockChest;
    public static Block fcBlockDoorWood;
    public static Block fcBlockWeb;
    public static Block fcBlockUnfiredClay;
    public static Block fcBlockMyceliumSlab;
    public static FCBlockToolPlaced fcBlockToolPlaced;
    public static Block fcBlockBrickLooseStairs;
    public static Block fcBlockCobblestoneLooseStairs;
    public static FCBlockLogSmouldering fcBlockLogSmouldering;
    public static FCBlockWoodCinders fcBlockWoodCinders;
    public static FCBlockStumpCharred fcBlockStumpCharred;
    public static Block fcBlockAshGroundCover;
    public static FCBlockSnowLoose fcBlockSnowLoose;
    public static FCBlockSnowLooseSlab fcBlockSnowLooseSlab;
    public static FCBlockSnowSolid fcBlockSnowSolid;
    public static FCBlockSnowSolidSlab fcBlockSnowSolidSlab;
    public static FCBlockLadder fcBlockLadder;
    public static FCBlockLadderOnFire fcBlockLadderOnFire;
    public static FCBlockShovel fcBlockShovel;
    public static FCBlockHamper fcBlockHamper;
    public static FCBlockCreeperOysters fcBlockCreeperOysters;
    public static FCBlockCreeperOystersSlab fcBlockCreeperOystersSlab;
    public static FCBlockTorchNetherBurning fcBlockTorchNetherBurning;
    public static FCBlockBucket fcBlockBucketEmpty;
    public static FCBlockBucketWater fcBlockBucketWater;
    public static FCBlockBucketCement fcBlockBucketCement;
    public static FCBlockBucketMilk fcBlockBucketMilk;
    public static FCBlockBucketMilkChocolate fcBlockBucketMilkChocolate;
    public static FCBlockMilk fcBlockMilk;
    public static FCBlockMilkChocolate fcBlockMilkChocolate;
    public static FCBlockGearBox fcBlockGearBox;
    public static FCBlockSpike fcBlockSpikeIron;
    public static FCBlockLightningRod fcBlockLightningRod;
    public static FCBlockChunkOreIron fcBlockChunkOreIron;
    public static FCBlockChunkOreGold fcBlockChunkOreGold;
    public static Block fcBlockStoneBrickLoose;
    public static Block fcBlockStoneBrickLooseSlab;
    public static Block fcBlockStoneBrickLooseStairs;
    public static Block fcBlockNetherBrickLoose;
    public static Block fcBlockNetherBrickLooseSlab;
    public static Block fcBlockNetherBrickLooseStairs;
    public static FCBlockNetherrackFalling fcBlockNetherrackFalling;
    public static FCBlockLavaPillow fcBlockLavaPillow;
    public static FCBlockMushroomCap fcBlockMushroomCapBrown;
    public static FCBlockMushroomCap fcBlockMushroomCapRed;
    public static FCBlockChunkOreStorageIron fcBlockChunkOreStorageIron;
    public static FCBlockChunkOreStorageGold fcBlockChunkOreStorageGold;
    public static FCBlockWicker fcBlockWicker;
    public static FCBlockWickerSlab fcBlockWickerSlab;
    public static FCBlockWickerPane fcBlockWickerPane;
    public static FCBlockGrate fcBlockGrate;
    public static FCBlockSlats fcBlockSlats;
    public static FCBlockFarmland fcBlockFarmland;
    public static FCBlockFarmlandFertilized fcBlockFarmlandFertilized;
    public static FCBlockWheatCrop fcBlockWheatCrop;
    public static FCBlockWheatCropTop fcBlockWheatCropTop;
    public static FCBlockWeeds fcBlockWeeds;
    public static FCBlockPlanterSoil fcBlockPlanterSoil;
    public static Item fcItemBucketCement;
    public static Item fcItemWolfRaw;
    public static Item fcItemWolfCooked;
    public static Item fcItemNethercoal;
    public static Item fcItemHempSeeds;
    public static Item fcItemHemp;
    public static Item fcItemGear;
    public static Item fcItemFlour;
    public static Item fcItemHempFibers;
    public static Item fcItemScouredLeather;
    public static Item fcItemDonut;
    public static Item fcItemRope;
    public static Item fcItemSlatsOld;
    public static Item fcItemDung;
    public static Item fcItemWaterWheel;
    public static Item fcItemWindMillBlade;
    public static Item fcItemWindMill;
    public static Item fcItemHempCloth;
    public static Item fcItemGrateOld;
    public static Item fcItemWickerPaneOld;
    public static Item fcItemTannedLeather;
    public static Item fcItemStrap;
    public static Item fcItemBelt;
    public static Item fcItemFoulFood;
    public static Item fcItemWoodBlade;
    public static Item fcItemGlue;
    public static Item fcItemTallow;
    public static Item fcItemHaft;
    public static Item fcItemSteel;
    public static Item fcItemRefinedPickAxe;
    public static Item fcItemRefinedShovel;
    public static Item fcItemRefinedHoe;
    public static Item fcItemBattleAxe;
    public static Item fcItemRefinedSword;
    public static Item fcItemGroundNetherrack;
    public static Item fcItemHellfireDust;
    public static Item fcItemConcentratedHellfire;
    public static Item fcItemArmorPlate;
    public static Item fcItemPlateHelm;
    public static Item fcItemPlateBreastPlate;
    public static Item fcItemPlateLeggings;
    public static Item fcItemPlateBoots;
    public static Item fcItemCompositeBow;
    public static Item fcItemBroadheadArrowhead;
    public static Item fcItemBroadheadArrow;
    public static Item fcItemCoalDust;
    public static Item fcItemPadding;
    public static Item fcItemFilament;
    public static Item fcItemPolishedLapis;
    public static Item fcItemUrn;
    public static Item fcItemSoulUrn;
    public static Item fcItemHardBoiledEgg;
    public static Item fcItemPotash;
    public static Item fcItemSoap;
    public static Item fcItemSawDust;
    public static Item fcItemArmorGimpHelm;
    public static Item fcItemArmorGimpChest;
    public static Item fcItemArmorGimpLeggings;
    public static Item fcItemArmorGimpBoots;
    public static Item fcItemDynamite;
    public static Item fcItemBreedingHarness;
    public static Item fcItemSoulDust;
    public static Item fcItemMattock;
    public static Item fcItemRefinedAxe;
    public static Item fcItemNetherSludge;
    public static Item fcItemNetherBrick;
    public static Item fcItemTuningFork;
    public static Item fcItemArcaneScroll;
    public static Item fcItemCandle;
    public static Item fcItemBloodMossSpores;
    public static Item fcItemMould;
    public static Item fcItemCanvas;
    public static Item fcItemDogFood;
    public static Item fcItemRawEgg;
    public static Item fcItemFriedEgg;
    public static Item fcItemScrew;
    public static Item fcItemRottenArrow;
    public static Item fcItemOcularOfEnder;
    public static Item fcItemEnderSpectacles;
    public static Item fcItemStake;
    public static Item fcItemBrimstone;
    public static Item fcItemNitre;
    public static Item fcItemElement;
    public static Item fcItemFuse;
    public static Item fcItemBlastingOil;
    public static Item fcItemWindMillVertical;
    public static Item fcItemBoiledPotato;
    public static Item fcItemMuttonRaw;
    public static Item fcItemMuttonCooked;
    public static Item fcItemWitchWart;
    public static Item fcItemCookedCarrot;
    public static Item fcItemTastySandwich;
    public static Item fcItemSteakAndPotatoes;
    public static Item fcItemHamAndEggs;
    public static Item fcItemSteakDinner;
    public static Item fcItemPorkDinner;
    public static Item fcItemWolfDinner;
    public static Item fcItemRawKebab;
    public static Item fcItemCookedKebab;
    public static Item fcItemChickenSoup;
    public static Item fcItemFishSoup;
    public static Item fcItemHeartyStew;
    public static Item fcItemMushroomRed;
    public static Item fcItemMushroomBrown;
    public static Item fcItemNuggetIron;
    public static Item fcItemMail;
    public static Item fcItemRawMysteryMeat;
    public static Item fcItemCookedMysteryMeat;
    public static Item fcItemRawMushroomOmelet;
    public static Item fcItemCookedMushroomOmelet;
    public static Item fcItemRawScrambledEggs;
    public static Item fcItemCookedScrambledEggs;
    public static Item fcItemCreeperOysters;
    public static Item fcItemArmorWoolHelm;
    public static Item fcItemArmorWoolChest;
    public static Item fcItemArmorWoolLeggings;
    public static Item fcItemArmorWoolBoots;
    public static Item fcItemArmorPaddedHelm;
    public static Item fcItemArmorPaddedChest;
    public static Item fcItemArmorPaddedLeggings;
    public static Item fcItemArmorPaddedBoots;
    public static Item fcItemArmorTannedHelm;
    public static Item fcItemArmorTannedChest;
    public static Item fcItemArmorTannedLeggings;
    public static Item fcItemArmorTannedBoots;
    public static Item fcItemIngotDiamond;
    public static Item fcItemLeatherCut;
    public static Item fcItemTannedLeatherCut;
    public static Item fcItemScouredLeatherCut;
    public static Item fcItemFishingRodBaited;
    public static Item fcItemPileDirt;
    public static Item fcItemPileSand;
    public static Item fcItemPileGravel;
    public static Item fcItemBatWing;
    public static Item fcItemGoldenDung;
    public static Item fcItemBark;
    public static Item fcItemPileSoulSand;
    public static Item fcItemRedstoneLatch;
    public static Item fcItemNuggetSteel;
    public static Item fcItemWool;
    public static Item fcItemCocoaBeans;
    public static Item fcItemChocolate;
    public static Item fcItemBucketMilkChocolate;
    public static Item fcItemSoulFlux;
    public static Item fcItemEnderSlag;
    public static Item fcItemPastryUncookedCake;
    public static Item fcItemPastryUncookedCookies;
    public static Item fcItemPastryUncookedPumpkinPie;
    public static Item fcItemMysteriousGland;
    public static Item fcItemBeastLiverRaw;
    public static Item fcItemBeastLiverCooked;
    public static Item fcItemAncientProphecy;
    public static Item fcItemStumpRemover;
    public static Item fcItemChiselWood;
    public static Item fcItemStone;
    public static Item fcItemChiselStone;
    public static Item fcItemClubWood;
    public static Item fcItemFireStarterSticks;
    public static Item fcItemFireStarterBow;
    public static Item fcItemChunkIronOre;
    public static Item fcItemPileIronOre;
    public static Item fcItemChiselIron;
    public static Item fcItemChunkGoldOre;
    public static Item fcItemPileGoldOre;
    public static Item fcItemWickerPiece;
    public static Item fcItemKnittingNeedles;
    public static Item fcItemKnitting;
    public static Item fcItemWoolKnit;
    public static Item fcItemClubBone;
    public static Item fcItemMeatCured;
    public static Item fcItemMetalFragment;
    public static Item fcItemPileClay;
    public static Item fcItemMeatBurned;
    public static Item fcItemChickenFeed;
    public static Item fcItemFishHookBone;
    public static Item fcItemCarvingBone;
    public static Item fcItemStoneBrick;
    public static Item fcItemWickerWeaving;
    public static Item fcItemWheat;
    public static Item fcItemWheatSeeds;
    public static Item fcItemBreadDough;
    public static Item fcItemStraw;
    public static Item fcItemBrickUnfired;
    public static Item fcItemNetherBrickUnfired;
    private static int fcBlockDirtSlabID = 206;
    public static int fcMillStoneContainerID = 222;
    public static int fcCauldronContainerID = 223;
    public static int fcHopperContainerID = 224;
    public static int fcCrucibleContainerID = 225;
    public static int fcAnvilContainerID = 226;
    public static int fcBlockDispenserContainerID = 227;
    public static int fcPulleyContainerID = 228;
    public static int fcInfernalEnchanterContainerID = 229;
    public static int fcFurnaceBrickContainerID = 230;
    public static int fcHamperContainerID = 231;
    public static int fcVanillaAnvilContainerID = 232;
    private static final Map m_configurationMap = new HashMap();
    public static boolean fcDisableMinecartChanges = false;
    private static boolean fcLocalEnableHardcoreBuoy = true;
    private static boolean fcServerEnableHardcoreBuoy = true;
    private static int fcLocalHardcorePlayerNamesLevel = 1;
    private static int fcServerHardcorePlayerNamesLevel = 1;
    public static boolean fcDisableEndText = true;
    public static boolean fcDisableGearBoxPowerDrain = false;
    public static String fcPlayerSkinURL = "http://skins.minecraft.net/MinecraftSkins/";
    public static String fcPlayerCloakURL = "http://skins.minecraft.net/MinecraftCloaks/";
    public static boolean bIsLensBeamBeingRemoved = false;
    public static final String fcCustomPacketChannelSpawnCustomEntity = "FC|SE";
    public static final String fcCustomPacketChannelCustomEntityEvent = "FC|EV";
    public static final String fcCustomPacketChannelVersionCheck = "FC|VC";
    public static final String fcCustomPacketChannelBTWOptions = "FC|OP";
    public static final String fcCustomPacketChannelOpenCustomInterface = "FC|OI";
    public static final int fcCustomSpawnEntityPacketTypeCanvas = 0;
    public static final int fcCustomSpawnEntityPacketTypeWindMill = 1;
    public static final int fcCustomSpawnEntityPacketTypeWaterWheel = 2;
    public static final int fcCustomSpawnEntityPacketTypeMiningCharge = 3;
    public static final int fcCustomSpawnEntityPacketTypeItemBloodWoodSapling = 4;
    public static final int fcCustomSpawnEntityPacketTypeItemFloating = 5;
    public static final int fcCustomSpawnEntityPacketTypeDynamite = 6;
    public static final int fcCustomSpawnEntityPacketTypeUrn = 7;
    public static final int fcCustomSpawnEntityPacketTypeBlockLiftedByPlatform = 8;
    public static final int fcCustomSpawnEntityPacketTypeWindMillVertical = 9;
    public static final int fcCustomSpawnEntityPacketTypeSpiderWeb = 10;
    public static final int fcCustomSpawnEntityPacketTypeSoulSand = 11;
    public static final int fcCustomEntityEventPacketTypeSetAttackTarget = 0;
    public static final int fcCustomEntityEventPacketTypeSquidTentacleAttack = 1;
    public static final int fcCustomEntityEventPacketTypeCowKickAttack = 2;
    public static StepSound fcStepSoundSquish = new FCStepSoundSquish("squish", 0.5F, 0.1F);
    public static boolean[] m_bBlocksPotentialFluidSources = new boolean[4096];
    public static int fcBlockWoodSidingItemStubID;
    public static int fcBlockWoodMouldingItemStubID;
    public static int fcBlockWoodCornerItemStubID;
    public static int fcBlockWoodMouldingDecorativeItemStubID;
    public static int fcBlockWoodSidingDecorativeItemStubID;
    public static final int m_iAnimalBirthingAuxFXID = 2222;
    public static final int m_iSawDamageEntityAuxFXID = 2223;
    public static final int m_iNetherGrothSporesAuxFXID = 2224;
    public static final int m_iGhastScreamSoundAuxFXID = 2225;
    public static final int m_iBurpSoundAuxFXID = 2226;
    public static final int m_iFireFizzSoundAuxFXID = 2227;
    public static final int m_iGhastMoanSoundAuxFXID = 2228;
    public static final int m_iMiningChargeExplosionAuxFXID = 2229;
    public static final int m_iHopperXPEjectAuxFXID = 2230;
    public static final int m_iItemCollectionPopSoundAuxFXID = 2231;
    public static final int m_iXPEjectPopSoundAuxFXID = 2232;
    public static final int m_iHopperCloseSoundAuxFXID = 2233;
    public static final int m_iRedstonePowerClickSoundAuxFXID = 2234;
    public static final int m_iMechanicalDeviceExplodeAuxFXID = 2235;
    public static final int m_iBlockPlaceAuxFXID = 2236;
    public static final int m_iDynamiteFuseSoundAuxFXID = 2237;
    public static final int m_iClickLowPitchSoundAuxFXID = 2238;
    public static final int m_iWolfHurtSoundAuxFXID = 2239;
    public static final int m_iChickenHurtSoundAuxFXID = 2240;
    public static final int m_iBlockDispenserSmokeEffectAuxFXID = 2241;
    public static final int m_iCompanionCubeDeathAuxFXID = 2242;
    public static final int m_iPossessedChickenExplosionAuxFXID = 2243;
    public static final int m_iEnderBlockCollectAuxFXID = 2244;
    public static final int m_iEnderBlockConvertAuxFXID = 2245;
    public static final int m_iEnderBlockPlaceAuxFXID = 2246;
    public static final int m_iEnderChangeDimensionAuxFXID = 2247;
    public static final int m_iSoulUrnShatterAuxFXID = 2248;
    public static final int m_iMelonExplodeAuxFXID = 2249;
    public static final int m_iPumpkinExplodeAuxFXID = 2250;
    public static final int m_iMelonImpactSoundAuxFXID = 2251;
    public static final int m_iBlockDestroyRespectParticleSettingsAuxFXID = 2252;
    public static final int m_iCowMilkFillAuxFXID = 2253;
    public static final int m_iCowMilkedAuxFXID = 2254;
    public static final int m_iCowConvertToMooshroomAuxFXID = 2255;
    public static final int m_iWolfHowlAuxFXID = 2256;
    public static final int m_iWolfConvertToDireAuxFXID = 2257;
    public static final int m_iCreeperNeuteredAuxFXID = 2258;
    public static final int m_iPossessedPigTransformToPigmanAuxFXID = 2259;
    public static final int m_iPossessedVillagerTransformToWitchAuxFXID = 2260;
    public static final int m_iSheepWoolRegrowAuxFXID = 2261;
    public static final int m_iSquidTentacleFlingAuxFXID = 2262;
    public static final int m_iSnowGolemCreatedAuxFXID = 2263;
    public static final int m_iIronGolemCreatedAuxFXID = 2264;
    public static final int m_iTossTheMilkAuxFXID = 2265;
    public static final int m_iDungAppliedToWolfAuxFXID = 2266;
    public static final int m_iStumpRemovedAuxFXID = 2267;
    public static final int m_iShaftRippedOffLogAuxFXID = 2268;
    public static final int m_iStoneRippedOffAuxFXID = 2269;
    public static final int m_iGravelRippedOffStoneAuxFXID = 2270;
    public static final int m_iWoodBlockDestroyedAuxFXID = 2271;
    public static final int m_iBlockDestroyedWithImproperToolAuxFXID = 2272;
    public static final int m_iPossessedSquidTransformToGhastAuxFXID = 2273;
    public static final int m_iMortarAppliedAuxFXID = 2274;
    public static final int m_iLooseBlockOnMortarAuxFXID = 2275;
    public static final int m_iLogSmoulderingFallAuxFXID = 2276;
    public static final int m_iLogSmoulderingExplosionAuxFXID = 2277;
    public static final int m_iWaterEvaporateAuxFXID = 2278;
    public static final int m_iWitherCreatedAuxFXID = 2279;
    public static final int m_iLightningStrikeAuxFXID = 2280;
    public static final int m_iFlamingNetherrackFallAuxFXID = 2281;
    public static final int m_iCactusExplodeAuxFXID = 2282;
    public static final int m_iAnimalEatAuxFXID = 2283;
    public static final int m_iWolfEatAuxFXID = 2284;
    public static final Potion potionFortune = (new Potion(31, false, 14270531)).setPotionName("potion.fcFortune").setIconIndex(2, 0);
    public static final Potion potionLooting = (new Potion(30, false, 9643043)).setPotionName("potion.fcLooting").setIconIndex(4, 0);
    public static final Potion potionTrueSight = (new Potion(29, false, 14270531)).setPotionName("potion.fcTrueSight").setIconIndex(4, 1);

    public void Initialize()
    {
        FCAddOnHandler.LogMessage("Better Than Wolves Version " + this.getVersion() + " Initializing...");
        this.ModInstallationIntegrityTest();
        ReadModConfigFile();
        this.InstantiateModBlocks();
        this.InstantiateModItems();
        this.CreateModTileEntityMappings();
        this.CreateModEntityMappings();
        FCRecipes.AddAllModRecipes();
        this.InitBlocksPotentialFluidSources();
        this.InitDispenserBehaviors();
        FCTileEntityBeacon.InitializeEffectsByBlockID();
        this.InitCustomPackets();
        FCAddOnHandler.LogMessage("Better Than Wolves Initialization Complete.");
    }

    private void AddBlockName(StringTranslate var1, Block var2, String var3)
    {
        String var4 = var2.getUnlocalizedName() + ".name";
        var1.GetTranslateTable().put(var4, var3);
    }

    private void AddItemName(StringTranslate var1, Item var2, String var3)
    {
        String var4 = var2.getUnlocalizedName() + ".name";
        var1.GetTranslateTable().put(var4, var3);
    }

    public String GetLanguageFilePrefix()
    {
        return "BTW";
    }

    public String getVersion()
    {
        return "4.B0000002";
    }

    public void ModInstallationIntegrityTest()
    {
        try
        {
            World.InstallationIntegrityTest();
            Block.InstallationIntegrityTest();
            EntityLiving.InstallationIntegrityTest();
            EntityPlayer.InstallationIntegrityTestPlayer();
            EntityItem.InstallationIntegrityTestEntityItem();
        }
        catch (Exception var3)
        {
            String var2 = "***Better Than Wolves has not been properly installed.  Please consult the readme.txt file for installation instructions***";
            FCAddOnHandler.LogMessage(var2);
            throw new RuntimeException(var3);
        }
    }

    public static boolean IsHardcoreBuoyEnabled(World var0)
    {
        return !var0.isRemote ? fcLocalEnableHardcoreBuoy : fcServerEnableHardcoreBuoy;
    }

    public static boolean IsHardcorePlayerNamesEnabled(World var0)
    {
        return !var0.isRemote ? fcLocalHardcorePlayerNamesLevel == 1 : fcServerHardcorePlayerNamesLevel == 1;
    }

    public static boolean AreHardcorePlayerNamesObstructed(World var0)
    {
        return !var0.isRemote ? fcLocalHardcorePlayerNamesLevel == 2 : fcServerHardcorePlayerNamesLevel == 2;
    }

    private static int ValidateIDFromFile(int var0, int var1)
    {
        return var1 > 0 ? var1 : var0;
    }

    private void InstantiateModBlocks()
    {
        fcBlockSlabSandAndGravel = new FCBlockSlabSandAndGravel(ParseID("fcBlockSlabFallingID", 175));
        fcBlockArcaneVessel = new FCBlockArcaneVessel(ParseID("fcBlockArcaneVesselID", 176));
        fcBlockAxlePowerSource = new FCBlockAxlePowerSource(ParseID("fcBlockAxlePowerSourceID", 177));
        fcBlockSidingAndCornerBlackStone = (new FCBlockSidingAndCornerAndDecorative(ParseID("fcBlockSidingAndCornerBlackStoneID", 178), Material.rock, "fcBlockDecorativeBlackStone", 1.5F, 10.0F, Block.soundStoneFootstep, "fcBlockSidingBlackStone")).SetPicksEffectiveOn();
        fcBlockMouldingAndDecorativeBlackStone = (new FCBlockMouldingAndDecorative(ParseID("fcBlockMouldingAndDecorativeBlackStoneID", 179), Material.rock, "fcBlockDecorativeBlackStone", "fcBlockColumnBlackStone_side", fcBlockSidingAndCornerBlackStone.blockID, 1.5F, 10.0F, Block.soundStoneFootstep, "fcBlockMouldingBlackStone")).SetPicksEffectiveOn();
        fcBlockAestheticOpaqueEarth = new FCBlockAestheticOpaqueEarth(ParseID("fcBlockAestheticOpaqueEarthID", 180));
        fcBlockCandle = new FCBlockCandle(ParseID("fcBlockCandleID", 181));
        fcBlockSandstoneSidingAndCorner = (new FCBlockSandstoneSidingAndCornerAndDecorative(ParseID("fcBlockSandstoneSidingAndCornerID", 182))).SetPicksEffectiveOn();
        fcBlockSandstoneMouldingAndDecorative = (new FCBlockSandstoneMouldingAndDecorative(ParseID("fcBlockSandstoneMouldingAndDecorativeID", 183), fcBlockSandstoneSidingAndCorner.blockID)).SetPicksEffectiveOn();
        fcBlockWoodOakSidingAndCorner = new FCBlockWoodSidingAndCornerAndDecorative(ParseID("fcBlockWoodOakSidingAndCornerID", 184), "FCBlockDecorativeWoodOak", "fcBlockWoodOakSiding");
        fcBlockSmoothStoneSidingAndCorner = (new FCBlockSidingAndCornerAndDecorative(ParseID("fcBlockSmoothStoneSidingAndCornerID", 185), Material.rock, "fcBlockDecorativeStone", 1.5F, 10.0F, Block.soundStoneFootstep, "fcStoneSiding")).SetPicksEffectiveOn();
        fcBlockBrickSidingAndCorner = (new FCBlockSidingAndCornerAndDecorative(ParseID("fcBlockBrickSidingAndCornerID", 186), Material.rock, "fcBlockDecorativeBrick", 2.0F, 10.0F, Block.soundStoneFootstep, "fcBrickSiding")).SetPicksEffectiveOn();
        fcBlockBrickMouldingAndDecorative = (new FCBlockMouldingAndDecorative(ParseID("fcBlockBrickMouldingAndDecorativeID", 187), Material.rock, "fcBlockDecorativeBrick", "fcBlockColumnBrick_side", fcBlockBrickSidingAndCorner.blockID, 2.0F, 10.0F, Block.soundStoneFootstep, "fcBrickMoulding")).SetPicksEffectiveOn();
        fcBlockNetherBrickSidingAndCorner = (new FCBlockNetherBrickSidingAndCornerAndDecorative(ParseID("fcBlockNetherBrickSidingAndCornerID", 188))).SetPicksEffectiveOn();
        fcBlockNetherBrickMouldingAndDecorative = (new FCBlockNetherBrickMouldingAndDecorative(ParseID("fcBlockNetherBrickMouldingAndDecorativeID", 189), fcBlockNetherBrickSidingAndCorner.blockID)).SetPicksEffectiveOn();
        fcBlockWhiteStoneStairs = new FCBlockStairsWhiteStone(ParseID("fcBlockWhiteStoneStairsID", 190));
        fcBlockWhiteStoneSidingAndCorner = (new FCBlockSidingAndCornerAndDecorative(ParseID("fcBlockWhiteStoneSidingAndCornerID", 191), Material.rock, "fcBlockDecorativeWhiteStone", 1.5F, 10.0F, Block.soundStoneFootstep, "fcWhiteStoneSiding")).SetPicksEffectiveOn();
        fcBlockWhiteStoneMouldingAndDecorative = (new FCBlockMouldingAndDecorative(ParseID("fcBlockWhiteStoneMouldingAndDecorativeID", 192), Material.rock, "fcBlockDecorativeWhiteStone", "fcBlockColumnWhiteStone_side", fcBlockWhiteStoneSidingAndCorner.blockID, 1.5F, 10.0F, Block.soundStoneFootstep, "fcWhiteStoneMoulding")).SetPicksEffectiveOn();
        fcBlockStakeString = new FCBlockStakeString(ParseID("fcBlockStakeStringID", 193));
        fcBlockStake = new FCBlockStake(ParseID("fcBlockStakeID", 194));
        fcBlockScrewPump = new FCBlockScrewPump(ParseID("fcBlockScrewPumpID", 195));
        fcBlockWoodSpruceSidingAndCorner = new FCBlockWoodSidingAndCornerAndDecorative(ParseID("fcBlockWoodSpruceSidingAndCornerID", 196), "fcBlockDecorativeWoodSpruce", "fcWoodSpruceSiding");
        fcBlockWoodSpruceMouldingAndDecorative = new FCBlockWoodMouldingAndDecorative(ParseID("fcBlockWoodSpruceMouldingID", 197), "fcBlockDecorativeWoodSpruce", "fcBlockColumnWoodSpruce_side", fcBlockWoodSpruceSidingAndCorner.blockID, "fcWoodSpruceMoulding");
        fcBlockWoodBirchSidingAndCorner = new FCBlockWoodSidingAndCornerAndDecorative(ParseID("fcBlockWoodBirchSidingAndCornerID", 198), "fcBlockDecorativeWoodBirch", "fcWoodBirchSiding");
        fcBlockWoodBirchMouldingAndDecorative = new FCBlockWoodMouldingAndDecorative(ParseID("fcBlockWoodBirchMouldingID", 199), "fcBlockDecorativeWoodBirch", "fcBlockColumnWoodBirch_side", fcBlockWoodBirchSidingAndCorner.blockID, "fcWoodBirchMoulding");
        fcBlockWoodJungleSidingAndCorner = new FCBlockWoodSidingAndCornerAndDecorative(ParseID("fcBlockWoodJungleSidingAndCornerID", 200), "fcBlockDecorativeWoodJungle", "fcWoodJungleSiding");
        fcBlockWoodJungleMouldingAndDecorative = new FCBlockWoodMouldingAndDecorative(ParseID("fcBlockWoodJungleMouldingID", 201), "fcBlockDecorativeWoodJungle", "fcBlockColumnWoodJungle_side", fcBlockWoodJungleSidingAndCorner.blockID, "fcWoodJungleMoulding");
        fcBlockStoneBrickSidingAndCorner = (new FCBlockSidingAndCornerAndDecorative(ParseID("fcBlockStoneBrickSidingAndCornerID", 202), Material.rock, "fcBlockDecorativeStoneBrick", 1.5F, 10.0F, Block.soundStoneFootstep, "fcStoneBrickSiding")).SetPicksEffectiveOn();
        fcBlockStoneBrickMouldingAndDecorative = (new FCBlockMouldingAndDecorative(ParseID("fcBlockStoneBrickMouldingID", 203), Material.rock, "fcBlockDecorativeStoneBrick", "fcBlockColumnStoneBrick_side", fcBlockStoneBrickSidingAndCorner.blockID, 1.5F, 10.0F, Block.soundStoneFootstep, "fcStoneBrickMoulding")).SetPicksEffectiveOn();
        fcBlockFarmlandLegacyFertilized = new FCBlockFarmlandLegacyFertilized(ParseID("fcBlockFarmlandFertilizedID", 204));
        fcBlockWoolSlabTop = new FCBlockWoolSlab(ParseID("fcBlockWoolSlabTopID", 205), true);
        fcBlockDirtSlab = new FCBlockDirtSlab(ParseID("fcBlockDirtSlabID", 206));
        fcBlockBloodMoss = new FCBlockNetherGrowth(ParseID("fcBlockNetherGrowthID", 207));
        fcInfernalEnchanter = new FCBlockInfernalEnchanter(ParseID("fcInfernalEnchanterID", 208));
        fcSoulforgedSteelBlock = new FCBlockSoulforgedSteel(ParseID("fcSoulforgedSteelBlockID", 209));
        fcBlockDetectorGlowingLogic = new FCBlockDetectorLogicGlowing(ParseID("fcBlockDetectorGlowingLogicID", 210));
        fcBlockBloodLeaves = new FCBlockBloodWoodLeaves(ParseID("fcLeavesID", 211));
        fcBloodWood = new FCBlockBloodWood(ParseID("fcBloodWoodID", 212));
        fcAestheticVegetation = new FCBlockAestheticVegetation(ParseID("fcAestheticVegetationID", 213));
        fcBlockSmoothStoneMouldingAndDecorative = (new FCBlockMouldingAndDecorative(ParseID("fcStoneMouldingID", 214), Material.rock, "fcBlockDecorativeStone", "fcBlockColumnStone_side", "fcBlockColumnStone_top", "fcBlockPedestalStone_side", "fcBlockPedestalStone_top", fcBlockSmoothStoneSidingAndCorner.blockID, 1.5F, 10.0F, Block.soundStoneFootstep, "fcStoneMoulding")).SetPicksEffectiveOn();
        fcAestheticOpaque = new FCBlockAestheticOpaque(ParseID("fcAestheticOpaqueID", 215));
        fcAestheticNonOpaque = new FCBlockAestheticNonOpaque(ParseID("fcAestheticNonOpaqueID", 216));
        fcBlockMiningCharge = new FCBlockMiningCharge(ParseID("fcMiningChargeID", 217));
        fcBuddyBlock = new FCBlockBuddyBlock(ParseID("fcBuddyBlockID", 218));
        fcKiln = new FCBlockKiln(ParseID("fcKilnID", 219));
        fcWoolSlab = new FCBlockWoolSlab(ParseID("fcWoolSlabID", 220), false);
        fcAnvil = new FCBlockSoulforge(ParseID("fcAnvilID", 221));
        fcLightBulbOff = new FCBlockLightBulb(ParseID("fcLightBulbOffID", 222), false);
        fcLightBulbOn = new FCBlockLightBulb(ParseID("fcLightBulbOnID", 223), true);
        fcBBQ = new FCBlockBBQ(ParseID("fcBBQID", 224));
        fcHopper = new FCBlockHopper(ParseID("fcHopperID", 225));
        fcSaw = new FCBlockSaw(ParseID("fcSawID", 226));
        fcPlatform = new FCBlockPlatform(ParseID("fcPlatformID", 227));
        fcCement = new FCBlockCement(ParseID("fcCementID", 228));
        fcPulley = new FCBlockPulley(ParseID("fcPulleyID", 229));
        fcBlockPressurePlateSoulforgedSteel = (new FCBlockPressurePlate(ParseID("fcPressurePlateObsidianID", 230), "fcBlockPressurePlateSoulforgedSteel", fcMaterialSoulforgedSteel, EnumMobType.players)).setHardness(1.0F).setResistance(2000.0F).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("pressurePlate");
        fcBlockWoodOakMouldingAndDecorative = new FCBlockWoodMouldingAndDecorative(ParseID("fcMouldingID", 231), "FCBlockDecorativeWoodOak", "fcBlockColumnWoodOak_side", fcBlockWoodOakSidingAndCorner.blockID, "fcBlockWoodOakMoulding");
        fcBlockLegacySmoothstoneAndOakCorner = new FCBlockLegacyCorner(ParseID("fcCornerID", 232));
        fcBlockDispenser = new FCBlockBlockDispenser(ParseID("fcBlockDispenserID", 233));
        fcCauldron = new FCBlockCauldron(ParseID("fcCauldronID", 234));
        fcDetectorRailWood = (new FCBlockDetectorRail(ParseID("fcDetectorRailWoodID", 235))).setHardness(0.7F).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("fcBlockDetectorRailWood");
        fcBlockDetectorRailSoulforgedSteel = (new FCBlockDetectorRail(ParseID("fcDetectorRailObsidianID", 236))).setHardness(0.7F).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("fcBlockDetectorRailSoulforgedSteel");
        fcCompanionCube = new FCBlockCompanionCube(ParseID("fcCompanionCubeID", 237));
        fcBlockDetector = new FCBlockDetectorBlock(ParseID("fcBlockDetectorID", 238));
        fcBlockDetectorLogic = (new FCBlockDetectorLogic(ParseID("fcBlockDetectorLogicID", 239))).setUnlocalizedName("fcBlockDetectorLogic");
        fcLens = new FCBlockLens(ParseID("fcBlockLensID", 240));
        fcBlockHempCrop = new FCBlockHempCrop(ParseID("fcHempCropID", 241));
        fcHandCrank = new FCBlockHandCrank(ParseID("fcHandCrankID", 242));
        fcMillStone = new FCBlockMillStone(ParseID("fcMillStoneID", 243));
        fcAnchor = new FCBlockAnchor(ParseID("fcAnchorID", 244));
        fcRopeBlock = new FCBlockRope(ParseID("fcRopeBlockID", 245));
        fcBlockLegacySmoothstoneAndOakSiding = new FCBlockLegacyOmniSlab(ParseID("fcOmniSlabID", 246));
        fcBlockAxle = new FCBlockAxle(ParseID("fcAxleBlockID", 247));
        fcBlockRedstoneClutch = new FCBlockRedstoneClutch(ParseID("fcGearBoxID", 248));
        fcTurntable = new FCBlockTurntable(ParseID("fcTurntableID", 249));
        fcBellows = new FCBlockBellows(ParseID("fcBellowsID", 250));
        fcBlockFireStoked = new FCBlockFireStoked(ParseID("fcStokedFireID", 251));
        fcUnfiredPottery = new FCBlockUnfiredPottery(ParseID("fcUnfiredPotteryID", 252));
        fcCrucible = new FCBlockCrucible(ParseID("fcCrucibleID", 253));
        fcPlanter = new FCBlockPlanter(ParseID("fcPlanterID", 254));
        fcVase = new FCBlockVase(ParseID("fcVaseID", 255));
        fcBlockRottenFlesh = new FCBlockRottenFlesh(ParseID("fcBlockRottenFleshID", 1000));
        fcBlockShaft = new FCBlockShaft(ParseID("fcBlockShaftID", 1001));
        fcBlockSoulforgeDormant = new FCBlockSoulforgeDormant(ParseID("fcBlockSoulforgeDormantID", 1002));
        fcBlockSmoothstoneStairs = (new FCBlockStairs(ParseID("fcBlockSmoothstoneStairsID", 1003), Block.stone, 0)).SetPicksEffectiveOn().setUnlocalizedName("fcBlockSmoothstoneStairs");
        fcBlockRottenFleshSlab = new FCBlockRottenFleshSlab(ParseID("fcBlockRottenFleshSlabID", 1004));
        fcBlockBoneSlab = new FCBlockBoneSlab(ParseID("fcBlockBoneSlabID", 1005));
        fcBlockPumpkinFresh = new FCBlockPumpkin(ParseID("fcBlockPumpkinFreshID", 1006), false);
        ((FCBlockStem)Block.pumpkinStem).SetFruitBlock(fcBlockPumpkinFresh);
        fcBlockWoodBloodSidingAndCorner = new FCBlockWoodSidingAndCornerAndDecorative(ParseID("fcBlockWoodBloodSidingAndCornerID", 1007), "fcBlockDecorativeWoodBlood", "fcWoodBloodSiding");
        fcBlockWoodBloodMouldingAndDecorative = new FCBlockWoodMouldingAndDecorative(ParseID("fcBlockWoodBloodMouldingAndDecorativeID", 1008), "fcBlockDecorativeWoodBlood", "fcBlockColumnWoodBlood_side", fcBlockWoodBloodSidingAndCorner.blockID, "fcWoodBloodMoulding");
        fcBlockWoodBloodStairs = (new FCBlockStairsWood(ParseID("fcBlockWoodBloodStairsID", 1009), Block.planks, 4)).setUnlocalizedName("fcBlockWoodBloodStairs");
        fcBlockLogDamaged = new FCBlockLogDamaged(ParseID("fcBlockLogDamagedID", 1010));
        fcBlockDirtLoose = new FCBlockDirtLoose(ParseID("fcBlockDirtLooseID", 1011));
        fcBlockDirtLooseSlab = new FCBlockDirtLooseSlab(ParseID("fcBlockDirtLooseSlabID", 1012));
        fcBlockCampfireUnlit = (FCBlockCampfire)(new FCBlockCampfire(ParseID("fcBlockCampfireUnlitID", 1013), 0)).setCreativeTab(CreativeTabs.tabDecorations);
        fcBlockCampfireSmall = (FCBlockCampfire)((FCBlockCampfire)(new FCBlockCampfire(ParseID("fcBlockCampfireSmallID", 1014), 1)).setLightValue(0.25F));
        fcBlockCampfireMedium = (FCBlockCampfire)((FCBlockCampfire)(new FCBlockCampfire(ParseID("fcBlockCampfireMediumID", 1015), 2)).setLightValue(0.5F));
        fcBlockCampfireLarge = (FCBlockCampfire)((FCBlockCampfire)(new FCBlockCampfire(ParseID("fcBlockCampfireLargeID", 1016), 3)).setLightValue(0.875F));
        fcBlockUnfiredBrick = new FCBlockUnfiredBrick(ParseID("fcBlockUnfiredBrickID", 1017));
        fcBlockCookedBrick = new FCBlockCookedBrick(ParseID("fcBlockCookedBrickID", 1018));
        fcBlockBrickLoose = new FCBlockBrickLoose(ParseID("fcBlockBrickLooseID", 1019));
        fcBlockBrickLooseSlab = new FCBlockBrickLooseSlab(ParseID("fcBlockBrickLooseSlabID", 1020));
        fcBlockCobblestoneLoose = new FCBlockCobblestoneLoose(ParseID("fcBlockCobblestoneLooseID", 1021));
        fcBlockCobblestoneLooseSlab = new FCBlockCobblestoneLooseSlab(ParseID("fcBlockCobblestoneLooseSlabID", 1022));
        fcBlockFurnaceBrickIdle = new FCBlockFurnaceBrickIdle(ParseID("fcBlockFurnaceBrickIdleID", 1023));
        fcBlockFurnaceBrickBurning = new FCBlockFurnaceBrickBurning(ParseID("fcBlockFurnaceBrickBurningID", 1024));
        fcBlockTorchFiniteUnlit = new FCBlockTorchFiniteUnlit(ParseID("fcBlockTorchFiniteIdleID", 1025));
        fcBlockTorchFiniteBurning = new FCBlockTorchFiniteBurning(ParseID("fcBlockTorchFiniteBurningID", 1026));
        fcBlockStoneRough = new FCBlockStoneRough(ParseID("fcBlockStoneRoughID", 1027), 0);
        fcBlockStoneRoughMidStrata = new FCBlockStoneRough(ParseID("fcBlockStoneRoughMidStrataID", 1028), 1);
        fcBlockStoneRoughDeepStrata = new FCBlockStoneRough(ParseID("fcBlockStoneRoughDeepStrataID", 1029), 2);
        fcBlockWorkStump = new FCBlockWorkStump(ParseID("fcBlockWorkStumpID", 1030));
        fcBlockBasketWicker = new FCBlockBasketWicker(ParseID("fcBlockBasketWickerID", 1031));
        fcBlockLogSpike = new FCBlockLogSpike(ParseID("fcBlockLogSpikeID", 1032));
        fcBlockTorchNetherUnlit = new FCBlockTorchNetherUnlit(ParseID("fcBlockTorchIdleID", 1033));
        fcBlockWorkbench = (new FCBlockWorkbench(ParseID("fcBlockWorkbenchID", 1034))).SetFireProperties(5, 20);
        fcBlockChest = (new FCBlockChest(ParseID("fcBlockChestID", 1035))).SetFireProperties(5, 20);
        fcBlockDoorWood = (new FCBlockDoorWood(ParseID("fcBlockDoorWoodID", 1036))).SetFireProperties(5, 20);
        fcBlockWeb = (new FCBlockWeb(ParseID("fcBlockWebID", 1037))).SetFireProperties(60, 100).setCreativeTab(CreativeTabs.tabDecorations);
        fcBlockUnfiredClay = new FCBlockUnfiredClay(ParseID("fcBlockUnfiredClayID", 1038));
        fcBlockMyceliumSlab = new FCBlockMyceliumSlab(ParseID("fcBlockMyceliumSlabID", 1039));
        fcBlockToolPlaced = new FCBlockToolPlaced(ParseID("fcBlockToolPlacedID", 1040));
        fcBlockBrickLooseStairs = new FCBlockBrickLooseStairs(ParseID("fcBlockBrickLooseStairsID", 1041));
        fcBlockCobblestoneLooseStairs = new FCBlockCobblestoneLooseStairs(ParseID("fcBlockCobblestoneLooseStairsID", 1042));
        fcBlockLogSmouldering = new FCBlockLogSmouldering(ParseID("fcBlockLogSmoulderingID", 1043));
        fcBlockWoodCinders = new FCBlockWoodCinders(ParseID("fcBlockWoodCindersID", 1044));
        fcBlockStumpCharred = new FCBlockStumpCharred(ParseID("fcBlockStumpCharredID", 1045));
        fcBlockAshGroundCover = new FCBlockAshGroundCover(ParseID("fcBlockAshGroundCoverID", 1046));
        fcBlockSnowLoose = new FCBlockSnowLoose(ParseID("fcBlockSnowLooseID", 1047));
        fcBlockSnowLooseSlab = new FCBlockSnowLooseSlab(ParseID("fcBlockSnowLooseSlabID", 1048));
        fcBlockSnowSolid = new FCBlockSnowSolid(ParseID("fcBlockSnowSolidID", 1049));
        fcBlockSnowSolidSlab = new FCBlockSnowSolidSlab(ParseID("fcBlockSnowSolidSlabID", 1050));
        fcBlockLadder = new FCBlockLadder(ParseID("fcBlockLadderID", 1051));
        fcBlockLadderOnFire = new FCBlockLadderOnFire(ParseID("fcBlockLadderOnFireID", 1052));
        fcBlockShovel = new FCBlockShovel(ParseID("fcBlockShovelID", 1053));
        fcBlockHamper = new FCBlockHamper(ParseID("fcBlockHamperID", 1054));
        fcBlockCreeperOysters = new FCBlockCreeperOysters(ParseID("fcBlockCreeperOystersID", 1055));
        fcBlockCreeperOystersSlab = new FCBlockCreeperOystersSlab(ParseID("fcBlockCreeperOystersSlabID", 1056));
        fcBlockTorchNetherBurning = (FCBlockTorchNetherBurning)(new FCBlockTorchNetherBurning(ParseID("fcBlockTorchNetherBurningID", 1057))).setCreativeTab(CreativeTabs.tabDecorations);
        fcBlockBucketEmpty = new FCBlockBucket(ParseID("fcBlockBucketEmptyID", 1058));
        fcBlockBucketWater = new FCBlockBucketWater(ParseID("fcBlockBucketWaterID", 1059));
        fcBlockBucketCement = new FCBlockBucketCement(ParseID("fcBlockBucketCementID", 1060));
        fcBlockBucketMilk = new FCBlockBucketMilk(ParseID("fcBlockBucketMilkID", 1061));
        fcBlockBucketMilkChocolate = new FCBlockBucketMilkChocolate(ParseID("fcBlockBucketMilkChocolateID", 1062));
        fcBlockMilk = new FCBlockMilk(ParseID("fcBlockMilkID", 1063));
        fcBlockMilkChocolate = new FCBlockMilkChocolate(ParseID("fcBlockMilkChocolateID", 1064));
        fcBlockGearBox = new FCBlockGearBox(ParseID("fcBlockGearBoxID", 1065));
        fcBlockSpikeIron = new FCBlockSpike(ParseID("fcBlockSpikeIronID", 1066));
        fcBlockLightningRod = new FCBlockLightningRod(ParseID("fcBlockLightningRodID", 1067));
        fcBlockChunkOreIron = new FCBlockChunkOreIron(ParseID("fcBlockChunkOreIronID", 1068));
        fcBlockChunkOreGold = new FCBlockChunkOreGold(ParseID("fcBlockChunkOreGoldID", 1069));
        fcBlockStoneBrickLoose = new FCBlockStoneBrickLoose(ParseID("fcBlockStoneBrickLooseID", 1070));
        fcBlockStoneBrickLooseSlab = new FCBlockStoneBrickLooseSlab(ParseID("fcBlockStoneBrickLooseSlabID", 1071));
        fcBlockStoneBrickLooseStairs = new FCBlockStoneBrickLooseStairs(ParseID("fcBlockStoneBrickLooseStairsID", 1072));
        fcBlockNetherBrickLoose = new FCBlockNetherBrickLoose(ParseID("fcBlockNetherBrickLooseID", 1073));
        fcBlockNetherBrickLooseSlab = new FCBlockNetherBrickLooseSlab(ParseID("fcBlockNetherBrickLooseSlabID", 1074));
        fcBlockNetherBrickLooseStairs = new FCBlockNetherBrickLooseStairs(ParseID("fcBlockNetherBrickLooseStairsID", 1075));
        fcBlockNetherrackFalling = new FCBlockNetherrackFalling(ParseID("fcBlockNetherrackFallingID", 1076));
        fcBlockLavaPillow = new FCBlockLavaPillow(ParseID("fcBlockLavaPillowID", 1077));
        fcBlockMushroomCapBrown = new FCBlockMushroomCap(ParseID("fcBlockMushroomCapBrownID", 1078), 0);
        fcBlockMushroomCapRed = new FCBlockMushroomCap(ParseID("fcBlockMushroomCapRedID", 1079), 1);
        fcBlockChunkOreStorageIron = new FCBlockChunkOreStorageIron(ParseID("fcBlockChunkOreStorageIronID", 1080));
        fcBlockChunkOreStorageGold = new FCBlockChunkOreStorageGold(ParseID("fcBlockChunkOreStorageGoldID", 1081));
        fcBlockWicker = new FCBlockWicker(ParseID("fcBlockWickerID", 1082));
        fcBlockWickerSlab = new FCBlockWickerSlab(ParseID("fcBlockWickerSlabID", 1083));
        fcBlockWickerPane = new FCBlockWickerPane(ParseID("fcBlockWickerPaneID", 1084));
        fcBlockGrate = new FCBlockGrate(ParseID("fcBlockGrateID", 1085));
        fcBlockSlats = new FCBlockSlats(ParseID("fcBlockSlatsID", 1086));
        fcBlockFarmland = new FCBlockFarmland(ParseID("fcBlockFarmlandNewID", 1087));
        fcBlockFarmlandFertilized = new FCBlockFarmlandFertilized(ParseID("fcBlockFarmlandFertilizedNewID", 1088));
        fcBlockWheatCrop = new FCBlockWheatCrop(ParseID("fcBlockWheatCropID", 1089));
        fcBlockWheatCropTop = new FCBlockWheatCropTop(ParseID("fcBlockWheatCropTopID", 1090));
        fcBlockWeeds = new FCBlockWeeds(ParseID("fcBlockWeedsID", 1091));
        fcBlockPlanterSoil = new FCBlockPlanterSoil(ParseID("fcBlockPlanterSoilID", 1092));
    }

    private void InstantiateModItems()
    {
        fcItemBucketCement = new FCItemBucketCement(ParseID("fcBucketCementID", 222));
        fcItemWolfRaw = new FCItemWolfChopRaw(ParseID("fcWolfRawID", 223));
        fcItemWolfCooked = new FCItemWolfChopCooked(ParseID("fcWolfCookedID", 224));
        fcItemNethercoal = (new Item(ParseID("fcNethercoalID", 225))).SetFurnaceBurnTime(2 * FCEnumFurnaceBurnTime.COAL.m_iBurnTime).SetFilterableProperties(2).setUnlocalizedName("fcItemNethercoal").setCreativeTab(CreativeTabs.tabMaterials);
        fcItemHempSeeds = (new FCItemSeeds(ParseID("fcHempSeedsID", 226), fcBlockHempCrop.blockID)).SetAsBasicChickenFood().setUnlocalizedName("fcItemSeedsHemp");
        fcItemHemp = (new Item(ParseID("fcHempID", 227))).SetBuoyant().SetBellowsBlowDistance(2).SetIncineratedInCrucible().SetFilterableProperties(16).setUnlocalizedName("fcItemHemp").setCreativeTab(CreativeTabs.tabMaterials);
        fcItemGear = (new Item(ParseID("fcGearID", 228))).SetBuoyant().SetIncineratedInCrucible().setUnlocalizedName("fcItemGear").setCreativeTab(CreativeTabs.tabMaterials);
        fcItemFlour = (new Item(ParseID("fcFlourID", 229))).SetBuoyant().SetBellowsBlowDistance(3).SetIncineratedInCrucible().SetFilterableProperties(8).setUnlocalizedName("fcItemFlour").setCreativeTab(CreativeTabs.tabMaterials);
        fcItemHempFibers = (new Item(ParseID("fcHempFibersID", 230))).SetBuoyant().SetBellowsBlowDistance(2).SetIncineratedInCrucible().SetFilterableProperties(18).setUnlocalizedName("fcItemFibersHemp").setCreativeTab(CreativeTabs.tabMaterials);
        fcItemScouredLeather = (new Item(ParseID("fcScouredLeatherID", 231))).SetBuoyant().SetIncineratedInCrucible().SetFilterableProperties(16).setUnlocalizedName("fcItemLeatherScoured").setCreativeTab(CreativeTabs.tabMaterials);
        fcItemDonut = (new FCItemFood(ParseID("fcDonutID", 232), 1, 0.5F, false, "fcItemDonut")).setAlwaysEdible().SetFilterableProperties(2);
        fcItemRope = (new FCItemRope(ParseID("fcRopeItemID", 233))).SetIncineratedInCrucible().SetFilterableProperties(4).setCreativeTab(CreativeTabs.tabTransport);
        fcItemSlatsOld = new FCItemSlatsLegacy(ParseID("fcRollersItemID", 234));
        fcItemDung = new FCItemDung(ParseID("fcDungID", 235));
        fcItemWaterWheel = (new FCItemWaterWheel(ParseID("fcWaterWheelItemID", 236))).SetIncineratedInCrucible();
        fcItemWindMillBlade = (new Item(ParseID("fcWindMillBladeItemID", 237))).SetBuoyant().SetIncineratedInCrucible().setMaxStackSize(1).setFull3D().setUnlocalizedName("fcItemBladeWindMill").setCreativeTab(CreativeTabs.tabMaterials);
        fcItemWindMill = (new FCItemWindMill(ParseID("fcWindMillItemID", 238))).SetIncineratedInCrucible();
        fcItemHempCloth = (new Item(ParseID("fcHempClothID", 239))).SetBuoyant().SetBellowsBlowDistance(1).SetIncineratedInCrucible().SetFilterableProperties(16).setUnlocalizedName("fcItempFabric").setCreativeTab(CreativeTabs.tabMaterials);
        fcItemGrateOld = new FCItemGrateLegacy(ParseID("fcGrateID", 240));
        fcItemWickerPaneOld = new FCItemWickerPaneLegacy(ParseID("fcWickerID", 241));
        fcItemTannedLeather = (new Item(ParseID("fcTannedLeatherID", 242))).SetBuoyant().SetIncineratedInCrucible().SetFilterableProperties(16).setUnlocalizedName("fcItemLeatherTanned").setCreativeTab(CreativeTabs.tabMaterials);
        fcItemStrap = (new Item(ParseID("fcStrapID", 243))).SetBuoyant().SetBellowsBlowDistance(1).SetIncineratedInCrucible().SetFilterableProperties(20).setUnlocalizedName("fcItemStrap").setCreativeTab(CreativeTabs.tabMaterials);
        fcItemBelt = (new Item(ParseID("fcBeltID", 244))).SetBuoyant().SetIncineratedInCrucible().SetFilterableProperties(4).setUnlocalizedName("fcItemBelt").setCreativeTab(CreativeTabs.tabMaterials);
        fcItemFoulFood = new FCItemFoulFood(ParseID("fcFoulFoodID", 245));
        fcItemWoodBlade = (new Item(ParseID("fcWoodBladeID", 246))).SetBuoyant().SetIncineratedInCrucible().setMaxStackSize(1).setUnlocalizedName("fcItemBladeWood").setCreativeTab(CreativeTabs.tabMaterials);
        fcItemGlue = (new Item(ParseID("fcGlueID", 247))).SetNeutralBuoyant().SetIncineratedInCrucible().setUnlocalizedName("fcItemGlue").setCreativeTab(CreativeTabs.tabMaterials);
        fcItemTallow = (new Item(ParseID("fcTallowID", 248))).SetBuoyant().SetIncineratedInCrucible().setUnlocalizedName("fcItemTallow").setCreativeTab(CreativeTabs.tabMaterials);
        fcItemHaft = (new Item(ParseID("fcHaftID", 249))).SetBuoyant().SetIncineratedInCrucible().SetFilterableProperties(4).setUnlocalizedName("fcItemHaft").setCreativeTab(CreativeTabs.tabMaterials);
        fcItemSteel = (new Item(ParseID("fcSteelID", 250))).setUnlocalizedName("fcItemIngotSteel").setCreativeTab(CreativeTabs.tabMaterials);
        fcItemRefinedPickAxe = new FCItemRefinedPickAxe(ParseID("fcRefinedPickAxeID", 251));
        fcItemRefinedShovel = new FCItemRefinedShovel(ParseID("fcRefinedShovelID", 252));
        fcItemRefinedHoe = new FCItemRefinedHoe(ParseID("fcRefinedHoeID", 253));
        fcItemBattleAxe = new FCItemBattleAxe(ParseID("fcBattleAxeID", 254));
        fcItemRefinedSword = new FCItemRefinedSword(ParseID("fcRefinedSwordID", 255));
        fcItemGroundNetherrack = (new Item(ParseID("fcGroundNetherrackID", 256))).SetBellowsBlowDistance(2).setUnlocalizedName("fcItemNetherrackGround").SetFilterableProperties(8).setCreativeTab(CreativeTabs.tabMaterials);
        fcItemHellfireDust = (new Item(ParseID("fcHellfireDustID", 257))).SetBellowsBlowDistance(3).setUnlocalizedName("fcItemDustHellfire").SetFilterableProperties(8).setCreativeTab(CreativeTabs.tabMaterials);
        fcItemConcentratedHellfire = (new Item(ParseID("fcConcentratedHellfireID", 258))).setUnlocalizedName("fcItemConcentratedHellfire").setCreativeTab(CreativeTabs.tabMaterials);
        fcItemArmorPlate = (new Item(ParseID("fcArmorPlateID", 259))).setUnlocalizedName("fcItemArmorPlate").setCreativeTab(CreativeTabs.tabMaterials);
        fcItemPlateHelm = (new FCItemArmorRefined(ParseID("fcPlateHelmID", 260), 0, 10)).setUnlocalizedName("fcItemHelmetPlate");
        fcItemPlateBreastPlate = (new FCItemArmorRefined(ParseID("fcPlateBreastPlateID", 261), 1, 14)).setUnlocalizedName("fcItemChestplatePlate");
        fcItemPlateLeggings = (new FCItemArmorRefined(ParseID("fcPlateLeggingsID", 262), 2, 12)).setUnlocalizedName("fcItemLeggingsPlate");
        fcItemPlateBoots = (new FCItemArmorRefined(ParseID("fcPlateBootsID", 263), 3, 8)).setUnlocalizedName("fcItemBootsPlate");
        fcItemCompositeBow = new FCItemCompositeBow(ParseID("fcCompositeBowID", 264));
        fcItemBroadheadArrowhead = (new Item(ParseID("fcBroadheadArrowheadID", 265))).SetFilterableProperties(2).setUnlocalizedName("fcItemArrowheadBroadhead").setCreativeTab(CreativeTabs.tabMaterials);
        fcItemBroadheadArrow = new FCItemArrowBroadhead(ParseID("fcBroadheadArrowID", 266));
        fcItemCoalDust = (new Item(ParseID("fcCoalDustID", 267))).SetBellowsBlowDistance(3).SetFurnaceBurnTime(FCEnumFurnaceBurnTime.COAL.m_iBurnTime / 2).SetFilterableProperties(8).setUnlocalizedName("fcItemDustCoal").setCreativeTab(CreativeTabs.tabMaterials);
        fcItemPadding = (new Item(ParseID("fcPaddingID", 268))).SetBuoyant().SetIncineratedInCrucible().setUnlocalizedName("fcItemPadding").setCreativeTab(CreativeTabs.tabMaterials);
        fcItemFilament = (new Item(ParseID("fcFilamentID", 269))).SetBellowsBlowDistance(1).SetFilterableProperties(2).setUnlocalizedName("fcItemFilament").setCreativeTab(CreativeTabs.tabMaterials);
        fcItemPolishedLapis = (new Item(ParseID("fcPolishedLapisID", 270))).SetFilterableProperties(2).setUnlocalizedName("fcItemRedstoneEye").setCreativeTab(CreativeTabs.tabMaterials);
        fcItemUrn = (new FCItemPlacesAsBlock(ParseID("fcUrnID", 271), fcAestheticNonOpaque.blockID, 0, "fcItemUrn")).SetBuoyant().setCreativeTab(CreativeTabs.tabMaterials);
        fcItemSoulUrn = new FCItemSoulUrn(ParseID("fcSoulUrnID", 272));
        fcItemHardBoiledEgg = new FCItemHardBoiledEgg(ParseID("fcHardBoiledEggID", 273));
        fcItemPotash = (new Item(ParseID("fcPotashID", 274))).SetBellowsBlowDistance(3).SetFilterableProperties(8).setUnlocalizedName("fcItemPotash").setCreativeTab(CreativeTabs.tabMaterials);
        fcItemSoap = (new FCItemSoap(ParseID("fcSoapID", 275))).SetIncineratedInCrucible().SetFilterableProperties(2).setCreativeTab(CreativeTabs.tabMaterials);
        fcItemSawDust = (new Item(ParseID("fcSawDustID", 276))).SetBuoyant().SetBellowsBlowDistance(3).SetFurnaceBurnTime(FCEnumFurnaceBurnTime.KINDLING).SetIncineratedInCrucible().SetFilterableProperties(8).setUnlocalizedName("fcItemDustSaw").setCreativeTab(CreativeTabs.tabMaterials);
        fcItemArmorGimpHelm = (new FCItemArmorGimp(ParseID("fcTannedLeatherHelmID", 277), 0)).setUnlocalizedName("fcItemGimpHelm");
        fcItemArmorGimpChest = (new FCItemArmorGimp(ParseID("fcTannedLeatherChestID", 278), 1)).setUnlocalizedName("fcItemGimpChest");
        fcItemArmorGimpLeggings = (new FCItemArmorGimp(ParseID("fcTannedLeatherLeggingsID", 279), 2)).setUnlocalizedName("fcItemGimpLeggings");
        fcItemArmorGimpBoots = (new FCItemArmorGimp(ParseID("fcTannedLeatherBootsID", 280), 3)).setUnlocalizedName("fcItemGimpBoots");
        fcItemDynamite = new FCItemDynamite(ParseID("fcDynamiteID", 281));
        fcItemBreedingHarness = new FCItemBreedingHarness(ParseID("fcBreedingHarnessID", 282));
        fcItemSoulDust = (new Item(ParseID("fcSoulDustID", 283))).SetBuoyant().SetBellowsBlowDistance(3).SetFurnaceBurnTime(FCEnumFurnaceBurnTime.KINDLING).SetIncineratedInCrucible().SetFilterableProperties(8).setUnlocalizedName("fcItemDustSoul").setCreativeTab(CreativeTabs.tabMaterials);
        fcItemMattock = new FCItemMattock(ParseID("fcMattockID", 284));
        fcItemRefinedAxe = new FCItemRefinedAxe(ParseID("fcRefinedAxeID", 285));
        fcItemNetherSludge = new FCItemNetherSludge(ParseID("fcNetherSludgeID", 286));
        fcItemNetherBrick = new FCItemNetherBrick(ParseID("fcNetherBrickID", 287));
        fcItemTuningFork = new FCItemTuningFork(ParseID("fcItemTuningForkID", 22222));
        fcItemArcaneScroll = new FCItemArcaneScroll(ParseID("fcItemArcaneScrollID", 22223));
        fcItemCandle = new FCItemCandle(ParseID("fcItemCandleID", 22224));
        fcItemBloodMossSpores = new FCItemBloodMossSpores(ParseID("fcItemNetherGrowthSporesID", 22225));
        fcItemMould = (new FCItemMould(ParseID("fcItemMouldID", 22226))).setUnlocalizedName("fcItemMould");
        fcItemCanvas = new FCItemCanvas(ParseID("fcItemCanvasID", 22227));
        fcItemDogFood = (new FCItemFood(ParseID("fcItemDogFoodID", 22228), 3, 0.0F, true, "fcItemKibble")).SetStandardFoodPoisoningEffect().SetFilterableProperties(2);
        fcItemRawEgg = (new FCItemFood(ParseID("fcItemRawEggID", 22229), 2, 0.25F, false, "fcItemEggRaw")).SetStandardFoodPoisoningEffect().SetFilterableProperties(2);
        fcItemFriedEgg = (new FCItemFood(ParseID("fcItemFriedEggID", 22230), 3, 0.25F, false, "fcItemEggFried")).SetFilterableProperties(2);
        fcItemScrew = (new Item(ParseID("fcItemScrewID", 22231))).setUnlocalizedName("fcItemScrew").setCreativeTab(CreativeTabs.tabMaterials);
        fcItemRottenArrow = new FCItemArrowRotten(ParseID("fcItemRottenArrowID", 22232));
        fcItemOcularOfEnder = (new Item(ParseID("fcItemOcularOfEnderID", 22233))).setUnlocalizedName("fcItemOcularOfEnder").setCreativeTab(CreativeTabs.tabMaterials);
        fcItemEnderSpectacles = (new FCItemArmorSpecial(ParseID("fcItemEnderSpectaclesID", 22234), 0)).setUnlocalizedName("fcItemEnderSpectacles");
        fcItemStake = (new ItemReed(ParseID("fcItemStakeID", 22235), fcBlockStake)).SetBuoyant().SetFilterableProperties(1).setUnlocalizedName("fcItemStake").setCreativeTab(CreativeTabs.tabTools);
        fcItemBrimstone = (new Item(ParseID("fcItemBrimstoneID", 22236))).SetBellowsBlowDistance(3).SetFilterableProperties(8).setUnlocalizedName("fcItemBrimstone").setCreativeTab(CreativeTabs.tabMaterials);
        fcItemNitre = (new Item(ParseID("fcItemNitreID", 22237))).SetBellowsBlowDistance(3).SetFilterableProperties(8).setUnlocalizedName("fcItemNitre").setCreativeTab(CreativeTabs.tabMaterials);
        fcItemElement = (new Item(ParseID("fcItemElementID", 22238))).SetBellowsBlowDistance(1).setUnlocalizedName("fcItemElement").SetFilterableProperties(2).setCreativeTab(CreativeTabs.tabMaterials);
        fcItemFuse = (new Item(ParseID("fcItemFuseID", 22239))).SetBuoyant().SetBellowsBlowDistance(2).SetFilterableProperties(18).setUnlocalizedName("fcItemFuse").setCreativeTab(CreativeTabs.tabMaterials);
        fcItemBlastingOil = (new Item(ParseID("fcItemBlastingOilID", 22240))).setUnlocalizedName("fcItemBlastingOil").setCreativeTab(CreativeTabs.tabMaterials);
        fcItemWindMillVertical = new FCItemWindMillVertical(ParseID("fcItemWindMillVerticalID", 22241));
        fcItemBoiledPotato = (new FCItemFood(ParseID("fcItemBoiledPotatoID", 22242), 2, 0.0F, false, "fcItemPotatoBoiled")).SetAsBasicPigFood().SetFilterableProperties(2);
        fcItemMuttonRaw = (new FCItemFood(ParseID("fcItemMuttonRawID", 22243), 3, 0.25F, true, "fcItemMuttonRaw", true)).SetStandardFoodPoisoningEffect();
        fcItemMuttonCooked = new FCItemFood(ParseID("fcItemMuttonCookedID", 22244), 4, 0.25F, true, "fcItemMuttonCooked");
        fcItemWitchWart = (new Item(ParseID("fcItemWitchWartID", 22245))).SetBuoyant().SetBellowsBlowDistance(1).SetFilterableProperties(2).setPotionEffect(PotionHelper.redstoneEffect).setUnlocalizedName("fcItemWitchWart");
        fcItemCookedCarrot = (new FCItemFood(ParseID("fcItemCookedCarrotID", 22246), 2, 0.0F, false, "fcItemCarrotCooked")).SetAsBasicPigFood();
        fcItemTastySandwich = new FCItemFood(ParseID("fcItemTastySandwichID", 22247), 5, 0.25F, true, "fcItemSandwichTasty");
        fcItemSteakAndPotatoes = new FCItemFood(ParseID("fcItemSteakAndPotatoesID", 22248), 6, 0.25F, true, "fcItemSteakAndPotatoes");
        fcItemHamAndEggs = new FCItemFood(ParseID("fcItemHamAndEggsID", 22249), 6, 0.25F, true, "fcItemHamAndEggs");
        fcItemSteakDinner = new FCItemFood(ParseID("fcItemSteakDinnerID", 22250), 8, 0.25F, true, "fcItemDinnerSteak");
        fcItemPorkDinner = new FCItemFood(ParseID("fcItemPorkDinnerID", 22251), 8, 0.25F, true, "fcItemDinnerPork");
        fcItemWolfDinner = new FCItemFood(ParseID("fcItemWolfDinnerID", 22252), 8, 0.25F, true, "fcItemDinnerWolf");
        fcItemRawKebab = (new FCItemFood(ParseID("fcItemRawKebabID", 22253), 6, 0.25F, true, "fcItemKebabRaw")).SetStandardFoodPoisoningEffect();
        fcItemCookedKebab = new FCItemFood(ParseID("fcItemCookedKebabID", 22254), 8, 0.25F, true, "fcItemKebabCooked");
        fcItemChickenSoup = new FCItemSoup(ParseID("fcItemChickenSoupID", 22255), 8, 0.25F, true, "fcItemSoupChicken");
        fcItemFishSoup = new FCItemSoup(ParseID("fcItemFishSoupID", 22256), 5, 0.25F, false, "fcItemChowder");
        fcItemHeartyStew = new FCItemSoup(ParseID("fcItemHeartyStewID", 22257), 10, 0.25F, true, "fcItemStewHearty");
        fcItemMushroomRed = (new FCItemMushroom(ParseID("fcItemMushroomRedID", 22258), 1, 0.0F, "fcItemMushroomRed", Block.mushroomRed.blockID)).setPotionEffect(Potion.poison.id, 5, 0, 1.0F).SetFilterableProperties(2).setPotionEffect(PotionHelper.spiderEyeEffect);
        fcItemMushroomBrown = (new FCItemMushroom(ParseID("fcItemMushroomBrownID", 22259), 1, 0.0F, "fcItemMushroomBrown", Block.mushroomBrown.blockID)).SetFilterableProperties(2);
        fcItemNuggetIron = (new Item(ParseID("fcItemNuggetIronID", 22260))).SetFilterableProperties(2).setUnlocalizedName("fcItemNuggetIron").setCreativeTab(CreativeTabs.tabMaterials);
        fcItemMail = (new Item(ParseID("fcItemMailID", 22261))).setUnlocalizedName("fcItemMail");
        fcItemRawMysteryMeat = new FCItemMysteryMeatRaw(ParseID("fcItemRawMysteryMeatID", 22262));
        fcItemCookedMysteryMeat = new FCItemMysteryMeatCooked(ParseID("fcItemCookedMysteryMeatID", 22263));
        fcItemRawMushroomOmelet = (new FCItemFood(ParseID("fcItemRawMushroomOmeletID", 22264), 3, 0.25F, false, "fcItemMushroomOmletRaw")).SetStandardFoodPoisoningEffect();
        fcItemCookedMushroomOmelet = new FCItemFood(ParseID("fcItemCookedMushroomOmeletID", 22265), 4, 0.25F, false, "fcItemMushroomOmletCooked");
        fcItemRawScrambledEggs = (new FCItemFood(ParseID("fcItemRawScrambledEggsID", 22266), 3, 0.25F, false, "fcItemEggScrambledRaw")).SetStandardFoodPoisoningEffect();
        fcItemCookedScrambledEggs = new FCItemFood(ParseID("fcItemCookedScrambledEggsID", 22267), 4, 0.25F, false, "fcItemEggScrambledCooked");
        fcItemCreeperOysters = new FCItemCreeperOysters(ParseID("fcItemCreeperOystersID", 22268));
        fcItemArmorWoolHelm = (new FCItemArmorWool(ParseID("fcItemArmorWoolHelmID", 22269), 0)).setUnlocalizedName("fcItemWoolHelm");
        fcItemArmorWoolChest = (new FCItemArmorWool(ParseID("fcItemArmorWoolChestID", 22270), 1)).setUnlocalizedName("fcItemWoolChest");
        fcItemArmorWoolLeggings = (new FCItemArmorWool(ParseID("fcItemArmorWoolLeggingsID", 22271), 2)).setUnlocalizedName("fcItemWoolLeggings");
        fcItemArmorWoolBoots = (new FCItemArmorWool(ParseID("fcItemArmorWoolBootsID", 22272), 3)).setUnlocalizedName("fcItemWoolBoots");
        fcItemArmorPaddedHelm = (new FCItemArmorPadded(ParseID("fcItemArmorPaddedHelmID", 22273), 0)).setUnlocalizedName("fcItemPaddedHelm");
        fcItemArmorPaddedChest = (new FCItemArmorPadded(ParseID("fcItemArmorPaddedChestID", 22274), 1)).setUnlocalizedName("fcItemPaddedChest");
        fcItemArmorPaddedLeggings = (new FCItemArmorPadded(ParseID("fcItemArmorPaddedLeggingsID", 22275), 2)).setUnlocalizedName("fcItemPaddedLeggings");
        fcItemArmorPaddedBoots = (new FCItemArmorPadded(ParseID("fcItemArmorPaddedBootsID", 22276), 3)).setUnlocalizedName("fcItemPaddedBoots");
        fcItemArmorTannedHelm = (new FCItemArmorTanned(ParseID("fcItemArmorTannedHelmID", 22277), 0)).setUnlocalizedName("fcItemTannedHelm");
        fcItemArmorTannedChest = (new FCItemArmorTanned(ParseID("fcItemArmorTannedChestID", 22278), 1)).setUnlocalizedName("fcItemTannedChest");
        fcItemArmorTannedLeggings = (new FCItemArmorTanned(ParseID("fcItemArmorTannedLeggingsID", 22279), 2)).setUnlocalizedName("fcItemTannedLeggings");
        fcItemArmorTannedBoots = (new FCItemArmorTanned(ParseID("fcItemArmorTannedBootsID", 22280), 3)).setUnlocalizedName("fcItemTannedBoots");
        fcItemIngotDiamond = (new Item(ParseID("fcItemIngotDiamondID", 22281))).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("fcItemIngotDiamond");
        fcItemLeatherCut = (new Item(ParseID("fcItemLeatherCutID", 22282))).SetBuoyant().SetFilterableProperties(16).setUnlocalizedName("fcItemLeatherCut");
        fcItemTannedLeatherCut = (new Item(ParseID("fcItemTannedLeatherCutID", 22283))).SetBuoyant().SetFilterableProperties(16).setUnlocalizedName("fcItemLeatherTannedCut");
        fcItemScouredLeatherCut = (new Item(ParseID("fcItemScouredLeatherCutID", 22284))).SetBuoyant().SetFilterableProperties(16).setUnlocalizedName("fcItemLeatherScouredCut");
        fcItemFishingRodBaited = new FCItemFishingRodBaited(ParseID("fcItemFishingRodBaitedID", 22285));
        fcItemPileDirt = new FCItemPileDirt(ParseID("fcItemPileDirtID", 22286));
        fcItemPileSand = new FCItemPileSand(ParseID("fcItemPileSandID", 22287));
        fcItemPileGravel = new FCItemPileGravel(ParseID("fcItemPileGravelID", 22288));
        fcItemBatWing = (new FCItemFood(ParseID("fcItemBatWingID", 22289), 1, 0.8F, false, "fcItemBatWing")).SetStandardFoodPoisoningEffect().SetBellowsBlowDistance(3).SetFilterableProperties(18);
        fcItemGoldenDung = (new Item(ParseID("fcItemGoldenDungID", 22290))).setUnlocalizedName("fcItemDungGolden");
        fcItemBark = new FCItemBark(ParseID("fcItemBarkID", 22291));
        fcItemPileSoulSand = new FCItemPileSoulSand(ParseID("fcItemPileSoulSandID", 22292));
        fcItemRedstoneLatch = (new Item(ParseID("fcItemRedstoneLatchID", 22293))).setUnlocalizedName("fcItemRedstoneLatch");
        fcItemNuggetSteel = (new Item(ParseID("fcItemNuggetSteelID", 22294))).setUnlocalizedName("fcItemNuggetSteel");
        fcItemWool = new FCItemWool(ParseID("fcItemWoolID", 2295));
        fcItemCocoaBeans = new FCItemCocoaBeans(ParseID("fcItemCocoaBeansID", 2296));
        fcItemChocolate = (new FCItemFood(ParseID("fcItemChocolateID", 2297), 2, 0.5F, true, "fcItemChocolate")).setAlwaysEdible().SetFilterableProperties(2);
        fcItemBucketMilkChocolate = new FCItemBucketMilkChocolate(ParseID("fcItemBucketChocolateMilkID", 2298));
        fcItemSoulFlux = new FCItemSoulFlux(ParseID("fcItemSoulFluxID", 2299));
        fcItemEnderSlag = (new Item(ParseID("fcItemEnderSlagID", 2300))).SetBellowsBlowDistance(1).SetFilterableProperties(8).setUnlocalizedName("fcItemEnderSlag");
        fcItemPastryUncookedCake = (new FCItemPlacesAsBlock(ParseID("fcItemPastryUncookedCakeID", 2301), fcUnfiredPottery.blockID, 9, "fcItemPastryUncookedCake")).SetBuoyant().setCreativeTab(CreativeTabs.tabFood);
        fcItemPastryUncookedCookies = (new FCItemPlacesAsBlock(ParseID("fcItemPastryUncookedCookiesID", 2302), fcUnfiredPottery.blockID, 10, "fcItemPastryUncookedCookies")).SetBuoyant().setCreativeTab(CreativeTabs.tabFood);
        fcItemPastryUncookedPumpkinPie = (new FCItemPlacesAsBlock(ParseID("fcItemPastryUncookedPumpkinPieID", 2303), fcUnfiredPottery.blockID, 12, "fcItemPastryUncookedPumpkinPie")).SetBuoyant().setCreativeTab(CreativeTabs.tabFood);
        fcItemMysteriousGland = new FCItemMysteriousGland(ParseID("fcItemMysteriousGlandID", 2304));
        fcItemBeastLiverRaw = (new FCItemFood(ParseID("fcItemBeastLiverRawID", 2305), 5, 0.5F, true, "fcItemBeastLiverRaw")).SetStandardFoodPoisoningEffect();
        fcItemBeastLiverCooked = new FCItemFood(ParseID("fcItemBeastLiverCookedID", 2306), 6, 0.5F, true, "fcItemBeastLiverCooked");
        fcItemAncientProphecy = new FCItemAncientProphecy(ParseID("fcItemAncientProphecyID", 2307));
        fcItemStumpRemover = new FCItemStumpRemover(ParseID("fcItemStumpRemoverID", 2308));
        fcItemChiselWood = new FCItemChiselWood(ParseID("fcItemChiselWoodID", 22309));
        fcItemStone = (new Item(ParseID("fcItemStoneID", 22310))).SetFilterableProperties(2).setUnlocalizedName("fcItemStone").setCreativeTab(CreativeTabs.tabMaterials);
        fcItemChiselStone = new FCItemChiselStone(ParseID("fcItemChiselStoneID", 22311));
        fcItemClubWood = new FCItemClubWood(ParseID("fcItemClubID", 22312));
        fcItemFireStarterSticks = (new FCItemFireStarterPrimitive(ParseID("fcItemFireStarterSticksID", 22313), 250, 0.05F, -0.1F, 0.1F, 0.001F)).SetFilterableProperties(4).setUnlocalizedName("fcItemFireStarterSticks");
        fcItemFireStarterBow = (new FCItemFireStarterPrimitive(ParseID("fcItemFireStarterBowID", 22314), 250, 0.025F, -0.1F, 0.1F, 0.004F)).setUnlocalizedName("fcItemFireStarterBow");
        fcItemChunkIronOre = new FCItemChunkOreIron(ParseID("fcItemChunkIronOreID", 22315));
        fcItemPileIronOre = (new Item(ParseID("fcItemPileIronOreID", 22316))).SetFilterableProperties(8).setUnlocalizedName("fcItemPileIronOre").setCreativeTab(CreativeTabs.tabMaterials);
        fcItemChiselIron = new FCItemChiselIron(ParseID("fcItemChiselIronID", 22317));
        fcItemChunkGoldOre = new FCItemChunkOreGold(ParseID("fcItemChunkGoldOreID", 22318));
        fcItemPileGoldOre = (new Item(ParseID("fcItemPileGoldOreID", 22319))).SetFilterableProperties(8).setUnlocalizedName("fcItemPileGoldOre").setCreativeTab(CreativeTabs.tabMaterials);
        fcItemWickerPiece = new FCItemWickerPiece(ParseID("fcItemWickerPieceID", 22320));
        fcItemKnittingNeedles = new FCItemKnittingNeedles(ParseID("fcItemKnittingNeedlesID", 22321));
        fcItemKnitting = new FCItemKnitting(ParseID("fcItemKnittingID", 22322));
        fcItemWoolKnit = new FCItemWoolKnit(ParseID("fcItemWoolKnitID", 22323));
        fcItemClubBone = new FCItemClub(ParseID("fcItemClubBoneID", 22324), 20, 4, "fcItemClubBone");
        fcItemMeatCured = new FCItemFoodCured(ParseID("fcItemMeatCuredID", 22325), 2, 0.25F, "fcItemMeatCured");
        fcItemMetalFragment = (new Item(ParseID("fcItemMetalFragmentID", 22326))).SetFilterableProperties(2).setUnlocalizedName("fcItemMetalFragment").setCreativeTab(CreativeTabs.tabMisc);
        fcItemPileClay = (new Item(ParseID("fcItemPileClayID", 22327))).SetFilterableProperties(2).setUnlocalizedName("fcItemPileClay").setCreativeTab(CreativeTabs.tabMaterials);
        fcItemMeatBurned = new FCItemFood(ParseID("fcItemMeatBurnedID", 22328), 2, 0.25F, true, "fcItemMeatBurned");
        fcItemChickenFeed = (new Item(ParseID("fcItemChickenFeedID", 22329))).SetAsBasicChickenFood().SetBellowsBlowDistance(2).SetFilterableProperties(8).setUnlocalizedName("fcItemChickenFeed").setCreativeTab(CreativeTabs.tabFood);
        fcItemFishHookBone = (new Item(ParseID("fcItemFishHookBoneID", 22330))).SetBellowsBlowDistance(2).SetFilterableProperties(2).setUnlocalizedName("fcItemFishHookBone").setCreativeTab(CreativeTabs.tabMisc);
        fcItemCarvingBone = new FCItemCarvingBone(ParseID("fcItemCarvingBoneID", 22331));
        fcItemStoneBrick = (new Item(ParseID("fcItemBrickStoneID", 22332))).setUnlocalizedName("fcItemBrickStone").setCreativeTab(CreativeTabs.tabMaterials);
        fcItemWickerWeaving = new FCItemWickerWeaving(ParseID("fcItemWickerWeavingID", 22333));
        fcItemWheat = new FCItemWheat(ParseID("fcItemWheatID", 22334));
        fcItemWheatSeeds = new FCItemWheatSeeds(ParseID("fcItemWheatSeedsID", 22335));
        fcItemBreadDough = (new FCItemPlacesAsBlock(ParseID("fcItemBreadDoughID", 22336), fcUnfiredPottery.blockID, 13, "fcItemBreadDough")).SetBuoyant().SetIncineratedInCrucible().setCreativeTab(CreativeTabs.tabFood);
        fcItemStraw = new FCItemStraw(ParseID("fcItemStrawID", 22337));
        fcItemBrickUnfired = new FCItemBrickUnfired(ParseID("fcItemBrickUnfiredID", 22338));
        fcItemNetherBrickUnfired = new FCItemNetherBrickUnfired(ParseID("fcItemNetherBrickUnfiredID", 22339));
        this.CreateAssociatedItemsForModBlocks();
    }

    private void CreateAssociatedItemsForModBlocks()
    {
        this.RegisterCustomBlockItems();

        for (int var1 = 0; var1 < 4096; ++var1)
        {
            if (Block.blocksList[var1] != null && Item.itemsList[var1] == null)
            {
                Item.itemsList[var1] = new ItemBlock(var1 - 256);
            }
        }
    }

    private void RegisterCustomBlockItems()
    {
        Item.m_bSuppressConflictWarnings = true;
        Item.itemsList[fcBlockSlabSandAndGravel.blockID] = new FCItemBlockSlabSandAndGravel(fcBlockSlabSandAndGravel.blockID - 256);
        Item.itemsList[fcBlockAestheticOpaqueEarth.blockID] = new FCItemBlockAestheticOpaqueEarth(fcBlockAestheticOpaqueEarth.blockID - 256);
        Item.itemsList[fcBlockMiningCharge.blockID] = new FCItemBlockMiningCharge(fcBlockMiningCharge.blockID - 256);
        Item.itemsList[fcWoolSlab.blockID] = new FCItemBlockWoolSlab(fcWoolSlab.blockID - 256);
        Item.itemsList[fcCompanionCube.blockID] = new FCItemBlockCompanionCube(fcCompanionCube.blockID - 256);
        Item.itemsList[fcMillStone.blockID] = new FCItemBlockMillStone(fcMillStone.blockID - 256);
        Item.itemsList[fcUnfiredPottery.blockID] = new FCItemBlockUnfiredPottery(fcUnfiredPottery.blockID - 256);
        Item.itemsList[fcVase.blockID] = new FCItemBlockVase(fcVase.blockID - 256);
        Item.itemsList[fcPlanter.blockID] = new FCItemBlockPlanter(fcPlanter.blockID - 256);
        Item.itemsList[fcAestheticNonOpaque.blockID] = new FCItemBlockAestheticNonOpaque(fcAestheticNonOpaque.blockID - 256);
        Item.itemsList[fcAestheticOpaque.blockID] = new FCItemBlockAestheticOpaque(fcAestheticOpaque.blockID - 256);
        Item.itemsList[fcAestheticVegetation.blockID] = new FCItemBlockAestheticVegetation(fcAestheticVegetation.blockID - 256);
        Item.itemsList[fcBloodWood.blockID] = new FCItemBlockBloodWood(fcBloodWood.blockID - 256);
        Item.itemsList[fcBlockBloodLeaves.blockID] = new FCItemBlockLeaves(fcBlockBloodLeaves.blockID - 256);
        Item.itemsList[fcBlockDirtSlab.blockID] = new FCItemBlockDirtSlab(fcBlockDirtSlab.blockID - 256);
        Item.itemsList[fcBlockWhiteStoneStairs.blockID] = new FCItemBlockStairsWhiteStone(fcBlockWhiteStoneStairs.blockID - 256);
        Item.itemsList[fcBlockLegacySmoothstoneAndOakSiding.blockID] = new FCItemBlockLegacySiding(fcBlockLegacySmoothstoneAndOakSiding.blockID - 256);
        Item.itemsList[fcBlockLegacySmoothstoneAndOakCorner.blockID] = new FCItemBlockLegacyCorner(fcBlockLegacySmoothstoneAndOakCorner.blockID - 256);
        Item.itemsList[fcBlockStoneBrickSidingAndCorner.blockID] = new FCItemBlockSidingAndCorner(fcBlockStoneBrickSidingAndCorner.blockID - 256);
        Item.itemsList[fcBlockStoneBrickMouldingAndDecorative.blockID] = new FCItemBlockMouldingAndDecorative(fcBlockStoneBrickMouldingAndDecorative.blockID - 256);
        Item.itemsList[fcBlockWoodOakSidingAndCorner.blockID] = new FCItemBlockSidingAndCorner(fcBlockWoodOakSidingAndCorner.blockID - 256);
        Item.itemsList[fcBlockWoodOakMouldingAndDecorative.blockID] = new FCItemBlockMoulding(fcBlockWoodOakMouldingAndDecorative.blockID - 256);
        Item.itemsList[fcBlockWoodSpruceSidingAndCorner.blockID] = new FCItemBlockWoodSidingStub(fcBlockWoodSpruceSidingAndCorner.blockID - 256);
        Item.itemsList[fcBlockWoodSpruceMouldingAndDecorative.blockID] = new FCItemBlockWoodMouldingStub(fcBlockWoodSpruceMouldingAndDecorative.blockID - 256);
        Item.itemsList[fcBlockWoodBirchSidingAndCorner.blockID] = new FCItemBlockWoodCornerStub(fcBlockWoodBirchSidingAndCorner.blockID - 256);
        Item.itemsList[fcBlockWoodBirchMouldingAndDecorative.blockID] = new FCItemBlockWoodMouldingDecorativeStub(fcBlockWoodBirchMouldingAndDecorative.blockID - 256);
        Item.itemsList[fcBlockWoodJungleSidingAndCorner.blockID] = new FCItemBlockWoodSidingDecorativeStub(fcBlockWoodJungleSidingAndCorner.blockID - 256);
        Item.itemsList[fcBlockWoodJungleMouldingAndDecorative.blockID] = new FCItemBlockMoulding(fcBlockWoodJungleMouldingAndDecorative.blockID - 256);
        Item.itemsList[fcBlockWoodBloodSidingAndCorner.blockID] = new FCItemBlockSidingAndCorner(fcBlockWoodBloodSidingAndCorner.blockID - 256);
        Item.itemsList[fcBlockWoodBloodMouldingAndDecorative.blockID] = new FCItemBlockMoulding(fcBlockWoodBloodMouldingAndDecorative.blockID - 256);
        fcBlockWoodSidingItemStubID = fcBlockWoodSpruceSidingAndCorner.blockID;
        fcBlockWoodMouldingItemStubID = fcBlockWoodSpruceMouldingAndDecorative.blockID;
        fcBlockWoodCornerItemStubID = fcBlockWoodBirchSidingAndCorner.blockID;
        fcBlockWoodMouldingDecorativeItemStubID = fcBlockWoodBirchMouldingAndDecorative.blockID;
        fcBlockWoodSidingDecorativeItemStubID = fcBlockWoodJungleSidingAndCorner.blockID;
        Item.itemsList[fcBlockWhiteStoneSidingAndCorner.blockID] = new FCItemBlockSidingAndCorner(fcBlockWhiteStoneSidingAndCorner.blockID - 256);
        Item.itemsList[fcBlockWhiteStoneMouldingAndDecorative.blockID] = new FCItemBlockMouldingAndDecorative(fcBlockWhiteStoneMouldingAndDecorative.blockID - 256);
        Item.itemsList[fcBlockNetherBrickSidingAndCorner.blockID] = new FCItemBlockSidingAndCorner(fcBlockNetherBrickSidingAndCorner.blockID - 256);
        Item.itemsList[fcBlockNetherBrickMouldingAndDecorative.blockID] = new FCItemBlockMouldingAndDecorative(fcBlockNetherBrickMouldingAndDecorative.blockID - 256);
        Item.itemsList[fcBlockBrickSidingAndCorner.blockID] = new FCItemBlockSidingAndCorner(fcBlockBrickSidingAndCorner.blockID - 256);
        Item.itemsList[fcBlockBrickMouldingAndDecorative.blockID] = new FCItemBlockMouldingAndDecorative(fcBlockBrickMouldingAndDecorative.blockID - 256);
        Item.itemsList[fcBlockSmoothStoneSidingAndCorner.blockID] = new FCItemBlockSidingAndCorner(fcBlockSmoothStoneSidingAndCorner.blockID - 256);
        Item.itemsList[fcBlockSmoothStoneMouldingAndDecorative.blockID] = new FCItemBlockMouldingAndDecorative(fcBlockSmoothStoneMouldingAndDecorative.blockID - 256);
        Item.itemsList[fcBlockSandstoneSidingAndCorner.blockID] = new FCItemBlockSidingAndCorner(fcBlockSandstoneSidingAndCorner.blockID - 256);
        Item.itemsList[fcBlockSandstoneMouldingAndDecorative.blockID] = new FCItemBlockMouldingAndDecorative(fcBlockSandstoneMouldingAndDecorative.blockID - 256);
        Item.itemsList[fcBlockSidingAndCornerBlackStone.blockID] = new FCItemBlockSidingAndCorner(fcBlockSidingAndCornerBlackStone.blockID - 256);
        Item.itemsList[fcBlockMouldingAndDecorativeBlackStone.blockID] = new FCItemBlockMouldingAndDecorative(fcBlockMouldingAndDecorativeBlackStone.blockID - 256);
        Item.itemsList[fcBlockSoulforgeDormant.blockID] = new FCItemBlockSoulforgeDormant(fcBlockSoulforgeDormant.blockID - 256);
        Item.itemsList[fcBlockRottenFleshSlab.blockID] = new FCItemBlockSlab(fcBlockRottenFleshSlab.blockID - 256);
        Item.itemsList[fcBlockBoneSlab.blockID] = new FCItemBlockSlab(fcBlockBoneSlab.blockID - 256);
        Item.itemsList[fcBlockPumpkinFresh.blockID] = new FCItemBlockPumpkinFresh(fcBlockPumpkinFresh.blockID - 256);
        Item.itemsList[fcBlockLogDamaged.blockID] = new FCItemBlockDamageToMetadata(fcBlockLogDamaged.blockID - 256);
        Item.itemsList[fcBlockDirtLooseSlab.blockID] = new FCItemBlockDirtLooseSlab(fcBlockDirtLooseSlab.blockID - 256);
        Item.itemsList[fcBlockBrickLooseSlab.blockID] = new FCItemBlockSlab(fcBlockBrickLooseSlab.blockID - 256);
        Item.itemsList[fcBlockCobblestoneLooseSlab.blockID] = new FCItemBlockSlab(fcBlockCobblestoneLooseSlab.blockID - 256);
        Item.itemsList[fcBlockTorchFiniteUnlit.blockID] = new FCItemBlockTorchFiniteIdle(fcBlockTorchFiniteUnlit.blockID - 256);
        Item.itemsList[fcBlockTorchFiniteBurning.blockID] = new FCItemBlockTorchFiniteBurning(fcBlockTorchFiniteBurning.blockID - 256);
        Item.itemsList[fcBlockTorchNetherUnlit.blockID] = new FCItemBlockTorchIdle(fcBlockTorchNetherUnlit.blockID - 256);
        Item.itemsList[fcBlockMyceliumSlab.blockID] = new FCItemBlockSlab(fcBlockMyceliumSlab.blockID - 256);
        Item.itemsList[fcBlockStumpCharred.blockID] = new FCItemBlockDamageToMetadata(fcBlockStumpCharred.blockID - 256);
        Item.itemsList[fcBlockSnowLooseSlab.blockID] = new FCItemBlockSnowLooseSlab(fcBlockSnowLooseSlab.blockID - 256);
        Item.itemsList[fcBlockSnowSolidSlab.blockID] = new FCItemBlockSlab(fcBlockSnowSolidSlab.blockID - 256);
        Item.itemsList[fcBlockCreeperOystersSlab.blockID] = new FCItemBlockSlab(fcBlockCreeperOystersSlab.blockID - 256);
        Item.itemsList[fcBlockTorchNetherBurning.blockID] = new FCItemBlockTorchBurning(fcBlockTorchNetherBurning.blockID - 256);
        Item.itemsList[fcBlockWickerSlab.blockID] = new FCItemBlockSlab(fcBlockWickerSlab.blockID - 256);
        Item.itemsList[Block.wood.blockID] = (new FCItemBlockLog(Block.wood.blockID - 256, Block.wood, BlockLog.woodType)).setUnlocalizedName("log");
        Item.itemsList[Block.planks.blockID] = (new ItemMultiTextureTile(Block.planks.blockID - 256, Block.planks, FCBlockPlanks.m_sWoodTypes)).setUnlocalizedName("wood");
        Item.itemsList[Block.lever.blockID] = (new FCItemBlockLever(Block.lever.blockID - 256)).setUnlocalizedName("lever");
        Item.itemsList[Block.ice.blockID] = (new FCItemBlockIce(Block.ice.blockID - 256)).setUnlocalizedName("ice");
        Item.itemsList[Block.snow.blockID] = (new FCItemBlockSnow(Block.snow.blockID - 256, Block.snow)).setUnlocalizedName("snow");
        Item.itemsList[Block.stone.blockID] = (new ItemBlockWithMetadata(Block.stone.blockID - 256, Block.stone)).setUnlocalizedName("stone");
        Item.itemsList[Block.cobblestone.blockID] = (new ItemBlockWithMetadata(Block.cobblestone.blockID - 256, Block.cobblestone)).setUnlocalizedName("stonebrick");
        Item.itemsList[Block.oreCoal.blockID] = (new ItemBlockWithMetadata(Block.oreCoal.blockID - 256, Block.oreCoal)).setUnlocalizedName("oreCoal");
        Item.itemsList[Block.oreIron.blockID] = (new ItemBlockWithMetadata(Block.oreIron.blockID - 256, Block.oreIron)).setUnlocalizedName("oreIron");
        Item.itemsList[Block.oreGold.blockID] = (new ItemBlockWithMetadata(Block.oreGold.blockID - 256, Block.oreGold)).setUnlocalizedName("oreGold");
        Item.itemsList[Block.oreDiamond.blockID] = (new ItemBlockWithMetadata(Block.oreDiamond.blockID - 256, Block.oreDiamond)).setUnlocalizedName("oreDiamond");
        Item.itemsList[Block.oreEmerald.blockID] = (new ItemBlockWithMetadata(Block.oreEmerald.blockID - 256, Block.oreEmerald)).setUnlocalizedName("oreEmerald");
        Item.itemsList[Block.oreLapis.blockID] = (new ItemBlockWithMetadata(Block.oreLapis.blockID - 256, Block.oreLapis)).setUnlocalizedName("oreLapis");
        Item.itemsList[Block.oreRedstone.blockID] = (new ItemBlockWithMetadata(Block.oreRedstone.blockID - 256, Block.oreRedstone)).setUnlocalizedName("oreRedstone");
        Item.itemsList[Block.waterlily.blockID] = (new FCItemBlockLilyPad(Block.waterlily.blockID - 256)).setUnlocalizedName("waterlily");
        Item.itemsList[Block.anvil.blockID] = (new FCItemBlockDeadWeight(Block.anvil.blockID - 256)).setUnlocalizedName("anvil");
        Item.itemsList[Block.torchWood.blockID] = (new FCItemBlockTorchLegacy(Block.torchWood.blockID - 256)).setUnlocalizedName("torch");
        Item.itemsList[Block.melon.blockID].setMaxStackSize(16);
        Item.itemsList[Block.workbench.blockID] = new FCItemBlockLegacySubstitution(Block.workbench.blockID - 256, fcBlockWorkbench.blockID);
        Item.itemsList[Block.chest.blockID] = new FCItemBlockLegacySubstitution(Block.chest.blockID - 256, fcBlockChest.blockID);
        Item.itemsList[Block.doorWood.blockID] = new FCItemBlockLegacySubstitution(Block.doorWood.blockID - 256, fcBlockDoorWood.blockID);
        Item.itemsList[Block.web.blockID] = new FCItemBlockLegacySubstitution(Block.web.blockID - 256, fcBlockWeb.blockID);
        Item.itemsList[Block.blockClay.blockID] = new FCItemBlockLegacySubstitution(Block.blockClay.blockID - 256, fcBlockUnfiredClay.blockID);
        Item.itemsList[Block.ladder.blockID] = new FCItemBlockLegacySubstitution(Block.ladder.blockID - 256, fcBlockLadder.blockID);
        Item.itemsList[Block.blockSnow.blockID] = new FCItemBlockLegacySubstitution(Block.blockSnow.blockID - 256, fcBlockSnowSolid.blockID);
        Item.m_bSuppressConflictWarnings = false;
    }

    private void CreateModTileEntityMappings()
    {
        TileEntity.addMapping(FCTileEntityCement.class, "Cement");
        TileEntity.addMapping(FCTileEntityCauldron.class, "fcCauldron");
        TileEntity.addMapping(FCTileEntityMillStone.class, "MillStone");
        TileEntity.ReplaceVanillaMapping(TileEntityHopper.class, FCTileEntityHopper.class, "Hopper");
        TileEntity.addMapping(FCTileEntityBlockDispenser.class, "BlockDispenser");
        TileEntity.addMapping(FCTileEntityPulley.class, "Pulley");
        TileEntity.addMapping(FCTileEntityTurntable.class, "Turntable");
        TileEntity.addMapping(FCTileEntityVase.class, "Vase");
        TileEntity.addMapping(FCTileEntityCrucible.class, "Crucible");
        TileEntity.addMapping(FCTileEntityInfernalEnchanter.class, "fcInfernalEnchanter");
        TileEntity.addMapping(FCTileEntityAnvil.class, "fcAnvil");
        TileEntity.addMapping(FCTileEntityArcaneVessel.class, "fcArcaneVessel");
        TileEntity.addMapping(FCTileEntityCampfire.class, "fcCampfire");
        TileEntity.addMapping(FCTileEntityUnfiredBrick.class, "fcUnfiredBrick");
        TileEntity.addMapping(FCTileEntityFurnaceBrick.class, "fcFurnaceBrick");
        TileEntity.addMapping(FCTileEntityTorchFinite.class, "fcTorchFinite");
        TileEntity.addMapping(FCTileEntityBasketWicker.class, "fcBasket");
        TileEntity.addMapping(FCTileEntityToolPlaced.class, "fcToolPlaced");
        TileEntity.addMapping(FCTileEntityHamper.class, "fcHamper");
        TileEntity.ReplaceVanillaMapping(TileEntityChest.class, FCTileEntityChest.class, "Chest");
        TileEntity.ReplaceVanillaMapping(TileEntityMobSpawner.class, FCTileEntityMobSpawner.class, "MobSpawner");
        TileEntity.ReplaceVanillaMapping(TileEntityBeacon.class, FCTileEntityBeacon.class, "Beacon");
        TileEntity.ReplaceVanillaMapping(TileEntityEnderChest.class, FCTileEntityEnderChest.class, "EnderChest");
    }

    private void CreateModEntityMappings()
    {
        EntityList.AddMapping(FCEntityWaterWheel.class, "WaterWheel", ParseID("fcWaterWheelEntityID", 222));
        EntityList.AddMapping(FCEntityWindMill.class, "WindMill", ParseID("fcWindMillEntityID", 223));
        EntityList.AddMapping(FCEntityMovingAnchor.class, "MovingAnchor", ParseID("fcMovingAnchorEntityID", 224));
        EntityList.AddMapping(FCEntityMovingPlatform.class, "MovingPlatform", ParseID("fcMovingPlatformEntityID", 225));
        EntityList.AddMapping(FCEntityBlockLiftedByPlatform.class, "BlockLiftedByPlatform", ParseID("fcBlockLiftedByPlatformEntityID", 226));
        EntityList.AddMapping(FCEntityBroadheadArrow.class, "BroadheadArrow", ParseID("fcBroadheadArrowEntityID", 227));
        EntityList.AddMapping(FCEntityUrn.class, "Urn", ParseID("fcUrnEntityID", 228));
        EntityList.AddMapping(FCEntityDynamite.class, "Dynamite", ParseID("fcDynamiteEntityID", 229));
        EntityList.AddMapping(FCEntityMiningCharge.class, "MiningCharge", ParseID("fcMiningChargeEntityID", 230));
        EntityList.AddMapping(FCEntityInfiniteArrow.class, "fcInfiniteArrow", ParseID("fcInfiniteArrowEntityID", 231));
        EntityList.AddMapping(FCEntityItemFloating.class, "fcItemFloating", ParseID("fcItemFloatingEntityID", 232));
        EntityList.AddMapping(FCEntityItemBloodWoodSapling.class, "fcItemBloodWoodSapling", ParseID("fcItemBloodWoodSaplingEntityID", 233));
        EntityList.AddMapping(FCEntityCanvas.class, "fcCanvas", ParseID("fcCanvasEntityID", 234));
        EntityList.AddMapping(FCEntityRottenArrow.class, "fcRottenArrow", ParseID("fcRottenArrowEntityID", 235));
        EntityList.AddMapping(FCEntityWindMillVertical.class, "fcWindMillVertical", ParseID("fcEntityWindMillVerticalID", 236));
        EntityList.AddMapping(FCEntitySpiderWeb.class, "fcSpiderWeb", ParseID("fcEntitySpiderWebID", 237));
        EntityList.AddMapping(FCEntityWolfDire.class, "fcDireWolf", ParseID("fcEntityDireWolfID", 238));
        EntityList.AddMapping(FCEntitySoulSand.class, "fcEntitySoulSand", ParseID("fcEntitySoulSandID", 239));
        EntityList.AddMapping(FCEntityJungleSpider.class, "fcJungleSpider", ParseID("fcEntityJungleSpiderID", 240));
        EntityList.AddMapping(FCEntityWitherPersistent.class, "fcWitherPersistent", ParseID("fcWitherPersistentID", 241));
        EntityList.ReplaceExistingMapping(FCEntityWitherSkull.class, "WitherSkull");
        EntityList.ReplaceExistingMapping(FCEntityFallingBlock.class, "FallingSand");
        EntityList.ReplaceExistingMapping(FCEntityCreeper.class, "Creeper");
        EntityList.ReplaceExistingMapping(FCEntitySkeleton.class, "Skeleton");
        EntityList.ReplaceExistingMapping(FCEntitySpider.class, "Spider");
        EntityList.ReplaceExistingMapping(FCEntityZombie.class, "Zombie");
        EntityList.ReplaceExistingMapping(FCEntitySlime.class, "Slime");
        EntityList.ReplaceExistingMapping(FCEntityGhast.class, "Ghast");
        EntityList.ReplaceExistingMapping(FCEntityPigZombie.class, "PigZombie");
        EntityList.ReplaceExistingMapping(FCEntityEnderman.class, "Enderman");
        EntityList.ReplaceExistingMapping(FCEntityCaveSpider.class, "CaveSpider");
        EntityList.ReplaceExistingMapping(FCEntityBlaze.class, "Blaze");
        EntityList.ReplaceExistingMapping(FCEntityMagmaCube.class, "LavaSlime");
        EntityList.ReplaceExistingMapping(FCEntityWither.class, "WitherBoss");
        EntityList.ReplaceExistingMapping(FCEntityBat.class, "Bat");
        EntityList.ReplaceExistingMapping(FCEntityWitch.class, "Witch");
        EntityList.ReplaceExistingMapping(FCEntityPig.class, "Pig");
        EntityList.ReplaceExistingMapping(FCEntitySheep.class, "Sheep");
        EntityList.ReplaceExistingMapping(FCEntityCow.class, "Cow");
        EntityList.ReplaceExistingMapping(FCEntityChicken.class, "Chicken");
        EntityList.ReplaceExistingMapping(FCEntitySquid.class, "Squid");
        EntityList.ReplaceExistingMapping(FCEntityWolf.class, "Wolf");
        EntityList.ReplaceExistingMapping(FCEntitySnowman.class, "SnowMan");
        EntityList.ReplaceExistingMapping(FCEntityOcelot.class, "Ozelot");
        EntityList.ReplaceExistingMapping(FCEntityVillager.class, "Villager");
    }

    private void InitBlocksPotentialFluidSources()
    {
        for (int var1 = 1; var1 < 4096; ++var1)
        {
            Block var2 = Block.blocksList[var1];

            if (var2 != null && var2 instanceof FCIBlockFluidSource)
            {
                m_bBlocksPotentialFluidSources[var1] = true;
            }
            else
            {
                m_bBlocksPotentialFluidSources[var1] = false;
            }
        }
    }

    private void InitDispenserBehaviors()
    {
        BlockDispenser.dispenseBehaviorRegistry.putObject(fcItemBroadheadArrow, new FCBehaviorBroadheadArrowDispense());
        BlockDispenser.dispenseBehaviorRegistry.putObject(fcItemRottenArrow, new FCBehaviorRottedArrowDispense());
        BlockDispenser.dispenseBehaviorRegistry.putObject(fcItemSoulUrn, new FCBehaviorSoulUrnDispense());
        BlockDispenser.dispenseBehaviorRegistry.putObject(fcItemDynamite, new FCBehaviorDispenseDynamite());

        if (MinecraftServer.getServer() != null)
        {
            BlockDispenser.dispenseBehaviorRegistry.putObject(Item.potion, new DispenserBehaviorPotion());
            DispenserBehaviorFilledBucket var1 = new DispenserBehaviorFilledBucket();
            BlockDispenser.dispenseBehaviorRegistry.putObject(Item.bucketLava, var1);
            BlockDispenser.dispenseBehaviorRegistry.putObject(Item.bucketWater, var1);
            BlockDispenser.dispenseBehaviorRegistry.putObject(Item.bucketEmpty, new DispenserBehaviorEmptyBucket());
        }
    }

    private static void ReadModConfigFile()
    {
        File var0 = new File(new File("."), "BTWConfig.txt");

        try
        {
            if (!var0.exists())
            {
                FCAddOnHandler.LogMessage("BTW config file not found...");
                return;
            }

            FCAddOnHandler.LogMessage("BTW reading custom config file...");
            BufferedReader var1 = new BufferedReader(new FileReader(var0));
            String var2 = "";

            while ((var2 = var1.readLine()) != null)
            {
                String[] var3 = var2.split("=");

                if (var3.length == 2)
                {
                    for (int var4 = 0; var4 < var3.length; ++var4)
                    {
                        var3[var4] = var3[var4].trim();
                    }

                    m_configurationMap.put(var3[0], var3[1]);
                }
            }

            var1.close();
        }
        catch (Exception var5)
        {
            System.out.println("Failed to load Better Than Wolves config file");
            var5.printStackTrace();
        }

        fcPlayerSkinURL = ParseStringConfigSetting("fcPlayerSkinURL", fcPlayerSkinURL);
        fcPlayerCloakURL = ParseStringConfigSetting("fcPlayerCloakURL", fcPlayerCloakURL);
        fcDisableMinecartChanges = ParseBooleanConfigSetting("fcDisableMinecartChanges", fcDisableMinecartChanges);
        fcLocalEnableHardcoreBuoy = ParseBooleanConfigSetting("fcEnableHardcoreBuoy", fcLocalEnableHardcoreBuoy);
        fcLocalHardcorePlayerNamesLevel = ParseIntegerConfigSetting("fcEnableHardcorePlayerNames", fcLocalHardcorePlayerNamesLevel);
        fcDisableGearBoxPowerDrain = ParseBooleanConfigSetting("fcDisableGearBoxPowerDrain", fcDisableGearBoxPowerDrain);
        fcDisableEndText = ParseBooleanConfigSetting("fcDisableEndText", fcDisableEndText);
        fcMillStoneContainerID = ParseID("fcMillStoneContainerID", fcMillStoneContainerID);
        fcCauldronContainerID = ParseID("fcCauldronContainerID", fcCauldronContainerID);
        fcHopperContainerID = ParseID("fcHopperContainerID", fcHopperContainerID);
        fcCrucibleContainerID = ParseID("fcCrucibleContainerID", fcCrucibleContainerID);
        fcAnvilContainerID = ParseID("fcAnvilContainerID", fcAnvilContainerID);
        fcBlockDispenserContainerID = ParseID("fcBlockDispenserContainerID", fcBlockDispenserContainerID);
        fcPulleyContainerID = ParseID("fcPulleyContainerID", fcPulleyContainerID);
        fcInfernalEnchanterContainerID = ParseID("fcInfernalEnchanterContainerID", fcInfernalEnchanterContainerID);
        fcFurnaceBrickContainerID = ParseID("fcFurnaceBrickContainerID", fcFurnaceBrickContainerID);
        fcHamperContainerID = ParseID("fcHamperContainerID", fcHamperContainerID);
        fcVanillaAnvilContainerID = ParseID("fcVanillaAnvilContainerID", fcVanillaAnvilContainerID);
        fcBlockDirtSlabID = ParseID("fcBlockDirtSlabID", fcBlockDirtSlabID);
    }

    private static String ParseStringConfigSetting(String var0, String var1)
    {
        String var2 = (String)m_configurationMap.get(var0);
        return var2 != null ? var2 : var1;
    }

    private static boolean ParseBooleanConfigSetting(String var0, boolean var1)
    {
        String var2 = (String)m_configurationMap.get(var0);

        if (var2 != null)
        {
            try
            {
                int var3 = Integer.parseInt(var2);
                boolean var4 = var3 != 0;
                return var4;
            }
            catch (Exception var5)
            {
                System.out.println("Invalid Better Than Wolves config file entry: " + var0 + " , " + var2);
                var5.printStackTrace();
            }
        }

        return var1;
    }

    private static int ParseID(String var0, int var1)
    {
        return ParseIntegerConfigSetting(var0, var1);
    }

    private static int ParseIntegerConfigSetting(String var0, int var1)
    {
        String var2 = (String)m_configurationMap.get(var0);

        if (var2 != null)
        {
            try
            {
                int var3 = Integer.parseInt(var2);
                return var3;
            }
            catch (Exception var4)
            {
                System.out.println("Invalid Better Than Wolves config file entry: " + var0 + " , " + var2);
                var4.printStackTrace();
            }
        }

        return var1;
    }

    public static void ServerPlayerConnectionInitialized(NetServerHandler var0, EntityPlayerMP var1)
    {
        ByteArrayOutputStream var2;
        DataOutputStream var3;

        if (!MinecraftServer.getServer().isSinglePlayer())
        {
            FCUtilsWorld.SendPacketToPlayer(var0, new Packet3Chat("\u00a7e" + var1.username + " connected to Better Than Wolves server V" + "4.B0000002"));
            var2 = new ByteArrayOutputStream();
            var3 = new DataOutputStream(var2);

            try
            {
                var3.writeUTF("4.B0000002");
            }
            catch (Exception var9)
            {
                var9.printStackTrace();
            }

            Packet250CustomPayload var4 = new Packet250CustomPayload("FC|VC", var2.toByteArray());
            FCUtilsWorld.SendPacketToPlayer(var0, var4);
        }
        else
        {
            FCUtilsWorld.SendPacketToPlayer(var0, new Packet3Chat("\u00a7f" + "BTW V" + "4.B0000002"));
        }

        var2 = new ByteArrayOutputStream();
        var3 = new DataOutputStream(var2);
        byte var10 = 0;

        if (fcLocalEnableHardcoreBuoy)
        {
            var10 = 1;
        }

        byte var5 = (byte)fcLocalHardcorePlayerNamesLevel;

        try
        {
            var3.writeByte(var10);
            var3.writeByte(var5);
        }
        catch (Exception var8)
        {
            var8.printStackTrace();
        }

        Packet250CustomPayload var6 = new Packet250CustomPayload("FC|OP", var2.toByteArray());
        FCUtilsWorld.SendPacketToPlayer(var0, var6);

        if (!MinecraftServer.getServer().isSinglePlayer())
        {
            String var7 = "\u00a7f" + "Hardcore Modes: Buoy ";

            if (fcLocalEnableHardcoreBuoy)
            {
                var7 = var7 + "(on)";
            }
            else
            {
                var7 = var7 + "(off)";
            }

            var7 = var7 + " Player Names ";

            if (fcLocalHardcorePlayerNamesLevel == 1)
            {
                var7 = var7 + "(Hardcore)";
            }
            else if (fcLocalHardcorePlayerNamesLevel == 2)
            {
                var7 = var7 + "(Obstructed)";
            }
            else
            {
                var7 = var7 + "(Displayed)";
            }

            FCUtilsWorld.SendPacketToPlayer(var0, new Packet3Chat(var7));
        }
    }

    public static void ServerOpenCustomInterface(EntityPlayerMP var0, Container var1, int var2)
    {
        try
        {
            int var3 = var0.IncrementAndGetWindowID();
            ByteArrayOutputStream var4 = new ByteArrayOutputStream();
            DataOutputStream var5 = new DataOutputStream(var4);
            var5.writeInt(var3);
            var5.writeInt(var2);
            Packet250CustomPayload var6 = new Packet250CustomPayload("FC|OI", var4.toByteArray());
            FCUtilsWorld.SendPacketToPlayer(var0.playerNetServerHandler, var6);
            var0.openContainer = var1;
            var0.openContainer.windowId = var3;
            var0.openContainer.onCraftGuiOpened(var0);
        }
        catch (Exception var7)
        {
            var7.printStackTrace();
        }
    }

    public static boolean IsSinglePlayerNonLan()
    {
        return false;
    }

    private void InitCustomPackets()
    {
        Packet.addIdClassMapping(166, false, true, FCPacket166StartBlockHarvest.class);
    }

    public static void DebugChatOutput(String var0)
    {
        if (MinecraftServer.getServer() != null)
        {
            MinecraftServer.getServer().getConfigurationManager().sendPacketToAllPlayers(new Packet3Chat(var0));
            FCAddOnHandler.LogMessage(var0);
        }
    }

    public static void DebugWarning(String var0)
    {
        if (MinecraftServer.getServer() != null)
        {
            MinecraftServer.getServer().getConfigurationManager().sendPacketToAllPlayers(new Packet3Chat("\u00a7E" + "WARNING: " + var0));
            FCAddOnHandler.LogWarning(var0);
        }
    }
}
