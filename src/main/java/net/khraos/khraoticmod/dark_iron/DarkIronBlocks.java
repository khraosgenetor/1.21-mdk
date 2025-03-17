package net.khraos.khraoticmod.dark_iron;

import net.khraos.khraoticmod.KhraoticMod;
import net.khraos.khraoticmod.block.ModBlocks;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DarkIronBlocks {
    public static final DeferredRegister<Block> DARK_IRON_BLOCK_REG =
            DeferredRegister.create(ForgeRegistries.BLOCKS, KhraoticMod.MOD_ID);

    public static final DeferredRegister<Item> DARK_IRON_BLOCK_ITEM_REG =
            DeferredRegister.create(ForgeRegistries.ITEMS, KhraoticMod.MOD_ID);

    public static final RegistryObject<Block> BLOCK_OF_DARK_IRON = ModBlocks.registerBlock(
            DARK_IRON_BLOCK_REG,
            DARK_IRON_BLOCK_ITEM_REG,
            "block_of_dark_iron",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST))
    );

    public static void register(IEventBus eventBus) {
        DARK_IRON_BLOCK_REG.register(eventBus);

    }
}
