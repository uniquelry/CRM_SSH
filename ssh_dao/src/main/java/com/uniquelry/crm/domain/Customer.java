package com.uniquelry.crm.domain;

import java.io.Serializable;

/**
 * @author uniquelry
 * @Date 2018年7月24日 下午1:22:11
 * @Description 
 * po的规范（Persistent Object持久化对象）
 * 1.公有类
 * 2.私有属性
 * 3.公有的getter与setter
 * 4.不能使用final修饰
 * 5.提供默认无参构造
 * 6.如果是基本类型，就写它对应的包装类
 * 7.一般要实现java.io.Serializable接口
 */
public class Customer implements Serializable {
	
	private Long custId;
	private String custName;
	private String custSource;
	private String custIndustry;
	
	private String custLevel;
	private String custPhone;
	private String custMobile;
	public Long getCustId() {
		return custId;
	}
	public void setCustId(Long custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustSource() {
		return custSource;
	}
	public void setCustSource(String custSource) {
		this.custSource = custSource;
	}
	public String getCustIndustry() {
		return custIndustry;
	}
	public void setCustIndustry(String custIndustry) {
		this.custIndustry = custIndustry;
	}
	public String getCustLevel() {
		return custLevel;
	}
	public void setCustLevel(String custLevel) {
		this.custLevel = custLevel;
	}
	public String getCustPhone() {
		return custPhone;
	}
	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}
	public String getCustMobile() {
		return custMobile;
	}
	public void setCustMobile(String custMobile) {
		this.custMobile = custMobile;
	}
	
}
