/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.finalkeywordex;

/**
 *
 * @author nayan
 */
class FinalVariableEx {
    final int x = 10;
    
    void display(){
        System.out.println("Value of final variable x: " + x);
    }
}

class Parent {
    final void display() {
        System.out.println("Final method in parent class");
    }
}

class Child extends Parent {
    
}
final class FinalClassEx {
    void display() {
        System.out.println("Inside final class");
    }
}
public class FinalKeywordEx {

    public static void main(String[] args) {
        FinalVariableEx obj1 = new FinalVariableEx();
        obj1.display();
        
        Parent obj2 = new Parent();
        obj2.display();
        
        FinalClassEx obj3 = new FinalClassEx();
        obj3.display();
    }
}
