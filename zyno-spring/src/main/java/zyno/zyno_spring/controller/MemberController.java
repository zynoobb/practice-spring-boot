package zyno.zyno_spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import zyno.zyno_spring.service.MemberService;

@Controller
public class MemberController {
    private final MemberService memberService;

    @Autowired // DI 생성자 주입
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
