package com.yl.littlebug.system.controller;

import com.yl.littlebug.system.common.ResultInfo;
import com.yl.littlebug.system.entity.SysUser;
import com.yl.littlebug.system.service.SysUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author by wzc
 * @Description 用户管理
 * @Date 2021/11/30 22:11
 */

@RestController
@RequestMapping("/system/user")
@RequiredArgsConstructor
public class SysUserController {


    private final SysUserService sysUserService;


    @GetMapping("/list")
    public Flux<SysUser> list() {

        return sysUserService.findAll();

    }




}
