package com.ltts.exam.service;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
import com.ltts.exam.model.Exam;  
import com.ltts.exam.repository.ExamRepository;  
//defining the business logic  
@Service  
public class ExamService   
{  
@Autowired  
ExamRepository examRepository;  
//getting all books record by using the method findaAll() of CrudRepository  
public List<Exam> getAllExams()   
{  
List<Exam> exam = new ArrayList<Exam>();  
examRepository.findAll().forEach(exam1 -> exam.add(exam1));  
return exam;  
}  
//getting a specific record by using the method findById() of CrudRepository  
public Exam getExamsById(int id)   
{  
return examRepository.findById(id).get();  
}  
//saving a specific record by using the method save() of CrudRepository  
public void saveOrUpdate(Exam exam)   
{  
examRepository.save(exam);  
}  
//deleting a specific record by using the method deleteById() of CrudRepository  
public void delete(int id)   
{  
	examRepository.deleteById(id);  
}  
//updating a record  
public void update(Exam exam, int exam_id)   
{  
examRepository.save(exam);  
}
} 