package net.javaguides.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tenants")

public class Tenant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	to generate values usually for primary keys
	
	@Column(name = "id")
	private long id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "sub_period")
	private int subPeriod;
	
	public Tenant(){
		//default constructor
	}
	
	public Tenant(long id, String firstName, String lastName, String email, int subPeriod) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.subPeriod = subPeriod;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSubPeriod() {
		return subPeriod;
	}
	public void setSubPeriod(int subPeriod) {
		this.subPeriod = subPeriod;
	}
	
	
}
