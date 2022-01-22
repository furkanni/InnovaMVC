package com.patika.tutorials;

import lombok.*;

@Data // gettersetter+hashcode+toString
@NoArgsConstructor //Parametresiz constructor
@AllArgsConstructor //Parametreli constructor
@Builder
public class LombokTutorials {

    //@Getter @Setter
    private String adi;
   //@Getter @Setter
    private String soyadi;
    //@Getter @Setter
    private String numarasi;

    @Override
    public String toString() {
        return "LombokTutorials{" +
                "adi='" + adi + '\'' +
                ", soyadi='" + soyadi + '\'' +
                ", numarasi='" + numarasi + '\'' +
                '}';
    }

    public static void main(String[] args) {
        LombokTutorials tutorials = LombokTutorials.builder().adi("Furkan").soyadi("Nişancı").numarasi("23556").build();
        System.out.println(tutorials);
    }
}
