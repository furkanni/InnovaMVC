package com.patika.software.prensible.a3.composition;

import lombok.NoArgsConstructor;
import org.apache.catalina.LifecycleState;

import java.util.List;

// N tane kitap (yazarsız kitap olmaz)

public class Kitap {

        private String kitapAdi;
        private String kitapFiyati;

    private Yazar yazar;

    public Kitap(){}

    public Kitap(String kitapAdi, String kitapFiyati) {
        this.kitapAdi = kitapAdi;
        this.kitapFiyati = kitapFiyati;
    }

    @Override
    public String toString() {
        return "Kitap{" +
                "kitapAdi='" + kitapAdi + '\'' +
                ", kitapFiyati='" + kitapFiyati + '\'' +
                '}';
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public Kitap setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
        return this;
    }

    public String getKitapFiyati() {
        return kitapFiyati;
    }

    public Kitap setKitapFiyati(String kitapFiyati) {
        this.kitapFiyati = kitapFiyati;
        return this;
    }

    public Yazar getYazar() {
        return yazar;
    }

    public Kitap setYazar(Yazar yazar) {
        this.yazar = yazar;
        return this;
    }
}
