package com.ghouse.apiwarehouse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProblemDetails {
	
	@JsonProperty("problemId")
	private String problemId;

	@JsonProperty("problemName")
	private String problemName;

	@JsonProperty("sectionName")
	private String sectionName;


}
