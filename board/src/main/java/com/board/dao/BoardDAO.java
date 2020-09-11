package com.board.dao;

import java.util.List;

import com.board.vo.BoardVO;

public interface BoardDAO {
	//게시글 작성
	public void write(BoardVO vo) throws Exception;
	
	//게시물 목록 조회
	public List<BoardVO> list() throws Exception;
	
}
