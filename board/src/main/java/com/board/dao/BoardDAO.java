package com.board.dao;

import java.util.List;

import com.board.vo.BoardVO;
import com.board.vo.Criteria;

public interface BoardDAO {
	//게시글 작성
	public void write(BoardVO vo) throws Exception;
	
	//게시물 목록 조회
	public List<BoardVO> list(Criteria cri) throws Exception;
	
	//게시물 총 갯수
	public int listCount() throws Exception;
	
	//게시물 조회
	public BoardVO read(int bno) throws Exception;
	
	//게시물 수정
	public void update(BoardVO vo) throws Exception;
	
	//게시물 삭제
	public void delete(int bno) throws Exception;
	
}
