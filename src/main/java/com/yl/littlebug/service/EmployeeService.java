package com.yl.littlebug.service;

import com.yl.littlebug.entity.Employee;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author by wzc
 * @Description service层
 * @Date 2021/11/30 10:05
 */
public interface EmployeeService {


    Flux<Employee> findAll();

    Mono<Employee> findById(long id);

    Flux<Employee> findByName(String name);

    Mono<Employee> save(Employee employee);

    Mono<Void> update(Employee employee);

    Mono<Void> delete(Employee employee);

    Mono<Void> deleteById(long id);
}
