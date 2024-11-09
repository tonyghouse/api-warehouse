package com.ghouse.apiwarehouse.project5010.controller;

import com.ghouse.apiwarehouse.project5010.dto.SectionInfoDto;
import com.ghouse.apiwarehouse.project5010.service.SectionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/project5010")
public class SectionController {

    private static final Logger log = LoggerFactory.getLogger(SectionController.class);

    @Autowired
    private SectionService sectionService;

    @GetMapping(value = "/sections", produces = "application/json")
    public ResponseEntity<List<SectionInfoDto>> getSections() {
        List<SectionInfoDto> results = sectionService.getSections();
        return new ResponseEntity<>(results, HttpStatus.OK);
    }

}
