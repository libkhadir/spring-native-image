package com.libkhadir.springnativeimage.runner;

import com.libkhadir.springnativeimage.model.Article;
import com.libkhadir.springnativeimage.repository.ArticleRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class AppRunner implements CommandLineRunner {
    private final ArticleRepository articleRepository;

    @Override
    public void run(String... args) throws Exception {
        var articleA = Article.builder()
                .title("testA")
                .message("test")
                .build();
        var articleB = Article.builder()
                .title("testB")
                .message("test")
                .build();
        articleRepository.saveAll(List.of(articleA, articleB));
    }
}
