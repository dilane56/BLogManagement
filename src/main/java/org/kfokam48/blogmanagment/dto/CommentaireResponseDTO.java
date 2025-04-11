package org.kfokam48.blogmanagment.dto;

import jakarta.validation.constraints.NotNull;


public class CommentaireResponseDTO {

    private Long idCommentaire;
    @NotNull(message = "Le contenu du commentaire ne doit pas être null")
    private String contenu;
    @NotNull(message = "Le commentaire doit appartenir a un article")
    private ArticleInCommentaireDTo article;

    public Long getIdCommentaire() {
        return idCommentaire;
    }

    public void setIdCommentaire(Long idCommentaire) {
        this.idCommentaire = idCommentaire;
    }

    public @NotNull(message = "Le contenu du commentaire ne doit pas être null") String getContenu() {
        return contenu;
    }

    public void setContenu(@NotNull(message = "Le contenu du commentaire ne doit pas être null") String contenu) {
        this.contenu = contenu;
    }

    public @NotNull(message = "Le commentaire doit appartenir a un article") ArticleInCommentaireDTo getArticle() {
        return article;
    }

    public void setArticle(@NotNull(message = "Le commentaire doit appartenir a un article") ArticleInCommentaireDTo article) {
        this.article = article;
    }
}
