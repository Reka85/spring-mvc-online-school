package com.onlineschool.demo.dao;

import com.onlineschool.demo.entity.Subject;

public interface SubjectDao {
	
	Subject getSubjectByName(String subjectName);
}
