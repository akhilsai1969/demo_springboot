package com.tcl.firstspringbootproj.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.tcl.firstspringbootproj.entity.Article;
import com.tcl.firstspringbootproj.repository.ArticleRepository;

@Configuration
public class ArticleServiceImpl implements ArticleService{

	@Autowired
	private ArticleRepository articleRepository;
	
	@Override
	public Article addArticle(Article article) {
		return articleRepository.save(article);
	}

	@Override
	public List<Article> listAllArticle() {
		return articleRepository.findAll();
	}

	@Override
	public Optional<Article> findByArticleId(Long id) {
		return articleRepository.findById(id);
	}

//	@Override
//	public Article findByArticleTitle(String title) {
//		return articleRepository.findByTitle(title);
//	}

	@Override
	public Article updateArticle(Article article) {
		 return articleRepository.save(article);
	}

	@Override
	public String deleteArticle(Long id) {
		articleRepository.deleteById(id);
		return "Deleted Successfully";
		
	}

}
