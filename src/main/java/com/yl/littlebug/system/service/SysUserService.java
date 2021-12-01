package com.yl.littlebug.system.service;

import com.yl.littlebug.system.entity.SysUser;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author by wzc
 * @Description service 层
 * @Date 2021/12/1 14:49
 */
public interface SysUserService {

    /**
     * 获取所有用户信息
     * @return
     */
    Flux<SysUser> findAll();

    /**
     * 根据id 获取用户信息
     * @param id
     * @return
     */
    Mono<SysUser> findById(long id);

    /**
     * 保存用户
     * @param sysUser
     * @return
     */
    Mono<Void> save(SysUser sysUser);

    /**
     * 根据id删除用户
     * @param id
     * @return
     */
    Mono<Void> deleteUserById(long id);

}
