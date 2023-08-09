package com.model.employee;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Answer {
	@Id
	private int answerId;

	private String answer;

//	private OneToOneQuestion que1;
//
//	public OneToOneQuestion getQue1() {
//		return que1;
//	}
//
//	public void setQue1(OneToOneQuestion que1) {
//		this.que1 = que1;
//	}

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Answer(int answerId, String answer) {
		super();
		this.answerId = answerId;
		this.answer = answer;
	}

	public Answer() {
		super();

	}

	@Override
	public String toString() {
		return "Answer [answerId=" + answerId + ", answer=" + answer +  "]";
	}

}
