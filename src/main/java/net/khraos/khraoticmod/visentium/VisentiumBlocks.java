package net.khraos.khraoticmod.visentium;

import net.khraos.khraoticmod.KhraoticMod;
import net.khraos.khraoticmod.item.ModItems; // Import ModItems
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class VisentiumBlocks {
    public static final DeferredRegister<Block> VISENTIUM_BLOCK_REG =
            DeferredRegister.create(ForgeRegistries.BLOCKS, KhraoticMod.MOD_ID);

    public static final RegistryObject<Block> BLOCK_OF_VISENTIUM = VISENTIUM_BLOCK_REG.register(
            "block_of_visentium",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST))
    );

    public static void register(IEventBus eventBus) {
        VISENTIUM_BLOCK_REG.register(eventBus);
    }
}
