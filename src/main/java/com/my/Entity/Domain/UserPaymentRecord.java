package com.my.Entity.Domain;





import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

import java.math.BigDecimal;
import java.util.Date;



/**
* 用户付费记录表
* @TableName user_payment_record
*/
public class UserPaymentRecord implements Serializable {

    /**
    * 
    */

    @Schema(description ="")
    private Long id;
    /**
    * 用户ID
    */
    @Schema(description ="用户ID")
    private Long userId;
    /**
    * 关联会员等级ID
    */
    @Schema(description ="关联会员等级ID")
    private Long membershipLevelId;
    /**
    * 支付金额
    */

    @Schema(description ="支付金额")
    private BigDecimal paymentAmount;
    /**
    * 支付时间
    */
    @Schema(description ="支付时间")
    private Date paymentTime;
    /**
    * 会员过期时间
    */
    @Schema(description ="会员过期时间")
    private Date expiryDate;
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
    * 用户ID
    */
    private void setUserId(Long userId){
    this.userId = userId;
    }

    /**
    * 关联会员等级ID
    */
    private void setMembershipLevelId(Long membershipLevelId){
    this.membershipLevelId = membershipLevelId;
    }

    /**
    * 支付金额
    */
    private void setPaymentAmount(BigDecimal paymentAmount){
    this.paymentAmount = paymentAmount;
    }

    /**
    * 支付时间
    */
    private void setPaymentTime(Date paymentTime){
    this.paymentTime = paymentTime;
    }

    /**
    * 会员过期时间
    */
    private void setExpiryDate(Date expiryDate){
    this.expiryDate = expiryDate;
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
    * 用户ID
    */
    private Long getUserId(){
    return this.userId;
    }

    /**
    * 关联会员等级ID
    */
    private Long getMembershipLevelId(){
    return this.membershipLevelId;
    }

    /**
    * 支付金额
    */
    private BigDecimal getPaymentAmount(){
    return this.paymentAmount;
    }

    /**
    * 支付时间
    */
    private Date getPaymentTime(){
    return this.paymentTime;
    }

    /**
    * 会员过期时间
    */
    private Date getExpiryDate(){
    return this.expiryDate;
    }

    /**
    * 逻辑删除标志: 0-未删除, 1-已删除
    */
    private String getIsDeleted(){
    return this.isDeleted;
    }

}
