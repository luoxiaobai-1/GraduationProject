package com.my.Controller.User;

import com.my.Annotation.Log;
import com.my.Entity.Domain.User;
import com.my.Entity.Vo.Registervo;
import com.my.Mapper.UserDAO;
import com.my.Result.ResponseInfo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


@RestController
@RequestMapping("/user")
@Slf4j
@Tag(name = "用户操作接口")
public class UserContronller {

    @Autowired
    UserDAO dao;
    @Operation(summary = "注册接口",description = "需要四个参数")
    @PostMapping("/register")
    @Log(op = "注册方法",description = "用户注册")
    public ResponseInfo Register(@Validated @RequestBody Registervo registervo)
    {
        User user=new User();
        user.setUsername(registervo.getUsername());
        user.setPassword(registervo.getPassword());
        user.setEmail(registervo.getEmail());
        user.setAvatarUrl(registervo.getAvatarUrl());
        user.setCreatedAt(new Date());
        dao.insert(user);
        return ResponseInfo.SuccessWithData(user);
    }
}
