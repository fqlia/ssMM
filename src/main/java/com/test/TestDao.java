package com.test;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.common.dao.HibernateBaseDao;
import com.common.page.Pagination;

@Repository
public class TestDao extends HibernateBaseDao<Yxcq>{
	
	public Pagination getListPage(){
		Pagination page=new Pagination(0,10,10);
		Criteria cri=createCriteria();
		return findListPage(cri, page);
	}

	
	public List<Yxcq> findAll(){
		Criteria cri=createCriteria();
		return findList(cri);
	}
}
