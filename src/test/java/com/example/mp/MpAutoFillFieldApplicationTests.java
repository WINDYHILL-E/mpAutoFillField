package com.example.mp;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.mp.bean.Student;
import com.example.mp.mapper.StudentMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.Timer;
import java.util.concurrent.locks.Lock;

@Slf4j
@SpringBootTest
class MpAutoFillFieldApplicationTests {

    @Autowired
    private StudentMapper studentMapper;

    @Test
    synchronized void contextLoads() {

        Student student = new Student();
        student.setName("yahahah" + new Date().getTime());

        insert(student);

        student = getById(student.getId());
        log.info(student.toString());

        student.setUpdateTime(null);
        delete(student);

        student = getById(student.getId());
        log.info(String.valueOf(student));

    }

    void insert(Student student) {
        studentMapper.insert(student);
    }

    Student getById(Long id) {
        return studentMapper.selectById(id);
    }

    void delete(Student student) {

        studentMapper.deleteById(student);

        // studentMapper.deleteByIdWithFill(student);

        UpdateWrapper<Student> wrapper = new UpdateWrapper<>();
        wrapper.eq("id", student.getId());
        wrapper.set("deleted", 1);
        // studentMapper.update(student, wrapper);
    }

    void delete(Long id) {
        studentMapper.deleteById(id);
    }

}
