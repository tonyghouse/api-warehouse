package com.ghouse.apiwarehouse.project5010.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TestCaseDto {

    @JsonProperty("input")
    private String input;
    
    @JsonProperty("output")
    private String output;
}