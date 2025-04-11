package org.kfokam48.blogmanagment.service;


import org.kfokam48.blogmanagment.dto.CommentaireDto;
import org.kfokam48.blogmanagment.dto.CommentaireResponseDTO;
import org.kfokam48.blogmanagment.exception.RessourceNotFoundException;
import org.kfokam48.blogmanagment.mapper.Mapper;
import org.kfokam48.blogmanagment.model.Article;
import org.kfokam48.blogmanagment.model.Commentaire;
import org.kfokam48.blogmanagment.repository.ArticleRepository;
import org.kfokam48.blogmanagment.repository.CommentaireRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CommentaireServiceImpl implements CommentaireService {
    private final CommentaireRepository commentaireRepository;
    private final ArticleRepository articleRepository;

    public CommentaireServiceImpl(CommentaireRepository commentaireRepository, ArticleRepository articleRepository) {
        this.commentaireRepository = commentaireRepository;
        this.articleRepository = articleRepository;
    }

    @Override
    public CommentaireResponseDTO addCommentaire( Long articleId, CommentaireDto commentaireDto) {
        Article article = articleRepository.findById(articleId).orElseThrow(()-> new RessourceNotFoundException("L' Article avec l'ID:"+articleId+" n'existe pas"));;
      Commentaire commentaire = new Commentaire();
      commentaire.setContenu(commentaireDto.getContenu());
      commentaire.setArticle(article);
      commentaireRepository.save(commentaire);
      CommentaireResponseDTO commentaireResponseDTO = new CommentaireResponseDTO();
      commentaireResponseDTO = Mapper.commentaireToCommentaireResponseDTO(commentaire);
        return commentaireResponseDTO ;
    }


    @Override
    public List<CommentaireResponseDTO> getAllCommentaire() {
        List<Commentaire> commentaireList = commentaireRepository.findAll();
        List<CommentaireResponseDTO> commentaireResponseDTOList = new ArrayList<CommentaireResponseDTO>();
        for (Commentaire commentaire : commentaireList) {
            CommentaireResponseDTO commentaireResponseDTO = Mapper.commentaireToCommentaireResponseDTO(commentaire);
            commentaireResponseDTOList.add(commentaireResponseDTO);
        }
       return commentaireResponseDTOList;
    }

    @Override
    public CommentaireResponseDTO getCommentaireById(long id) {

       return Mapper.commentaireToCommentaireResponseDTO(commentaireRepository.findById(id).orElseThrow(()-> new RessourceNotFoundException("Le commentaire avec l'ID:"+id+" n'existe pas")));
    }

    @Override
    public ResponseEntity<String> deleteCommentaire(long id) {
        Commentaire commentaire = commentaireRepository.findById(id).orElseThrow(()-> new RessourceNotFoundException("Le commentaire avec l'ID:"+id+" n'existe pas"));
        commentaireRepository.deleteById(id);
        return ResponseEntity.ok("Commentaire supprimer avec succès");
    }

    @Override
    public CommentaireResponseDTO updateCommentaire(long id, CommentaireDto commentaire) {
        Commentaire commentaire1 = commentaireRepository.findById(id).orElseThrow(()-> new RessourceNotFoundException("Le commentaire avec l'ID:"+id+" n'existe pas"));
        commentaire1.setContenu(commentaire.getContenu());
        commentaireRepository.save(commentaire1);
        CommentaireResponseDTO commentaireResponseDTO = new CommentaireResponseDTO();
        commentaireResponseDTO = Mapper.commentaireToCommentaireResponseDTO(commentaire1);
        return commentaireResponseDTO;
    }


}
