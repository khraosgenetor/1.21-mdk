package net.khraos.khraoticmod.dark_iron;

import net.khraos.khraoticmod.KhraoticMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DarkIronItems {
    public static final DeferredRegister<Item> DARK_IRON_ITEM_REG =
            DeferredRegister.create(ForgeRegistries.ITEMS, KhraoticMod.MOD_ID);

    public static final RegistryObject<Item> DARK_IRON = DARK_IRON_ITEM_REG.register("dark_iron",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_DARK_IRON = DARK_IRON_ITEM_REG.register("raw_dark_iron",
            () -> new Item(new Item.Properties()));
}
