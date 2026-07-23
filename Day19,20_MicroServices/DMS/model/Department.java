package com.coforge.dms.model;

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
@Entity
@Table(name = "tbl_dept")
public class Department {

	@Id
	@NotNull
	@Column(name = "dno", length = 5)
	private int dno;
	@NotBlank
	@Column(name = "dname", length = 20)
	private String dname;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(@NotNull int dno, @NotBlank String dname) {
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
