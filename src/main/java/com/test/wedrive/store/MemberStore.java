package com.test.wedrive.store;

import com.test.wedrive.domin.Member;

import java.util.List;

public interface MemberStore {

    /**
     * 사용자 목록 조회
     *
     * @return List<Member>
     */
    List<Member> readAll();

    /**
     * 사용자 조회
     *
     * @param id
     * @return Member
     */
    Member read(String id);

    /**
     * 사용자 등록
     *
     * @param member
     */
    void create(Member member);

    /**
     * 사용자 정보 수정
     *
     * @param member
     */
    void update(Member member);

    /**
     * 사용자 정보 삭제
     *
     * @param id
     */
    void delete(String id);
}
