package com.SpringBootExample.Bean;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.SpringBootExample.Bean.DAO.StudentDAO;

@Component
public class StudentService implements StudentInt
{
	@Autowired
	private StudentDAO studentdao;
	private int studIncrement=1;
	private List<Student> studentlist = new ArrayList<>();

	@Override
	public Student addStudent(Student student) 
	{
		// TODO Auto-generated method stub
//		student.setId(studIncrement);
//		studentlist.add(student);
//		studIncrement++;
//		return student;
		return studentdao.save(student);
	}

	@Override
	public List<Student> getStudent() 
	{
		// TODO Auto-generated method stub
		return studentdao.findAll();
		//return studentlist;
	}

	@Override
	public Student getStudentbyId(int id) 
	{
		
		return studentdao.findById(id).get();
		
		// TODO Auto-generated method stub
		/*return studentlist.stream()
						  .filter(student->student.getId()== id)
						  .findFirst()
		                  .get();*/
//		for(int i=0;i<studentlist.size();i++)
//		{
//			int ssid=studentlist.get(i).getId();
//			if(ssid==sid)
//			{
//				studentlist.get(i).getId();
//				studentlist.get(i).getName();
//				studentlist.get(i).getGender();
//			}
//		}
		//return (Student) studentlist;
	}

	@Override
	public Student updateStudent(int id, Student student) 
	{
		// TODO Auto-generated method stub
		student.setId(id);
		return studentdao.save(student);
		//return null;
	}

	@Override
	public void removeStudent(int id)
	{
		// TODO Auto-generated method stub
		studentdao.deleteById(id);
	}
}
