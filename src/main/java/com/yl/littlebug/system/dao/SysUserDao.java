package com.yl.littlebug.system.dao;

import com.yl.littlebug.system.entity.SysUser;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 * @author by wzc
 * @Description dao 层
 * @Date 2021/11/30 22:13
 */
public interface SysUserDao extends ReactiveCrudRepository<SysUser,Long> {


}
