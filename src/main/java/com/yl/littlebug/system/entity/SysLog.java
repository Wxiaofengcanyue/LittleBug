package com.yl.littlebug.system.entity;

import lombok.*;
import org.springframework.data.annotation.*;
import org.springframework.data.relational.core.mapping.Table;
import java.time.LocalDateTime;


/**
 * @author wangzhichao
 */
@Table("sys_log")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SysLog {

  @Id
  private long id;

  private String userName;

  private String operation;

  private String method;

  private String params;

  private long time;

  private String ip;

  private String createBy;

  private LocalDateTime createTime;

  private String lastUpdateBy;

  private LocalDateTime lastUpdateTime;

}
