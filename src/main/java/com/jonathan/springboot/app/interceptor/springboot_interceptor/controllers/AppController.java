package com.jonathan.springboot.app.interceptor.springboot_interceptor.controllers;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {

    @GetMapping("/foo")
    public Map<String, String> app() {
        return Collections.singletonMap("message", "handler foo controller");
    }

    @GetMapping("/bar")
    public Map<String, String> bar() {
        return Collections.singletonMap("message", "handler bar controller");
    }

    @GetMapping("/baz")
    public Map<String, String> baz() {
        return Collections.singletonMap("message", "handler baz controller");
    }
}
