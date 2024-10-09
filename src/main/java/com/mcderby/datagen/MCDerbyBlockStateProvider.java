package com.mcderby.datagen;

import com.mcderby.MCDerby;
import com.mcderby.block.MCDerbyBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class MCDerbyBlockStateProvider extends BlockStateProvider {
    public MCDerbyBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MCDerby.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlockWithItem(MCDerbyBlocks.WESTERN_TURF);
    }

    private void simpleBlockWithItem(RegistryObject<Block> block) {
        simpleBlockWithItem(block.get(), cubeAll(block.get()));
    }
}
