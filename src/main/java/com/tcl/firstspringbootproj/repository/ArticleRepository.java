package com.tcl.firstspringbootproj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcl.firstspringbootproj.entity.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {

	//public Article findByTitle(String title);
}

