package com.pecf.controller;

import org.springframework.web.bind.annotation.*;

@RestController("/DailyFood")
public class DailyFoodController {

    @GetMapping("/list")
    public String list() {
        return "index";
    }

    @GetMapping("/{id}")
    public void detail(@PathVariable("id") Long id) {

    }

    @PostMapping("/save")
    public void saveOrEdit() {

    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable("id") Long id) {

    }
}
