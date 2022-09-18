package me.jasperchasetoq.metalworks;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class MetalWorksItems {
    public static final NestedItemGroup MetalWorks_General = new NestedItemGroup(new NamespacedKey(MetalWorks.getInstance(), "METALWORKS_GENERAL"), new CustomItemStack(Material.ANVIL, "&fMetalWorks"));
    public static final SubItemGroup Armor = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "HELMETS"), MetalWorks_General, new CustomItemStack(Material.DIAMOND_HELMET, "&fMetalworks Helmets"));
    public static final SubItemGroup Tools = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "SHIELDS"), MetalWorks_General, new CustomItemStack(Material.SHIELD, "&fMetalworks Shields"));

    //Gold 4k
    public static final SlimefunItemStack JC_GOLD_4K_HELMET = new SlimefunItemStack("JC_GOLD_4K_HELMET", Material.GOLDEN_HELMET, "&fGolden Helmet &7(4-Carat)");
    public static final SlimefunItemStack JC_GOLD_4K_CHESTPLATE = new SlimefunItemStack("JC_GOLD_4_CHESTPLATE", Material.GOLDEN_CHESTPLATE, "&fGolden Chestplate &7(4-Carat)");
    public static final SlimefunItemStack JC_GOLD_4K_LEGGINGS = new SlimefunItemStack("JC_GOLD_4K_LEGGINGS", Material.GOLDEN_LEGGINGS, "&fGolden Leggings &7(4-Carat)");
    public static final SlimefunItemStack JC_GOLD_4K_BOOTS = new SlimefunItemStack("JC_GOLD_4K_BOOTS", Material.GOLDEN_BOOTS, "&fGolden Boots &7(4-Carat)");
    public static final SlimefunItemStack JC_GOLD_4K_SWORD = new SlimefunItemStack("JC_GOLD_4K_SWORDS", Material.GOLDEN_SWORD, "&fGolden Sword &7(4-Carat)");
    public static final SlimefunItemStack JC_GOLD_4K_PICKAXE = new SlimefunItemStack("JC_GOLD_4K_PICKAXE", Material.GOLDEN_PICKAXE, "&fGolden Pickaxe &7(4-Carat)");
    public static final SlimefunItemStack JC_GOLD_4K_AXE = new SlimefunItemStack("JC_GOLD_4K_AXE", Material.GOLDEN_AXE, "&fGolden Helmet &7(4-Carat)");
    public static final SlimefunItemStack JC_GOLD_4K_SHOVEL = new SlimefunItemStack("JC_GOLD_4K_SHOVEL", Material.GOLDEN_AXE, "&fGolden Shovel &7(4-Carat)");
    public static final SlimefunItemStack JC_GOLD_4K_HOE = new SlimefunItemStack("JC_GOLD_4K_HOE", Material.GOLDEN_HOE, "&fGolden Hoe &7(4-Carat)");
    public static final SlimefunItemStack JC_GOLD_4K_SHIELD = new SlimefunItemStack("JC_GOLD_4K_SHIELD", Material.SHIELD, "&fGolden Shield &7(4-Carat)");
    public static final SlimefunItemStack JC_GOLD_4K_BOW = new SlimefunItemStack("JC_GOLD_4K_BOW", Material.BOW, "&fGolden Bow &7(4-Carat)");
    public static final SlimefunItemStack JC_GOLD_4K_CROSSBOW = new SlimefunItemStack("JC_GOLD_4K_CROSSBOW", Material.CROSSBOW, "&fGolden Crossbow &7(4-Carat)");
    //Gold 6K
    public static final SlimefunItemStack JC_GOLD_6K_HELMET = new SlimefunItemStack("JC_GOLD_6K_HELMET", Material.GOLDEN_HELMET, "&fGolden Helmet &7(6-Carat)");
    public static final SlimefunItemStack JC_GOLD_6K_CHESTPLATE = new SlimefunItemStack("JC_GOLD_6K_CHESTPLATE", Material.GOLDEN_CHESTPLATE, "&fGolden Chestplate &7(6-Carat)");
    public static final SlimefunItemStack JC_GOLD_6K_LEGGINGS = new SlimefunItemStack("JC_GOLD_6K_LEGGINGS", Material.GOLDEN_LEGGINGS, "&fGolden Leggings &7(6-Carat)");
    public static final SlimefunItemStack JC_GOLD_6K_BOOTS = new SlimefunItemStack("JC_GOLD_6K_BOOTS", Material.GOLDEN_BOOTS, "&fGolden Boots &7(6-Carat)");
    public static final SlimefunItemStack JC_GOLD_6K_SWORD = new SlimefunItemStack("JC_GOLD_6K_SWORDS", Material.GOLDEN_SWORD, "&fGolden Sword &7(6-Carat)");
    public static final SlimefunItemStack JC_GOLD_6K_PICKAXE = new SlimefunItemStack("JC_GOLD_6K_PICKAXE", Material.GOLDEN_PICKAXE, "&fGolden Pickaxe &7(6-Carat)");
    public static final SlimefunItemStack JC_GOLD_6K_AXE = new SlimefunItemStack("JC_GOLD_6K_AXE", Material.GOLDEN_AXE, "&fGolden Helmet &7(6-Carat)");
    public static final SlimefunItemStack JC_GOLD_6K_SHOVEL = new SlimefunItemStack("JC_GOLD_6K_SHOVEL", Material.GOLDEN_AXE, "&fGolden Shovel &7(6-Carat)");
    public static final SlimefunItemStack JC_GOLD_6K_HOE = new SlimefunItemStack("JC_GOLD_6K_HOE", Material.GOLDEN_HOE, "&fGolden Hoe &7(6-Carat)");
    public static final SlimefunItemStack JC_GOLD_6K_SHIELD = new SlimefunItemStack("JC_GOLD_6K_SHIELD", Material.SHIELD, "&fGolden Shield &7(6-Carat)");
    public static final SlimefunItemStack JC_GOLD_6K_BOW = new SlimefunItemStack("JC_GOLD_6K_BOW", Material.BOW, "&fGolden Bow &7(6-Carat)");
    public static final SlimefunItemStack JC_GOLD_6K_CROSSBOW = new SlimefunItemStack("JC_GOLD_6K_CROSSBOW", Material.CROSSBOW, "&fGolden Crossbow &7(6-Carat)");
}
