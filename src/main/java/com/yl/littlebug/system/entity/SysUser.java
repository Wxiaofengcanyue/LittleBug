package com.yl.littlebug.system.entity;

import lombok.*;
import org.springframework.data.annotation.*;
import org.springframework.data.relational.core.mapping.Table;

import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * @author wangzhichao
 */
@Table("sys_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SysUser implements Serializable {

  @Id
  private long userId;

  private long deptId;

  private String userName;

  private String nickName;

  private String userType;

  private String email;

  private String phoneNumber;

  private String sex;

  private String avatar;

  private String password;

  private String status;

  private String delFlag;

  private String loginIp;

  private LocalDateTime loginDate;

  private String createBy;

  private LocalDateTime createTime;

  private String updateBy;

  private LocalDateTime updateTime;

  private String remark;

}
