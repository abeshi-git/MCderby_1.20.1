package com.mcderby.block;

import com.mcderby.MCDerby;
import com.mcderby.item.MCDerbyItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class MCDerbyBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MCDerby.MOD_ID);

    public static final RegistryObject<Block> WESTERN_TURF = registerBlockItem("western_turf", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)));


    private static <T extends Block> RegistryObject<T> registerBlockItem(String name, Supplier<T> supplier){
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        MCDerbyItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
        return block;
    }


    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
