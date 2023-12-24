package com.curd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curd.Entity.Student;
import com.curd.Repos.UserRepo;

@Service
public class serviceImp implements UserService {
	@Autowired
	private UserRepo repo;

	@Override
	public Student saveStudent(Student student) {
		int tot=0;
		double p=0.0;
		String g=null, r=null;
		tot=student.getHibarnate()+student.getSpring()+student.getSpringBoot();
		p=tot/3;
		if(p>=70) {
			g="A grade";
		}else if(p>=60) {
			g="B grade";
		}else if(p>=50) {
			g="C grade";
		}
		else {
			g="D grade";
		}
		if(student.getHibarnate()>=35 && student.getSpring()>=35 && student.getSpringBoot()>=35) {
			r="Pass";
		}else {
			r="Fail";
		}
		student.setTotal(tot);
		student.setPercentage(p);
		student.setGrade(g);
		student.setResult(r);
		return repo.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		int tot=0;
		double p=0.0;
		String g=null, r=null;
		tot=student.getHibarnate()+student.getSpring()+student.getSpringBoot();
		p=tot/3;
		if(p>=70) {
			g="A grade";
		}else if(p>=60) {
			g="B grade";
		}else if(p>=50) {
			g="C grade";
		}
		if(student.getHibarnate()>=35 && student.getSpring()>=35 && student.getSpringBoot()>=35) {
			r="Pass";
		}else {
			r="Fail";
		}
		student.setTotal(tot);
		student.setPercentage(p);
		student.setGrade(g);
		student.setResult(r);
		return repo.save(student);
	}

	@Override
	public void deleteStudent(int id) {
		repo.deleteById(id);

	}

	@Override
	public Student getStudent(int id) {
		Student student=repo.findById(id).get();
		return student;
		
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> studentList=(List<Student>)repo.findAll();
		return studentList;
	}

}
