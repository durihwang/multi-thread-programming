package com.study.multithreadprogramming.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultiThreadController {

    private int count = 0;
    @RequestMapping("/multi")
    public int multiThread() {
        count++;
        return count;
    }

}
