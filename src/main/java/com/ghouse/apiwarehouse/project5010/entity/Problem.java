package com.ghouse.apiwarehouse.project5010.entity;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.*;

import javax.persistence.*;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
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

	@Column(name = "description")
	private String description;

	@Column(name = "difficulty")
	private String difficulty;

	@Column(name = "tags", columnDefinition = "jsonb")
	@JdbcTypeCode(SqlTypes.JSON)
	private JsonNode tags;

	@Column(name = "sort_order")
	private Integer sortOrder;

	@ManyToOne
	@JoinColumn(name="section_id", nullable=false)
	private Section section;

	@Transient
	private String sectionId;

	public String getSectionId() {
		return section != null ? section.getSectionId() : null;
	}

}
