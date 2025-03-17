package net.khraos.khraoticmod.creativemodtabs;

import net.khraos.khraoticmod.KhraoticMod;
import net.khraos.khraoticmod.dark_iron.DarkIronBlocks;
import net.khraos.khraoticmod.dark_iron.DarkIronItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeModeTabs {
    private static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, KhraoticMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> KHRAOTIC_TAB = TABS.register(
            "khraotic_tab", () -> new CreativeModeTab.Builder(CreativeModeTab.Row.TOP, 0)
                    .icon(() -> new ItemStack(DarkIronItems.DARK_IRON.get())) // Static icon
                    .title(Component.translatable("visentium.khraotic_tabs"))
                    .displayItems((pParameters, pOutput) -> {
                        for (RegistryObject<Item> item : DarkIronItems.DARK_IRON_ITEM_REG.getEntries()) {
                            pOutput.accept(item.get());
                        }
                        for (RegistryObject<Block> block : DarkIronBlocks.DARK_IRON_BLOCK_REG.getEntries()) {
                            pOutput.accept(block.get());
                        }
                    })
                    .build()
    );

    public static void register(IEventBus eventBus) {
        TABS.register(eventBus);
    }
}
