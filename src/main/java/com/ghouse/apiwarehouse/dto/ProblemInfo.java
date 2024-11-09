package com.ghouse.apiwarehouse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProblemInfo {
	
	@JsonProperty("problemId")
	private String problemId;

	@JsonProperty("problemName")
	private String problemName;
	

}
