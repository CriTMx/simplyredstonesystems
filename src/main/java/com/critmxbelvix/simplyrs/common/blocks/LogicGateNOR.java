package com.critmxbelvix.simplyrs.common.blocks;

import com.critmxbelvix.simplyrs.common.creativetabs.SimplyRSCreativeTab;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;

public class LogicGateNOR extends GateBlock {

    final static String name = "logicgate_nor";
    final static CreativeModeTab tab = SimplyRSCreativeTab.SRS_TAB;
    public static final Properties gate_nor_properties = BlockBehaviour.Properties.of(Material.STONE).strength(0.1f).dynamicShape();

    public LogicGateNOR(Properties m_properties) {
        super(m_properties);
    }

    public static String m_getName()
    {
        return name;
    }
    public static CreativeModeTab m_getTab()
    {
        return tab;
    }
    public Properties m_getProperties()
    {
        return gate_nor_properties;
    }

    /* Redstone */

    @Override
    public int getDirectSignal(BlockState pBlockState, BlockGetter pBlockAccess, BlockPos pPos, Direction pSide) {
        return pBlockState.getSignal(pBlockAccess, pPos, pSide);
    }

    @Override
    public int getSignal(BlockState pBlockState, BlockGetter pBlockAccess, BlockPos pPos, Direction pSide) {
        boolean input1 = pBlockState.getValue(INPUT_1);
        boolean input2 = pBlockState.getValue(INPUT_2);
        boolean input3 = pBlockState.getValue(INPUT_3);

        if ((input1==false && input2==false && input3==false) && pSide == pBlockState.getValue(FACING).getOpposite()) {
            return this.getOutputSignal(pBlockAccess, pPos, pBlockState);
        }
        else {
            return 0;
        }
    }
}
