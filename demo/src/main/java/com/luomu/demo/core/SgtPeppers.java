package com.luomu.demo.core;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {
    @Override
    public void play() {
        System.out.println("playing sgt sgt.......");
    }
}
