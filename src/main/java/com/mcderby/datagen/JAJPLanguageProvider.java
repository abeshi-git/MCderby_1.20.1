package com.mcderby.datagen;

import com.mcderby.MCDerby;
import com.mcderby.block.MCDerbyBlocks;
import com.mcderby.item.MCDerbyItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.Locale;

public class JAJPLanguageProvider extends LanguageProvider {
    public JAJPLanguageProvider(PackOutput output) {
        super(output, MCDerby.MOD_ID, Locale.JAPAN.toString().toLowerCase());
    }

    @Override
    protected void addTranslations() {
        add("creativetabs.mcderby_tab", "MCダービー");
        /* アイテム */
        addItem(MCDerbyItems.SHORT_WHIP, "短鞭");
        addItem(MCDerbyItems.LONG_WHIP, "長鞭");

        /* ブロック */
        addBlock(MCDerbyBlocks.WESTERN_TURF, "洋芝");
    }
}
