package com.ghouse.apiwarehouse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
public class Problem {
	
	@JsonProperty("sectionId")
	private Integer sectionId;

	@JsonProperty("sectionName")
	private String sectionName;

	@JsonProperty("questions")
	private List<Problem> questions;

	

}
