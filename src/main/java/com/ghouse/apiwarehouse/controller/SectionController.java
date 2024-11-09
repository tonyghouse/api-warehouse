package com.ghouse.apiwarehouse.controller;

import com.ghouse.apiwarehouse.dto.SectionInfoDto;
import com.ghouse.apiwarehouse.service.SectionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
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
