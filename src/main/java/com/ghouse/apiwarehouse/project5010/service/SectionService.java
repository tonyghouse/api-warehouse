package com.ghouse.apiwarehouse.project5010.service;

import com.ghouse.apiwarehouse.project5010.dto.ProblemInfoDto;
import com.ghouse.apiwarehouse.project5010.dto.SectionInfoDto;
import com.ghouse.apiwarehouse.project5010.entity.Problem;
import com.ghouse.apiwarehouse.project5010.entity.Section;
import com.ghouse.apiwarehouse.project5010.repo.ProblemRepo;
import com.ghouse.apiwarehouse.project5010.repo.SectionRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

import static java.util.Collections.emptyList;
import static java.util.stream.Collectors.groupingBy;

@Service
public class SectionService{

	Logger log = LoggerFactory.getLogger(SectionService.class);

	@Autowired
	private SectionRepo sectionRepo;

	@Autowired
	private ProblemRepo problemRepo;


	public List<SectionInfoDto> getSections() {
		List<SectionInfoDto> sectionInfoDtoList = new ArrayList<>();
		List<Section> sections = sectionRepo.findAllByOrderBySortOrder();
		List<Problem> problems = problemRepo.findAll();
		Map<String, List<Problem>> problemsMap = problems.stream()
				.collect(groupingBy(Problem::getSectionId));


		for(Section section : sections){
			SectionInfoDto sectionInfoDto = new SectionInfoDto();
			sectionInfoDto.setSectionId(section.getSectionId());
			sectionInfoDto.setSectionName(section.getName());
			List<Problem> problemsRelated = problemsMap.getOrDefault(section.getSectionId(), emptyList());
			List<ProblemInfoDto> problemInfoDtos = mapToProblemInfos(problemsRelated);
			sectionInfoDto.setProblems(problemInfoDtos);
			sectionInfoDtoList.add(sectionInfoDto);
		}
		return sectionInfoDtoList;
	}

	private List<ProblemInfoDto> mapToProblemInfos(List<Problem> problems) {
		List<ProblemInfoDto> problemInfoDtos = new ArrayList<>();
		for(Problem problem : problems){
			ProblemInfoDto problemInfoDto = new ProblemInfoDto();
			problemInfoDto.setProblemId(problem.getProblemId());
			problemInfoDto.setProblemName(problem.getName());

			problemInfoDtos.add(problemInfoDto);
		}

		return problemInfoDtos;
	}
}
