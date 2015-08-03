package com;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.test.TestDao;


/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration 
@ContextConfiguration(locations ={"classpath:spring-mvc.xml"})
@Transactional
public class AppTest 
{
	
	
	@Autowired
	private TestDao testDao;
	
    @Test
    public void testDataBase(){
//		Map map=new HashMap();
//		mybatisBaseDao.queryForMap(map);
//    	System.out.println(mybatisBaseDao.queryForMap(map));
    	System.out.println(testDao.getListPage().getList());
    }

}
