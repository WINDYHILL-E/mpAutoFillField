package com.example.mp.config;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface MyBaseMapper<T> extends BaseMapper<T> {

    int deleteByIdWithFill(T t);

}
