package com.ghouse.apibase.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user_platform")
public class UserPlatform {

	@Id
	@GeneratedValue(generator = "user-platform-uuid")
	@GenericGenerator(name = "user-platform-uuid", strategy = "uuid")
	private String userPlatformId;
	
	private String userId;
	
	private String platform;

}
