package com.yl.littlebug.system.entity;

import lombok.*;
import org.springframework.data.annotation.*;
import org.springframework.data.relational.core.mapping.Table;
import java.time.LocalDateTime;


/**
 * @author wangzhichao
 */
@Table("sys_user_role")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SysUserRole {

  @Id
  private long id;

  private long userId;

  private long roleId;

  private String createBy;

  private LocalDateTime createTime;

  private String lastUpdateBy;

  private LocalDateTime lastUpdateTime;

}
