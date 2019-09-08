package com.chinasoft.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chinasoft.dao.CusDevPlanDao;
import com.chinasoft.entity.CusDevPlan;
import com.chinasoft.service.CusDevPlanService;

/**
 * 客户开发计划Service实现类
 * @author Administrator
 *
 */
@Service("cusDevPlanService")
public class CusDevPlanServiceImpl implements CusDevPlanService{

	@Resource
	private CusDevPlanDao cusDevPlanDao;
	
	@Override
	public List<CusDevPlan> findCusDevPlan(Map<String, Object> map) {
		return cusDevPlanDao.findCusDevPlan(map);
	}

	@Override
	public Long getTotalCusDevPlan(Map<String, Object> map) {
		return cusDevPlanDao.getTotalCusDevPlan(map);
	}

	@Override
	public int addCusDevPlan(CusDevPlan cusDevPlan) {
		return cusDevPlanDao.addCusDevPlan(cusDevPlan);
	}

	@Override
	public int updateCusDevPlan(CusDevPlan cusDevPlan) {
		return cusDevPlanDao.updateCusDevPlan(cusDevPlan);
	}

	@Override
	public int deleteCusDevPlan(Integer id) {
		return cusDevPlanDao.deleteCusDevPlan(id);
	}

	@Override
	public CusDevPlan findById(Integer id) {
		return cusDevPlanDao.findById(id);
	}

}
