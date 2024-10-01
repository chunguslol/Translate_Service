package com.example.TranslateService;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TranslateServiceTest {
    private final TranslateService translateService = new TranslateService();
    @Test
    public void testTranslate() {
        String text = "hello world";
        String expectedTranslation = "HELLO WORLD";
        assertEquals(expectedTranslation, translateService.translate(text));
    }
}
