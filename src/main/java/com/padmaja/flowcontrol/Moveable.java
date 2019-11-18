package com.padmaja.flowcontrol;

public interface Moveable {
    String MIN_DISTANCE = "Small";
    default void relax(){
        System.out.println("No moving");
    }

}
