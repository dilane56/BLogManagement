package org.kfokam48.blogmanagment.service;

import org.kfokam48.blogmanagment.dto.CommentaireDto;
import org.kfokam48.blogmanagment.dto.CommentaireResponseDTO;
import org.kfokam48.blogmanagment.model.Commentaire;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CommentaireService {

   CommentaireResponseDTO addCommentaire(Long articleId, CommentaireDto commentaire);
   List<CommentaireResponseDTO> getAllCommentaire();
   CommentaireResponseDTO getCommentaireById(long id);
   ResponseEntity<String> deleteCommentaire(long id);
   CommentaireResponseDTO updateCommentaire(long id, CommentaireDto commentaire);

}
