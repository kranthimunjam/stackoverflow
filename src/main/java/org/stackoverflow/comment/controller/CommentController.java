package org.stackoverflow.comment.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.stackoverflow.comment.dto.CommentRequestDTO;
import org.stackoverflow.comment.dto.CommentResponseDTO;
import org.stackoverflow.comment.service.CommentService;

@Slf4j
@RestController("/comment")
public class CommentController {
    private final CommentService commentService;

    @Autowired
    CommentController(CommentService commentService){
        this.commentService = commentService;
    }

    @PostMapping
    ResponseEntity<CommentResponseDTO> postComment(@RequestBody CommentRequestDTO request){
        return commentService.postComment(request);
    }
}
