package com.bridgelabz.dao;

import java.util.List;

import com.bridgelabz.model.Person;

public interface PersonDao {

	public void save(Person p);

	public List<Person> list();

}
