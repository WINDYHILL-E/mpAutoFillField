package com.example.mp.methods;

import com.baomidou.mybatisplus.core.injector.AbstractMethod;
import com.baomidou.mybatisplus.core.metadata.TableInfo;
import org.apache.ibatis.mapping.MappedStatement;

public class LogicDeleteByIdWithFill extends AbstractMethod {
    /**
     * @param methodName 方法名
     * @since 3.5.0
     */
    protected LogicDeleteByIdWithFill(String methodName) {
        super(methodName);
    }

    @Override
    public MappedStatement injectMappedStatement(Class<?> mapperClass, Class<?> modelClass, TableInfo tableInfo) {
        return null;
    }
}
