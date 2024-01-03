package com.greenjui.mrowebview.domain.member.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import java.time.LocalDateTime;

@Getter
@Table(name = "USERINFO")
@Entity(name = "Member")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long urefitem;

    @Comment("이름")
    @Column
    private String username;

    @Comment("사용자아이디")
    @Column
    private String userid;

    @Comment("통화단위")
    @Column
    private String ucurrency;

    @Comment("비밀번호")
    @Column
    private String password;

    @Comment("사용여부")
    @Column
    private String isuse;

    @Comment("회사구분")
    @Column
    private String iscompany;

    @Comment("배송지FK")
    @Column
    private Long defshop;

    @Comment("청구지FK")
    @Column
    private Long defbill;

    @Column
    private String usertype;

    @Column
    private String delflag;

    @Column
    private LocalDateTime insertdate;

    @Column
    private String smsYN;

    @Column
    private String emailYn;

    @Column
    private String agreeYn;

    @Column
    private String teamsYn;

    @Column
    private LocalDateTime passwordUpdateon;

    @Column
    private Long usernoS;

    @Column
    private String useridIf;

    @Column
    private Long grade;

    @Column
    private String authGrpNumber;

    @Column
    private Long userRelationSeq;

    @Column
    private Long passwordCnt;
}
