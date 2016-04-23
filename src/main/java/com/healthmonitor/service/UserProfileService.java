package com.healthmonitor.service;

import java.util.List;

import com.healthmonitor.model.UserProfile;


public interface UserProfileService {

	UserProfile findById(int id);

	UserProfile findByType(String type);
	
	List<UserProfile> findAll();
	
}
