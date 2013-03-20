/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utc.advance;

/**
 *
 * @author Masudul Haque
 */
public enum BasicOperation implements Operation {
    PLUS("+") {
    public double apply(double x, double y) { return x + y; }
    },
    MINUS("-") {
    public double apply(double x, double y) { return x - y; }
    },
    TIMES("*") {
    public double apply(double x, double y) { return x * y; }
    },
    DIVIDE("/") {
    public double apply(double x, double y) { return x / y; }
    };
    private final String symbol;
    BasicOperation(String symbol) {
        this.symbol = symbol;
    }
    @Override public String toString() {
        return symbol;
    }
}
