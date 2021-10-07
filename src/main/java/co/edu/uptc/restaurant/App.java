package co.edu.uptc.restaurant;

import java.time.LocalDate;
import java.util.List;

import co.edu.uptc.restaurant.dao.CustomerDao;
import co.edu.uptc.restaurant.dominio.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	CustomerDao cDao = new CustomerDao();
    	List<Customer> customer1 = cDao.getAll();
    	System.out.println(customer1);
    	
    	Customer c = new Customer("Dario", "Gomez", "74123", "Calle 10", LocalDate.parse("1998-10-01"));
    	System.out.println(c);
    	cDao.save(c);
    	
    	
    	//insert
    	Customer c1 = new Customer("Rosa", "Perez", "1278", "Calle 14569",  LocalDate.parse("1998-10-25"));
    	System.out.println(c1);
    	cDao.save(c1);
    	
    	
    	System.out.println("\n Resultado por nombre:" + cDao.newCustomer("Paola"));
    	System.out.println("\n Cumpleañeros en este mes: " + cDao.customerBirthDay());
    	


    }
}
