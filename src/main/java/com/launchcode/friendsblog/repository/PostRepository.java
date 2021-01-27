package com.launchcode.friendsblog.repository;

import com.launchcode.friendsblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
