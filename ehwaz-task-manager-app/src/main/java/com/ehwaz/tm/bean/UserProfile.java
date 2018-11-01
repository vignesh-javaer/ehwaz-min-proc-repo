package com.ehwaz.tm.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Entity
@Table(name="user_profiles")
@Data
@ToString
public class UserProfile {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private Long userId;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="user_dept")
	private String userDept;
	
	@Column(name="user_dsgn")
	private String userDesg;
	
	@Column(name="user_assigne")
	private String userAssigne;
	
	@Column(name="user_last_upated")
	private String lastUpdated;
	
	

}
