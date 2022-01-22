package com.patika.software.prensible.a2.aggregation;

import lombok.*;
import lombok.extern.log4j.Log4j2;

//araba motora bağlıdır
//araba bağımlı

@Log4j2
public class Araba {

    @Getter @Setter
    private Motor motor;

    public double getToplamFiyat(){
        motor = new Motor();
        double toplam = motor.getMotorFiyati()+2000;
        return toplam;
    }

}
