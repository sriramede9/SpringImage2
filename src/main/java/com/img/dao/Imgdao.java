package com.img.dao;

import java.util.List;

import com.img.model.Studentimg;

public interface Imgdao {

	public List<Studentimg> getall();

	public Studentimg getbyid(int id);

	public void addStudentimg(Studentimg simg);

	public void deletebyid(int id);
}
