/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfaceabstractdemo;

/**
 *
 * @author nayan
 */
interface MyInterface {
    void method1();
    void method2();
}

abstract class AbstractClass implements MyInterface {
    
    public void method1() {
        System.out.println("Implementation of method1() inside AbstractClass");
    }
    
    public abstract void method2();
}

class MyClass extends AbstractClass {
    
    public void method2() {
        System.out.println("Implementation of method2() inside MyClass");
    }
}

public class InterfaceAbstractDemo {

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        
        obj.method1();
        obj.method2();
    }
}
