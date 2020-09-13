package com.test.wedrive.store.jpa.tbo;

import com.test.wedrive.domin.Member;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "member")
public class MemberTbo {
    //
    @Id
    private String id;
    private String userId;
    private String password;
    private String name;
    private String phone;
    private String address;
    private String detailedAddress;

    public MemberTbo() {
        //
    }

    public MemberTbo(Member member) {
        update(member);
    }

    public Member toDomain() {
        Member member = new Member(this.id);
        BeanUtils.copyProperties(this, member, Member.class);

        return member;
    }

    private void update(Member member) {
        BeanUtils.copyProperties(member, this);
    }
}
