package com.libkhadir.springnativeimage.mapper;

import com.libkhadir.springnativeimage.dto.ArticleDto;
import com.libkhadir.springnativeimage.model.Article;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ArticleMapper {

    ArticleDto toDto(Article a);
}
