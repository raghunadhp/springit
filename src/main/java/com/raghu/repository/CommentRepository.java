package com.raghu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raghu.springit.domain.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
