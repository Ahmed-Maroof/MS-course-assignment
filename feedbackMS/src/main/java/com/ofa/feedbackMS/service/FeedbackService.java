package com.ofa.feedbackMS.service;

import com.ofa.feedbackMS.model.Feedback;
import com.ofa.feedbackMS.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackService {

    @Autowired
    FeedbackRepository feedbackRepository;

    public Feedback saveOrUpdate(Feedback feedback) {
        return feedbackRepository.save(feedback);
    }

    public List<Feedback> getAllOrdersByCustomerId(int customerId) {
        return feedbackRepository.findALLByCustomerId(customerId);
    }
}
