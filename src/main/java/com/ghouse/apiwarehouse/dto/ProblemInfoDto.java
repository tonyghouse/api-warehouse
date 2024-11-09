package com.ghouse.apiwarehouse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProblemInfoDto {
	
	@JsonProperty("problemId")
	private String problemId;

	@JsonProperty("problemName")
	private String problemName;
	

}
