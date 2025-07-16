package com.coforge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import com.coforge.model.Person;
import com.coforge.util.DatabaseUtil;

public class PersonDao {

	Set<Person> personSet;

	Statement statement;
	PreparedStatement preparedStatement;
	ResultSet resultSet;
	Connection connection;

	public PersonDao() throws SQLException {
//		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//		
//		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coforge_db", "root", "mysql");
		 connection=DatabaseUtil.getMyConnection();

	}

	public boolean addPerson(Person p) throws SQLException {
		preparedStatement = connection.prepareStatement("insert into person values(?,?,?) ");
		preparedStatement.setInt(1, p.getPersonId());
		preparedStatement.setString(2, p.getPersonName());
		preparedStatement.setFloat(3, p.getPersonSalary());

		int r = preparedStatement.executeUpdate();
		if (r == 1)
			return true;
		else
			return false;

	}

	public Set<Person> getAllPerson() throws SQLException {
      resultSet=preparedStatement.executeQuery("select * from person");
      personSet=null;
      personSet = new HashSet<Person>();
      Person person=null;
      
      while(resultSet.next()) {
    	  person=new Person();
    	  person.setPersonId(resultSet.getInt(1));
    	  person.setPersonName(resultSet.getString(2));
    	  person.setPersonSalary(resultSet.getFloat(3));
    	  personSet.add(person);
      }
      return  personSet;
	}
}

//create table person(personid int, name varchar(20), salary float(10,2), primary key(personid));

/*
CRUD 
C-- create -- insert
R -- retrieve  -- select one, all
U -- update
D -- delete  

*/