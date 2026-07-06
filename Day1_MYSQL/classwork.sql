create table tbl_employee (
emp_id int auto_increment primary key,
ename VARCHAR(100),
esalary int
);
/*
*/

describe tbl_employee;

insert into tbl_employee values
(101,'sai',1000),
(102,'cha',1500);

insert into tbl_employee(emp_id , esalary ) values
(103,2500);
select * from tbl_employee;

select * from tbl_employee where emp_id = 101;

select * from tbl_employee where emp_id <> 101;

select ename from tbl_employee where esalary < 5000;
select * from tbl_employee where ename is null;

select * from tbl_employee where ename is not null;

select * from tbl_employee where emp_id in (101 , 103);

select * from tbl_employee where emp_id not in (101 , 103);

select * from tbl_employee where esalary not between 2500 and 1000;

select * from tbl_employee where ename like '%a%';

update tbl_employee set esalary = 0 where emp_id = 101; 
select * from tbl_employee;
rollback;

SET SQL_SAFE_UPDATES = 0;

delete from tbl_employee where ename is null;


select * from tbl_employee;

insert into tbl_employee values
(103,'saicha',9000);

select 'Charith Reddy' , 4 + 1 from tbl_employee;

select emp_id as 'emp idd' , sysdate() as 'currendate' , 'Charith Reddy' , 4 + 1 from tbl_employee;

alter table tbl_employee add column dno int;

select * from tbl_employee;

rename table tbl_employee to emp1;
