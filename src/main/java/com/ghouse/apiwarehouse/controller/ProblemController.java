package com.ghouse.apiwarehouse.controller;

import com.ghouse.apiwarehouse.dto.ProblemDetails;
import com.ghouse.apiwarehouse.dto.ProblemInfo;
import com.ghouse.apiwarehouse.dto.SectionInfo;
import com.ghouse.apiwarehouse.service.ProblemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProblemController {

    private static final Logger log = LoggerFactory.getLogger(ProblemController.class);

    @Autowired
    private ProblemService problemService;

    @GetMapping(value = "/problem/{problemId}", produces = "application/json")
    public ResponseEntity<ProblemDetails> getProblemInfoById(@PathVariable String problemId) {
        ProblemDetails result = problemService.getProblemInfoById(problemId);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}