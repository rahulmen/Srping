package com.selflearning.spring.Test;

public class Car4 {

    private Engine2 engine;

    private String carName;

    public void setEngine(Engine2 engine) {
        this.engine = engine;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void getInfo(){
        System.out.print(carName);
        System.out.println(engine.getEngineName());
    }

}
