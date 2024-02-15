package com.my.Entity.Domain;





import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;




/**
* 角色与权限关联表
* @TableName role_permission
*/
public class RolePermission implements Serializable {

    /**
    * 角色ID
    */
    @Schema(description ="角色ID")
    private Long roleId;
    /**
    * 权限ID
    */
    @Schema(description ="权限ID")
    private Long permissionId;
    /**
    * 逻辑删除标志: 0-未删除, 1-已删除
    */
    @Schema(description ="逻辑删除标志: 0-未删除, 1-已删除")
    private String isDeleted;

    /**
    * 角色ID
    */
    private void setRoleId(Long roleId){
    this.roleId = roleId;
    }

    /**
    * 权限ID
    */
    private void setPermissionId(Long permissionId){
    this.permissionId = permissionId;
    }

    /**
    * 逻辑删除标志: 0-未删除, 1-已删除
    */
    private void setIsDeleted(String isDeleted){
    this.isDeleted = isDeleted;
    }


    /**
    * 角色ID
    */
    private Long getRoleId(){
    return this.roleId;
    }

    /**
    * 权限ID
    */
    private Long getPermissionId(){
    return this.permissionId;
    }

    /**
    * 逻辑删除标志: 0-未删除, 1-已删除
    */
    private String getIsDeleted(){
    return this.isDeleted;
    }

}
