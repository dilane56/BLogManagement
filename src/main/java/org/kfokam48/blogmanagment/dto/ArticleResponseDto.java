package org.kfokam48.blogmanagment.dto;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class ArticleResponseDto {
   private Long id;
    private String titre;
    private String contenu;
    private LocalDate creationDate;
    private List<CommentaireInArticleDTO> commentaires;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public LocalDate getCreationDate(LocalDateTime datePublication) {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public List<CommentaireInArticleDTO> getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(List<CommentaireInArticleDTO> commentaires) {
        this.commentaires = commentaires;
    }
}
