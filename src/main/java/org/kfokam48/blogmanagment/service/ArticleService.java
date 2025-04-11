package org.kfokam48.blogmanagment.service;

import org.kfokam48.blogmanagment.dto.ArticleDto;
import org.kfokam48.blogmanagment.dto.ArticleResponseDto;
import org.kfokam48.blogmanagment.model.Article;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ArticleService {
    ArticleResponseDto getArticleById(long id);
    List<ArticleResponseDto> getAllArticles();
    Article createArticle(ArticleDto article);
    ArticleResponseDto updateArticle(Long id ,ArticleDto article);
    ResponseEntity<String> deleteArticle(long id);
}
