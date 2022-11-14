package com.example.task;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name ="employees")
	public class Employee {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		@Column(name = "emp_no",nullable = false)
		private int empNo;
		@Column(name = "first_name",nullable = false)
		private String firstName;
		@Column(name = "last_name",nullable = false)
		private String lastName;
		@Column(name = "email_Id",nullable = false)
		private String emailId;
		@Column(name = "mobile_no",nullable = false)
		private int mobile_No;
		@Column(name = "role_work",nullable = false)
		private String role_Work;
		@Column(name = "location_place",nullable = false)
		private String location_place;
		
		
		public Employee() {
			super();
		}


		public Employee(int empNo, String firstName, String lastName, String emailId, int mobile_No, String role_Work,
				String location_place) {
			super();
			this.empNo = empNo;
			this.firstName = firstName;
			this.lastName = lastName;
			this.emailId = emailId;
			this.mobile_No = mobile_No;
			this.role_Work = role_Work;
			this.location_place = location_place;
		}


		public long getId() {
			return id;
		}


		public void setId(long id) {
			this.id = id;
		}


		public int getEmpNo() {
			return empNo;
		}


		public void setEmpNo(int empNo) {
			this.empNo = empNo;
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


		public String getEmailId() {
			return emailId;
		}


		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}


		public int getMobile_No() {
			return mobile_No;
		}


		public void setMobile_No(int mobile_No) {
			this.mobile_No = mobile_No;
		}


		public String getRole_Work() {
			return role_Work;
		}


		public void setRole_Work(String role_Work) {
			this.role_Work = role_Work;
		}


		public String getLocation_place() {
			return location_place;
		}


		public void setLocation_place(String location_place) {
			this.location_place = location_place;
		}
		
		
		
		
}
