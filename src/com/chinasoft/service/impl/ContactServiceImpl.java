package com.chinasoft.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chinasoft.dao.ContactDao;
import com.chinasoft.entity.Contact;
import com.chinasoft.service.ContactService;

/**
 * 联系人Service实现类
 * @author Administrator
 *
 */
@Service("contactService")
public class ContactServiceImpl implements ContactService{

	@Resource
	private ContactDao contactDao;
	
	@Override
	public List<Contact> findContact(Map<String, Object> map) {
		return contactDao.findContact(map);
	}

	@Override
	public Long getTotalContact(Map<String, Object> map) {
		return contactDao.getTotalContact(map);
	}

	@Override
	public int addContact(Contact contact) {
		return contactDao.addContact(contact);
	}

	@Override
	public int updateContact(Contact contact) {
		return contactDao.updateContact(contact);
	}

	@Override
	public int deleteContact(Integer id) {
		return contactDao.deleteContact(id);
	}

	@Override
	public Contact findById(Integer id) {
		return contactDao.findById(id);
	}

}
