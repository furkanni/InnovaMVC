package com.patika.software;

import lombok.extern.log4j.Log4j2;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

@Log4j2

//Keep It Simple Stupid : Olabildiğince her şeyi en basit yöntemle çöz.
public class Kiss {
    private static String path = "C:\\Users\\MSI\\Desktop\\INNOVA BOOTCAMP\\Patika.txt";

    //File Writer ?? mutlaka bil diyo
    public void utilWriter() {

        //try with resources
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {
            String value = JOptionPane.showInputDialog("Lütfen bir şeyler giriniz.");
            bufferedWriter.write(value);
            bufferedWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    //File Reader ?? Mutlaka bil diyo

    public void utilReader() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String numborRow = "", sumRow = "";
            while ((numborRow = bufferedReader.readLine()) != null) {
                sumRow += numborRow;
            }
            log.info(sumRow);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        Kiss kiss = new Kiss();
        kiss.utilWriter();
    }


}
