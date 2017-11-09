package com.userskill.model;

import java.util.List;

public interface UserSkillDAO_interface {
	public void insert(UserSkillVO userSkillVO);
	public void delete(String mem_no, String skill_No);
	public void update(UserSkillVO userSkillVO);
	public UserSkillVO findByPrimaryKey(String mem_no, String skill_No);
	public List<UserSkillVO> getall();
}