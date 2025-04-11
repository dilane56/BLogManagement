package org.kfokam48.blogmanagment.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class CommentaireDto {
    @NotNull(message = "Le contenu du commentaire ne doit pas être null")
    private String contenu;

    public @NotNull(message = "Le contenu du commentaire ne doit pas être null") String getContenu() {
        return contenu;
    }

    public void setContenu(@NotNull(message = "Le contenu du commentaire ne doit pas être null") String contenu) {
        this.contenu = contenu;
    }
}
