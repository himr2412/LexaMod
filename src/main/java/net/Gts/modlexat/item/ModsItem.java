package net.Gts.modlexat.item;

import net.Gts.modlexat.ModLexaT;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModsItem {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ModLexaT.MODID);

    public static final DeferredItem<Item> LEXA_TOTEM = ITEMS.register("lexa_totem",
            () -> new Item(new Item.Properties())
    );


    public static void registerItems(IEventBus eventBus) {

        ITEMS.register(eventBus);

    }
}
