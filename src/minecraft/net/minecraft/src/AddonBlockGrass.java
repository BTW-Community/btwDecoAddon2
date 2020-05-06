package net.minecraft.src;

import java.util.Random;

public class AddonBlockGrass extends FCBlockGrass {
    private boolean m_bTempHasSnowOnTop;
    private Icon[] iconGrassTop = new Icon[2];
    private Icon iconSnowSide;
    private Icon iconGrassSideOverlay;
    
	public AddonBlockGrass(int id) {
		super(id);
	}

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World world, int x, int y, int z, Random rand)
    {
        int idAbove = world.getBlockId(x, y + 1, z);
        Block blockAbove = Block.blocksList[idAbove];
        int lightValue = world.getBlockLightValue(x, y, z);
        int skylightBaseValue = world.GetBlockNaturalLightValueMaximum(x, y + 1, z);
        int skylightValue = skylightBaseValue - world.skylightSubtracted;

        if (Math.max(lightValue, skylightValue) >= 9 && Block.lightOpacity[idAbove] <= 2 && (blockAbove == null || blockAbove.GetCanGrassGrowUnderBlock(world, x, y + 1, z, false)))
        {
        	if (skylightValue >= 9)
        		world.setBlockMetadataWithNotify(x, y, z, 0);
        	else
        		world.setBlockMetadataWithNotify(x, y, z, 1);
            
            if (skylightValue >= 11)
            {
                CheckForGrassSpreadFromLocation(world, x, y, z);
            }
        }
        else
        {
        	if (Block.lightOpacity[idAbove] <= 2 &&  (blockAbove == null || blockAbove.GetCanGrassGrowUnderBlock(world, x, y + 1, z, false)))
        		world.setBlockMetadataWithNotify(x, y, z, 1);
        	else
        		world.setBlockWithNotify(x, y, z, Block.dirt.blockID);
        }
    }

    public static void CheckForGrassSpreadFromLocation(World world, int x, int y, int z)
    {
        if (world.provider.dimensionId != 1 && !FCBlockGroundCover.IsGroundCoverRestingOnBlock(world, x, y, z))
        {
            int var4 = x + world.rand.nextInt(3) - 1;
            int var5 = y + world.rand.nextInt(5) - 3;
            int var6 = z + world.rand.nextInt(3) - 1;
            Block var7 = Block.blocksList[world.getBlockId(var4, var5, var6)];

            if (var7 != null)
            {
            	if (var7 instanceof FCBlockDirt)
            		((AddonBlockDirt) var7).AttempToSpreadGrassToBlock(world, var4, var5, var6);
            	else if (var7 instanceof FCBlockDirtSlab)
            		((AddonBlockDirtSlab) var7).AttempToSpreadGrassToBlock(world, var4, var5, var6);
            	if (var7 instanceof FCBlockDirtLoose)
            		((AddonBlockDirtLoose) var7).AttempToSpreadGrassToBlock(world, var4, var5, var6);
            	else if (var7 instanceof FCBlockDirtLooseSlab)
            		((AddonBlockDirtLooseSlab) var7).AttempToSpreadGrassToBlock(world, var4, var5, var6);
            	else
            		var7.AttempToSpreadGrassToBlock(world, var4, var5, var6);
            }
        }
    }

    /**
     * Called whenever the block is added into the world. Args: world, x, y, z
     */
    public void onBlockAdded(World world, int x, int y, int z) {
    	int var6 = world.getBlockId(x, y + 1, z);
        int var8 = world.GetBlockNaturalLightValueMaximum(x, y + 1, z);
        int var9 = var8 - world.skylightSubtracted;

        if (!(var8 >= 9 && Block.lightOpacity[var6] <= 2))
        {
            world.setBlockMetadataWithNotify(x, y, z, 1);
        }
    }

    public boolean CanBeGrazedOn(IBlockAccess blockAccess, int x, int y, int z, EntityAnimal animal)
    {
    	int meta = blockAccess.getBlockMetadata(x, y, z);
        return meta == 0;
    }
    
    //CLIENT ONLY
    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
    public void registerIcons(IconRegister register)
    {
        super.registerIcons(register);
        this.iconGrassTop[0] = register.registerIcon("grass_top");
        this.iconGrassTop[1] = register.registerIcon("ginger_grassRough");
        this.iconSnowSide = register.registerIcon("snow_side");
        this.iconGrassSideOverlay = register.registerIcon("grass_side_overlay");
    }

    /**
     * Retrieves the block texture to use based on the display side. Args: iBlockAccess, x, y, z, side
     */
    public Icon getBlockTexture(IBlockAccess blockAccess, int x, int y, int z, int side)
    {
    	int meta = blockAccess.getBlockMetadata(x, y, z);
        return side == 1 ? this.iconGrassTop[meta] : (side == 0 ? Block.dirt.getBlockTextureFromSide(side) : (this.m_bTempHasSnowOnTop ? this.iconSnowSide : this.blockIcon));
    }
}
