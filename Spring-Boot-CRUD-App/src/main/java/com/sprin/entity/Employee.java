package com.sprin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "emp_dtls")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long eId;
	@Column(nullable = false)
	private String eName;
	@Column(nullable = false)
	private String eAdd;
	@Column(nullable = false)
	private Long eNumber;
	@Column(nullable = false, unique = true)
	private String eEmail;

	public Long geteId() {
		return eId;
	}

	public void seteId(Long eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteAdd() {
		return eAdd;
	}

	public void seteAdd(String eAdd) {
		this.eAdd = eAdd;
	}

	public Long geteNumber() {
		return eNumber;
	}

	public void seteNumber(Long eNumber) {
		this.eNumber = eNumber;
	}

	public String geteEmail() {
		return eEmail;
	}

	public void seteEmail(String eEmail) {
		this.eEmail = eEmail;
	}

	public Employee save(Employee emp) {

		return emp;
	}

}
