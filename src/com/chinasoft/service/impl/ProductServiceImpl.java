package com.chinasoft.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chinasoft.dao.ProductDao;
import com.chinasoft.entity.Product;
import com.chinasoft.service.ProductService;

/**
 * 产品Service实现类
 * @author Administrator
 *
 */
@Service("productService")
public class ProductServiceImpl implements ProductService{

	@Resource
	private ProductDao productDao;
	
	@Override
	public List<Product> findProduct(Map<String, Object> map) {
		return productDao.findProduct(map);
	}

	@Override
	public Long getTotalProduct(Map<String, Object> map) {
		return productDao.getTotalProduct(map);
	}

	

}
