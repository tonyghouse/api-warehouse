package com.ghouse.apiwarehouse.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "solution")
public class Solution {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "solution_id")
    private Integer solutionId;

	@Column(name = "problem_id")
	private String problemId;

    @Column(name = "video_link")
    private String videoLink;

    @Column(name = "video_id")
    private String videoId;

    @Column(name = "explanation")
    private String explanation;

    @Column(name = "intuition")
    private String intuition;

    @Column(name = "notes")
    private String notes;

}
