package com.literalura.liter_alura.gutendex.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true) 
public record AuthorRecord(
    String name,
    Integer birth_year,
    Integer death_year
) {}