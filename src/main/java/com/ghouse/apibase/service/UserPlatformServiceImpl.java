package com.ghouse.apibase.service;

import com.ghouse.apibase.entity.UserPlatform;
import com.ghouse.apibase.repo.UserPlatformRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserPlatformServiceImpl implements UserPlatformService {

	Logger log = LoggerFactory.getLogger(UserPlatformServiceImpl.class);

	@Autowired
	private UserPlatformRepo userPlatformRepo;


	@Override
	public List<UserPlatform> getUserPlatformsByUserId(String userId) {
		return userPlatformRepo.findByUserId(userId);
	}
}
