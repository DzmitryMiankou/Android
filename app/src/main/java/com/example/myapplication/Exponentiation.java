package com.example.myapplication;

public class Exponentiation {
    private final long OPERATION, BASE;
    private long value = 1;
    Exponentiation(int b, int o){
        OPERATION = o;
        BASE = b;
    }
    protected long getResult() {
        for(int i = 0; i < this.OPERATION; i++) this.value = this.value * this.BASE;
        return  value;
    }
}