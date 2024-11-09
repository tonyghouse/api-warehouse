package com.ghouse.apiwarehouse.project5010.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "test_case")
public class TestCase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "test_case_id")
    private Integer testCaseId;

	@Column(name = "problem_id")
	private String problemId;

    @Column(name = "input")
    private String input;

    @Column(name = "output")
    private String output;
}
