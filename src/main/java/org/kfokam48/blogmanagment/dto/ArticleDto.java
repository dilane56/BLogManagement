package org.kfokam48.blogmanagment.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class ArticleDto {

    @NotNull(message = "Le titre de l'article ne doit pas être null")
    @NotEmpty(message = "Le titre de l'article ne doit pas être vide")
    private String titre;

    @NotNull(message = "Le contenu de l'article ne doit pas être null")
    @NotEmpty(message = "Le contenu de l'article ne doit pas être vide")
    private String contenu;

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
}
