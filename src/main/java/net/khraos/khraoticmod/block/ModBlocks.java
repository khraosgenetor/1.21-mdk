package net.khraos.khraoticmod.block;

import net.khraos.khraoticmod.dark_iron.DarkIronBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static <T extends Block> RegistryObject<T> registerBlock(DeferredRegister<Block> REG, DeferredRegister<Item> ITEM_REG,
                                                                    String name, Supplier<T> block) {
        RegistryObject<T> toReturn = REG.register(name, block);
        registerBlockItem(ITEM_REG, name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(DeferredRegister<Item> ITEM_REG,
                                                                           String name, RegistryObject<T> block) {
        return ITEM_REG.register(
                name, () -> new BlockItem(block.get(), new Item.Properties())
        );
    }

    public static void register(IEventBus eventBus) {
        DarkIronBlocks.register(eventBus);
    }
}
