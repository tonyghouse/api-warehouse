package com.ghouse.apiwarehouse.project5010.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SectionInfoDto {
	
	@JsonProperty("sectionId")
	private String sectionId;

	@JsonProperty("sectionName")
	private String sectionName;

	@JsonProperty("problems")
	private List<ProblemInfoDto> problems;

	

}
