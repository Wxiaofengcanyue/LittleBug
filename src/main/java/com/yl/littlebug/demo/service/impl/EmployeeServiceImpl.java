package com.yl.littlebug.demo.service.impl;


import com.yl.littlebug.demo.dao.EmployeeDao;
import com.yl.littlebug.demo.entity.Employee;
import com.yl.littlebug.demo.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author by wzc
 * @Description 实现层
 * @Date 2021/11/30 10:02
 */

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeDao employeeDao;


    @Override
    public Flux<Employee> findAll() {
        return employeeDao.findAll();
    }

    @Override
    public Mono<Employee> findById(long id) {
        return employeeDao.findById(id);
    }

    @Override
    public Flux<Employee> findByName(String name) {
        return employeeDao.findByNameLike(name);
    }

    @Override
    public Mono<Employee> save(Employee employee) {
        return employeeDao.save(employee);
    }

    @Override
    public Mono<Void> update(Employee employee) {
        return findById(employee.getId())
                .map(em -> employee.withId(em.getId()))
                .flatMap(employeeDao::save)
                .then();
    }

    @Override
    public Mono<Void> delete(Employee employee) {
        return employeeDao.delete(employee);
    }

    @Override
    public Mono<Void> deleteById(long id) {
        return employeeDao.deleteById(id);
    }
}
