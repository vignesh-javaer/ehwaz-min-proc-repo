package com.ehwaz.tm.bean;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class UserProfile {
	
	private Long userId;
	private String userName;
	private String userDept;
	private String userDesg;
	private String userAssigne;
	private String lastUpdated;

}
