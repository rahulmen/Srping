package com.selflearning.spring.Test;

public class Car3 {

    private Engine1 engine;

    private String carName;

    public void setEngine(Engine1 engine) {
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
