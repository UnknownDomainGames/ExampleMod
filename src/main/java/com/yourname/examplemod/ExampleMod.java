package com.yourname.examplemod;

import com.google.inject.Inject;
import engine.event.Listener;
import engine.event.mod.ModLifecycleEvent;
import engine.mod.annotation.Mod;
import org.slf4j.Logger;

@Mod(id = "examplemod", name = "Example Mod")
public class ExampleMod {

    @Inject
    public static Logger logger;

    @Listener
    public void onInit(ModLifecycleEvent.Initialization event) {
        logger.info("Hello World!");
    }
}
