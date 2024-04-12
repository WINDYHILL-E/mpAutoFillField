package com.example.mp;

import com.example.mp.bean.Student;
import com.example.mp.mapper.StudentMapper;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MpAutoFillFieldApplicationTests {

	Logger logger = LoggerFactory.getLogger(MpAutoFillFieldApplicationTests.class);

	@Autowired
	private StudentMapper studentMapper;

	@Test
	void contextLoads() {
		Student student = new Student();
		student.setName("yahahah");
		studentMapper.insert(student);
		Student selectById = studentMapper.selectById(student.getId());
		logger.info(selectById.toString());
	}

}
