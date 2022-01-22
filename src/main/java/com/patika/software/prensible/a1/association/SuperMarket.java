package com.patika.software.prensible.a1.association;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.extern.log4j.Log4j2;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2
public class SuperMarket {

    private String superMarketAdi;
    private String superMarketSehir;
}
