package com.github.mhdfcraft.bingo;

import com.github.mhdfcraft.bingo.util.Util;
import com.github.mhdfcraft.bingo.util.message.LogUtil;
import org.bukkit.plugin.java.JavaPlugin;

public final class Bingo extends JavaPlugin {

    @Override
    public void onEnable() {
        Util.instance = this;

        LogUtil.colorLog("&f[MHDF-Bingo] &a插件加载完成!");
        LogUtil.colorLog("&f[MHDF-Bingo] &a欢迎使用梦东系列插件 交流群号:129139830");
    }

    @Override
    public void onDisable() {
        Util.instance = null;

        LogUtil.colorLog("&f[MHDF-Bingo] &9插件已卸载! 感谢您再次支持!");
        LogUtil.colorLog("&f[MHDF-Bingo] &a欢迎使用梦东系列插件 交流群号:129139830");
    }
}
