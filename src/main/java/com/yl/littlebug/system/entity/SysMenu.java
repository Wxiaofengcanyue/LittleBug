package com.yl.littlebug.system.entity;

import lombok.*;
import org.springframework.data.annotation.*;
import org.springframework.data.relational.core.mapping.Table;
import java.time.LocalDateTime;


/**
 * @author wangzhichao
 */
@Table("sys_menu")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SysMenu {

  @Id
  private long id;

  private String name;

  private long parentId;

  private String url;

  private String perms;

  private long type;

  private String icon;

  private long orderNum;

  private String createBy;

  private LocalDateTime createTime;

  private String lastUpdateBy;

  private LocalDateTime lastUpdateTime;

  private long delFlag;

}
