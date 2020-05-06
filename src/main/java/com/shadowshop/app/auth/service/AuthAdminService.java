package com.shadowshop.app.auth.service;

import com.shadowshop.app.dto.LoginAdminDTO;

public interface AuthAdminService {

	public LoginAdminDTO login(LoginAdminDTO dto);
	public boolean logout();
}
