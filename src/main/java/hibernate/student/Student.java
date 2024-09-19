package hibernate.student;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//Table name chenge
//@Entity(name="Acg_Student")
@Entity
public class Student {
	
	//Id Auto generated
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Id
	private int id;
	
	//column chenge
	//@Column(name="S_Name")
	private String name;
	private String email;
	private String department;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, String email, String department) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.department = department;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", department=" + department + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getEmail()=" + getEmail() + ", getDepartment()="
				+ getDepartment() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
	
	

}
