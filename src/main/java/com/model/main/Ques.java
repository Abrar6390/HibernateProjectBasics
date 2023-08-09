package com.model.main;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Question1")
public class Ques {
	@Id
	@Column(name = "Question_Id")
	private int quesId;

	@Column(name = "Question")
	private String ques;
	
	@OneToMany(mappedBy ="ques")
	private List<Answ> answs;
	
	
	public int getQuesId() {
		return quesId;
	}
	public void setQuesId(int quesId) {
		this.quesId = quesId;
	}
	public String getQues() {
		return ques;
	}
	public void setQues(String ques) {
		this.ques = ques;
	}
	public List<Answ> getAnsws() {
		return answs;
	}
	public void setAnsws(List<Answ> answs) {
		this.answs = answs;
	}
	public Ques() {
		super();
		
	}
	public Ques(int quesId, String ques, List<Answ> answs) {
		super();
		this.quesId = quesId;
		this.ques = ques;
		this.answs = answs;
	}
}
