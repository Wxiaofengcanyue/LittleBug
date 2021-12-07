package com.yl.littlebug.system.entity;

import lombok.*;
import org.springframework.data.annotation.*;
import org.springframework.data.relational.core.mapping.Table;
import java.time.LocalDateTime;


/**
 * @author wangzhichao
 */

@Table("sys_dept")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SysDept {

  @Id
  private long id;

  private String name;

  private long parentId;

  private long orderNum;

  private String createBy;

  private LocalDateTime createTime;

  private String lastUpdateBy;

  private LocalDateTime lastUpdateTime;

  private long delFlag;

}
