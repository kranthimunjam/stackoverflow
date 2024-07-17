package org.stackoverflow.post.dto.response;

import lombok.Builder;
import lombok.Getter;
import org.stackoverflow.post.entity.Post;

import java.util.List;

@Builder
@Getter
public class PostResponse {
    Post question;
    List<Post> answers;
}
