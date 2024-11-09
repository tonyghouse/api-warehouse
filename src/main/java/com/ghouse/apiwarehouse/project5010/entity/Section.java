package com.ghouse.apiwarehouse.project5010.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "section")
public class Section {

	@Id
	@Column(name = "section_id")
	private String sectionId;

	@Column(name = "name")
	private String name;

	@Column(name = "sort_order")
	private Integer sortOrder;

	@OneToMany(mappedBy="section", fetch = FetchType.LAZY)
	private List<Problem> problems;

}
