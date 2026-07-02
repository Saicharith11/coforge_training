create database emplo;
use emplo;

create table tbl_emp (
eid int,
ename varchar(50),
esalary int,
dno int);

desc tbl_emp;

insert into tbl_emp values 
(101 , 'Sai' , 1000 ,10 ),
(102 , 'Charith' , 2000, 20),
(103 , 'Sai Charith' , 10000 , 10 ),
(104 , 'Chittamuru' , 5000 , 20);

select * from tbl_emp;

select dno , count(*) as total_number_employees from tbl_emp group by dno;

select dno , sum(esalary) as sum , avg(esalary) as avg, min(esalary) as min, max(esalary) as max
from tbl_emp group by dno
having min(esalary) > 1000;

select dno , sum(esalary) as sum , avg(esalary) as avg, min(esalary) as min, max(esalary) as max
from tbl_emp group by dno order by dno desc;

create table tbl_depa(
dno int , 
dname varchar(20));

insert into tbl_depa values
(10 , 'Development'),
(20 , 'Testing');

select e.eid , d.dname from tbl_emp as e join tbl_depa as d on e.dno = d.dno
where e.eid = 101;

select dname from tbl_depa where dno = ( select dno from tbl_emp where eid = 101); 

select * from tbl_emp where 
dno = ( select dno from tbl_depa where dname = 'Testing');

select dname from tbl_depa where 
dno = ( select dno from tbl_emp where ename = "Sai");

select dname from tbl_depa where 
dno in ( select dno from tbl_emp where eid = 101 or eid = 102);

drop table tbl_emp;

create table tbl_emp (
eid int primary key,
ename varchar(50) not null,
esalary int check(esalary > 0),
email varchar(50) unique,
dno int);

insert into tbl_emp values
(101 , 'Niraj' , 0 , 'saiaiaiaia' , 10);

drop table tbl_emp;
drop table tbl_depa;


create table tbl_dept
(dno int primary key , 
dname varchar(20));
drop table tbl_emp;

create table tbl_emp1 (
eid int primary key,
ename varchar(50) not null,
esalary int check(esalary > 0),
email varchar(50) unique,
dno int ,
FOREIGN KEY (dno) REFERENCES tbl_dept(dno)
);

insert into tbl_emp1 values ( 101 , 'Ramesh' , 1000 , 'aaaaa' , 10);

insert into tbl_dept values ( 10 , 'Development');


DELIMITER //
create procedure insertEmployee1(in eid int , in ename varchar(20)
 , in esalary int , in dno int)
 begin 
	insert into tbl_emp1 (eid , ename , esalary , dno)
	values ( eid , ename , esalary , dno);
end //


call insertEmployee1(102 , 'Valan' , 3000 , 10);


DELIMITER //
create procedure getEmployeeName(in empid int , out empname varchar(20))
begin 
	select ename into empname from tbl_emp1 where eid = empid;
end //

call getEmployeeName(101 , @empname);
select @empname;

DELIMITER //
create function getEmpName(empid int) returns varchar(20) DETERMINISTIC 
begin 
	declare empname varchar(20);
    select ename into empname from tbl_emp1 where eid = empid;
    return empname;
end //

select getEmpName(102);


DELIMITER //
create function getEmpName1(eid int) returns varchar(20) DETERMINISTIC 
begin 
	
    select ename from tbl_emp1 where eid = eid;
    return ename;
end //

select getEmpName(102);

CREATE TABLE agents (
    agent_code VARCHAR(10) PRIMARY KEY,
    agent_name VARCHAR(50) NOT NULL,
    working_area VARCHAR(50)
);
INSERT INTO agents (agent_code, agent_name, working_area)
VALUES
('A101', 'agent1', 'Chennai'),
('A102', 'agent2', 'Chennai'),
('A103', 'agent3', 'Bangalore'),
('A104', 'agent4', 'Bangalore');

CREATE TABLE customers (
    customer_code VARCHAR(10) PRIMARY KEY,
    customer_name VARCHAR(50) NOT NULL,
    customer_area VARCHAR(50)
);

INSERT INTO customers (customer_code, customer_name, customer_area)
VALUES
('C101', 'customer1', 'Chennai'),
('C102', 'customer2', 'Chennai'),
('C103', 'customer3', 'Chennai'),
('C104', 'customer4', 'Bangalore'),
('C105', 'customer5', 'Bangalore');

 #inner join equi
 select a.agent_name, c.customer_name, c.customer_area
 from agents a join customers c on a.working_area=c.customer_area; 
 
 #inner join no equi join
 select agents.agent_name, customers.customer_name, customers.customer_area  
 from agents join customers  on agents.working_area <> customers.customer_area; 
 
 #innerjoin
  select agents.agent_name, customers.customer_name, customers.customer_area  
  from agents inner join customers  on agents.working_area = customers.customer_area; 
  
  #left outer join
  select * from agents 
  left join customers on agents.working_area = customers.customer_area; 
  
  #right outer join
   select * from agents 
   right join customers on agents.working_area = customers.customer_area; 
   
#outer join
SELECT *
FROM agents
LEFT JOIN customers
ON agents.working_area = customers.customer_area
UNION
SELECT *
FROM agents
RIGHT JOIN customers
ON agents.working_area = customers.customer_area;

#self join
select a.agent_code, b.agent_name 
from agents a, agents b where a.working_area = b.working_area; 

#natural join
select agents.agent_name, customers.customer_name, customers.customer_area  
from agents natural join customers; 

#cross join
select agents.agent_name, customers.customer_name, customers.customer_area
  from agents cross join customers;

