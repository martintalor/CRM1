package com.chinasoft.dao;

import java.util.List;
import java.util.Map;

import com.chinasoft.entity.Product;

/**
 * ��ƷDao�ӿ�
 * @author Administrator
 *
 */
public interface ProductDao {

	/**
	 * ��ѯ��Ʒ
	 * @param map
	 * @return
	 */
	public List<Product> findProduct(Map<String,Object> map);
	
	/**
	 * ��ѯ��Ʒ��¼��
	 * @param map
	 * @return
	 */
	public Long getTotalProduct(Map<String,Object> map);
	
	
}
