package com.example.demo.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ViewTest {
    private View view = new View();

    @Test
    void getTest() {
        assertEquals("hello", view.getTest());
    }
}