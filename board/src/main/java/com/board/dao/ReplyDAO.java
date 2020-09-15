package com.board.dao;

import java.util.List;

import com.board.vo.ReplyVO;

public interface ReplyDAO {
	//댓글조회
	public List<ReplyVO> readReply(int bno) throws Exception;
	
}
