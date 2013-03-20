/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.tutorial;

/**
 *
 * @author Masudul Haque
 */
public interface HelloMBean { 
 
    public void sayHello(); 
    public int add(int x, int y); 
 
    public String getName(); 
 
    public int getCacheSize(); 
    public void setCacheSize(int size); 
}