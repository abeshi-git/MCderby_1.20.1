package com.mcderby.datagen;

import com.mcderby.MCDerby;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MCDerby.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MCDerbyDataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(event.includeClient(), new MCDerbyItemModelProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new MCDerbyBlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new ENUSLanguageProvider(packOutput));
        generator.addProvider(event.includeClient(), new JAJPLanguageProvider(packOutput));

        /* レシピ */
        generator.addProvider(event.includeServer(), new MCDerbyRecipeProvider(packOutput));
    }
}
