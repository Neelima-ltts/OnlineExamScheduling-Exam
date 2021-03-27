package com.ltts.exam.controller;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;  
import com.ltts.exam.model.Exam;  
import com.ltts.exam.service.ExamService;  
//mark class as Controller  
@RestController  
public class ExamController   
{  
//autowire the BooksService class  
@Autowired  
ExamService examService;  
//creating a get mapping that retrieves all the books detail from the database   
@GetMapping("/exams")  
private List<Exam> getAllExams()   
{  
return examService.getAllExams();  
}  
//creating a get mapping that retrieves the detail of a specific book  
@GetMapping("/exams/{exam_id}")  
private Exam getExams(@PathVariable("exam_id") int exam_id)   
{  
return examService.getExamsById(exam_id);  
}  
//creating a delete mapping that deletes a specified book  
@DeleteMapping("/exams/{exam_id}")  
private void deleteExam(@PathVariable int exam_id)   
{  
examService.delete(exam_id);  
}  
//creating post mapping that post the book detail in the database  
@PostMapping("/exams")  
private int saveExam(@RequestBody Exam exams)   
{  
examService.saveOrUpdate(exams);  
return exams.getExam_id();  
}  
//creating put mapping that updates the book detail   
@PutMapping("/exams")  
private Exam update(@RequestBody Exam exams)   
{  
examService.saveOrUpdate(exams);  
return exams;  
}  
}  
