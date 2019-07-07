package com.hystli.sub.dao;

import com.hystli.sub.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao {
    public UserEntity findById(Long id);
}
