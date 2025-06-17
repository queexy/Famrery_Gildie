package org.qu33xy;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("\n" +
                " _____   ____  ____   ___ ___    ___  ____   __ __ \n" +
                "|     | /    ||    \\ |   |   |  /  _]|    \\ |  |  |\n" +
                "|   __||  o  ||  D  )| _   _ | /  [_ |  D  )|  |  |\n" +
                "|  |_  |     ||    / |  \\_/  ||    _]|    / |  ~  |\n" +
                "|   _] |  _  ||    \\ |   |   ||   [_ |    \\ |___, |\n" +
                "|  |   |  |  ||  .  \\|   |   ||     ||  .  \\|     |\n" +
                "|__|   |__|__||__|\\_||___|___||_____||__|\\_||____/ \n" +
                "                                                   \n"
        );
        registerCustomItems();
        Bukkit.getPluginManager().registerEvents(new PlaceBlock_Listener(), this);
    }

    private void registerCustomItems() {
        ItemStack boyFarmer = new ItemStack(Material.OBSIDIAN);
        ItemMeta boyMeta = boyFarmer.getItemMeta();
        boyMeta.setDisplayName("Boy Farmer");
        boyFarmer.setItemMeta(boyMeta);

        ShapedRecipe boyRecipe = new ShapedRecipe(new NamespacedKey(this, "boy_farmer"), boyFarmer);
        boyRecipe.shape("OOO", "ODO", "OOO");
        boyRecipe.setIngredient('O', Material.OBSIDIAN);
        boyRecipe.setIngredient('D', Material.DIAMOND);
        Bukkit.addRecipe(boyRecipe);

        ItemStack sandFarmer = new ItemStack(Material.SAND);
        ItemMeta sandMeta = sandFarmer.getItemMeta();
        sandMeta.setDisplayName("Sand Farmer");
        sandFarmer.setItemMeta(sandMeta);

        ShapedRecipe sandRecipe = new ShapedRecipe(new NamespacedKey(this, "sand_farmer"), sandFarmer);
        sandRecipe.shape("SSS", "SDS", "SSS");
        sandRecipe.setIngredient('S', Material.SAND);
        sandRecipe.setIngredient('D', Material.DIAMOND);
        Bukkit.addRecipe(sandRecipe);

        ItemStack kopaczFosy = new ItemStack(Material.STICK);
        ItemMeta kopaczMeta = kopaczFosy.getItemMeta();
        kopaczMeta.setDisplayName("Kopacz Fosy");
        kopaczFosy.setItemMeta(kopaczMeta);

        ShapedRecipe kopaczRecipe = new ShapedRecipe(new NamespacedKey(this, "kopacz_fosy"), kopaczFosy);
        kopaczRecipe.shape("EEE", "EDE", "EEE");
        kopaczRecipe.setIngredient('E', Material.DIRT);
        kopaczRecipe.setIngredient('D', Material.DIAMOND);
        Bukkit.addRecipe(kopaczRecipe);
    }

    @Override
    public void onDisable() {
    }
}