package com.ghouse.apiwarehouse.project5010.controller;

import com.ghouse.apiwarehouse.project5010.dto.ProblemDetailsDto;
import com.ghouse.apiwarehouse.project5010.service.ProblemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project5010")
public class ProblemController {

    private static final Logger log = LoggerFactory.getLogger(ProblemController.class);

    @Autowired
    private ProblemService problemService;

    @GetMapping(value = "/problem/{problemId}", produces = "application/json")
    public ResponseEntity<ProblemDetailsDto> getProblemInfoById(@PathVariable String problemId) {
        ProblemDetailsDto result = problemService.getProblemInfoById(problemId);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
