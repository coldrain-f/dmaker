package me.coldrain.dmaker.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Setter
@Getter
@ToString
@Slf4j
public class DevDto {
    private String name;
    private Integer age;
    private LocalDateTime startAt; // 개발 시작 시점

}
