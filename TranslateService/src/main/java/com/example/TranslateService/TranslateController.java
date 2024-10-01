package com.example.TranslateService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/translate")
public class TranslateController {

    private final TranslateService translateService;
    public TranslateController(TranslateService translateService) {
        this.translateService = translateService;
    }
    @GetMapping("/text")
    public String translateText(@RequestParam String text) {
        return translateService.translate(text);
    }
}