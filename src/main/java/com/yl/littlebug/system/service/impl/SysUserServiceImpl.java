package com.yl.littlebug.system.service.impl;

import com.yl.littlebug.system.dao.SysUserDao;
import com.yl.littlebug.system.entity.SysUser;
import com.yl.littlebug.system.service.SysUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author by wzc
 * @Description 接口实现层
 * @Date 2021/12/1 14:49
 */
@Service
@RequiredArgsConstructor
public class SysUserServiceImpl implements SysUserService {


    private final SysUserDao userDao;


    @Override
    public Flux<SysUser> findAll() {
        return userDao.findAll();
    }

    @Override
    public Mono<SysUser> findById(long id) {
        //serverRequest

        // build notFound response
        Mono<ServerResponse> notFound = ServerResponse.notFound().build();

        // get user from dao
        return userDao.findById(id);

        // build response
//        return sysUserMono
//                .flatMap(user -> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(fromValue(user)))
//                .switchIfEmpty(notFound);
    }

    @Override
    public Mono<Void> save(SysUser sysUser) {

        userDao.save(sysUser);

        return Mono.empty();
    }

    @Override
    public Mono<Void> deleteUserById(long id) {

        Mono<Void> voidMono = userDao.deleteById(id);

        return voidMono;
    }
}
