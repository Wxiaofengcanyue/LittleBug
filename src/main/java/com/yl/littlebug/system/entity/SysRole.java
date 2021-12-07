package com.yl.littlebug.system.entity;

import lombok.*;
import org.springframework.data.annotation.*;
import org.springframework.data.relational.core.mapping.Table;
import java.time.LocalDateTime;


/**
 * @author wangzhichao
 */
@Table("sys_role")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SysRole {

  @Id
  private long id;

  private String name;

  private String remark;

  private String createBy;

  private LocalDateTime createTime;

  private String lastUpdateBy;

  private LocalDateTime lastUpdateTime;

  private long delFlag;

}
