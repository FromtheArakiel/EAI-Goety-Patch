package eai_goety_patch;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

@Mod(EaiGoetyPatch.MOD_ID)
public class EaiGoetyPatch {

    public static final String MOD_ID = "eai_goety_patch";
    public static final Logger LOGGER = LogUtils.getLogger();

    public EaiGoetyPatch() {
        LOGGER.info("EAI Goety Patch loaded");
    }
}