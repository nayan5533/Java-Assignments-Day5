/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.passbyvaluereferencedemo;

/**
 *
 * @author nayan
 */
class Person {
    String name;
    
    public Person(String name) {
        this.name = name;
    }
}
public class PassByValueReferenceDemo {

    public static void main(String[] args) {
        int x = 10;
        
        System.out.println("Before method call: x = " + x);
        passByValue(x);
        System.out.println("After method call: x = " + x);
        System.out.println();
        
        Person person = new Person("John");
        System.out.println("Before method call: Person name= " + person.name);
        passByReference(person);
        System.out.println("After method call: Person name = " + person.name);
    }
    
    public static void passByValue(int x){
        x = 20;
        System.out.println("Inside methid: x = " + x);
    }
    
    public static void passByReference(Person p) {
        p.name = "Nayan";
        System.out.println("Inside method: Person name = " + p.name);
    }
}
