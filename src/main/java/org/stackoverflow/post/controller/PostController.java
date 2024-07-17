package org.stackoverflow.post.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;
import org.stackoverflow.post.dto.request.PostRequest;
import org.stackoverflow.post.dto.response.PostResponse;
import org.stackoverflow.post.service.question.PostService;

import java.util.Objects;
import java.util.UUID;

@Slf4j
@RestController("/post")
public class PostController {
    private final PostService postService;

    @Autowired
    public PostController(PostService postService){
        this.postService = postService;
    }

    @GetMapping
    public ResponseEntity<PostResponse> getQuestion(@RequestParam(value = "id") @NonNull String id){
        if(!isValidId(id)) {
            return ResponseEntity.badRequest().build();
        }
        return buildResponse(postService.getPost(id));
    }

    @PostMapping
    public ResponseEntity<PostResponse> postQuestion(@RequestBody PostRequest request){
        return ResponseEntity.ok(postService.publishPost(request));
    }

    private boolean isValidId(String id){
        try{
            return UUID.fromString(id).toString().equals(id);
        } catch (IllegalArgumentException illegalArgumentException) {
            log.error("Illegal question id:" + id + " trace: ", illegalArgumentException);
            return false;
        }
    }

    ResponseEntity<PostResponse> buildResponse(PostResponse postResponse){
        if(Objects.isNull(postResponse)) return ResponseEntity.notFound().build();
        else return ResponseEntity.ok(postResponse);
    }

}
