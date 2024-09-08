package com.github.mhdfcraft.bingo;

import com.github.mhdfcraft.bingo.util.Util;
import com.github.mhdfcraft.bingo.util.message.LogUtil;
import org.bukkit.plugin.java.JavaPlugin;

public final class Bingo extends JavaPlugin {

    public Bingo() {
        Util.instance = this;
    }

    @Override
    public void onLoad() {
        LogUtil.colorLog("&f[Bingo] &a插件加载完毕!");
    }

    @Override
    public void onEnable() {
        LogUtil.colorLog("&f[Bingo] &a插件启用完成!");
    }

    @Override
    public void onDisable() {
        LogUtil.colorLog("&f[Bingo] &9插件已卸载!");
        Util.instance = null;
    }
}
