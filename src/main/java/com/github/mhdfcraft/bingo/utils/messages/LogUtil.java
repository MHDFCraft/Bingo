package com.github.mhdfcraft.bingo.utils.messages;

import com.github.mhdfcraft.bingo.utils.Util;
import org.bukkit.Bukkit;

public final class LogUtil {
    public static void debug(String... messages) {
        if (Util.instance.getConfig().getBoolean("Debug")) {
            StringBuilder messageBuilder = new StringBuilder("[Bingo-调试] ");
            for (int i = 0; i < messages.length; i++) {
                messageBuilder.append(messages[i]);
                if (i < messages.length - 1) {
                    messageBuilder.append(" | ");
                }
            }
            colorLog(messageBuilder.toString());
        }
    }

    public static void colorLog(String message) {
        Bukkit.getConsoleSender().sendMessage(MessageUtil.colorMessage(message));
    }
}