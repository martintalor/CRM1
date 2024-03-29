package com.chinasoft.quartz;

import com.chinasoft.service.CustomerService;

/**
 * 查找流失客户定时任务
 * @author Administrator
 *
 */
public class FindLossCustomerJob {

	private CustomerService customerService; // 客户Service
	
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	public void work() {  
		customerService.checkCustomerLoss();
    }  
}
