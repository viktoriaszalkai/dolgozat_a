package com.soter.idomok;

public class Gomb extends FaIdom {

    public double v;

    public Gomb(double v) {
        this.v = v;
    }

    @Override
    public double terfogat() {
        return (4*Math.pow(v,3)*Math.PI)/3;
    }

    @Override
    public double suly() {
        return terfogat()*getFajsuly();
    }


}
