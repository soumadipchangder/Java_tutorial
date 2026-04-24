package com;

class Bmw {

    void engineStarts(){
        System.out.println("Engine started");
    }

    void headlights(){
        System.out.println("Headlights are on");
    }

    void running(){
        System.out.println("Car is running");
    }
}

public class Car {

    public static void main(String[] args) {

        Bmw b = new Bmw();

        b.engineStarts();
        b.headlights();
        b.running();
    }
}