package com.nasatest.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


/**
 * @author guirosset
 * @created/modified on 03/17/2022
 */
public class ConfigManager {

    private static ConfigManager manager;
    private static final Properties PROPS = new Properties();

    private ConfigManager() throws IOException {
        try (InputStream stream = ConfigManager.class.getResourceAsStream("/config.properties")) {
            PROPS.load(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ConfigManager getInstance() {
        if (manager == null) {
            synchronized (ConfigManager.class) {
                try {
                    manager = new ConfigManager();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return manager;
    }

    public String getString(String key) {
        return PROPS.getProperty(key, PROPS.getProperty(key));
    }
}