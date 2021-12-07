package com.yl.littlebug.system.entity;

import lombok.*;
import org.springframework.data.annotation.*;
import org.springframework.data.relational.core.mapping.Table;
import java.time.LocalDateTime;


/**
 * @author wangzhichao
 */
@Table("sys_dict")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SysDict {

  @Id
  private long id;

  private String value;

  private String label;

  private String type;

  private String description;

  private double sort;

  private String createBy;

  private LocalDateTime createTime;

  private String lastUpdateBy;

  private LocalDateTime lastUpdateTime;

  private String remarks;

  private long delFlag;

}
