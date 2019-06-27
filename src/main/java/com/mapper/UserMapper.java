package com.mapper;

import com.entity.User;
import org.apache.ibatis.annotations.Mapper;

import javax.annotation.Resource;

@Mapper
public interface UserMapper {
    User Sel(int id);
}
