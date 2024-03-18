/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfacefieldaccess;

/**
 *
 * @author nayan
 */
interface MyInterface{
    
    String MESSAGE = "Hello Interface!";
    int VALUE = 100;
}
public class InterfaceFieldAccess {

    public static void main(String[] args) {
        System.out.println("Message from interface: " + MyInterface.MESSAGE);
        System.out.println("Value from interface: " + MyInterface.VALUE);
    }
    }

