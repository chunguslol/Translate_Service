package com.example.TranslateService;

import org.springframework.stereotype.Service;

@Service
public class TranslateService {
    // Traducción simulada: convierte el texto a mayúsculas
    public String translate(String text) {
        return text.toUpperCase();
    }
}
