package com.test;

import com.zking.Entity.StudentEntity;
import com.zking.dao.StudentDao;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author: longyt
 * @create: 2018-01-10 20:58
 * @desc:
 **/
public class TestSpring {

    @Test
    public void testSpring(){
        ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        StudentDao studentDao = (StudentDao) context.getBean("studentDao");
        List<StudentEntity> list  = studentDao.getallStudent();
        for (StudentEntity studentEntity : list) {
            System.out.println(studentEntity.getSname());
        }
    }
}
