package com.common.dao;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.common.page.Pagination;
import com.common.utils.GenericsUtils;

@Repository
public class HibernateBaseDao<T> extends HibernateDaoSupport {

	@SuppressWarnings("unchecked")
	protected Class<T> entityClass = GenericsUtils.getSuperClassGenricType(this.getClass());  
	
	@Resource  
    public void setSessionFacotry(SessionFactory sessionFacotry) {  
        super.setSessionFactory(sessionFacotry);  
    } 
	
	public Session getCurrSession() {
		return getHibernateTemplate().getSessionFactory().getCurrentSession();
	}

	public Criteria createCriteria(){
		return getCurrSession().createCriteria(entityClass);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> findList(Criteria dc) {
		return dc.list();
	}

	public Pagination findListPage(Criteria dc,Pagination page){
		dc.setFirstResult(page.getFirstResult());
		dc.setMaxResults(page.getPageSize());
		if(page.getOrder()!=null)
		 dc.addOrder(page.getOrder());
		page.setList(dc.list());
		return page;
	}
	
	public T get(Serializable id, T entity) {
		return (T) getHibernateTemplate().get(entityClass, id);
	}

	public void delete(T entity) {
		getHibernateTemplate().delete(entity);
	}

	public void save(T entity) {
		getHibernateTemplate().saveOrUpdate(entity);
	}
}
