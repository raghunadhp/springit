package com.raghu.springit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raghu.springit.domain.Link;

public interface LinkRepository extends JpaRepository<Link, Long> {

}
