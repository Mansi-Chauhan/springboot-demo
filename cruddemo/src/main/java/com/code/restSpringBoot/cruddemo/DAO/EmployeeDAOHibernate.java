package com.code.restSpringBoot.cruddemo.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.code.restSpringBoot.cruddemo.entity.Employee;

@Repository
public class EmployeeDAOHibernate implements EmployeeDAO {

	private EntityManager entityManager;
	
	public EmployeeDAOHibernate(EntityManager em) {
		entityManager=em;
		}
		
	@Transactional
	@Override
	public List<Employee> getList() {
		
		Session currentSession=entityManager.unwrap(Session.class);
		
	   Query<Employee> query=currentSession.createQuery("from Employee",Employee.class);
	   
	   List<Employee> list=query.getResultList();
		
		return list;
	}

}
