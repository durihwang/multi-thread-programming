package com.study.multithreadprogramming.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MultiThreadControllerTest {

    @Test
    void multiThread() {
        Thread runnable = new Thread(() -> System.out.println("runnable"));
        runnable.start();
    }
}