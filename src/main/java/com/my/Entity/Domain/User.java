package com.my.Entity.Domain;





import java.io.Serializable;

import java.util.Date;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


/**
* 用户表
* @TableName user
*/
@Data
public class User implements Serializable {

    /**
    * 
    */

    @Schema()
    private Long id;
    /**
    * 用户名
    */

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
    /**
    * 创建时间
    */
    @Schema(description ="创建时间")
    private Date createdAt;
    /**
    * 更新时间
    */
    @Schema(description ="更新时间")
    private Date updatedAt;
    /**
    * 逻辑删除标志: 0-未删除, 1-已删除
    */
    @Schema(description ="逻辑删除标志: 0-未删除, 1-已删除")
    private String isDeleted;

    /**
    * 
    */


}
