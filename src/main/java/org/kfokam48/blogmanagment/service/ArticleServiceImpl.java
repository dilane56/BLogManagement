package org.kfokam48.blogmanagment.service;

import jakarta.transaction.Transactional;
import org.kfokam48.blogmanagment.dto.ArticleDto;
import org.kfokam48.blogmanagment.dto.ArticleResponseDto;
import org.kfokam48.blogmanagment.exception.RessourceNotFoundException;
import org.kfokam48.blogmanagment.mapper.Mapper;
import org.kfokam48.blogmanagment.model.Article;
import org.kfokam48.blogmanagment.repository.ArticleRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
@Transactional
public class ArticleServiceImpl implements ArticleService {

    private final ArticleRepository articleRepository;

    public ArticleServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public ArticleResponseDto getArticleById(long id) {
        Article article = articleRepository.findById(id).orElseThrow(()->new RessourceNotFoundException("L'article avec l'ID:"+id+" n'existe pas"));
        ArticleResponseDto articleResponseDto = new ArticleResponseDto();
        articleResponseDto = Mapper.articleToArticleResponseDto(article);
        return articleResponseDto;
    }

    @Override
    public List<ArticleResponseDto> getAllArticles() {

        return Mapper.articleToArticleResponseDtoList(articleRepository.findAll());
    }

    @Override
    public Article createArticle(ArticleDto articleDto) {
        Article article = new Article();
        article.setTitre(articleDto.getTitre());
        article.setContenu(articleDto.getContenu());
        article.setDatePublication(LocalDate.now());
        return articleRepository.save(article);
    }

    @Override
    public ArticleResponseDto updateArticle(Long id , ArticleDto articleDto) {
        Article article =articleRepository.findById(id).orElseThrow(()->new RessourceNotFoundException("L'article avec l'ID: "+id+" n'existe pas"));
        article.setTitre(articleDto.getTitre());
        article.setContenu(articleDto.getContenu());
        articleRepository.save(article);
      ArticleResponseDto articleResponseDto = new ArticleResponseDto();
      articleResponseDto = Mapper.articleToArticleResponseDto(article);
      return articleResponseDto;

    }

    @Override
    public ResponseEntity<String> deleteArticle(long id) {
        Article article = articleRepository.findById(id).orElseThrow(()->new RessourceNotFoundException("L'article avec l'ID: "+id+" n'existe pas"));
        articleRepository.deleteById(id);
        return ResponseEntity.ok("Article supprimer avec succès");
    }
}
