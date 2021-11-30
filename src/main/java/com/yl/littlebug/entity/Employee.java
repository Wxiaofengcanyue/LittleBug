package com.yl.littlebug.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

/**
 * @author by wzc
 * @Description 测试实体类
 * @Date 2021/11/30 9:57
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@With
@Table("employee")
public class Employee {

    @Id
    private long id;

    private String name;

    private int age;

    private long salary;














}
