package com.patika.web;
//DTO- Data Transfer Object
//DAO- Data Access Object

import com.patika.model.Student;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Log4j2
public class _01_ResponseBody {

    //1
    //http://localhost:3333/birinci
    @GetMapping("/birinci")
    @ResponseBody //sayfaya gitmeden ekranda yazdırmak
    public String birinciMethod() {
        return "Yükleniyor...";
    }

    //2
    //http://localhost:3333/ikinci
    @GetMapping("/ikinci")
    public String ikinciMethod() {

        return "index";
    }

    //3
    //http://localhost:3333/ucuncu
    @GetMapping("/ucuncu")
    public String ucuncuMethod() {
        return "other/deneme";
    }

    //4
    //http://localhost:3333/dorduncu
    @GetMapping("/dorduncu")
    public String dorduncuMethod(Model model) {
        model.addAttribute("param_key", "Merhbalar Spring Model ile geldi data");
        return "param";
    }

    //5
    //http://localhost:3333/besinci/44
    @GetMapping("/besinci/{param1}")
    public String besinciMethod(Model model, @PathVariable(name = "param1") int sayi) {
        model.addAttribute("param_key", "merhabalar" + sayi);
        return "pathvariable";

    }

    //6
    //http://localhost:3333/altinci/44
    @GetMapping({"/altinci/{param1}", "/altinci"})
    public String altinciMethod(Model model, @PathVariable(name = "param1", required = false) Integer sayi) {
        model.addAttribute("param_key", "Data" + sayi);
        return "pathvariable";
    }

    //7
    //http://localhost:3333/yedinci/44
    //http://localhost:3333/yedinci/
    @GetMapping({"/yedinci/{param1}", "/yedinci"})
    public String yedinciMethod(Model model, @PathVariable(name = "param1", required = false) Integer sayi) {
        if (sayi != null) {
            model.addAttribute("param_key", "Data" + sayi);
        } else {
            model.addAttribute("param_key", "Data");
        }
        return "pathvariable";
    }
    ///////////////////////////////////RequestParam///////////////////////

    //http://localhost:3333/sekizinci?query=44
    @GetMapping("/sekizinci")
    public String sekizinciMethod(Model model, @RequestParam(name = "query") Integer sayi) {
        model.addAttribute("param_key", "Data ID: " + sayi);
        return "pathvariable";
    }

    @GetMapping("/dokuzuncu")
    public String dokuzuncuMethod(Model model, @RequestParam(name = "query", required = false, defaultValue = "0") Long sayi) {
        model.addAttribute("param_key", "Data ID: " + sayi);
        return "pathvariable";
    }

    //http://localhost:3333/onuncu
    @GetMapping("/onuncu")
    public String onuncuMethod(
            Model model,
            @RequestParam(name = "adi", required = false, defaultValue = "adınızı giriniz") String adi,
            @RequestParam(name = "soyadi", required = false, defaultValue = "soyadınızı giriniz") String soyadi
    ) {
        model.addAttribute("param_key", "Data ID: " + adi + " " + soyadi);
        return "pathvariable";
    }

    //http://localhost:3333/onbirinci
    @GetMapping("/onbirinci")
    public String onbirinciMethod(Model model) {
        Student student = Student.builder().studentName("Furkan").studentSurname("Nisanci").build();
        model.addAttribute("param_key", "Data ID: " + student);
        return "pathvariable";
    }

    ///////////////////////////   FORM   //////////////////////////////
    //http://localhost:3333/onikinci
    @GetMapping("/onikinci")
    public String onikinciMethod(Model model) {
        Student student = Student.builder().studentName("Adınızı girmediniz...").studentSurname("Soyadınızı girmediniz...").build();
        model.addAttribute("form_key", "Data ID: " + student);
        return "form";
    }
}
