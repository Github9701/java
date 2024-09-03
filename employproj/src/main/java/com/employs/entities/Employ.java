package com.employs.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class Employ {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer employid;
	
	@Column(name = "first_name",nullable = false)
	private String fname;
	
	@Column(name = "last_name", nullable = false)
	private String lname;
	
	@Column(name = "email_id",nullable = false,unique = true)
	private String email;
}
