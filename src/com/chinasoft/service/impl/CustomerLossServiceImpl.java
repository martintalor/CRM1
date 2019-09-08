package com.chinasoft.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chinasoft.dao.CustomerLossDao;
import com.chinasoft.entity.CustomerLoss;
import com.chinasoft.service.CustomerLossService;

/**
 * 客户流失Service实现类
 * @author Administrator
 *
 */
@Service("customerLossService")
public class CustomerLossServiceImpl implements CustomerLossService{
	
	@Resource
	private CustomerLossDao customerLossDao;

	@Override
	public List<CustomerLoss> findCustomerLoss(Map<String, Object> map) {
		return customerLossDao.findCustomerLoss(map);
	}

	@Override
	public Long getTotalCutomerLoss(Map<String, Object> map) {
		return customerLossDao.getTotalCutomerLoss(map);
	}

	@Override
	public CustomerLoss findById(Integer id) {
		return customerLossDao.findById(id);
	}

	@Override
	public int updateCustomerLoss(CustomerLoss customerLoss) {
		return customerLossDao.updateCustomerLoss(customerLoss);
	}
	

}
