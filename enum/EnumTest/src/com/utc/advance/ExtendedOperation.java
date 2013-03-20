/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utc.advance;

/**
 *
 * @author Masudul Haque
 */
public enum ExtendedOperation implements Operation {
    EXP("^") {
        public double apply(double x, double y) {
        return Math.pow(x, y);
        }
    },
    REMAINDER("%") {
        public double apply(double x, double y) {
        return x % y;
        }
    };
    private final String symbol;
    ExtendedOperation(String symbol) {
        this.symbol = symbol;
    }
    @Override public String toString() {
        return symbol;
    }
}