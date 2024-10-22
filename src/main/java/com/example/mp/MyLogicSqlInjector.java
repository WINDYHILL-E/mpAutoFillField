package com.example.mp;

import com.baomidou.mybatisplus.core.injector.AbstractMethod;
import com.baomidou.mybatisplus.core.injector.DefaultSqlInjector;
import com.baomidou.mybatisplus.core.metadata.TableInfo;
import com.baomidou.mybatisplus.extension.injector.methods.LogicDeleteByIdWithFill;
import org.apache.ibatis.session.Configuration;

import java.util.ArrayList;
import java.util.List;

public class MyLogicSqlInjector extends DefaultSqlInjector {

    @Override
    public List<AbstractMethod> getMethodList(Configuration configuration, Class<?> mapperClass, TableInfo tableInfo) {
        List<AbstractMethod> list = new ArrayList<>();
        list.add(new LogicDeleteByIdWithFill());
        list.addAll(super.getMethodList(configuration, mapperClass, tableInfo));
        return list;
    }
}
