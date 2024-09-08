package com.github.mhdfcraft.bingo;

import com.github.mhdfcraft.bingo.logs.Log;
import com.github.mhdfcraft.bingo.utils.Utils;
import org.bukkit.plugin.java.JavaPlugin;

public final class Bingo extends JavaPlugin {

    public static Log log = new Log();

    public Bingo() {
        Utils.instance = this;
    }

    @Override
    public void onLoad() {
        log.info("Loaded " + getDescription().getFullName());
    }

    @Override
    public void onEnable() {
        log.info("Enabled " + getDescription().getFullName());
    }

    @Override
    public void onDisable() {
        log.info("Disabled " + getDescription().getFullName());
    }
}
