/**
 * 
 */
package com.ehwaz.tm.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ehwaz.tm.bean.UserProfile;
import com.ehwaz.tm.dao.UserProfileDao;

/**
 * @author vignesh
 *
 */
@Repository
@Transactional
public class UserProfileService {
	
	@Autowired private UserProfileDao userProfile;
	
	public List<UserProfile> getAllUserInfo() {
		List<UserProfile> userList = new ArrayList<>();
		Iterable<UserProfile> userProfiles = userProfile.findAll();
		userProfiles.forEach(users -> {
			userList.add(users);
		});
		return userList;
	}

}
