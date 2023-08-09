package com.model.main;

import jakarta.persistence.Embeddable;

@Embeddable
public class Certificate {
     String course;
     String duretion;
	
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDuretion() {
		return duretion;
	}
	public void setDuretion(String duretion) {
		this.duretion = duretion;
	}
	
	public Certificate() {
		super();

	}
	public Certificate(String course, String duretion) {
		super();
		this.course = course;
		this.duretion = duretion;
	}
}
