package com.github.mouse0w0.examplemod;

import org.slf4j.Logger;
import unknowndomain.engine.event.Listener;
import unknowndomain.engine.event.game.GameReadyEvent;
import unknowndomain.engine.mod.Mod;

@Mod("examplemod:1.0.0")
public class ExampleMod {

    @unknowndomain.engine.mod.inject.Logger
    public static Logger logger;

    @Listener
    public void onReady(GameReadyEvent event) {
        logger.info("Hello UDEngine.");
    }
}
