package com.uniquelry.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.uniquelry.crm.dao.CustomerDao;
import com.uniquelry.crm.domain.Customer;

/**
 * @author uniquelry
 * @Date 2018年7月24日 下午3:36:17
 * @Description 
 */
public class CustomerTest {
	@Test
	public void testFindAll() {
		ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext-dao.xml");
		CustomerDao customerDao=(CustomerDao) ac.getBean("customerDao");
		
		List<Customer> list = customerDao.findAll();
		System.out.println(list.size());
	}
}
