package com.my.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.my.Entity.Domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDAO extends BaseMapper<User> {
}