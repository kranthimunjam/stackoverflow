package org.stackoverflow.post.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.stackoverflow.post.dto.Comment;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

public class Post {
    UUID id;
    UUID creatorUserId;
    String parentQuestionId;

    Timestamp createdTime;
    String postType;
    String postTitle;
    String postDetails;
    List<String> mediaUrls;
    List<Comment> comments;
}
