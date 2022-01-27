package com.ofa.feedbackMS.repository;

import com.ofa.feedbackMS.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {

    public List<Feedback> findALLByCustomerId(int customerId);

}
