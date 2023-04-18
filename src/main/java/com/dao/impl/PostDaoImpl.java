package com.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dao.PostDao;

@Repository
public class PostDaoImpl implements PostDao {
	
	@Autowired
	SqlSession session;
	
	String map = "Post";

}
