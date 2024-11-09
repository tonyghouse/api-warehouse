package com.ghouse.apiwarehouse.service;

import com.ghouse.apiwarehouse.dto.ProblemDetails;
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
import java.util.Optional;

@Service
public class ProblemService {

	Logger log = LoggerFactory.getLogger(ProblemService.class);

	@Autowired
	private SectionRepo sectionRepo;

	@Autowired
	private ProblemRepo problemRepo;


	public ProblemDetails getProblemInfoById(String problemId) {
		Optional<Problem> problemOpt = problemRepo.findById(problemId);
		if(problemOpt.isEmpty()){
			return null;
		}

		Problem problem = problemOpt.get();
		String sectionName = problem.getSection().getName();
		ProblemDetails problemDetails = new ProblemDetails();
		problemDetails.setProblemId(problemId);
		problemDetails.setProblemName(problem.getName());
		problemDetails.setSectionName(sectionName);
		return problemDetails;
	}
}
