package org.stackoverflow.comment.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Data;

import java.util.UUID;

@Data
public class CommentRequestDTO {
    String commentText;
    UUID userId;
    UUID postId;
}
