package club.moddedminecraft.tpsmonitoring.bukkit;

import club.moddedminecraft.tpsmonitoring.core.TpsLibrary;
import org.bukkit.plugin.java.JavaPlugin;

public class TpsMonitoring extends JavaPlugin {

    @Override
    public void onEnable() {
        TpsLibrary library = new TpsLibrary();
        library.init();
    }

    @Override
    public void onDisable() {

    }

}
