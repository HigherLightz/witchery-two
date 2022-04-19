package me.higherlevel.witcherytwo;

import me.higherlevel.witcherytwo.item.WitchSalt;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WitcheryTwoMod implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("witchtwo");

	//Item
	public static final Item WITCH_SALT = new WitchSalt(new FabricItemSettings().maxCount(16).group(WitcheryTwoGroup.WITCHERY_GROUP));
	public static final Item RITUAL_CHALK = new Item(new FabricItemSettings().maxCount(1));

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM,new Identifier("witchtwo","witch_salt"), WITCH_SALT);
		Registry.register(Registry.ITEM,new Identifier("witchtwo","ritual_chalk"), RITUAL_CHALK);
	}
}
