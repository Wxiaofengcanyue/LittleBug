package com.yl.littlebug.demo.dao;

import com.yl.littlebug.demo.entity.Employee;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

/**
 * @author by wzc
 * @Description 员工实体类
 * @Date 2021/11/30 9:59
 */
public interface EmployeeDao extends ReactiveCrudRepository<Employee,Long> {

    Flux<Employee> findByName(String name);

}
