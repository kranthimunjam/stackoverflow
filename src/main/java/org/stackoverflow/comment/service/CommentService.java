package org.stackoverflow.comment.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.stackoverflow.comment.dto.CommentRequestDTO;
import org.stackoverflow.comment.dto.CommentResponseDTO;

@Slf4j
@Component
public class CommentService {
    public CommentService(){

    }

    public ResponseEntity<CommentResponseDTO> postComment(CommentRequestDTO commentRequest){
        return null;
    }
}
