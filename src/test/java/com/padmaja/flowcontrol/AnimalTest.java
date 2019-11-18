package com.padmaja.flowcontrol;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {
Animal animal = new Animal();
    @Test
    public void relax() {
        System.out.println("relaxation");
        animal.relax();
        animal.relax();
        System.out.println(animal.equals(animal));

    }
    AnimalTest(){
        System.out.println(Jumpable.MIN_DISTANCE);
        System.out.println(Moveable.MIN_DISTANCE);
    }

}
