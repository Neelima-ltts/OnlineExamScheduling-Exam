package com.ltts.exam.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name="exam")
public class Exam implements Serializable{
 
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column
    private int exam_id;
	@Column
    private String exam_name;
 
 public Exam() {
		super();
	}
	  
public Exam(int exam_id, String exam_name) {
	super();
	this.exam_id = exam_id;
	this.exam_name = exam_name;
}

public int getExam_id() {
	return exam_id;
}
public void setExam_id(int exam_id) {
	this.exam_id = exam_id;
}
public String getExam_name() {
	return exam_name;
}
public void setExam_name(String exam_name) {
	this.exam_name = exam_name;
}

@Override
public String toString() {
	return "Exam [exam_id=" + exam_id + ", exam_name=" + exam_name + "]";
}


 
}

