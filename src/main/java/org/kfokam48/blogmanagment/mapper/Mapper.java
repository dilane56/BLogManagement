package org.kfokam48.blogmanagment.mapper;

import org.kfokam48.blogmanagment.dto.*;
import org.kfokam48.blogmanagment.model.Article;
import org.kfokam48.blogmanagment.model.Commentaire;

import java.util.ArrayList;
import java.util.List;

public  class Mapper {

    public static CommentaireResponseDTO commentaireToCommentaireResponseDTO(Commentaire commentaire) {
        CommentaireResponseDTO commentaireResponseDTO = new CommentaireResponseDTO();
        commentaireResponseDTO.setIdCommentaire(commentaire.getId());
        commentaireResponseDTO.setContenu(commentaire.getContenu());
        commentaireResponseDTO.setArticle(Mapper.articletoArticleInCommentaireDTo(commentaire.getArticle()));
        return commentaireResponseDTO;
    }

    public static ArticleDto articleToArticleDto(Article article) {
        ArticleDto articleDto = new ArticleDto();
        articleDto.setTitre(article.getTitre());
        articleDto.setContenu(article.getContenu());
        return articleDto;
    }
    public static ArticleInCommentaireDTo articletoArticleInCommentaireDTo(Article article) {
        ArticleInCommentaireDTo articleInCommentaireDTo = new ArticleInCommentaireDTo();
        articleInCommentaireDTo.setId(article.getId());
        articleInCommentaireDTo.setTitle(article.getTitre());
        return articleInCommentaireDTo;
    }

    public static ArticleResponseDto articleToArticleResponseDto(Article article) {
        ArticleResponseDto articleResponseDto = new ArticleResponseDto();
        articleResponseDto.setId(article.getId());
        articleResponseDto.setTitre(article.getTitre());
        articleResponseDto.setContenu(article.getContenu());
        articleResponseDto.setCreationDate(article.getDatePublication());
        articleResponseDto.setCommentaires(commentaireToCommentaireDtoList(article.getCommentaires()));
        return articleResponseDto;
    }
    public static CommentaireInArticleDTO commentaireToCommentaireInArticle(Commentaire commentaire) {
      CommentaireInArticleDTO commentaireInArticleDTO = new CommentaireInArticleDTO();
      commentaireInArticleDTO.setId(commentaire.getId());
      commentaireInArticleDTO.setContenu(commentaire.getContenu());
      return commentaireInArticleDTO;
    }

    public static List<CommentaireInArticleDTO> commentaireToCommentaireDtoList(List<Commentaire> commentaireList) {
        List<CommentaireInArticleDTO> commentaireDtoList = new ArrayList<CommentaireInArticleDTO>();
        for (Commentaire commentaire : commentaireList) {
            commentaireDtoList.add(commentaireToCommentaireInArticle(commentaire));
        }
        return commentaireDtoList;
    }
    public static List<ArticleResponseDto> articleToArticleResponseDtoList(List<Article> articleList) {
        List<ArticleResponseDto> articleResponseDtoList = new ArrayList<>();
        for (Article article : articleList) {
            articleResponseDtoList.add(articleToArticleResponseDto(article));
        }
        return articleResponseDtoList;
    }

}
