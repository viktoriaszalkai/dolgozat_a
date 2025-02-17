package com.soter;

import com.soter.idomok.FaIdom;
import com.soter.idomok.Gomb;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FaIdomokProgram {
    private  ArrayList<FaIdom>faIdomok;

    public FaIdomokProgram() {
    }

    public void ujIdom(FaIdom faIdom) {
        faIdomok = new ArrayList<>(List.of(faIdom));
    }

    public ArrayList<FaIdom> getLista() {
        return this.faIdomok;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FaIdomokProgram that = (FaIdomokProgram) o;
        return Objects.equals(faIdomok, that.faIdomok);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(faIdomok);
    }

    public double osszSuly(){
        double ossz =  0.0;
        for(FaIdom idom:faIdomok){
            ossz += idom.suly();
        }
        return ossz;
    }
    public double gombokOsszSuly(){
        double osszG =  0.0;
        for(FaIdom idom:faIdomok){
            if(idom instanceof Gomb) {
                osszG += ((Gomb)idom).suly();
            }
        }
        return osszG;
    }
    public FaIdom maxV(){
        FaIdom max = faIdomok.get(0);
        for (int i = 0; i < faIdomok.size()-1; i++) {
            if(max.terfogat() < faIdomok.get(i+1).terfogat()){
                max = faIdomok.get((i+1));
            }
        }
        return max;
    }

    public FaIdom minV(){
        FaIdom min = faIdomok.get(0);
        for (int i = 0; i < faIdomok.size()-1; i++) {
            if(min.terfogat() > faIdomok.get(i+1).terfogat()){
                min = faIdomok.get((i+1));
            }
        }
        return min;
    }


}
