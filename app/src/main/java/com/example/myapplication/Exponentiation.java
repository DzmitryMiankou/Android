package com.example.myapplication;

public class Exponentiation {
    private final long EXPONENT, BASE;
    private long value = 1;
    Exponentiation(int b, int o){
        EXPONENT = o;
        BASE = b;
    }
    protected long getResult() {
        for(int i = 0; i < this.EXPONENT; i++) this.value = this.value * this.BASE;
        return (int) value;
    }
}