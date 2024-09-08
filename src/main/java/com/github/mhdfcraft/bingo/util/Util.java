package com.github.mhdfcraft.bingo.util;

import com.github.mhdfcraft.bingo.Bingo;

import java.util.Locale;

public final class Util {
    public static Bingo instance;

    public static String getLanguage() {
        return Locale.getDefault().getLanguage();
    }
}
