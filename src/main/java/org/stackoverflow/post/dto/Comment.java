package org.stackoverflow.post.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.Date;
import java.util.UUID;

@Builder
@Getter
public class Comment {
    UUID commentId;
    UUID userId;
    UUID postId;
    String commentText;
}
