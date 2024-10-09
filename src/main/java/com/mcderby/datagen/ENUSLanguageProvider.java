package com.mcderby.datagen;

import com.mcderby.MCDerby;
import com.mcderby.block.MCDerbyBlocks;
import com.mcderby.item.MCDerbyItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.Locale;

public class ENUSLanguageProvider extends LanguageProvider {
    public ENUSLanguageProvider(PackOutput output) {
        super(output, MCDerby.MOD_ID, Locale.US.toString().toLowerCase());
    }

    @Override
    protected void addTranslations() {
        add("creativetabs.mcderby_tab", "MC Derby");
        /* アイテム */
        addItem(MCDerbyItems.SHORT_WHIP, "Short Whip");
        addItem(MCDerbyItems.LONG_WHIP, "Long Whip");

        /* ブロック */
        addBlock(MCDerbyBlocks.WESTERN_TURF, "Western Turf");
    }
}
