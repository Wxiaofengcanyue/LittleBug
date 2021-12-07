package com.yl.littlebug.system.entity;

import lombok.*;
import org.springframework.data.annotation.*;
import org.springframework.data.relational.core.mapping.Table;
import java.time.LocalDateTime;


/**
 * @author wangzhichao
 */
@Table("sys_role_menu")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SysRoleMenu {

  @Id
  private long id;

  private long roleId;

  private long menuId;

  private String createBy;

  private LocalDateTime createTime;

  private String lastUpdateBy;

  private LocalDateTime lastUpdateTime;

}
