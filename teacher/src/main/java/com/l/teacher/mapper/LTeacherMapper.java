package com.l.teacher.mapper;

import com.l.teacher.entity.LTeacher;
import com.l.teacher.entity.LTeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LTeacherMapper {
    long countByExample(LTeacherExample example);

    int deleteByExample(LTeacherExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LTeacher record);

    int insertSelective(LTeacher record);

    List<LTeacher> selectByExample(LTeacherExample example);

    LTeacher selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LTeacher record, @Param("example") LTeacherExample example);

    int updateByExample(@Param("record") LTeacher record, @Param("example") LTeacherExample example);

    int updateByPrimaryKeySelective(LTeacher record);

    int updateByPrimaryKey(LTeacher record);
}