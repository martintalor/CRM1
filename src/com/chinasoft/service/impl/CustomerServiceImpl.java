package com.chinasoft.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chinasoft.dao.CustomerDao;
import com.chinasoft.dao.CustomerLossDao;
import com.chinasoft.dao.OrderDao;
import com.chinasoft.entity.Customer;
import com.chinasoft.entity.CustomerFw;
import com.chinasoft.entity.CustomerGc;
import com.chinasoft.entity.CustomerGx;
import com.chinasoft.entity.CustomerLoss;
import com.chinasoft.entity.Order;
import com.chinasoft.service.CustomerService;

/**
 * 客户Service实现类
 * @author Administrator
 *
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService{

	@Resource
	private CustomerDao customerDao;
	
	@Resource
	private CustomerLossDao customerLossDao;
	
	@Resource
	private OrderDao orderDao;
	
	@Override
	public List<Customer> findCustomer(Map<String, Object> map) {
		return customerDao.findCustomer(map);
	}

	@Override
	public Long getTotalCustomer(Map<String, Object> map) {
		return customerDao.getTotalCustomer(map);
	}

	@Override
	public int addCustomer(Customer customer) {
		return customerDao.addCustomer(customer);
	}

	@Override
	public int updateCustomer(Customer customer) {
		return customerDao.updateCustomer(customer);
	}

	@Override
	public int deleteCustomer(Integer id) {
		return customerDao.deleteCustomer(id);
	}

	@Override
	public Customer findById(Integer id) {
		return customerDao.findById(id);
	}

	@Override
	public void checkCustomerLoss() {
		List<Customer> customerList=customerDao.findLossCustomer(); // 查找流失客户
		for(Customer c:customerList){
			CustomerLoss customerLoss=new CustomerLoss(); // 定义客户流失实体
			customerLoss.setCusNo(c.getKhno()); // 客户编号
			customerLoss.setCusName(c.getName()); // 客户名称
			customerLoss.setCusManager(c.getCusManager()); // 客户经理
			Order order=orderDao.findLastByCusId(c.getId()); // 查找指定客户最近的订单
			customerLoss.setLastOrderTime(order.getOrderDate()); // 设置最近的下单时间
			customerLossDao.addCustomerLoss(customerLoss); // 添加到客户流失表
		}
	}

	@Override
	public List<CustomerGx> findCutomerGx(Map<String, Object> map) {
		return customerDao.findCutomerGx(map);
	}

	@Override
	public Long getTotalCustomerGx(Map<String, Object> map) {
		return customerDao.getTotalCustomerGx(map);
	}

	@Override
	public List<CustomerGc> findCustomerGc() {
		return customerDao.findCustomerGc();
	}

	@Override
	public List<CustomerFw> findCustomerFw() {
		return customerDao.findCustomerFw();
	}

}
