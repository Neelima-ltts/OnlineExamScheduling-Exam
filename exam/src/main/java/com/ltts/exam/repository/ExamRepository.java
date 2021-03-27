package com.ltts.exam.repository;

import org.springframework.data.repository.CrudRepository;  
import com.ltts.exam.model.Exam;  
//repository that extends CrudRepository  
public interface ExamRepository extends CrudRepository<Exam, Integer>  
{  
	}  