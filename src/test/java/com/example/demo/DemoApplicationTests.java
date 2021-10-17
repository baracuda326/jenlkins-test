package com.example.demo;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest(classes = {com.example.demo.DemoApplication.class})
class DemoApplicationTests {

    @Test
    public void loadTest() {
        assertEquals(1, 1);
    }
}
