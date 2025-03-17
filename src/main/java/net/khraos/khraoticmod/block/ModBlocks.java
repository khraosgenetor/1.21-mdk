package net.khraos.khraoticmod.block;

import net.khraos.khraoticmod.visentium.VisentiumBlocks;
import net.minecraftforge.eventbus.api.IEventBus;

public class ModBlocks {
    public static void register(IEventBus eventBus) {
        VisentiumBlocks.register(eventBus);
    }
}
