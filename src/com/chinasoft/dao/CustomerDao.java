package com.chinasoft.dao;

import java.util.List;
import java.util.Map;

import com.chinasoft.entity.Customer;
import com.chinasoft.entity.CustomerFw;
import com.chinasoft.entity.CustomerGc;
import com.chinasoft.entity.CustomerGx;

/**
 * �ͻ�Dao�ӿ�
 * @author Administrator
 *
 */
public interface CustomerDao {

	/**
	 * ��ѯ�ͻ�
	 * @param map
	 * @return
	 */
	public List<Customer> findCustomer(Map<String,Object> map);
	
	/**
	 * ��ѯ�ͻ���¼��
	 * @param map
	 * @return
	 */
	public Long getTotalCustomer(Map<String,Object> map);
	
	/**
	 * ��ӿͻ�
	 * @param customer
	 * @return
	 */
	public int addCustomer(Customer customer);
	
	/**
	 * �޸Ŀͻ�
	 * @param customer
	 * @return
	 */
	public int updateCustomer(Customer customer);
	
	/**
	 * ɾ���ͻ�
	 * @param id
	 * @return
	 */
	public int deleteCustomer(Integer id);
	
	/**
	 * ͨ��Id����ʵ��
	 * @param id
	 * @return
	 */
	public Customer findById(Integer id);
	
	/**
	 * ������ʧ�Ŀͻ� 6����δ�µ��Ŀͻ�
	 * @return
	 */
	public List<Customer> findLossCustomer();
	
	/**
	 * ��ѯ�ͻ�����
	 * @param map
	 * @return
	 */
	public List<CustomerGx> findCutomerGx(Map<String,Object> map);
	
	/**
	 * ��ѯ�ͻ����׼�¼��
	 * @param map
	 * @return
	 */
	public Long getTotalCustomerGx(Map<String,Object> map);
	
	/**
	 * ��ѯ�ͻ�����
	 * @return
	 */
	public List<CustomerGc> findCustomerGc();
	
	/**
	 * ��ѯ�ͻ��������
	 * @return
	 */
	public List<CustomerFw> findCustomerFw();
}
