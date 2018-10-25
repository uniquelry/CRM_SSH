package com.uniquelry.crm.service;
/**
 * @author uniquelry
 * @Date 2018年7月24日 下午4:07:04
 * @Description Customer的业务层的接口
 */

import java.util.List;

import com.uniquelry.crm.domain.Customer;

public interface CustomerService {
	/**
	 * 查询所有客户列表
	 * @return
	 */
	public List<Customer> findAll();
}
