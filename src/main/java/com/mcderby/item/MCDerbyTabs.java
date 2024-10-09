package com.mcderby.item;

import com.mcderby.MCDerby;
import com.mcderby.block.MCDerbyBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class MCDerbyTabs {
    // レジストリを作成
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MCDerby.MOD_ID);

    // レジストリにTABを登録
    public static final RegistryObject<CreativeModeTab> MCDERBY_TAB = TABS.register("mcderby_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("creativetabs.mcderby_tab"))
            .icon(MCDerbyItems.SHORT_WHIP.get()::getDefaultInstance)
            .displayItems(((pParameters, pOutput) -> {
                /* アイテム */
                pOutput.accept(MCDerbyItems.SHORT_WHIP.get());
                pOutput.accept(MCDerbyItems.LONG_WHIP.get());

                /* ブロック */
                pOutput.accept(MCDerbyBlocks.WESTERN_TURF.get());
            }))
            .build());

    public static void register(IEventBus eventbus){
        TABS.register(eventbus);
    }
}
