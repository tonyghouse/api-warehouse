package com.ghouse.apiwarehouse.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "code_solution")
public class CodeSolution {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "code_solution_id")
	private Integer codeSolutionId;

	@Column(name = "problem_id")
	private String problemId;

	@Column(name ="language")
	private String language;

	@Column(name ="code")
	private String code;

}
