package com.padmaja.flowcontrol;

public class Animal  implements Jumpable,Moveable {
                Animal(){
                    System.out.println(Jumpable.MIN_DISTANCE);
                }


    @Override
    public void relax() {
        System.out.println("relax");
    }

}
