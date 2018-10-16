package com.springbook.biz.board.impl;

import java.util.List;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;

public class BoardServiceImpl implements BoardService{

	 private BoardDAO boardDAO; 
	   
	 public void setBoardDAO(BoardDAO boardDAO) {
		 this.boardDAO = boardDAO;
	 }
	 
	   public void insertBoard(BoardVO vo);
	    void updateBoard(BoardVO vo); 
	    void deleteBoard(BoardVO vo);
	    BoardVO getBoard(BoardVO vo);
	    List<BoardVO> getBoardList(BoardVO vo); 

}
