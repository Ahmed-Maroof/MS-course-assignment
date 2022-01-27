package com.ofa.feedbackMS.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feedbacks")
public class FeedBackController {

    @GetMapping("/")
    public String health() {
        return "FeedBack is Ok";
    }
}
