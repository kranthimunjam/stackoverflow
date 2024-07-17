package org.stackoverflow.comment.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class CommentResponseDTO {
    UUID commentId;
    String commentText;
    UUID userId;
    UUID postId;
}
