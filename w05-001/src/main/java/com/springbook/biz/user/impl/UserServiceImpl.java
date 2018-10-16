package com.springbook.biz.user.impl;

import com.springbook.biz.user.UserService;
import com.springbook.biz.user.UserVO;

public class UserServiceImpl implements UserService{
        private UserDAO userDAO;
        
        public void setUserDAO(UserDAO userDAO) {
        	this.userDAO = userDAO; 
        }  // setter 의존성 주입을 위한 함수 
        
        public UserVO getUser(UserVO vo) {
        	return userDAO.getUser(vo);
        }
}
