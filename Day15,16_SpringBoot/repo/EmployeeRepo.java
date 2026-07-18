package com.coforge.ems.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coforge.ems.model.Employee;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Integer> {
	List<Employee> findByEmpName(String empName);

    long deleteByEmpName(String empName);
    
    //public List<Employee> findByDno(int deptno);
    //public int deleteByDno(int deptno);
    
 // Custom Query Methods

    @Query("select empId from Employee")
    public List<Integer> getEids();

    @Query("select count(*), sum(empSalary), min(empSalary), max(empSalary) from Employee")
    public String getInfo();


}