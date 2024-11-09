package com.ghouse.apiwarehouse.service;

import com.ghouse.apiwarehouse.dto.SectionInfo;
import com.ghouse.apiwarehouse.entity.Section;

import java.util.List;

public interface SectionService {

	List<SectionInfo> getSections();
}
