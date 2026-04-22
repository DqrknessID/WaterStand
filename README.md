# WaterStand

A minimal, ultra-optimized Paper plugin designed to fix a specific behavior introduced in recent Minecraft versions (1.21.1+) where Armor Stands take `FIRE_TICK` damage even when submerged in water, which often breaks existing water-based traps or decorative setups.

## 🚀 Features

- **Targeted Fix**: Specifically cancels `FIRE_TICK` damage for `ArmorStand` entities ONLY when they are in water.
- **Ultra-Performance**: 
    - **Fast Filtering**: Uses high-speed enum comparisons to discard irrelevant events in nanoseconds.
    - **Smart Execution**: Employs `EventPriority.LOWEST` and `ignoreCancelled = true` to ensure the lowest possible CPU overhead.
    - **Zero Footprint**: No background tasks, no commands, and no configuration files needed.
- **Plug & Play**: Works immediately upon installation.

## 🛠️ Requirements

- **Server**: Paper, Purpur, or any high-performance fork of Spigot.
- **Version**: Minecraft 1.21.11 or newer.
- **Java**: Version 21.

## 📦 Installation

1. Compile the plugin using Maven (`mvn clean package`).
2. Copy the resulting JAR file from the `target/` directory to your server's `plugins/` folder.
3. Restart your server.

## 📄 License

This project is open-source and free to use.
