package com.l.member.client;

import com.l.common.result.Result;
import com.l.member.client.exphandler.TeacherClientExceptionHandler;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * 远程教师服务
 * @author L
 * @date 2021/05/01
 */
@FeignClient(value = "l-teacher",fallback = TeacherClientExceptionHandler.class)
@Component
public interface TeacherClient {

    @GetMapping("/teacher/selectTeacherAll")
    public Result selectTeacherAll(@RequestParam(value = "i") int i, @RequestParam(value = "s") String s);
}
