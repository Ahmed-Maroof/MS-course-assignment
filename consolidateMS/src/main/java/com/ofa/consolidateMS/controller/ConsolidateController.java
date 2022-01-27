package com.ofa.consolidateMS.controller;

import com.ofa.consolidateMS.entity.DashbordEntryDTO;
import com.ofa.consolidateMS.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consolidations")
public class ConsolidateController {

    @Autowired
    DashboardService dashboardService;

    @GetMapping("/")
    public String health() {
        return "consolidation is Ok";
    }

    @GetMapping("/consolidation/{id}")
    public DashbordEntryDTO getDashboardEntryByCustomerId (@PathVariable("id") int id) {
        return dashboardService.getCustomerDashboardEntry(id);
    }
}
