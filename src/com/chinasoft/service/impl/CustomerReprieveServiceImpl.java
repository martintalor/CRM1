package com.chinasoft.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chinasoft.dao.CustomerReprieveDao;
import com.chinasoft.entity.CustomerReprieve;
import com.chinasoft.service.CustomerReprieveService;

/**
 * �ͻ���ʧ�ݻ���ʩService�ӿ�ʵ����
 * @author Administrator
 *
 */
@Service("customerReprieveService")
public class CustomerReprieveServiceImpl implements CustomerReprieveService{

	@Resource
	private CustomerReprieveDao customerReprieveDao;
	
	@Override
	public List<CustomerReprieve> findCustomerReprieve(Map<String, Object> map) {
		return customerReprieveDao.findCustomerReprieve(map);
	}

	@Override
	public Long getTotalCustomerReprieve(Map<String, Object> map) {
		return customerReprieveDao.getTotalCustomerReprieve(map);
	}

	@Override
	public int addCustomerReprieve(CustomerReprieve customerReprieve) {
		return customerReprieveDao.addCustomerReprieve(customerReprieve);
	}

	@Override
	public int updateCustomerReprieve(CustomerReprieve customerReprieve) {
		return customerReprieveDao.updateCustomerReprieve(customerReprieve);
	}

	@Override
	public int deleteCustomerReprieve(Integer id) {
		return customerReprieveDao.deleteCustomerReprieve(id);
	}

}
