package com.l.member.client.exphandler;

import com.l.common.result.Result;
import com.l.member.client.TeacherClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author L
 * @date 2021/05/04
 */
@Slf4j
@Component
public class TeacherClientExceptionHandler implements TeacherClient {

    @Override
    public Result selectTeacherAll(int i, String s) {
        log.error("调用远程服务【查询所有教师】失败");
        return Result.error().message("调用远程服务【查询所有教师】失败");
    }
}
