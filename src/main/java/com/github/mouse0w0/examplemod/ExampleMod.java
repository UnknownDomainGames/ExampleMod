package com.github.mouse0w0.examplemod;

import unknowndomain.engine.event.Listener;
import unknowndomain.engine.event.game.GameReadyEvent;
import unknowndomain.engine.mod.Mod;

@Mod("examplemod:1.0.0")
public class ExampleMod {

    @Listener
    public void onReady(GameReadyEvent event) {
        System.out.println("Hello UDEngine");
    }
}
