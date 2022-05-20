package net.fabricmc.testmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.testmod.items.DildoSword;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMod implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("tesrmod");

	public static final Item DILDO_SWORD = new DildoSword(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Identifier GOAT_SCREAM_ID = new Identifier("testmod","goat_scream");
	public static final SoundEvent GOAT_SCREAM_SOUND = new SoundEvent(GOAT_SCREAM_ID);
	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		Registry.register(Registry.ITEM,new Identifier("testmod","dildo_sword"),DILDO_SWORD);
		Registry.register(Registry.SOUND_EVENT,GOAT_SCREAM_ID,GOAT_SCREAM_SOUND);
	}
}
