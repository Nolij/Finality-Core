package com.oekt.finalitycore.item;

import com.oekt.finalitycore.FinalityCore;
import com.oekt.finalitycore.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;



public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FinalityCore.MODID);
    public static final RegistryObject<Item> LIVING_NETHERWART_SEED = ITEMS.register("living_netherwart_seed", () -> new ItemNameBlockItem(ModBlocks.LIVING_NETHERWART_CROP.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> LIVING_NETHERWART = ITEMS.register("living_netherwart", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).stacksTo(64)));
}