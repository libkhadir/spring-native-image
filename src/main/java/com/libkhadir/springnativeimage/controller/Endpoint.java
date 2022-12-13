package com.libkhadir.springnativeimage.controller;

import com.libkhadir.springnativeimage.dto.ArticleDto;
import com.libkhadir.springnativeimage.service.ArticleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class Endpoint {
    private ArticleService articleService;

    @GetMapping("/articles")
    public List<ArticleDto> getArticles() {
        return articleService.findAll();
    }
}
