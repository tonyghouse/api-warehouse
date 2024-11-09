package com.ghouse.apiwarehouse.project5010.service;

import com.ghouse.apiwarehouse.project5010.dto.CodeSolutionDto;
import com.ghouse.apiwarehouse.project5010.dto.ProblemDetailsDto;
import com.ghouse.apiwarehouse.project5010.dto.TestCaseDto;
import com.ghouse.apiwarehouse.project5010.entity.CodeSolution;
import com.ghouse.apiwarehouse.project5010.entity.Problem;
import com.ghouse.apiwarehouse.project5010.entity.Solution;
import com.ghouse.apiwarehouse.project5010.entity.TestCase;
import com.ghouse.apiwarehouse.project5010.repo.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ProblemService {

	Logger log = LoggerFactory.getLogger(ProblemService.class);

	@Autowired
	private SectionRepo sectionRepo;

	@Autowired
	private ProblemRepo problemRepo;

	@Autowired
	private SolutionRepo solutionRepo;

	@Autowired
	private CodeSolutionRepo codeSolutionRepo;

	@Autowired
	private TestCaseRepo testCaseRepo;

	public ProblemDetailsDto getProblemInfoById(String problemId) {
		Optional<Problem> problemOpt = problemRepo.findById(problemId);
		if(problemOpt.isEmpty()){
			return null;
		}

		Problem problem = problemOpt.get();
		String sectionName = problem.getSection().getName();


		ProblemDetailsDto problemDetailsDto = new ProblemDetailsDto();
		problemDetailsDto.setProblemId(problemId);
		problemDetailsDto.setProblemName(problem.getName());
		problemDetailsDto.setSectionName(sectionName);
		problemDetailsDto.setDescription(problem.getDescription());
		problemDetailsDto.setDifficulty(problem.getDifficulty());
		problemDetailsDto.setTags(problem.getTags());

		List<TestCase> testCaseEntities = testCaseRepo.findByProblemId(problem.getProblemId());
		List<TestCaseDto> testCaseDtos = new ArrayList<>();
		for(TestCase testCase : testCaseEntities){
			TestCaseDto testCaseDto = new TestCaseDto();
			testCaseDto.setInput(testCase.getInput());
			testCaseDto.setOutput(testCase.getOutput());
			testCaseDtos.add(testCaseDto);
		}
		problemDetailsDto.setTestCaseDtos(testCaseDtos);

		List<Solution> solutionEntities = solutionRepo.findByProblemId(problem.getProblemId());
		if(!solutionEntities.isEmpty()){
			Solution solution = solutionEntities.get(0);
			problemDetailsDto.setVideoLink(solution.getVideoLink());
			problemDetailsDto.setVideoId(solution.getVideoId());
			problemDetailsDto.setExplanation(solution.getExplanation());
			problemDetailsDto.setIntuition(solution.getIntuition());
			problemDetailsDto.setNotes(solution.getNotes());
		}


		List<CodeSolution> codeSolutionEntities = codeSolutionRepo.findByProblemId(problem.getProblemId());
		List<CodeSolutionDto> codeSolutionDtos = new ArrayList<>();
		for(CodeSolution codeSolution : codeSolutionEntities) {
			CodeSolutionDto codeSolutionDto = new CodeSolutionDto();
			codeSolutionDto.setLanguage(codeSolution.getLanguage());
			codeSolutionDto.setCode(codeSolution.getCode());
			codeSolutionDtos.add(codeSolutionDto);

		}
		problemDetailsDto.setCodeSolutionDtos(codeSolutionDtos);
		return problemDetailsDto;
	}
}
