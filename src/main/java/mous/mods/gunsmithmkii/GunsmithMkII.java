package mous.mods.gunsmithmkii;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = GunsmithMkII.MODID, version = GunsmithMkII.VERSION, name = GunsmithMkII.NAME)
public class GunsmithMkII {
	public static final String MODID = "gunsmithmkii";
	public static final String VERSION = "1.0";
	public static final String NAME = "V2GunsmithModMkII";
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent event){
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		System.out.println("GS init");
	}
}
