package com.healthmonitor.dao;

import java.util.List;

import com.healthmonitor.model.UserProfile;


public interface UserProfileDao {

	List<UserProfile> findAll();
	
	UserProfile findByType(String type);
	
	UserProfile findById(int id);
}
