package org.stackoverflow.activity.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.stackoverflow.activity.dto.ActivityRequest;
import org.stackoverflow.activity.dto.ActivityResponse;
import org.stackoverflow.activity.service.ActivityService;

@Slf4j
@RestController("/activity")
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    @PostMapping("/vote")
    ResponseEntity<ActivityResponse> vote(@RequestBody ActivityRequest request){
        return activityService.vote(request);
    }
}
