package com.ghouse.apiwarehouse.service;

import com.ghouse.apiwarehouse.entity.Section;

import java.util.List;

public interface UserPlatformService {

	List<Section> getUserPlatformsByUserId(String userId);
}
