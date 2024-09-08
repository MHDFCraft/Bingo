package com.github.mhdfcraft.bingo.util.message;

import com.github.mhdfcraft.bingo.util.Util;
import com.github.mhdfcraft.bingo.util.file.ResourceUtil;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.util.Locale;

public final class LangUtil {
    private static final File langFile = new File(Util.instance.getDataFolder(),"lang.yml");
    private static YamlConfiguration lang;

    public static void saveLang() {
        // 判断设备语言是否为中文,如果是使用中文语言文件
        if (Util.getLanguage().contains("zh")) {
            ResourceUtil.saveResource(langFile.getParent(),langFile.getName() + "_zh",false);
        }else {
            ResourceUtil.saveResource(langFile.getParent(), langFile.getName() + "_en", false);
        }
    }

    public static void reloadLang() {
        lang = YamlConfiguration.loadConfiguration(langFile);
    }

    public static String i18n(String key) {
        // 如果未加载语言文件,就自动加载
        if (lang == null) {
            reloadLang();
        }
        return lang.getString(key);
    }
}
