package org.stackoverflow.post.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.stackoverflow.post.entity.Post;

import java.util.List;

// @Repository
public interface PostRepository {
    Post getPostById(String questioId);

    // @Query("Select ")
    List<Post> getAnswers(String questionId);



}
