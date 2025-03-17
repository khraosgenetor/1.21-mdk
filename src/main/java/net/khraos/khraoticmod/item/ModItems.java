package net.khraos.khraoticmod.item;

import net.khraos.khraoticmod.KhraoticMod;
import net.khraos.khraoticmod.visentium.VisentiumBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, KhraoticMod.MOD_ID);

    public static final RegistryObject<Item> BLOCK_OF_VISENTIUM_ITEM = ITEMS.register(
            "block_of_visentium",
            () -> new BlockItem(VisentiumBlocks.BLOCK_OF_VISENTIUM.get(), new Item.Properties())
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
