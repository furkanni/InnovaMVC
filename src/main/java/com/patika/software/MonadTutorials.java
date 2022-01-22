package com.patika.software;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class MonadTutorials {
    // Data olsun bu datayı büyük harfler ile olsun

    public static String getValue(String data){
        return data;
    }
    public static String getResult(String data){
        return data;
    }
//monad: bir metodun çıktısı diğer motodun girdisine denir.
    public static void main(String[] args) {
        String monad = getResult(getValue("Malatya"));
        log.info(monad);
    }
}
