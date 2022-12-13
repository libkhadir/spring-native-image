package com.libkhadir.springnativeimage.repository;

import com.libkhadir.springnativeimage.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
