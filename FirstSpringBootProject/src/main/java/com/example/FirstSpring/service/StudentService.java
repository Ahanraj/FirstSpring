package com.example.FirstSpring.service;
import java.util.List;

import com.example.FirstSpring.Model.StudentDetails;
public interface StudentService {
	void saveStudent(StudentDetails studentDetails);
	
	List<StudentDetails> getAllstudent();
	void deleteStudent(Integer id);
	StudentDetails getStudentbyId(Integer id);
}
