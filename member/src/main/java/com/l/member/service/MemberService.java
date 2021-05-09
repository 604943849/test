package com.l.member.service;

import com.l.member.entity.LMember;

import java.util.List;

public interface MemberService {
    List<LMember> selectAll();

    void add();

    LMember getRedis(String key);
}
