package org.stackoverflow.post.dto.request;

import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.UUID;

@Builder
@Getter
public class PostRequest {
    int creatorUserId;
    UUID parentQuestionId;
    int postType;
    String postTitle;
    String postDetails;
    List<String> mediaUrls;
}
