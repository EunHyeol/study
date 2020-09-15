package com.board.service;

import java.util.List;

import com.board.vo.ReplyVO;

public interface ReplyService {

	public List<ReplyVO> readReply(int bno) throws Exception;
	
}
