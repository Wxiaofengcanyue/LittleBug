package com.yl.littlebug.system.handler;

import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * @author by wzc
 * @Description handler 接口层
 * @Date 2021/12/1 10:30
 */
public interface SysUserHandler {

    /**
     * 获取所有用户信息
     * @param serverRequest
     * @return
     */
    Mono<ServerResponse> findAll(ServerRequest serverRequest);

    /**
     * 根据id 获取用户信息
     * @param serverRequest
     * @return
     */
    Mono<ServerResponse> findById(ServerRequest serverRequest);

    /**
     * 保存用户
     * @param serverRequest
     * @return
     */
    Mono<ServerResponse> save(ServerRequest serverRequest);


}
