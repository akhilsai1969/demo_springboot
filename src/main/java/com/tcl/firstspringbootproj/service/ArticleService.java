package com.tcl.firstspringbootproj.service;

import java.util.List;
import java.util.Optional;

import com.tcl.firstspringbootproj.entity.Article;


public interface ArticleService {
	public Article addArticle(Article article);
	public List<Article> listAllArticle();
	public Optional<Article> findByArticleId(Long id);
	//public Article findByArticleTitle(String title);
	public Article updateArticle(Article article);
	public String deleteArticle(Long id);
}
