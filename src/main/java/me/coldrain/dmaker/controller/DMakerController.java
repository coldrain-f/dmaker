package me.coldrain.dmaker.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// 사용자 요청을 받고 JSON 데이터를 응답해줄 수 있음.
@RestController
@Slf4j
public class DMakerController {

    @GetMapping("/developers")
    public List<String> getAllDevelopers() {
        // GET /developers HTTP/1.1 을 요청하면 이곳으로 들어옴.
        log.info("GET /developers HTTP/1.1");

        return List.of("snow", "Elsa", "Olaf");
    }
}