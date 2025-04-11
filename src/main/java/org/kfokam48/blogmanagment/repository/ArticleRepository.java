package org.kfokam48.blogmanagment.repository;

import org.kfokam48.blogmanagment.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
}
