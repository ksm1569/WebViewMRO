package com.greenjui.mrowebview.domain.member.service;

import com.greenjui.mrowebview.domain.member.entity.Member;
import com.greenjui.mrowebview.domain.member.repository.MemberRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public Member findMemberById(Long urefitem) {
        return memberRepository.findById(urefitem)
                .orElseThrow(() -> new EntityNotFoundException("존재하지 않는 멤버입니다"));
    }
}
