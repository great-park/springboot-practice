package com.studyproject.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor //final필드를 포함한 생성자
public class HelloResponseDto {
    private final String name;
    private final int amount;
}
