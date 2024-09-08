package com.github.mhdfcraft.bingo.util.message;

import com.github.mhdfcraft.bingo.util.VersionUtil;
import net.md_5.bungee.api.ChatColor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class MessageUtil {
    public static String translateHexCodes(String message) {
        // 解析RGB文本
        final String hexPattern = "#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{8})";
        Matcher matcher = Pattern.compile(hexPattern).matcher(message);
        StringBuilder sb = new StringBuilder(message.length());
        while (matcher.find()) {
            String hex = matcher.group(1);
            ChatColor color = ChatColor.of("#" + hex);
            matcher.appendReplacement(sb, color.toString());
        }
        matcher.appendTail(sb);
        return sb.toString();
    }

    public static String colorMessage(String Message) {
        // 判断是否为1.16+版本
        if (VersionUtil.is1_16orAbove()) {
            Message = translateHexCodes(Message);
        }
        return ChatColor.translateAlternateColorCodes('&', Message);
    }
}