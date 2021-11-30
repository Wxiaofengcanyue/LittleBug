package com.yl.littlebug.system.service;

import com.yl.littlebug.system.entity.SysUser;
import reactor.core.publisher.Flux;

/**
 * @author by wzc
 * @Description service 层
 * @Date 2021/11/30 22:15
 */
public interface SysUserService {

    /**
     * 查询所有
     * @return  Flux<SysUser>
     */
    Flux<SysUser> findAll();



}
