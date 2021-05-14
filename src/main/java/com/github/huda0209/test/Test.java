package com.github.huda0209.test;

import org.bukkit.plugin.java.JavaPlugin;

public final class Test extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("This plugin was enable.");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("This plugin was disable.");
    }
}
