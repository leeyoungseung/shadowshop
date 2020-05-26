package com.shadowshop.app.daoimpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shadowshop.app.dao.MemberDAO;
import com.shadowshop.app.vo.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberDAOImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	
	private static String namespace = "com.shadowshop.mapper.MemberMapper";

	@Override
	public List<MemberVO> getMemberList() {
		logger.info("getMemberList Start");
		return sqlSession.selectList(namespace + ".memberList");
	}

	@Override
	public MemberVO getMemberOne(Integer no) {
		logger.info("getMemberOne Start");
		return sqlSession.selectOne(namespace + ".memberOne", no);
	}
	
	
	

}
