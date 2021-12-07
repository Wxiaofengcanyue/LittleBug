package com.yl.littlebug.system.entity;

import lombok.*;
import org.springframework.data.annotation.*;
import org.springframework.data.relational.core.mapping.Table;
import java.time.LocalDateTime;


/**
 * @author wangzhichao
 */
@Table("sys_role_dept")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SysRoleDept {

  @Id
  private long id;

  private long roleId;

  private long deptId;

  private String createBy;

  private LocalDateTime createTime;

  private String lastUpdateBy;

  private LocalDateTime lastUpdateTime;

}
