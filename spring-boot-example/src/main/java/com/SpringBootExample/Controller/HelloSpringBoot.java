package com.SpringBootExample.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootExample.Bean.Student;
import com.SpringBootExample.Bean.StudentService;

@RestController 
@RequestMapping(value = "/students")
public class HelloSpringBoot 
{
@RequestMapping(value="/hello") 
//@GetMapping("/")
	public String sayhello()   
	{  
	return "Student Managment Application";  
	}
@RequestMapping(value="/getStudentMethodTest") 
   public Student getStudent()
   {
	   Student student = new Student(1,"jimmy","Male");
	   return student;
   }
//----Testing can be done using postmaster tool----//


//@Autowired - declares StudentService as component for controller class.
@Autowired
private StudentService studentService;
//@RequestBody - means it will take data for JSON
//@RequestMapping(value="/addStudent")
@PostMapping
public Student addStudent(@RequestBody Student student)
{
	return studentService.addStudent(student);
}
//@RequestMapping(value="/getStudents")
@GetMapping
public List<Student> getStudents()
{
	return studentService.getStudent();
	
}
@RequestMapping(value = "/{id}")
//@PathVariable - is used when you are passing a parameter to function
public Student getStudentbyId(@PathVariable("id") int id)
{
	return studentService.getStudentbyId(id);
}
@PutMapping(value = "/{id}")
public Student updateStudent(@PathVariable("id")int id,@RequestBody Student student)
{
	return studentService.updateStudent(id, student);
}
@DeleteMapping(value ="/{id}")
public void removeStudent(@PathVariable("id")int id)
{
	studentService.removeStudent(id);
}

 @GetMapping("/Students") 
   public List<Student> getStudents1() 
   {
//	 StudentBean student = new StudentBean(1,"jimmy","Male");
//	 List<StudentBean> list = new ArrayList<StudentBean>();
//	 list.add(new StudentBean(2,"b","F"));
//	 list.add(new StudentBean(3,"c","M"));
//	 list.add(new StudentBean(4,"d","M"));
//	 list.add(student);

	 return  Arrays.asList(
			 new Student(1,"jimmy","Male"),
			 new Student(2,"A","Male"),
			 new Student(3,"B","Male"),
			 new Student(4,"C","Male")
			 );
   }
 
}
