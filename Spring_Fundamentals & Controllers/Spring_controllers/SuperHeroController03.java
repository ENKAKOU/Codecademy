package com.codecademy.ccapplication;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;
import java.lang.Iterable;
import java.util.Date;

@RestController
@RequestMapping("/superHeroes")
public class SuperHeroController03 {

    private final SuperHeroRepository superHeroRepository;
    private final SuperReportRepository superReportRepository;

    public SuperHeroController03(SuperHeroRepository superHeroRepository,
                                 SuperReportRepository superReportRepository) {

        this.superHeroRepository = superHeroRepository;
        this.superReportRepository = superReportRepository;
    }

    @RequestMapping()
    public Iterable<SuperHero> getSuperHeros() {
        Iterable<SuperHero> superHeroes = superHeroRepository.findAll();
        return superHeroes;

    }
}