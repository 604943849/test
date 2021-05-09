package com.l.teacher.mapper;

import com.l.teacher.entity.LCourse;
import com.l.teacher.entity.LCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LCourseMapper {
    long countByExample(LCourseExample example);

    int deleteByExample(LCourseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LCourse record);

    int insertSelective(LCourse record);

    List<LCourse> selectByExample(LCourseExample example);

    LCourse selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LCourse record, @Param("example") LCourseExample example);

    int updateByExample(@Param("record") LCourse record, @Param("example") LCourseExample example);

    int updateByPrimaryKeySelective(LCourse record);

    int updateByPrimaryKey(LCourse record);
}