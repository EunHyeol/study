package com.board.service;

import com.board.vo.BoardVO;

public interface BoardService {
	//게시글 작성
	public void write(BoardVO vo) throws Exception;
	
}
