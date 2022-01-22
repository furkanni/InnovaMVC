package com.patika.tutorials;

import lombok.Getter;

//type safe
public enum EnumRenkler {
    MAVI,YESIL,TURUNCU
}

enum Renkler2 {
    MAVI(1,"mavi"), YESIL(2,"yesil"),TURUNCU(3,"turuncu");

    @Getter
    private final int renkID;
    @Getter
    private final String renkAdi;

    Renkler2(int renkID, String renkAdi) {
        this.renkID = renkID;
        this.renkAdi = renkAdi;
    }
}

class Deneme{
    public static void main(String[] args) {
        EnumRenkler renkler = EnumRenkler.MAVI;
        System.out.println(renkler);

        String renkler2 = EnumRenkler.MAVI.toString();
        System.out.println(renkler2.toLowerCase());
        System.out.println("**************");

        String cons= Renkler2.MAVI.getRenkAdi();
        System.out.println(cons);

    }
}
