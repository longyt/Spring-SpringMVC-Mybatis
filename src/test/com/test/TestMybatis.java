package com.test;

import com.zking.Entity.StudentEntity;
import com.zking.dao.StudentDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.util.List;

/**
 * @author: longyt
 * @create: 2018-01-10 19:54
 * @desc:
 **/
public class TestMybatis {

    @org.junit.Test
    public void TestMybatis(){
        try {
            SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("Mybatis_config.xml"));
            SqlSession sqlSession = sqlSessionFactory.openSession();
            StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
            List<StudentEntity> list = studentDao.getallStudent();
            for (StudentEntity s : list) {
                System.out.println(s.getSname());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
