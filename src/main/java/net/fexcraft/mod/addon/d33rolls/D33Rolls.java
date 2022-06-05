package net.fexcraft.mod.addon.d33rolls;

import net.fexcraft.mod.fvtm.data.addon.AddonClass;
import net.minecraftforge.fml.common.Mod;

@AddonClass(registryname = "fvtm:d33rolls"/*,hasJson = false*/)
@Mod(modid = D33Rolls.MODID, name = D33Rolls.NAME, version = D33Rolls.VERSION, useMetadata = true, dependencies = "required-after:fcl;required-after:fvtm")
public class D33Rolls {
	
    public static final String MODID = "d33rolls";
    public static final String NAME = "D33 Rolls-Royce";
    public static final String VERSION = "0.1";
    
    /*@Mod.EventHandler
    public void init(FMLInitializationEvent event){
    	
    }*/
}
