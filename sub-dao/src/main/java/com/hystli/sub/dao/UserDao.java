package com.hystli.sub.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.hystli.sub.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao extends BaseMapper<UserEntity> {
    UserEntity findById(Long id);
}
