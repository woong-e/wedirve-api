package com.test.wedrive.service.logic;

import com.test.wedrive.domin.Member;
import com.test.wedrive.service.MemberService;
import com.test.wedrive.store.MemberStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceLogic implements MemberService {
    //
    @Autowired
    private MemberStore store;

    @Override
    public List<Member> findAll() {
        return store.readAll();
    }

    @Override
    public Member find(String id) {
        return store.read(id);
    }

    @Override
    public void register(Member member) {
        store.create(member);
    }

    @Override
    public void modify(Member member) {
        store.update(member);
    }

    @Override
    public void remove(String id) {
        store.delete(id);
    }
}
