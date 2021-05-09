package com.l.member.service.impl;

import com.l.member.entity.LMember;
import com.l.member.mapper.LMemberMapper;
import com.l.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author L
 * @date 2021/05/01
 */
@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private LMemberMapper memberMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public List<LMember> selectAll() {
        return memberMapper.selectByExample(null);
    }

    /**
     * Redis 写入缓存
     */
    @Override
    public void add() {
        LMember member = new LMember();
        member.setUsername("qqq");
        member.setPassword("123456");
        try {
            String s = "写入数据";
            redisTemplate.opsForValue().set(s,member);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public LMember getRedis(String key) {

        return (LMember) redisTemplate.opsForValue().get(key);
    }
}
