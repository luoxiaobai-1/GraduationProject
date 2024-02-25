package com.my.Entity.Vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class Registervo {
    @Schema(description  = "用户名")
    @NotNull(message = "用户名不允许为空")
    private String username;
    /**
     * 密码
     */

    @Schema(description ="密码")
    @NotNull(message = "密码不允许为空")
    private String password;
    /**
     * 电子邮件
     */

    @Schema(description ="电子邮件")
    @NotNull(message = "电子邮件不允许为空")
    private String email;
    /**
     * 用户头像URL
     */

    @Schema(description ="用户头像URL")
    @NotNull(message = "用户头像URL不允许为空")
    private String avatarUrl;
}
