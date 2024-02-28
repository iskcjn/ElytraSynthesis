package ricecc.elytrasynthesis;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public final class ElytraSynthesis extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        ShapedRecipe craft = new ShapedRecipe(new ItemStack(Material.ELYTRA))
                .shape("   ","xyx"," x ")
                .setIngredient('x',Material.FEATHER)
                .setIngredient('y',Material.NETHERITE_INGOT);
        getServer().addRecipe(craft);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
