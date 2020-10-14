package com.company;

public class God {

    private static God god;

    private God(){
        System.out.println("I am the only God here!");
    }

    public static God getInstance(){
        if (god == null){
            return new God();
        }
        return god;
    }


    public void createUniverse(){
        System.out.println("Universe has been created!");
    }

    public void createTheFirstHuman(){
        System.out.println("The first human has been created!");
    }

    public void startTheTimeLine(){
        System.out.println("Timeline has been started");
    }
    
    public void sayHello(){
        System.out.println("Hello world!");
    }

}
