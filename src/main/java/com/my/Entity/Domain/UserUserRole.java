package com.my.Entity.Domain;




import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;





/**
* 用户与角色关联表
* @TableName user_user_role
*/
public class UserUserRole implements Serializable {

    /**
    * 用户ID
    */

    @Schema(description ="用户ID")
    private Long userId;
    /**
    * 角色ID
    */

    @Schema(description ="角色ID")
    private Long roleId;
    /**
    * 逻辑删除标志: 0-未删除, 1-已删除
    */
    @Schema(description ="逻辑删除标志: 0-未删除, 1-已删除")
    private String isDeleted;

    /**
    * 用户ID
    */
    private void setUserId(Long userId){
    this.userId = userId;
    }

    /**
    * 角色ID
    */
    private void setRoleId(Long roleId){
    this.roleId = roleId;
    }

    /**
    * 逻辑删除标志: 0-未删除, 1-已删除
    */
    private void setIsDeleted(String isDeleted){
    this.isDeleted = isDeleted;
    }


    /**
    * 用户ID
    */
    private Long getUserId(){
    return this.userId;
    }

    /**
    * 角色ID
    */
    private Long getRoleId(){
    return this.roleId;
    }

    /**
    * 逻辑删除标志: 0-未删除, 1-已删除
    */
    private String getIsDeleted(){
    return this.isDeleted;
    }

}
