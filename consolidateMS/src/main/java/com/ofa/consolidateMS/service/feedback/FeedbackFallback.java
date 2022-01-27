package com.ofa.consolidateMS.service.feedback;

import com.ofa.consolidateMS.entity.Feedback;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FeedbackFallback implements FeedbackServiceFeignClient {

    @Override
    public List<Feedback> getFeedback(int id) {
        return new ArrayList<>();
    }

}
