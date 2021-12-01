package com.yl.littlebug.system.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by wzc
 * @Description 登录
 * @Date 2021/12/1 16:38
 */

@RestController
@RequestMapping("/system")
public class SysLoginController {



    @PostMapping("/login")
    public ResponseEntity login() {

        return ResponseEntity.ok("success");

    }
}
