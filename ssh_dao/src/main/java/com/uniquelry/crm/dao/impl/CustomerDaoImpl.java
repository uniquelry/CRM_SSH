package com.uniquelry.crm.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.uniquelry.crm.dao.CustomerDao;
import com.uniquelry.crm.domain.Customer;

/**
 * @author uniquelry
 * @Date 2018年7月24日 下午3:30:23
 * @Description 
 */
public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

	@Override
	public List<Customer> findAll() {
		return (List<Customer>) this.getHibernateTemplate().find("from Customer");
	}

}
