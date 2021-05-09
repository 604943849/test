package com.l.member.controller;

import com.l.common.result.Result;
import com.l.member.client.TeacherClient;
import com.l.member.entity.LMember;
import com.l.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @author L
 * @date 2021/05/01
 */
@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @Autowired
    private TeacherClient teacherClient;

    @GetMapping("selectAll")
    public Result selectAll(){
        List<LMember> members =  memberService.selectAll();
        return Result.ok().data("list",members);
    }

    @GetMapping("selectTeacherAll")
    public Result selectTeacherAll(){
        int i = 1;
        return teacherClient.selectTeacherAll(i,"zhangsan");
    }

    @PostMapping("add")
    public Result addRedis(){
        memberService.add();
        return Result.ok();
    }

    @GetMapping("get")
    public Result getRedis(String key){
        LMember member = memberService.getRedis(key);
        return Result.ok().data("数据",member);
    }

    @GetMapping("test")
    public Result test001(){
        return Result.ok();
    }
}
