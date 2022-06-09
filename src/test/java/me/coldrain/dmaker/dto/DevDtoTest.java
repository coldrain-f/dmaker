package me.coldrain.dmaker.dto;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class DevDtoTest {

    @Test
    void test() {
        DevDto devDto = new DevDto();
        devDto.setName("snow");
        devDto.setAge(21);
        devDto.setStartAt(LocalDateTime.now());

        System.out.println(devDto);


    }
}