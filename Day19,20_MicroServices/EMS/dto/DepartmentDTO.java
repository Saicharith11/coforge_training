package com.coforge.ems.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

//lombok
//@Getter
//@Setter
//@ToString
//@NoArgsConstructor
//@AllArgsConstructor

//@ToString 
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor

public class DepartmentDTO {

	private int dno;

	private String dname;

	public DepartmentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DepartmentDTO(int dno,String dname) {
		super();
		this.dno = dno;
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "Department [dno=" + dno + ", dname=" + dname + "]";
	}

	public int getDno() {
		return dno;
	}

	public String getDname() {
		return dname;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

}
