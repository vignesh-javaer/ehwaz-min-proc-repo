package com.ehwaz.tm.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.ehwaz.tm.bean.UserProfile;

@Component
public interface UserProfileDao extends CrudRepository<UserProfile, Long>  {

}
