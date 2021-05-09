package com.l.teacher.service.impl;

import com.l.teacher.entity.LTeacher;
import com.l.teacher.mapper.LTeacherMapper;
import com.l.teacher.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author L
 * @date 2021/05/01
 */
@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private LTeacherMapper teacherMapper;

    @Override
    public List<LTeacher> selectTeacherAll() {
        return teacherMapper.selectByExample(null);
    }
}
