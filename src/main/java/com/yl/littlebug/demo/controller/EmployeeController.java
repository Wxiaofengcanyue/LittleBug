package com.yl.littlebug.demo.controller;


import com.yl.littlebug.demo.entity.Employee;
import com.yl.littlebug.demo.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author by wzc
 * @Description controller层 测试用途
 * @Date 2021/11/30 10:16
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/employee")
@Slf4j
public class EmployeeController {

    private final EmployeeService employeeService;


    @GetMapping("/findAll")
    public Flux<Employee> findAll() {
        return employeeService.findAll();
    }

    @GetMapping(path = "{id}")
    public Mono<Employee> findById(@PathVariable("id") long id) {
        return employeeService.findById(id);
    }

    @GetMapping("/findByName")
    public Flux<Employee> findByName(@RequestParam("name") String name) {
        return employeeService.findByName(name);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Employee> save(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Mono<Void> update(@RequestBody Employee employee) {
        return employeeService.update(employee);
    }

    @DeleteMapping("/delete")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Mono<Void> delete(@RequestBody Employee employee) {
        return employeeService.delete(employee);
    }
    @DeleteMapping(path = "{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Mono<Void> deleteById(@PathVariable long id) {
        return employeeService.deleteById(id);
    }





































}
