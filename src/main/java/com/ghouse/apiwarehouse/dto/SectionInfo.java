package com.ghouse.apiwarehouse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SectionInfo {
	
	@JsonProperty("sectionId")
	private String sectionId;

	@JsonProperty("sectionName")
	private String sectionName;

	@JsonProperty("problems")
	private List<ProblemInfo> problems;

	

}
