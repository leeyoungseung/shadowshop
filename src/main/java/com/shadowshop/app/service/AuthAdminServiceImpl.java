package com.shadowshop.app.service;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.shadowshop.app.auth.service.AuthAdminService;
import com.shadowshop.app.dto.LoginAdminDTO;

@Service
public class AuthAdminServiceImpl implements AuthAdminService {

	private static final Logger logger = LoggerFactory.getLogger(AuthAdminServiceImpl.class);
	
	@Override
	public LoginAdminDTO login(LoginAdminDTO dto) {
		dto.setLastLoginTime(new Date());
		return dto;
	}

	@Override
	public boolean logout() {
		// TODO Auto-generated method stub
		return false;
	}

}
