package org.dqrknessid.waterstand;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class WaterStand extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void onEntityDamage(EntityDamageEvent event) {
        // Optimization: Fast enum check for damage cause first
        if (event.getCause() != EntityDamageEvent.DamageCause.FIRE_TICK) {
            return;
        }

        // Optimization: Fast enum check for entity type
        if (event.getEntityType() != EntityType.ARMOR_STAND) {
            return;
        }

        // Optimization: Check water state last as it may involve spatial checks
        if (event.getEntity().isInWater()) {
            event.setCancelled(true);
        }
    }
}
