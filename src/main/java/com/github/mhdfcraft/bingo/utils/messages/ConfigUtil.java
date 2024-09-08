package com.github.mhdfcraft.bingo.utils.messages;

import com.github.mhdfcraft.bingo.utils.Util;
import com.github.mhdfcraft.bingo.utils.files.ResourceUtil;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.util.Locale;

public final class ConfigUtil {
    private static final File configFile = new File(Util.instance.getDataFolder(),"config.yml");
    private static YamlConfiguration config;

    public static void saveConfig() {
        // 判断设备语言是否为中文,如果是使用中文配置文件
        if (Locale.getDefault().getLanguage().contains("zh")) {
            ResourceUtil.saveResource(configFile.getParent(),configFile.getName() + "_zh",false);
        }else {
            ResourceUtil.saveResource(configFile.getParent(), configFile.getName() + "_en", false);
        }
    }

    public static void reloadConfig() {
        config = YamlConfiguration.loadConfiguration(configFile);
    }

    public static YamlConfiguration getConfig() {
        // 如果未加载配置文件,就自动加载
        if (config == null) {
            reloadConfig();
        }
        return config;
    }
}
