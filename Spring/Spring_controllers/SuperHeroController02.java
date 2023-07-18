package com.codecademy.ccapplication;

import java.util.List;
import java.lang.Iterable;
import java.util.Date;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SuperHeroController02 {

    private final SuperHeroRepository superHeroRepository;
    private final SuperReportRepository superReportRepository;

    public SuperHeroController02(SuperHeroRepository superHeroRepository,
                                 SuperReportRepository superReportRepository) {

        this.superHeroRepository = superHeroRepository;
        this.superReportRepository = superReportRepository;
    }

    @RequestMapping("/superHeroes")
    public Iterable<SuperHero> getSuperHeros() {

        Iterable<SuperHero> superHeroes = superHeroRepository.findAll();

        return superHeroes;

    }
}