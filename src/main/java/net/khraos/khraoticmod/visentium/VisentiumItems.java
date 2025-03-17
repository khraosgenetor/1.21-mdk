package net.khraos.khraoticmod.visentium;

import net.khraos.khraoticmod.KhraoticMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class VisentiumItems {
    public static final DeferredRegister<Item> VISENTIUM_ITEM_REG =
            DeferredRegister.create(ForgeRegistries.ITEMS, KhraoticMod.MOD_ID);

    public static final RegistryObject<Item> VISENTIUM_GEM = VISENTIUM_ITEM_REG.register("visentium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_VISENTIUM = VISENTIUM_ITEM_REG.register("raw_visentium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BISENTIUM = VISENTIUM_ITEM_REG.register("bisentium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_BISENTIUM = VISENTIUM_ITEM_REG.register("raw_bisentium",
            () -> new Item(new Item.Properties()));
}
