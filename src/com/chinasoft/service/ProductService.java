package com.chinasoft.service;

import java.util.List;
import java.util.Map;

import com.chinasoft.entity.Product;

/**
 * ��ƷDao�ӿ�
 * @author Administrator
 *
 */
public interface ProductService {

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
