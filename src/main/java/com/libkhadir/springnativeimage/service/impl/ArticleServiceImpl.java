package com.libkhadir.springnativeimage.service.impl;

import com.libkhadir.springnativeimage.dto.ArticleDto;
import com.libkhadir.springnativeimage.mapper.ArticleMapper;
import com.libkhadir.springnativeimage.repository.ArticleRepository;
import com.libkhadir.springnativeimage.service.ArticleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ArticleServiceImpl implements ArticleService {
    private final ArticleRepository articleRepository;
    private final ArticleMapper articleMapper;

    @Override
    public List<ArticleDto> findAll() {
        return articleRepository.findAll()
                .stream()
                .map(articleMapper::toDto)
                .toList();
    }
}
