package com.my.Entity.Domain;



import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;




/**
* 用户角色表
* @TableName user_role
*/
public class UserRole implements Serializable {

    /**
    * 
    */

    @Schema(description ="")
    private Long id;
    /**
    * 角色名称
    */


    @Schema(description ="角色名称")

    private String name;
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
    * 角色名称
    */
    private void setName(String name){
    this.name = name;
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
    * 角色名称
    */
    private String getName(){
    return this.name;
    }

    /**
    * 逻辑删除标志: 0-未删除, 1-已删除
    */
    private String getIsDeleted(){
    return this.isDeleted;
    }

}
