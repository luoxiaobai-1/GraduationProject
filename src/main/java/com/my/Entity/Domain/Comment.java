package com.my.Entity.Domain;




import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

import java.util.Date;






/**
* 评论表
* @TableName comment
*/
public class Comment implements Serializable {

    /**
    * 
    */

   @Schema(description = "评论id")
    private Long id;
    /**
    * 评论内容
    */

    @Schema(description ="评论内容")

    private String content;
    /**
    * 评论用户ID
    */
    @Schema(description ="评论用户ID")
    private Long userId;
    /**
    * 关联帖子ID
    */
    @Schema(description ="关联帖子ID")
    private Long postId;
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
    * 评论内容
    */
    private void setContent(String content){
    this.content = content;
    }

    /**
    * 评论用户ID
    */
    private void setUserId(Long userId){
    this.userId = userId;
    }

    /**
    * 关联帖子ID
    */
    private void setPostId(Long postId){
    this.postId = postId;
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
    * 评论内容
    */
    private String getContent(){
    return this.content;
    }

    /**
    * 评论用户ID
    */
    private Long getUserId(){
    return this.userId;
    }

    /**
    * 关联帖子ID
    */
    private Long getPostId(){
    return this.postId;
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
