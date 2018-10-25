package com.uniquelry.crm.web;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.uniquelry.crm.domain.Customer;
import com.uniquelry.crm.service.CustomerService;

/**
 * @author uniquelry
 * @Date 2018年7月24日 下午4:32:03
 * @Description 
 */
public class CustomerAction extends ActionSupport{
	
	private CustomerService customerService;
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	@Override
	public String execute() throws Exception {
		List<Customer> list = customerService.findAll();
		System.out.println(list.size());
		
		ActionContext.getContext().put("list", list);
		return SUCCESS;
	}
}
