package com.uniquelry.crm.dao;
/**
 * @author uniquelry
 * @Date 2018年7月24日 下午1:18:23
 * @Description Customer的Dao层的接口
 */

import java.util.List;

import com.uniquelry.crm.domain.Customer;

public interface CustomerDao {
	/**
	 * 查询出Customer表中的所有记录
	 * @return
	 */
	public List<Customer> findAll();
}
