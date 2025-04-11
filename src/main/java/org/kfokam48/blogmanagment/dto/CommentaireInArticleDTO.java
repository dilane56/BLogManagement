package org.kfokam48.blogmanagment.dto;

public class CommentaireInArticleDTO {
    private Long id;
    private String contenu;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }
}
