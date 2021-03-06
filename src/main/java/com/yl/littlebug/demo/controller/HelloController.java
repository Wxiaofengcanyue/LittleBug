package com.yl.littlebug.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author wangzhichao
 * @Description 测试用途
 * @Date 2021/11/29 23:31
 */

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/test")
    public Mono<String> hello() {
        return Mono.just("hello world wzc!");
    }
}
