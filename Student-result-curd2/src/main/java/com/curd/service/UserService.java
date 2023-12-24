package com.curd.service;

import java.util.List;

import com.curd.Entity.Student;

public interface UserService {
	
	public Student saveStudent(Student student);


	public Student updateStudent(Student student);

	

	public void deleteStudent(int sid);



	public Student getStudent(int sid);


	public List<Student> getAllStudent();

}
