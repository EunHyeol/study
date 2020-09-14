package com.board.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.board.vo.BoardVO;
import com.board.vo.Criteria;

@Repository
public class BoardDAOImpl implements BoardDAO{
	@Inject
	private SqlSession sqlSession;
	//게시글작성
	@Override
	public void write(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.insert("boardMapper.insert", vo);
	}
	//게시글 목록
	/*@Override
	public List<BoardVO> list() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList("boardMapper.list");
	}*/
	//게시물 목록 조회
	@Override
	public List<BoardVO> list(Criteria cri) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList("boardMapper.listPage",cri);
	}
	//게시물 총 갯수
	@Override
	public int listCount() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("boardMapper.listCount");
	}
	//게시글 조회
	@Override
	public BoardVO read(int bno) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("boardMapper.read",bno);
	}
	//게시물 수정
	@Override
	public void update(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.update("boardMapper.update",vo);
	}
	//게시물 삭제
	@Override
	public void delete(int bno) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.delete("boardMapper.delete",bno);
	}
	
}
