package com.board.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.board.dao.MemberDAO;
import com.board.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Inject MemberDAO dao;
	//회원가입
	@Override
	public void register(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		dao.register(vo);
	}
	
	
}
