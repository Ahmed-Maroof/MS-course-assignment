package com.ofa.consolidateMS.service.feedback;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "feedback-service",fallback = FeedbackFallback.class)
public interface FeedbackServiceFeignClient extends FeedbackService {

}
