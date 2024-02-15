package com.my.Entity.Domain;





import java.io.Serializable;


import io.swagger.v3.oas.annotations.media.Schema;


/**
* 权限表
* @TableName permission
*/
public class Permission implements Serializable {

    /**
    * 
    */

    @Schema(description ="")
    private Long id;
    /**
    * 权限名称
    */

    @Schema(description ="权限名称")

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
    * 权限名称
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
    * 权限名称
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
