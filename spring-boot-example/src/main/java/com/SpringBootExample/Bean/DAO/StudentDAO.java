package com.SpringBootExample.Bean.DAO;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SpringBootExample.Bean.Student;

@Repository
public interface StudentDAO extends CrudRepository<Student, Integer>
{ 
	@Override
	List<Student> findAll(); 
	
}
