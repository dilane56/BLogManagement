package org.kfokam48.blogmanagment.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.kfokam48.blogmanagment.dto.CommentaireDto;
import org.kfokam48.blogmanagment.dto.CommentaireResponseDTO;
import org.kfokam48.blogmanagment.model.Commentaire;
import org.kfokam48.blogmanagment.service.CommentaireService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/articles/commentaires")
@Tag(name = "Commentaire-Controller", description = "Endpoints perméttant d'effectuer différentes opérations sur les commentaires a savoir Ajouter, lister, modifier, supprimer ")
public class CommentaireController {

    private final CommentaireService commentaireService;

    public CommentaireController(CommentaireService commentaireService) {
        this.commentaireService = commentaireService;
    }

    @PostMapping
    @Operation(summary = "Ajouter un Commentaire a un article")
    public CommentaireResponseDTO addCommentaire(@RequestParam Long articleId, @RequestBody CommentaireDto commentaire) {
        return commentaireService.addCommentaire(articleId, commentaire);
    }

    @GetMapping
    @Operation(summary = "Récupérer la liste de tous les commentaire Presents dans la BD")
    public List<CommentaireResponseDTO> getAllCommentaires() {
        return commentaireService.getAllCommentaire();
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Supprimer un Commentaire  a l'aide de son ID")
    public ResponseEntity<String> deleteCommentaire(@PathVariable Long id) {
        commentaireService.deleteCommentaire(id);
        return ResponseEntity.ok("Commentaire supprimer avec succès");
    }

    @GetMapping("/{id}")
    @Operation(summary = "Recuperer un Commentaire a l'aide de son id")
    public CommentaireResponseDTO getCommentaireById(@PathVariable Long id) {
        return commentaireService.getCommentaireById(id);
    }

    @PutMapping("/update/{id}")
    @Operation(summary = "Mettre a jour un commentaire a l'aide de son ID")
    public CommentaireResponseDTO updateCommentaire(@PathVariable Long id, @RequestBody CommentaireDto commentaire) {
       return commentaireService.updateCommentaire(id, commentaire);
    }
}
