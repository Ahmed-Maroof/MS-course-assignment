package com.ofa.feedbackMS.controller;

import com.ofa.feedbackMS.model.Feedback;
import com.ofa.feedbackMS.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feedbacks")
public class FeedBackController {

    @Autowired
    FeedbackService feedbackService;

    @GetMapping("/")
    public String health() {
        return "FeedBack is Ok";
    }

    @GetMapping("/feedback/{id}")
    public ResponseEntity<List<Feedback>> getFeedBacks(@PathVariable("id") String customerId) {
        return new ResponseEntity<List<Feedback>>(feedbackService.getAllOrdersByCustomerId(Integer.valueOf(customerId).intValue()), HttpStatus.OK);
    }


    @PostMapping("/feedback")
    private Feedback saveFeedback(@RequestBody Feedback feedback) {
        return feedbackService.saveOrUpdate(feedback);
    }
}
