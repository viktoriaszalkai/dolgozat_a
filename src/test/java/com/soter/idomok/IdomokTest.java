package com.soter.idomok;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IdomokTest {
    FaIdom idom;

    @Test
    void testAbstract() throws NoSuchMethodException {
        Class<?> clazz = FaIdom.class;
        assertTrue(Modifier.isAbstract(clazz.getModifiers()), "A 'FaIdom' osztály legyen abstract.");

        String pkg = clazz.getPackageName();
        assertEquals("com.soter.idomok", pkg, "a csomag 'com.soter.idomok' legyen.");

        Method method = clazz.getDeclaredMethod("terfogat");
        boolean abs = Modifier.isAbstract(method.getModifiers());
        assertTrue(abs, "a 'terfogat' metódus legyen abstract.");
    }

    @Test
    void testFajsuly(){
        assertEquals(0.75, FaIdom.getFajsuly());
    }

    @Test
    void testGombTerfogat(){
        idom = new Gomb(1.0);
        assertEquals(4.188, idom.terfogat(), 0.001);
    }

    @Test
    void testGombSuly(){
        idom = new Gomb(1.0);
        double d = idom.suly();
        assertEquals(3.141, idom.suly(), 0.001);
    }

    @Test
    void testHasabTerfogat(){
        idom = new Hasab(1.0, 1.0, 1.0);
        assertEquals(1, idom.terfogat(), 0.001);
    }

    @Test
    void testHasabSuly(){
        idom = new Hasab(1.0, 1.0, 1.0);
        assertEquals(0.75, idom.suly(), 0.001);
    }

    @Test
    void testHasabParamSorrend(){
        Hasab hasab = new Hasab(1,2,3);
        assertEquals(1, hasab.getA());
        assertEquals(2, hasab.getB());
        assertEquals(3, hasab.getM());
    }
}
