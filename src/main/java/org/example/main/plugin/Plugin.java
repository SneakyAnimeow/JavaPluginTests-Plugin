package org.example.main.plugin;

import com.google.gson.GsonBuilder;
import org.example.main.api.Api;

public class Plugin implements Api {
    @Override
    public void onEnable() {
        System.out.println("Plugin was enabled!\nTesting external dependency gson:");

        var gson = new GsonBuilder().setPrettyPrinting().create();

        var json = gson.toJson(new TestObject().setName("Test").setAge(1));

        System.out.println(json);
    }

    @Override
    public void onDisable() {
        System.out.println("Plugin was disabled!");
    }
}