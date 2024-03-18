/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vehicleenginedemo;

/**
 *
 * @author nayan
 */
interface Engine {
    void start();
    void stop();
}

class VehicleEngine implements Engine {
    public void start() {
        System.out.println("Vehicle engine started.");
    }
    
    public void stop(){
        System.out.println("Vehicle engine stopped.");
    }
}

class Car {
    private Engine engine;
    
    public Car(Engine engine){
        this.engine = engine;
    }
    
    public void startCar(){
        engine.start();
    }
    public void stopCar(){
        engine.stop();
    }
}

public class VehicleEngineDemo {

    public static void main(String[] args) {
        Engine vehicleEngine = new VehicleEngine();
        
        Car car = new Car(vehicleEngine);
        
        car.startCar();
        car.stopCar();
    }
}
