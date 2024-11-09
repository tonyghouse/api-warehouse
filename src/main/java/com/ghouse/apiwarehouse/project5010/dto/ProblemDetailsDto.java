package com.ghouse.apiwarehouse.project5010.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.Data;

import java.util.List;

@Data
public class ProblemDetailsDto {

    @JsonProperty("problemId")
    private String problemId;

    @JsonProperty("problemName")
    private String problemName;

    @JsonProperty("sectionName")
    private String sectionName;

    @JsonProperty("description")
    private String description;

    @JsonProperty("difficulty")
    private String difficulty;

    @JsonProperty("tags")
    private JsonNode tags;

    @JsonProperty("testCases")
    private List<TestCaseDto> testCaseDtos;

    @JsonProperty("videoLink")
    private String videoLink;

    @JsonProperty("videoId")
    private String videoId;

    @JsonProperty("explanation")
    private String explanation;

    @JsonProperty("intuition")
    private String intuition;

    @JsonProperty("notes")
    private String notes;

    @JsonProperty("solutions")
    private List<CodeSolutionDto> codeSolutionDtos;


}