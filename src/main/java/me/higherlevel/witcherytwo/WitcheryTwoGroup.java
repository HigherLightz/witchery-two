package me.higherlevel.witcherytwo;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class WitcheryTwoGroup {
    public static final ItemGroup WITCHERY_GROUP = FabricItemGroupBuilder.create(
            new Identifier("witchtwo","witchgroup"))
            .icon(() -> new ItemStack(WitcheryTwoMod.RITUAL_CHALK))
            .build();
}
