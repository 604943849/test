package com.l.teacher.controller;

import com.l.common.result.Result;
import com.l.teacher.entity.LTeacher;
import com.l.teacher.service.TeacherService;
import org.apache.http.HttpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;

/**
 * @author L
 * @date 2021/05/01
 */
@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("selectTeacherAll")
    public Result selectTeacherAll(int i,String s){
        System.out.println("当前线程123");
        List<LTeacher> list = teacherService.selectTeacherAll();
        return Result.ok().data("teacherList",list).data(s,i);
    }


}
