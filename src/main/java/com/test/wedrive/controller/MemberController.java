package com.test.wedrive.controller;

import com.test.wedrive.domin.Member;
import com.test.wedrive.service.MemberService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("members")
public class MemberController {
    //
    @Autowired
    private MemberService service;

    @GetMapping
    @ApiOperation(value = "사용자 목록 조회")
    public List<Member> findAll() {
        return service.findAll();
    }

    @GetMapping("{id}")
    @ApiOperation(value = "사용자 조회")
    public Member find(@PathVariable String id) {
        return service.find(id);
    }

    @PostMapping
    @ApiOperation(value = "사용자 등록")
    public void register(@RequestBody Member member) {
        service.register(member);
    }

    @PutMapping
    @ApiOperation(value = "사용자 정보 수정")
    public void modify(@RequestBody Member member) {
        service.modify(member);
    }

    @DeleteMapping("{id}")
    @ApiOperation(value = "사용자 정보 삭제")
    public void remove(@PathVariable String id) {
        service.remove(id);
    }
}
