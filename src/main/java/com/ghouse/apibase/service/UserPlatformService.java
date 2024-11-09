package com.ghouse.apibase.service;

import com.ghouse.apibase.entity.UserPlatform;

import java.util.List;

public interface UserPlatformService {

	List<UserPlatform> getUserPlatformsByUserId(String userId);
}
