package mc.lovexyn0827.mcwmem.hud;

import mc.lovexyn0827.mcwmem.MCWMEMod;

public class HudUtil {
	public static boolean isLeftAligned() {
		return MCWMEMod.INSTANCE.getOption("alignMode").contains("Left");
	}
}
