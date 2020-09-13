package com.test.wedrive.domin;

import io.swagger.annotations.ApiParam;
import lombok.Data;

import java.util.UUID;

@Data
public class Member {

    /**
     * id
     */
    @ApiParam(value = "UUID", required = true)
    private String id;

    /**
     * 유저 아이디
     */
    @ApiParam(value = "유저 아이디")
    private String userId;

    /**
     * 비밀번호
     */
    @ApiParam(value = "비밀번호")
    private String password;

    /**
     * 이름
     */
    @ApiParam(value = "이름")
    private String name;

    /**
     * 전화번호
     */
    @ApiParam(value = "전화번호")
    private String phone;

    /**
     * 주소
     */
    @ApiParam(value = "주소")
    private String address;

    /**
     * 상세주소
     */
    @ApiParam(value = "상세주소")
    private String detailedAddress;

    //

    public Member() {
        this.id = UUID.randomUUID().toString();
    }

    public Member(String id) {
        this.id = id;
    }
}
