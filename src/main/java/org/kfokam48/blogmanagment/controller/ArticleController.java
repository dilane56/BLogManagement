package org.kfokam48.blogmanagment.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.kfokam48.blogmanagment.dto.ArticleDto;
import org.kfokam48.blogmanagment.dto.ArticleResponseDto;
import org.kfokam48.blogmanagment.model.Article;
import org.kfokam48.blogmanagment.service.ArticleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/articles")
@Tag(name = "Article-Controller", description = "Endpoints permettant d'effectuer différentes operations sur les articles a savoir Ajouter, lister , modifier, supprimer")
public class ArticleController {

    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @PostMapping
    @Operation(summary = "Ajouter un article")
    public Article createArticle(@Valid @RequestBody ArticleDto article) {
        return articleService.createArticle(article);
    }

    @GetMapping
    @Operation(summary = "Récupérer  la liste des articles")
    public List<ArticleResponseDto> getAllArticles() {
        return articleService.getAllArticles();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Récupérer un Article a laide de son ID")
    public ArticleResponseDto getArticleById(@PathVariable Long id) {
      return articleService.getArticleById(id);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Modifier  un article")
    public ArticleResponseDto updateArticle(@Valid @PathVariable Long id, @RequestBody ArticleDto articleDetails) {
      return articleService.updateArticle(id, articleDetails);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Supprimer un article")
    public ResponseEntity<String> deleteArticle(@PathVariable Long id) {

        return articleService.deleteArticle(id);
    }
}
