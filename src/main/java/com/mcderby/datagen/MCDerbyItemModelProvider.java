package com.mcderby.datagen;

import com.mcderby.MCDerby;
import com.mcderby.item.MCDerbyItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class MCDerbyItemModelProvider extends ItemModelProvider {
    public MCDerbyItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MCDerby.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(MCDerbyItems.SHORT_WHIP.get());
        basicItem(MCDerbyItems.LONG_WHIP.get());
    }
}
