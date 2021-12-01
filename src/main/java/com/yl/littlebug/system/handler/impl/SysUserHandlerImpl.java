package com.yl.littlebug.system.handler.impl;

import com.yl.littlebug.system.dao.SysUserDao;
import com.yl.littlebug.system.entity.SysUser;
import com.yl.littlebug.system.handler.SysUserHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.BodyInserters.fromValue;

/**
 * @author by wzc
 * @Description handler实现层
 * @Date 2021/12/1 10:31
 */

@Component
@RequiredArgsConstructor
public class SysUserHandlerImpl implements SysUserHandler {

    private final SysUserDao sysUserDao;


    @Override
    public Mono<ServerResponse> findAll(ServerRequest serverRequest) {

        Flux<SysUser> all = sysUserDao.findAll();

         return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(all, SysUser.class);

    }

    @Override
    public Mono<ServerResponse> findById(ServerRequest serverRequest) {

        //serverRequest

        long sysUserId = Long.valueOf(serverRequest.pathVariable("id"));

        Mono<SysUser> byId = sysUserDao.findById(sysUserId);

        // build notFound response
        Mono<ServerResponse> notFound = ServerResponse.notFound().build();

        // get user from dao
        Mono<SysUser> sysUserMono = sysUserDao.findById(sysUserId);

        // build response
        return sysUserMono
                .flatMap(user -> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(fromValue(user)))
                .switchIfEmpty(notFound);

    }

    @Override
    public Mono<ServerResponse> save(ServerRequest serverRequest) {

        Mono<SysUser> customer = serverRequest.bodyToMono(SysUser.class);

        Mono<SysUser> sysUserMono = customer.doOnNext(user -> sysUserDao.save(user));

        return ServerResponse.ok().build(sysUserMono.then());
    }


}
