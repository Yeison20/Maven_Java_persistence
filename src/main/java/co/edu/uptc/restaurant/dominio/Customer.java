package co.edu.uptc.restaurant.dominio;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "customer")
public class Customer {



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_customer")
	private int id_customer;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "last_name")
	private String last_name;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "birthDay_date")
	private LocalDate birthDay_date;
	
	
	
	public Customer(String name, String last_name, String phone, String address, LocalDate birthDay_date) {
		this.name = name;
		this.last_name = last_name;
		this.phone = phone;
		this.address = address;
		this.birthDay_date = birthDay_date;
	}

	public Customer() {
		
	}

	public int getId_customer() {
		return id_customer;
	}


	public void setId_customer(int id_customer) {
		this.id_customer = id_customer;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public LocalDate getBirthDay_date() {
		return birthDay_date;
	}


	public void setBirthDay_date(LocalDate birthDay_date) {
		this.birthDay_date = birthDay_date;
	}


	@Override
	public String toString() {
		return "Customer [id_customer=" + id_customer + ", name=" + name + ", last_name=" + last_name + ", phone="
				+ phone + ", address=" + address + ", birthDay_date=" + birthDay_date + "]";
	}
	
	
	
	
}
