package com.chinasoft.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chinasoft.dao.LinkManDao;
import com.chinasoft.entity.LinkMan;
import com.chinasoft.service.LinkManService;

/**
 * 联系人Service实现类
 * @author Administrator
 *
 */
@Service("linkManService")
public class LinkManServiceImpl implements LinkManService{

	@Resource
	private LinkManDao linkManDao;
	
	@Override
	public List<LinkMan> findLinkMan(Map<String, Object> map) {
		return linkManDao.findLinkMan(map);
	}

	@Override
	public Long getTotalLinkMan(Map<String, Object> map) {
		return linkManDao.getTotalLinkMan(map);
	}

	@Override
	public int addLinkMan(LinkMan cusDevPlan) {
		return linkManDao.addLinkMan(cusDevPlan);
	}

	@Override
	public int updateLinkMan(LinkMan cusDevPlan) {
		return linkManDao.updateLinkMan(cusDevPlan);
	}

	@Override
	public int deleteLinkMan(Integer id) {
		return linkManDao.deleteLinkMan(id);
	}

	@Override
	public LinkMan findById(Integer id) {
		return linkManDao.findById(id);
	}

}
