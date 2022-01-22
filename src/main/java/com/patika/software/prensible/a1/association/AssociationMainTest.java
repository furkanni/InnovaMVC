package com.patika.software.prensible.a1.association;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class AssociationMainTest {

    public static void main(String[] args) {
        Musteri musteri=Musteri.builder().musteriAdi("Furkan").musteriSehri("İstanbul").build();

        SuperMarket superMarket= SuperMarket.builder().superMarketAdi("Migros").superMarketSehir("İstanbul").build();

        log.info("Müsteri Adı "+musteri.getMusteriAdi()+" Supermarket Adı: "+superMarket.getSuperMarketAdi());

    }
}
