package com.img.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Studentimg {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String firstname;

	private String lastname;

	@Lob
	private byte[] file;

//	
//	
//
//
//
	public byte[] getFile() {
		return file;
	}

//
	public void setFile(byte[] file) {
		this.file = file;
	}

	public Studentimg() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Studentimg(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "Studentimg [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", file="
				+ Arrays.toString(file) + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}
