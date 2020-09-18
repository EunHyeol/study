package com.board.dao;

import com.board.vo.MemberVO;

public interface MemberDAO {
	//회원가입
	public void register(MemberVO vo) throws Exception;
}
