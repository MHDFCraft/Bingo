package com.github.mhdfcraft.bingo.logs;

import com.github.mhdfcraft.bingo.utils.Utils;

public class Log {
    public void info(String str) {
        Utils.instance.getLogger().info(str);
    }

    public void warning(String str) {
        Utils.instance.getLogger().warning(str);
    }

    public void severe(String str) {
        Utils.instance.getLogger().severe(str);
    }
}
