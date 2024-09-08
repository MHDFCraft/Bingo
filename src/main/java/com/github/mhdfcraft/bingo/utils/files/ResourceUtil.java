package com.github.mhdfcraft.bingo.utils.files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public final class ResourceUtil {
    public static InputStream getResource(String file) {
        if (file == null || file.isEmpty()) {
            throw new IllegalArgumentException("Filename cannot be null or empty");
        }

        URL url = ResourceUtil.class.getClassLoader().getResource(file);
        if (url == null) {
            return null;
        }

        try {
            URLConnection connection = url.openConnection();
            connection.setUseCaches(false);
            return connection.getInputStream();
        } catch (IOException ex) {
            throw new RuntimeException("Failed to open input stream for resource: " + file, ex);
        }
    }

    public static void saveResource(String filePath, String fileName, boolean replace) {
        if (filePath == null || filePath.isEmpty()) {
            throw new IllegalArgumentException("FilePath cannot be null or empty");
        }
        if (fileName == null || fileName.isEmpty()) {
            throw new IllegalArgumentException("OutFileName cannot be null or empty");
        }

        fileName = fileName.replace('\\', '/');
        try (InputStream in = getResource(fileName)) {
            if (in == null) {
                throw new IllegalArgumentException("The embedded resource '" + fileName + "' cannot be found");
            }

            File outFile = new File(filePath, fileName);
            if (!outFile.exists() || replace) {
                try (FileOutputStream out = new FileOutputStream(outFile)) {
                    byte[] buf = new byte[1024];
                    int len;
                    while ((len = in.read(buf)) > 0) {
                        out.write(buf, 0, len);
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to save resource to files", e);
        }
    }
}
