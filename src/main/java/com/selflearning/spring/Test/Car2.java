package com.selflearning.spring.Test;

public class Car2 {

    private Engine1 engine;

    private String carName;

    public void setEngine(Engine1 engine) {
        this.engine = engine;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void getInfo(){
        System.out.println("Name of the car "+carName);
        System.out.println("Engine name is "+engine.getEngineName());
    }

}
