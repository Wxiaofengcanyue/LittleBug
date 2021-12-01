package com.yl.littlebug.system.controller;

import com.yl.littlebug.system.entity.SysUser;
import com.yl.littlebug.system.service.SysUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * @author by wzc
 * @Description controller层
 * @Date 2021/12/1 14:47
 */

@RestController
@RequestMapping("/system/user")
@RequiredArgsConstructor
public class SysUserController {

    private final SysUserService userService;


    @GetMapping("/findAll")
    public ResponseEntity findAll() {
        Flux<SysUser> userFlux = userService.findAll();
        return ResponseEntity.ok().body(userFlux);
    }

    @GetMapping("/findUserById/{id}")
    public ResponseEntity findUserById(@PathVariable long id) {

        Mono<SysUser> userMono = userService.findById(id);

        return ResponseEntity.ok().body(userMono);
    }

    @PostMapping("/saveUser")
    public ResponseEntity saveUser(@Valid @NotNull SysUser sysUser) {

        Mono<Void> voidMono = userService.save(sysUser);

        return ResponseEntity.ok(voidMono);

    }

    @DeleteMapping("/deleteUserById/{id}")
    public ResponseEntity deleteUserById(@PathVariable long id) {

        Mono<Void> voidMono = userService.deleteUserById(id);

        return ResponseEntity.ok(voidMono);

    }
}
