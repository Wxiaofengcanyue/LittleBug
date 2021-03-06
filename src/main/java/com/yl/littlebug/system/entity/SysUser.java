package com.yl.littlebug.system.entity;

import lombok.*;
import org.springframework.data.annotation.*;
import org.springframework.data.relational.core.mapping.Table;
import java.time.LocalDateTime;


/**
 * @author wangzhichao
 */


@Table("sys_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SysUser {

  @Id
  private long id;

  private String name;

  private String nickName;

  private String avatar;

  private String password;

  private String salt;

  private String email;

  private String mobile;

  private long status;

  private long deptId;

  private String createBy;

  private LocalDateTime createTime;

  private String lastUpdateBy;

  private LocalDateTime lastUpdateTime;

  private long delFlag;

}
