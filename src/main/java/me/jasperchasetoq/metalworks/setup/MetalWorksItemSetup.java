package me.jasperchasetoq.metalworks.setup;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.jasperchasetoq.metalworks.MetalWorks;
import me.jasperchasetoq.metalworks.MetalWorksItems;
import me.jasperchasetoq.metalworks.implementation.items.Armor;
import me.jasperchasetoq.metalworks.implementation.items.Sword;
import me.jasperchasetoq.metalworks.implementation.items.Tool;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.ArrayList;
import java.util.List;

public class MetalWorksItemSetup {
    private MetalWorksItemSetup() {
    }

    public static void setup(@Nonnull MetalWorks plugin) {

        registerMetalWorksGear(MetalWorksItems.Armor, SlimefunItems.GOLD_4K, new ItemStack[]{MetalWorksItems.JC_GOLD_4K_HELMET, MetalWorksItems.JC_GOLD_4K_CHESTPLATE, MetalWorksItems.JC_GOLD_4K_LEGGINGS,MetalWorksItems.JC_GOLD_4K_BOOTS}, "JC_GOLD_4K", plugin);
        registerMetalWorksGear(MetalWorksItems.Tools, SlimefunItems.GOLD_4K, new ItemStack[]{MetalWorksItems.JC_GOLD_4K_SWORD, MetalWorksItems.JC_GOLD_4K_PICKAXE, MetalWorksItems.JC_GOLD_4K_AXE, MetalWorksItems.JC_GOLD_6K_SHOVEL, MetalWorksItems.JC_GOLD_4K_HOE, MetalWorksItems.JC_GOLD_4K_SHIELD, MetalWorksItems.JC_GOLD_4K_BOW, MetalWorksItems.JC_GOLD_4K_CROSSBOW}, "JC_GOLD_4K", plugin);
        registerMetalWorksGear(MetalWorksItems.Armor, SlimefunItems.GOLD_6K, new ItemStack[]{MetalWorksItems.JC_GOLD_6K_HELMET, MetalWorksItems.JC_GOLD_6K_CHESTPLATE, MetalWorksItems.JC_GOLD_6K_LEGGINGS,MetalWorksItems.JC_GOLD_6K_BOOTS}, "JC_GOLD_6K", plugin);
        registerMetalWorksGear(MetalWorksItems.Tools, SlimefunItems.GOLD_6K, new ItemStack[]{MetalWorksItems.JC_GOLD_6K_SWORD, MetalWorksItems.JC_GOLD_6K_PICKAXE, MetalWorksItems.JC_GOLD_6K_AXE, MetalWorksItems.JC_GOLD_6K_SHOVEL, MetalWorksItems.JC_GOLD_6K_HOE, MetalWorksItems.JC_GOLD_6K_SHIELD, MetalWorksItems.JC_GOLD_6K_BOW, MetalWorksItems.JC_GOLD_6K_CROSSBOW}, "JC_GOLD_6K", plugin);
    }

    @ParametersAreNonnullByDefault
    private static void registerMetalWorksGear(ItemGroup itemGroup, ItemStack MetalType, ItemStack[] items, String idSyntax, SlimefunAddon MetalWorksGear) {
        String[] components = new String[]
                {"_HELMET", "_CHESTPLATE", "_LEGGINGS", "_BOOTS", "_SWORD", "_PICKAXE", "_AXE", "_SHOVEL", "_HOE", "_SHIELD", "_BOW", "_CROSSBOW"};
        List<ItemStack[]> recipes = new ArrayList<>();
        //Helmet (1)
        recipes.add(new ItemStack[]{
                MetalType, MetalType, MetalType,
                MetalType, null, MetalType,
                null, null, null});
        //Chestplate (2)
        recipes.add(new ItemStack[]{
                MetalType, null, MetalType,
                MetalType, MetalType, MetalType,
                MetalType, MetalType, MetalType});
        //Leggings (3)
        recipes.add(new ItemStack[]{
                MetalType, MetalType, MetalType,
                MetalType, null, MetalType,
                MetalType, null, MetalType});
        //Boots (4)
        recipes.add(new ItemStack[]{
                null, null, null,
                MetalType, null, MetalType,
                MetalType, null, MetalType});
        //Swords (5)
        recipes.add(new ItemStack[]{
                null, MetalType, null,
                null, MetalType, null,
                null, new ItemStack(Material.STICK), null});
        //Pickaxes (6)
        recipes.add(new ItemStack[]{
                MetalType, MetalType, MetalType,
                null, new ItemStack(Material.STICK), null,
                null, new ItemStack(Material.STICK), null});
        //Axes (7)
        recipes.add(new ItemStack[]{
                null, null, null,
                null, new ItemStack(Material.STICK), null,
                null, new ItemStack(Material.STICK), null});
        //Shovels (8)
        recipes.add(new ItemStack[]{
                null, null, null,
                null, new ItemStack(Material.STICK), null,
                null, new ItemStack(Material.STICK), null});
        //Hoes (9)
        recipes.add(new ItemStack[]{
                null, null, null,
                null, new ItemStack(Material.STICK), null,
                null, new ItemStack(Material.STICK), null});
        //Shields (10)
        recipes.add(new ItemStack[]{
                MetalType, new ItemStack(Material.IRON_INGOT), MetalType,
                MetalType, MetalType, MetalType,
                null, MetalType, null});
        //Bows (11)
        recipes.add(new ItemStack[]{
                null, MetalType, new ItemStack(Material.STRING),
                MetalType, null, new ItemStack(Material.STRING),
                null, MetalType, new ItemStack(Material.STRING)});
        //CrossBows (12)
        recipes.add(new ItemStack[]{
                MetalType, new ItemStack(Material.IRON_INGOT), MetalType,
                MetalType, new ItemStack(Material.TRIPWIRE_HOOK), MetalType,
                null, MetalType, null});

        for (int i = 0; i < 12; i++) {
            if (i < 4) {
                new Armor(itemGroup, new SlimefunItemStack(idSyntax + components[i], items[i]), RecipeType.ARMOR_FORGE, recipes.get(i)).register(MetalWorksGear);
            } else if (i < 5) {
                new Sword(itemGroup, new SlimefunItemStack(idSyntax + components[i], items[i]), RecipeType.ARMOR_FORGE, recipes.get(i)).register(MetalWorksGear);
            } else if (i > 6) {
                new Tool(itemGroup, new SlimefunItemStack(idSyntax + components[i], items[i]), RecipeType.ARMOR_FORGE, recipes.get(i)).register(MetalWorksGear);

            }
        }
    }
}