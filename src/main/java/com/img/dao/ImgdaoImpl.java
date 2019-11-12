package com.img.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.img.model.Studentimg;

@Repository
@Transactional
public class ImgdaoImpl implements Imgdao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	public List<Studentimg> getall() {
		// TODO Auto-generated method stub
		return null;
	}

	public Studentimg getbyid(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addStudentimg(Studentimg simg) {
		// TODO Auto-generated method stub

		// System.out.println("in respository adding studentimg obj " + simg);

		hibernateTemplate.saveOrUpdate(simg);

	}

	public void deletebyid(int id) {
		// TODO Auto-generated method stub

	}

}
