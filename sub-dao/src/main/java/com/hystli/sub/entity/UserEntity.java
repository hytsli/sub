package com.hystli.sub.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

@Data
@TableName("jap_test")
public class UserEntity {

    @TableId
    private Long id;
    private String name;
    private String description;
}
