package com.example.springapp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SampleController {

    @PostMapping("/processData")
    public ResponseData processRequest(@RequestBody RequestData requestData) {
        // Извлечение данных из входящего запроса
        float inputSide1 = requestData.getSide1();


        // Создание ответа с данными из входящего запроса
        ResponseData responseData = new ResponseData();

        responseData.setSide(inputSide1*2);

        return responseData;
    }
}
