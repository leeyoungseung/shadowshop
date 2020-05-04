package com.shadowshop.app.auth.service;

import com.shadowshop.app.dto.AdminLoginDTO;

public interface AuthAdminService {

	public AdminLoginDTO login(AdminLoginDTO dto);
	public boolean logout();
}
