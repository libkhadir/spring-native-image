package com.libkhadir.springnativeimage.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ArticleDto {
    private Long id;
    private String title;
    private String message;
}
