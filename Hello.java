/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uum;

/**
 *
 * @author admin
 */
public class HelloWorld {
    
    public static void main(String[] args){
        HelloWorld hw = new HelloWorld();
        String x = hw.sayHello("Ain");
        System.out.println(x);
    }
    
    public String sayHello (String name){
        String hello = "Hello "+ name;
        return hello;
        
    }
}
