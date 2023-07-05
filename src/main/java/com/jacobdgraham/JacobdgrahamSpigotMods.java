package com.jacobdgraham;

import com.jacobdgraham.commands.RepairItem;
import com.jacobdgraham.listeners.PlayerJoinListener;
import org.bukkit.command.PluginCommand;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.Objects;

public final class JacobdgrahamSpigotMods extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("RepairItem").setExecutor(new RepairItem());
        getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
