package net.fabricmc.testmod.items;

import net.fabricmc.testmod.TestMod;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;


public class DildoSword extends Item {
    public DildoSword(Settings settings){
        super(settings);
    }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand){
        Vec3d playerVelocity = playerEntity.getVelocity();
        playerEntity.setVelocity(playerVelocity.x,.5,playerVelocity.z);
        playerEntity.playSound(TestMod.GOAT_SCREAM_SOUND,2.0F,2.0F);
        return TypedActionResult.success(playerEntity.getStackInHand(hand));
    }
}
