package com.board.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.board.vo.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO{
	
	@Inject SqlSession sql;
	//회원가입
	@Override
	public void register(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		sql.insert("memberMapper.register", vo);
	}
	//로그인
	@Override
	public MemberVO login(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		return sql.selectOne("memberMapper.login", vo);
	}
	//회원정보 수정
	@Override
	public void memberUpdate(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		sql.update("memberMapper.memberUpdate", vo);
	}
	//회원탈퇴
	@Override
	public void memberDelete(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		sql.delete("memberMapper.memberDelete",vo);
	}
	//패스워드 체크
	@Override
	public int passChk(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		int result = sql.selectOne("memberMapper.passChk", vo);
		return result;
	}
	@Override
	public int idChk(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		int result = sql.selectOne("memberMapper.idChk",vo);
		return result;
	}

}
