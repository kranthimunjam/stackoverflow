package org.stackoverflow.activity.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.stackoverflow.activity.dto.ActivityRequest;
import org.stackoverflow.activity.dto.ActivityResponse;

@Component
public class ActivityService {

    public ResponseEntity<ActivityResponse> vote(ActivityRequest request){

        return null;
    }
}
