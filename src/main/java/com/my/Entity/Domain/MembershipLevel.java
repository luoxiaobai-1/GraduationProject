package com.my.Entity.Domain;





import java.io.Serializable;

import java.math.BigDecimal;
import java.util.Date;

import io.swagger.v3.oas.annotations.media.Schema;


/**
* 会员等级表
* @TableName membership_level
*/
public class MembershipLevel implements Serializable {

    /**
    * 
    */

    @Schema(description ="")
    private Long id;
    /**
    * 会员等级名称
    */


    @Schema(description ="会员等级名称")

    private String name;
    /**
    * 会员等级描述
    */

    @Schema(description ="会员等级描述")

    private String description;
    /**
    * 会员价格
    */

    @Schema(description ="会员价格")
    private BigDecimal price;
    /**
    * 会员时长（天）
    */
    @Schema(description ="会员时长（天）")
    private Integer duration;
    /**
    * 创建时间
    */
    @Schema(description ="创建时间")
    private Date createdAt;
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
    * 会员等级名称
    */
    private void setName(String name){
    this.name = name;
    }

    /**
    * 会员等级描述
    */
    private void setDescription(String description){
    this.description = description;
    }

    /**
    * 会员价格
    */
    private void setPrice(BigDecimal price){
    this.price = price;
    }

    /**
    * 会员时长（天）
    */
    private void setDuration(Integer duration){
    this.duration = duration;
    }

    /**
    * 创建时间
    */
    private void setCreatedAt(Date createdAt){
    this.createdAt = createdAt;
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
    * 会员等级名称
    */
    private String getName(){
    return this.name;
    }

    /**
    * 会员等级描述
    */
    private String getDescription(){
    return this.description;
    }

    /**
    * 会员价格
    */
    private BigDecimal getPrice(){
    return this.price;
    }

    /**
    * 会员时长（天）
    */
    private Integer getDuration(){
    return this.duration;
    }

    /**
    * 创建时间
    */
    private Date getCreatedAt(){
    return this.createdAt;
    }

    /**
    * 逻辑删除标志: 0-未删除, 1-已删除
    */
    private String getIsDeleted(){
    return this.isDeleted;
    }

}
