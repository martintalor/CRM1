package com.chinasoft.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chinasoft.dao.OrderDetailsDao;
import com.chinasoft.entity.OrderDetails;
import com.chinasoft.service.OrderDetailsService;

/**
 * 订单详情Service实现类
 * @author Administrator
 *
 */
@Service("orderDetailsService")
public class OrderDetailsServiceImpl implements OrderDetailsService{

	@Resource
	private OrderDetailsDao orderDetailsDao;
	
	@Override
	public List<OrderDetails> findOrderDetails(Map<String, Object> map) {
		return orderDetailsDao.findOrderDetails(map);
	}

	@Override
	public Long getTotalOrderDetails(Map<String, Object> map) {
		return orderDetailsDao.getTotalOrderDetails(map);
	}

	@Override
	public float getTotalPriceByOrderId(int orderId) {
		return orderDetailsDao.getTotalPriceByOrderId(orderId);
	}

}
