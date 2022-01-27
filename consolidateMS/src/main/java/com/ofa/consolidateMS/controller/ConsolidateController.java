package com.ofa.consolidateMS.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consolidations")
public class ConsolidateController {

    @GetMapping("/")
    public String health() {
        return "consolidation is Ok";
    }
}
