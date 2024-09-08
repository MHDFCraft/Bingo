package com.github.mhdfcraft.bingo.utils.files;

import com.github.mhdfcraft.bingo.utils.Util;

import java.io.File;
import java.io.IOException;

public final class FileUtil {
    public static void createDir(File directory) {
        if (!directory.exists()) {
            directory.mkdirs();
        }
    }

    public static void createDir(String path) {
        File directory = new File(Util.instance.getDataFolder(), path);
        createDir(directory);
    }

    public static void createFile(String path) {
        File file = new File(Util.instance.getDataFolder(), path);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void createFile(File file) {
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
