/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfacemethodvisibility;

/**
 *
 * @author nayan
 */
interface MyInterface{
    void publicMethod();
    
    private void privateMethod(){
    System.out.println("This is a private method inside the interface.");
}

default void defaultMethod(){
System.out.println("This is a default method inside the interface.");
privateMethod();
}
}

class MyClass implements MyInterface{
    public void publicMethod(){
        System.out.println("This is the implentation of publicMethod() in MyClass.");
    }
}

public class InterfaceMethodVisibility{
    public static void main(String[] args){
        MyClass obj = new MyClass();
        
        obj.publicMethod();
        obj.defaultMethod();
    }
}












