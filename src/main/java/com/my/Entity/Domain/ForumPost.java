package com.my.Entity.Domain;





import java.io.Serializable;

import java.util.Date;

import io.swagger.v3.oas.annotations.media.Schema;
;


/**
* 帖子表
* @TableName forum_post
*/
public class ForumPost implements Serializable {

    /**
    * 
    */

    @Schema(description ="")
    private Long id;
    /**
    * 帖子标题
    */

    @Schema(description ="帖子标题")

    private String title;
    /**
    * 帖子内容
    */

    @Schema(description ="帖子内容")

    private String content;
    /**
    * 发布用户ID
    */
    @Schema(description ="发布用户ID")
    private Long userId;
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
    * 帖子标题
    */
    private void setTitle(String title){
    this.title = title;
    }

    /**
    * 帖子内容
    */
    private void setContent(String content){
    this.content = content;
    }

    /**
    * 发布用户ID
    */
    private void setUserId(Long userId){
    this.userId = userId;
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
    * 帖子标题
    */
    private String getTitle(){
    return this.title;
    }

    /**
    * 帖子内容
    */
    private String getContent(){
    return this.content;
    }

    /**
    * 发布用户ID
    */
    private Long getUserId(){
    return this.userId;
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
