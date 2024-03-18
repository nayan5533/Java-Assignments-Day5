/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.multipleinterfacesdemo;

/**
 *
 * @author nayan
 */
interface Flyble{
    void fly();
}

interface Swimmable{
    void swim();
}

class Bird implements Flyble,Swimmable{
    
    public void fly(){
        System.out.println("Bird is flying.");
    }
    
    public void swim(){
        System.out.println("Bird is Swimming.");
    }
}
public class MultipleInterfacesDemo {

    public static void main(String[] args) {
        Bird bird = new Bird();
        
        bird.fly();
        bird.swim();
        
    }
}
