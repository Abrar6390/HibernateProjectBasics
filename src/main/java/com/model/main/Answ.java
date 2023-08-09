package com.model.main;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Answer1")
public class Answ {
	
	@Id
	@Column(name="Answe_Id")
    private int ansId;
	
	@Column(name="Answer")
    private String ans;
	
	@ManyToOne
	private Ques ques;
	
	public int getAnsId() {
		return ansId;
	}

	public void setAnsId(int ansId) {
		this.ansId = ansId;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

	public Ques getQues() {
		return ques;
	}

	public void setQues(Ques ques) {
		this.ques = ques;
	}

	public Answ(int ansId, String ans, Ques ques) {
		super();
		this.ansId = ansId;
		this.ans = ans;
		this.ques = ques;
	}

	public Answ() {
		super();
		
	}
}
