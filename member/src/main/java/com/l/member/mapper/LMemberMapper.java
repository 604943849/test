package com.l.member.mapper;

import com.l.member.entity.LMember;
import com.l.member.entity.LMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;


public interface LMemberMapper {
    long countByExample(LMemberExample example);

    int deleteByExample(LMemberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LMember record);

    int insertSelective(LMember record);

    List<LMember> selectByExample(LMemberExample example);

    LMember selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LMember record, @Param("example") LMemberExample example);

    int updateByExample(@Param("record") LMember record, @Param("example") LMemberExample example);

    int updateByPrimaryKeySelective(LMember record);

    int updateByPrimaryKey(LMember record);
}