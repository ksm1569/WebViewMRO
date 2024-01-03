package com.greenjui.mrowebview.domain.member.service;

import com.greenjui.mrowebview.domain.member.entity.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class MemberServiceTest {
    @Autowired
    MemberService memberService;

    @DisplayName("124499(김수민) 회원을 조회 해보자")
    @Test
    public void selectedMember() {
        Member member = memberService.findMemberById(124499L);

        assertEquals("김수민", member.getUsername());
    }
}