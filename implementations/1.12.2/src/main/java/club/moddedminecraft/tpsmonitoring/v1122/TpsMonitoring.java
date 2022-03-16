package club.moddedminecraft.tpsmonitoring.v1122;

import club.moddedminecraft.tpsmonitoring.core.TpsLibrary;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = TpsMonitoring.MODID, name = TpsMonitoring.NAME, version = TpsMonitoring.VERSION, serverSideOnly = true)
public class TpsMonitoring {
    public static final String MODID = "tpsmonitoring";
    public static final String NAME = "Tps Monitoring";
    public static final String VERSION = "1.0";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        TpsLibrary library = new TpsLibrary();
        library.init();
    }
}
