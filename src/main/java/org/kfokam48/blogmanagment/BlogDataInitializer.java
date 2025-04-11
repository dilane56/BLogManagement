package org.kfokam48.blogmanagment;
import org.kfokam48.blogmanagment.model.Article;
import org.kfokam48.blogmanagment.model.Commentaire;
import org.kfokam48.blogmanagment.repository.ArticleRepository;
import org.kfokam48.blogmanagment.repository.CommentaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;

@Component
public class BlogDataInitializer implements CommandLineRunner {

    @Autowired
    private ArticleRepository articleRepository;

    @Autowired
    private CommentaireRepository commentaireRepository;

    @Override
    public void run(String... args) {
        // Créer des articles par défaut
        Article article1 = new Article();
        article1.setTitre("Introduction à Spring Boot");
        article1.setContenu("Spring Boot facilite la création d'applications Java.");
        article1.setDatePublication(LocalDate.now());

        Article article2 = new Article();
        article2.setTitre("Guide de démarrage rapide avec Java");
        article2.setContenu("Ce guide vous aidera à démarrer avec Java.");
        article2.setDatePublication(LocalDate.now());

        // Sauvegarder les articles
        articleRepository.saveAll(Arrays.asList(article1, article2));

        // Créer des commentaires par défaut
        Commentaire commentaire1 = new Commentaire();
        commentaire1.setContenu("Excellent article !");
        commentaire1.setArticle(article1);

        Commentaire commentaire2 = new Commentaire();
        commentaire2.setContenu("Merci pour ces informations.");
        commentaire2.setArticle(article1);

        Commentaire commentaire3 = new Commentaire();
        commentaire3.setContenu("Très utile, merci !");
        commentaire3.setArticle(article2);

        // Sauvegarder les commentaires
        commentaireRepository.saveAll(Arrays.asList(commentaire1, commentaire2, commentaire3));
    }
}

