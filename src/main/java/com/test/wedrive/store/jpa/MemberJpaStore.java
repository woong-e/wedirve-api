package com.test.wedrive.store.jpa;

import com.test.wedrive.domin.Member;
import com.test.wedrive.store.MemberStore;
import com.test.wedrive.store.jpa.repository.MemberRepository;
import com.test.wedrive.store.jpa.tbo.MemberTbo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class MemberJpaStore implements MemberStore {
    //
    @Autowired
    private MemberRepository repository;

    @Override
    public List<Member> readAll() {
        List<MemberTbo> tbos = repository.findAll();

        return tbos.stream().map(MemberTbo::toDomain).collect(Collectors.toList());
    }

    @Override
    public Member read(String id) {
        MemberTbo tbo = repository.findById(id).orElse(null);
        return tbo != null ? tbo.toDomain() : null;
    }

    @Override
    public void create(Member member) {
        save(member);
    }

    @Override
    public void update(Member member) {
        save(member);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    private void save(Member member) {
        MemberTbo tbo = new MemberTbo(member);
        repository.save(tbo);
    }
}
