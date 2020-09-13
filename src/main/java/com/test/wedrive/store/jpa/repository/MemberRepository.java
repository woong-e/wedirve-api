package com.test.wedrive.store.jpa.repository;

import com.test.wedrive.store.jpa.tbo.MemberTbo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberTbo, String> {
    //
}
