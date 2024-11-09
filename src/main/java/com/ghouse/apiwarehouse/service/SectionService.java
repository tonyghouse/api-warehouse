package com.ghouse.apiwarehouse.service;

import com.ghouse.apiwarehouse.dto.ProblemInfo;
import com.ghouse.apiwarehouse.dto.SectionInfo;
import com.ghouse.apiwarehouse.entity.Problem;
import com.ghouse.apiwarehouse.entity.Section;
import com.ghouse.apiwarehouse.repo.ProblemRepo;
import com.ghouse.apiwarehouse.repo.SectionRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.groupingBy;

@Service
public class SectionService{

	Logger log = LoggerFactory.getLogger(SectionService.class);

	@Autowired
	private SectionRepo sectionRepo;

	@Autowired
	private ProblemRepo problemRepo;


	public List<SectionInfo> getSections() {
		List<SectionInfo> sectionInfoList = new ArrayList<>();
		List<Section> sections = sectionRepo.findAll();

		for(Section section : sections){
			SectionInfo sectionInfo = new SectionInfo();
			sectionInfo.setSectionId(section.getSectionId());
			sectionInfo.setSectionName(section.getName());
			List<Problem> problems = section.getProblems();
			List<ProblemInfo> problemInfos = mapToProblemInfos(problems);
			sectionInfo.setProblems(problemInfos);
			sectionInfoList.add(sectionInfo);
		}
		return sectionInfoList;
	}

	private List<ProblemInfo> mapToProblemInfos(List<Problem> problems) {
		List<ProblemInfo> problemInfos = new ArrayList<>();
		for(Problem problem : problems){
			ProblemInfo problemInfo = new ProblemInfo();
			problemInfo.setProblemId(problem.getProblemId());
			problemInfo.setProblemName(problem.getName());

			problemInfos.add(problemInfo);
		}

		return problemInfos;
	}
}
