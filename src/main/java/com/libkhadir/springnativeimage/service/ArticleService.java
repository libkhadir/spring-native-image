package com.libkhadir.springnativeimage.service;

import com.libkhadir.springnativeimage.dto.ArticleDto;

import java.util.List;

public interface ArticleService {

    List<ArticleDto> findAll();
}
