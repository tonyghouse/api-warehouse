package com.ghouse.apiwarehouse.service;

import com.ghouse.apiwarehouse.dto.ProblemInfoDto;
import com.ghouse.apiwarehouse.dto.SectionInfoDto;
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


	public List<SectionInfoDto> getSections() {
		List<SectionInfoDto> sectionInfoDtoList = new ArrayList<>();
		List<Section> sectionEntities = sectionRepo.findAll();

		for(Section section : sectionEntities){
			SectionInfoDto sectionInfoDto = new SectionInfoDto();
			sectionInfoDto.setSectionId(section.getSectionId());
			sectionInfoDto.setSectionName(section.getName());
			List<Problem> problems = section.getProblems();
			List<ProblemInfoDto> problemInfoDtos = mapToProblemInfos(problems);
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
