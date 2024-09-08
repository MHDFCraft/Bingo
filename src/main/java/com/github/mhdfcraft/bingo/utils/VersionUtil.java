package com.github.mhdfcraft.bingo.utils;

import org.bukkit.Bukkit;

public final class VersionUtil {
    public static String getVersion() {
        return Bukkit.getVersion().split("MC: ")[1].replace(")", "");
    }

    public static boolean is1_8() {
        return getVersion().startsWith("1.8");
    }

    public static boolean is1_9orAbove() {
        return !getVersion().startsWith("1.7") || !getVersion().startsWith("1.8");
    }

    public static boolean is1_12orAbove() {
        return getVersion().startsWith("1.12") || getVersion().startsWith("1.13") || getVersion().startsWith("1.14") || getVersion().startsWith("1.15") || getVersion().startsWith("1.16") || getVersion().startsWith("1.17") || getVersion().startsWith("1.18") || getVersion().startsWith("1.19") || getVersion().startsWith("1.20");
    }

    public static boolean is1_13orAbove() {
        return getVersion().startsWith("1.13") || getVersion().startsWith("1.14") || getVersion().startsWith("1.15") || getVersion().startsWith("1.16") || getVersion().startsWith("1.17") || getVersion().startsWith("1.18") || getVersion().startsWith("1.19") || getVersion().startsWith("1.20");
    }

    public static boolean is1_14orAbove() {
        return getVersion().startsWith("1.14") || getVersion().startsWith("1.15") || getVersion().startsWith("1.16") || getVersion().startsWith("1.17") || getVersion().startsWith("1.18") || getVersion().startsWith("1.19") || getVersion().startsWith("1.20");
    }

    public static boolean is1_15orAbove() {
        return getVersion().startsWith("1.15") || getVersion().startsWith("1.16") || getVersion().startsWith("1.17") || getVersion().startsWith("1.18") || getVersion().startsWith("1.19") || getVersion().startsWith("1.20");
    }

    public static boolean is1_16orAbove() {
        return getVersion().startsWith("1.16") || getVersion().startsWith("1.17") || getVersion().startsWith("1.18") || getVersion().startsWith("1.19") || getVersion().startsWith("1.20");
    }

    public static boolean is1_17orAbove() {
        return getVersion().startsWith("1.17") || getVersion().startsWith("1.18") || getVersion().startsWith("1.19") || getVersion().startsWith("1.20");
    }

    public static boolean is1_18orAbove() {
        return getVersion().startsWith("1.18") || getVersion().startsWith("1.19") || getVersion().startsWith("1.20");
    }

    public static boolean is1_19orAbove() {
        return getVersion().startsWith("1.19") || getVersion().startsWith("1.20");
    }

    public static boolean is1_20orAbove() {
        return getVersion().startsWith("1.20") || getVersion().startsWith("1.21");
    }
}
