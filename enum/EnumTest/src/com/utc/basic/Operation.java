/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utc.basic;

/**
 *
 * @author Masudul Haque
 */
public enum Operation {
//     PLUS,MINUS,TIMES,DIVIDE;
//     
//     double apply(double x, double y){
//         switch(this){
//             case PLUS: return x+y;
//             case MINUS: return x-y;
//             case TIMES: return x*y;
//             case DIVIDE: return x/y;  
//         }
//         throw new AssertionError("Unknown Op :"+this);
//     }
//     
    

//        PLUS { double apply(double x, double y){return x + y;} },
//        MINUS { double apply(double x, double y){return x - y;} },
//        TIMES { double apply(double x, double y){return x * y;} },
//        DIVIDE { double apply(double x, double y){return x / y;} };
//        abstract double apply(double x, double y);   
    
    PLUS("+") {
    double apply(double x, double y) { return x + y; }
    },
    MINUS("-") {
    double apply(double x, double y) { return x - y; }
    },
    TIMES("*") {
    double apply(double x, double y) { return x * y; }
    },
    DIVIDE("/") {
    double apply(double x, double y) { return x / y; }
    };
    private final String symbol;
    Operation(String symbol) { this.symbol = symbol; }
    @Override public String toString() { return symbol; }
    abstract double apply(double x, double y);

}
