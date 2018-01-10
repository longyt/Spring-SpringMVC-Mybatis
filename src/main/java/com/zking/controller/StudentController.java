package com.zking.controller;

import com.zking.Entity.StudentEntity;
import com.zking.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author: longyt
 * @create: 2018-01-10 21:23
 * @desc:
 **/
@Controller
public class StudentController {

    @Autowired
    private StudentDao studentDao;

    @RequestMapping("getall")
    public String getall(){
        List<StudentEntity> list = studentDao.getallStudent();
        for (StudentEntity s : list) {
            System.out.println(s.getSname());
        }
        return "success";
    }
}
