package com.model.main;

import jakarta.persistence.*;

@Entity
@Table(name = "Room_Mate")
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="Room_Mate")
	private String name;
	
	@Column(name="Mobile_No")
	private String mobile;
	

	private String course;

	public Room(int id, String name, String mobile, String course) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.course = course;
	}

	public Room() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return id + name + mobile + course;
	}

}
