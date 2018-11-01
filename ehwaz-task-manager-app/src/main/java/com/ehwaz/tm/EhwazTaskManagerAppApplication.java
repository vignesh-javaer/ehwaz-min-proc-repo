package com.ehwaz.tm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.ehwaz.tm.bean.UserProfile;
import com.ehwaz.tm.service.UserProfileService;

/**
 * 
 * @author vignesh
 *
 */
@SpringBootApplication
@ComponentScan(basePackages="com.ehwaz")
public class EhwazTaskManagerAppApplication implements CommandLineRunner{
	
	@Autowired private UserProfileService userProfile;

	public static void main(String[] args) {
		SpringApplication.run(EhwazTaskManagerAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		List<UserProfile> allUserInfo = userProfile.getAllUserInfo();
		allUserInfo.forEach(users -> {
			System.out.println(users.toString());
		});
		
		
		
	}
}
