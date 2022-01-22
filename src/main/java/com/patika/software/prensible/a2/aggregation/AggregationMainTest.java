package com.patika.software.prensible.a2.aggregation;

public class AggregationMainTest {

    public static void main(String[] args) {

        //Motor = 1 tane olsun
        //Araba -> 1den fazla olsun

        Araba araba = new Araba();
        double fiyat = araba.getToplamFiyat();
        System.out.println(fiyat);
    }
}
