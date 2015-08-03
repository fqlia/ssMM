package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.TestDao;
import com.test.Yxcq;

@Service
@Transactional(readOnly=false)
public class TestService {

	@Autowired
	private TestDao testDao;
	
	public List<Yxcq> findAll(){
		return testDao.findAll();
	}
}
