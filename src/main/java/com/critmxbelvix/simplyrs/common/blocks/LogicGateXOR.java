package com.critmxbelvix.simplyrs.common.blocks;

import com.critmxbelvix.simplyrs.common.creativetabs.SimplyRSCreativeTab;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class LogicGateXOR extends Block {

    final String name = "logicgate_xor";
    final CreativeModeTab tab = SimplyRSCreativeTab.SRS_TAB;
    public static final Properties gate_xor_properties = BlockBehaviour.Properties.of(Material.STONE).strength(0.1f).dynamicShape();
    public LogicGateXOR(Properties m_properties) {
        super(m_properties);
    }
    public static final LogicGateXOR LOGICGATE_XOR = new LogicGateXOR(gate_xor_properties);


    public String m_getName()
    {
        return name;
    }
    public CreativeModeTab m_getTab()
    {
        return tab;
    }
    public Properties m_getProperties()
    {
        return gate_xor_properties;
    }

}