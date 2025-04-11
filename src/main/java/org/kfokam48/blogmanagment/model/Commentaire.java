package org.kfokam48.blogmanagment.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "commentaires")
@NoArgsConstructor
@AllArgsConstructor
public class Commentaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String contenu;

    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;

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

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    @Override
    public String toString() {
        return "Commentaire{" +
                "id=" + id +
                ", contenu='" + contenu + '\'' +

                '}';
    }
}
