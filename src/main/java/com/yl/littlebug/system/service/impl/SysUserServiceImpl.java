package com.yl.littlebug.system.service.impl;

import com.yl.littlebug.system.dao.SysUserDao;
import com.yl.littlebug.system.entity.SysUser;
import com.yl.littlebug.system.service.SysUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

/**
 * @author by wzc
 * @Description serviceImpl 实现层
 * @Date 2021/11/30 22:15
 */

@Service
@RequiredArgsConstructor
public class SysUserServiceImpl implements SysUserService {


    private final SysUserDao sysUserDao;


    @Override
    public Flux<SysUser> findAll() {
        return sysUserDao.findAll();
    }
}
