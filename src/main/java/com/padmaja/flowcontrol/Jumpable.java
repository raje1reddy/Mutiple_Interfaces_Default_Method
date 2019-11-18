package com.padmaja.flowcontrol;

public interface Jumpable {
    int MIN_DISTANCE = 10;
    default void relax(){
        System.out.println("No jumping");
    }

}
