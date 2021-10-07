package co.edu.uptc.restaurant.dao;

import java.util.List;

import javax.persistence.Query;

import co.edu.uptc.restaurant.dominio.Customer;

public class CustomerDao extends AbstractDao<Customer> {

	public CustomerDao() {
		setClazz(Customer.class);
	}
	
	public Customer newCustomer(String name) {
		String sqlString = "FROM " + Customer.class.getName() + " Where name = ?1";
		Query query = getEntityManager().createQuery(sqlString);
		query.setParameter(1, name);
		return (Customer) query.getSingleResult();
	}
	
	public List<Customer> customerBirthDay(){
		String sqlString = "FROM " + Customer.class.getName() + " WHERE month( birthDay_date ) = month(now())";
		Query query = getEntityManager().createQuery(sqlString);
		return query.getResultList();
	}
	
}
