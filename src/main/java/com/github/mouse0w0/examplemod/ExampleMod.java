package com.github.mouse0w0.examplemod;

import org.slf4j.Logger;
import unknowndomain.engine.event.Listener;
import unknowndomain.engine.event.game.GameReadyEvent;
import unknowndomain.engine.mod.Mod;
import unknowndomain.engine.mod.inject.Log;

@Mod("examplemod:1.0.0")
public class ExampleMod {

    @Log
    public static Logger logger;

    @Listener
    public void onReady(GameReadyEvent event) {
        logger.info("Hello UDEngine.");
    }
}
