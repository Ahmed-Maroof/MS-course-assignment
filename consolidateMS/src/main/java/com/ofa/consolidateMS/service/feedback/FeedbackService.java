package com.ofa.consolidateMS.service.feedback;

import com.ofa.consolidateMS.entity.Customer;
import com.ofa.consolidateMS.entity.Feedback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("input-format")
public interface FeedbackService {
    @RequestMapping(value = "/feedbacks/feedback/{id}", method = RequestMethod.GET, produces = "application/json")
    List<Feedback> getFeedback(@RequestParam("id") int id);

}
