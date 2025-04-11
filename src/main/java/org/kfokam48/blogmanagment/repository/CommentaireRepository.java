package org.kfokam48.blogmanagment.repository;

import org.kfokam48.blogmanagment.model.Commentaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentaireRepository extends JpaRepository<Commentaire, Long> {
}
