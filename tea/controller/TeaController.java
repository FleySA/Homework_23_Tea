package com.telran.org.tea.controller;

import com.telran.org.tea.model.Tea;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tea")
class TeaController {

    private List<Tea> teaList = new ArrayList<>();

    public TeaController() {
        init();
    }

    @GetMapping
    public Iterable<Tea> getTeas() {
        return teaList;
    }

    @GetMapping("/{id}")
    public Tea getTeaById(@PathVariable String id) {
        for (Tea tea : teaList) {
            if (tea.getId().equals(id)) {
                return tea;
            }
        }
        return null;
    }

    private void init() {
        List<Tea> teas = List.of(
                new Tea("Earl Grey"),
                new Tea("Green Tea"),
                new Tea("Chamomile"));

        teaList.addAll(teas);
    }
}