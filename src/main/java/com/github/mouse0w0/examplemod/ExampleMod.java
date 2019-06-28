package com.github.mouse0w0.examplemod;

import com.google.inject.Inject;
import nullengine.event.Listener;
import nullengine.event.mod.ModLifecycleEvent;
import nullengine.mod.annotation.Mod;
import org.slf4j.Logger;

@Mod(id = "examplemod", version = "1.0.0", name = "Example Mod")
public class ExampleMod {

    @Inject
    public static Logger logger;

    @Listener
    public void onInit(ModLifecycleEvent.Initialization event) {
        logger.info("Hello World!");
    }
}
