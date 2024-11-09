package com.ghouse.apiwarehouse.service;

import com.ghouse.apiwarehouse.entity.Section;
import com.ghouse.apiwarehouse.repo.UserPlatformRepo;
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
	public List<Section> getUserPlatformsByUserId(String userId) {
		return userPlatformRepo.findByUserId(userId);
	}
}
