package com.my.Entity.Domain;





import java.io.Serializable;

import java.util.Date;

import io.swagger.v3.oas.annotations.media.Schema;


/**
* 用户表
* @TableName user
*/
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

    private String username;
    /**
    * 密码
    */

    @Schema(description ="密码")

    private String password;
    /**
    * 电子邮件
    */

    @Schema(description ="电子邮件")

    private String email;
    /**
    * 用户头像URL
    */

    @Schema(description ="用户头像URL")

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
    private void setId(Long id){
    this.id = id;
    }

    /**
    * 用户名
    */
    private void setUsername(String username){
    this.username = username;
    }

    /**
    * 密码
    */
    private void setPassword(String password){
    this.password = password;
    }

    /**
    * 电子邮件
    */
    private void setEmail(String email){
    this.email = email;
    }

    /**
    * 用户头像URL
    */
    private void setAvatarUrl(String avatarUrl){
    this.avatarUrl = avatarUrl;
    }

    /**
    * 创建时间
    */
    private void setCreatedAt(Date createdAt){
    this.createdAt = createdAt;
    }

    /**
    * 更新时间
    */
    private void setUpdatedAt(Date updatedAt){
    this.updatedAt = updatedAt;
    }

    /**
    * 逻辑删除标志: 0-未删除, 1-已删除
    */
    private void setIsDeleted(String isDeleted){
    this.isDeleted = isDeleted;
    }


    /**
    * 
    */
    private Long getId(){
    return this.id;
    }

    /**
    * 用户名
    */
    private String getUsername(){
    return this.username;
    }

    /**
    * 密码
    */
    private String getPassword(){
    return this.password;
    }

    /**
    * 电子邮件
    */
    private String getEmail(){
    return this.email;
    }

    /**
    * 用户头像URL
    */
    private String getAvatarUrl(){
    return this.avatarUrl;
    }

    /**
    * 创建时间
    */
    private Date getCreatedAt(){
    return this.createdAt;
    }

    /**
    * 更新时间
    */
    private Date getUpdatedAt(){
    return this.updatedAt;
    }

    /**
    * 逻辑删除标志: 0-未删除, 1-已删除
    */
    private String getIsDeleted(){
    return this.isDeleted;
    }

}
