package com.yl.littlebug.system.entity;

import lombok.*;
import org.springframework.data.annotation.*;
import org.springframework.data.relational.core.mapping.Table;
import java.time.LocalDateTime;


/**
 * @author wangzhichao
 */
@Table("sys_login_log")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SysLoginLog {

  @Id
  private long id;

  private String userName;

  private String status;

  private String ip;

  private String createBy;

  private LocalDateTime createTime;

  private String lastUpdateBy;

  private LocalDateTime lastUpdateTime;

}
