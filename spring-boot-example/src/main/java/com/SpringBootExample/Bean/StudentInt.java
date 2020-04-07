package com.SpringBootExample.Bean;

import java.util.List;

public interface StudentInt 
{
 public Student addStudent(Student student);
 public List<Student> getStudent();
 public Student getStudentbyId(int id);
 public Student updateStudent(int id,Student student);
 public void removeStudent(int id);
}
