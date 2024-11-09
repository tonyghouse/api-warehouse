package com.ghouse.apiwarehouse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CodeSolutionDto {
    
    @JsonProperty("language")
    private String language;
    
    @JsonProperty("code")
    private String code;
}