package com.dewlapine.dewlapinesbunnypet.item;

import com.dewlapine.dewlapinesbunnypet.DewlapinesBunnyPet;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DewlapinesBunnyPet.MODID);

    private static String name;
    public static final DeferredItem<Item> BELLBALL = ITEMS.register(name = "bellball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CUPTOY = ITEMS.register(name = "cuptoy",
            () -> new Item(new Item.Properties()));

    @SubscribeEvent

    public void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}