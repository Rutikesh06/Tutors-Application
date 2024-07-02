package com.cjc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Admin;
import com.cjc.repository.AdminRepository;

@Service
public class AdminServiceIMPL implements AdminService {
	@Autowired
	private AdminRepository arepo;

	@Override
	public Admin saveadmin(Admin admin) {

		return arepo.save(admin) ;
	}

}
