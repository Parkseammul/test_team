package com.itwillbs.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itwillbs.domain.MemberDTO;
import com.itwillbs.service.MemberService;

@Controller
public class MemberController {
	
	@Inject
	private MemberService memberService;
	
	@RequestMapping(value = "/member/insert", method = RequestMethod.GET)
	public String insert() {
//		/WEB-INF/views/member/join.jsp  => 이동
		
		return "member/join";
	}
	
	@RequestMapping(value = "/member/insertPro", method = RequestMethod.POST)
	public String insertPro(MemberDTO memberDTO) {

		// 리턴할형 없음 insertMember(MemberDTO memberDTO) 메서드 정의
		// 메서드 호출
		memberService.insertMember(memberDTO);
		
		return "redirect:/member/login";
	}
	
	
	@RequestMapping(value = "/member/login", method = RequestMethod.GET)
	public String login() {
//		/WEB-INF/views/member/login.jsp  => 이동
		
		return "member/join";
	}
	
	
}
