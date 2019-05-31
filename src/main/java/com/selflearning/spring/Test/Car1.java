package com.selflearning.spring.Test;


public class Car1 {

    private String carName;
    private Engine1 engine;

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setEngine(Engine1 engine) {
        this.engine = engine;
    }

    public void getCarInfo(){
        System.out.println("Engine name : "+engine.getEngineName());
        System.out.println("Car name : "+carName);
    }
}
