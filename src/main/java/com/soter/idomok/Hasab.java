package com.soter.idomok;

public class Hasab extends FaIdom {
    public double a,b,m;

    public Hasab(double a, double b, double m) {
        this.a = a;
        this.b = b;
        this.m = m;
    }

    @Override
    public double terfogat() {
        return a*b*m;
    }

    @Override
    public double suly() {
        return terfogat()*getFajsuly();
    }

    public double getA() {
        return this.a;
    }
    public double getB() {
        return this.b;
    }
    public double getM() {
        return this.m;
    }
}
