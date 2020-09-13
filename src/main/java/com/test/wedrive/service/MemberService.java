package com.test.wedrive.service;

import com.test.wedrive.domin.Member;

import java.util.List;

public interface MemberService {

    /**
     * 사용자 목록 조회
     *
     * @return List<Member>
     */
    List<Member> findAll();

    /**
     * 사용자 정보 조회
     *
     * @param id
     * @return Member
     */
    Member find(String id);

    /**
     * 사용자 등록
     *
     * @param member
     */
    void register(Member member);

    /**
     * 사용자 정보 수정
     *
     * @param member
     */
    void modify(Member member);

    /**
     * 사용자 정보 삭제
     *
     * @param id
     */
    void remove(String id);
}
