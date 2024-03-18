/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.genericinterfacedemo;

/**
 *
 * @author nayan
 */
interface MyInterface<T> {
    void processData(T data);
}

class IntegerProcessor implements MyInterface<Integer>{
    public void processData(Integer data){
        System.out.println("Processing Integer data: " + data);
    }
}

class StringProcessor implements MyInterface<String>{
    public void processData(String data){
        System.out.println("Processing String data: " + data);
    }
}
public class GenericInterfaceDemo {

    public static void main(String[] args) {
        
        MyInterface<Integer> intProcessor = new IntegerProcessor();
        MyInterface<String> stringProcessor = new StringProcessor();
        
        intProcessor.processData(10);
        stringProcessor.processData("Hello");
    }
}
