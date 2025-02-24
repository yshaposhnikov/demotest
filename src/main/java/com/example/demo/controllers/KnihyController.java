package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.knihaDTO;
import com.example.demo.controllers.KnihyController;

import java.util.List;
import java.util.LinkedList;


@RestController
public class KnihyController {

    @Autowired
    private KnihyService knihyService;

    @GetMapping("/kniha/{id}")
    public KnihaDTO vratKnihu(@PathVariable long id){
        System.out.println("hladam knihu" + id);
        KnihaDTO k = new KnihaDTO("Zeleny strom", "Janko Hrasko", 100);
        return k;
    }

    @GetMapping("/knihy")
    public List<KnihaDTO> vratKnihy() {
        List<KnihaDTO> knihy = new LinkedList<>();
        knihy.add(new KnihaDTO("Zeleny strom", "Janko Hrasko", 100));
        knihy.add(new KnihaDTO("Modry strom", "Jo Hko", 200));
        knihy.add(new KnihaDTO("Cerveny strom", "Jan Hrko", 300));
        return knihy;
    }


    @PostMapping("/kniha")
    public Long vytvorKnihu(@RequestBody KnihaDTO k) {
        return knihyService.vytvorKnihu(k);
    }
}