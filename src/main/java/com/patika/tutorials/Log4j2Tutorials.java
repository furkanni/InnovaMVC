package com.patika.tutorials;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data // gettersetter+hashcode+toString
//@NoArgsConstructor //Parametresiz constructor
@AllArgsConstructor //Parametreli constructor
@Builder
@Log4j2
public class Log4j2Tutorials {

    private String adi;
    private String soyadi;
    private String numarasi;

    public Log4j2Tutorials(){
        this.adi = "Adınızı Girmediniz";
        this.soyadi = "Soyadınızı Girmediniz";
        this.numarasi = "Numaranızı Girmediniz";

    }

    public static void main(String[] args) {
        Log4j2Tutorials tutorials = new Log4j2Tutorials();
        System.out.println(tutorials);
        if(tutorials.getAdi().equals("Adınızı Girmediniz")){
            log.error("Hata adınızı girmediniz!!!");
        }else{
            log.info("Bilgiler Girildi");
        }
    }
}
