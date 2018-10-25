package com.uniquelry.crm.service.impl;

import java.util.List;

import com.uniquelry.crm.dao.CustomerDao;
import com.uniquelry.crm.domain.Customer;
import com.uniquelry.crm.service.CustomerService;

/**
 * @author uniquelry
 * @Date 2018年7月24日 下午4:15:36
 * @Description Customer的业务层的实现类
 */
public class CustomerServiceImpl implements CustomerService {
	
	//注值
	private CustomerDao customerDao;
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public List<Customer> findAll() {
		return customerDao.findAll();
	}

}
