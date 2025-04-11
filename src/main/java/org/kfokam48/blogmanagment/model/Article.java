package org.kfokam48.blogmanagment.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "articles")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titre;
    private String contenu;
    private LocalDate datePublication;

    @OneToMany(mappedBy = "article", cascade = CascadeType.ALL, orphanRemoval = true)
   // @JsonIgnore // Ignore la sérialisation de l'article dans les commentaires
    private List<Commentaire> commentaires;
    // Setter pour la date de publication


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

    public LocalDate getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(LocalDate datePublication) {
        this.datePublication = datePublication;
    }

    public List<Commentaire> getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(List<Commentaire> commentaires) {
        this.commentaires = commentaires;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", contenu='" + contenu + '\'' +
                ", datePublication=" + datePublication +

                '}';
    }
}