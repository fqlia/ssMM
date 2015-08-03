package com.common.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MybatisBaseDao extends SqlSessionDaoSupport {

	@Resource
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	// sqlSessionTemplate
	public List<Map<String, Object>> queryForMap(Map<String, Object> map) {
		return getSqlSession().selectList("common.myTest");
	}

}
