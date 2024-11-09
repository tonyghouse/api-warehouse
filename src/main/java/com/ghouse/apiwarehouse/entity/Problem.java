package com.ghouse.apiwarehouse.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "problem")
public class Problem {

	@Id
	@Column(name = "problem_id")
	private String problemId;

	@Column(name = "name")
	private String name;

	@Column(name = "sort_order")
	private Integer sortOrder;

	@ManyToOne
	@JoinColumn(name="section_id", nullable=false)
	private Section section;

}
