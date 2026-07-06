#Assignment 1: Create a Database and Table
create database School;
use School;

CREATE TABLE Students (
    StudentID INT PRIMARY KEY,
    Name VARCHAR(50),
    Age INT,
    Gender VARCHAR(1),
    City VARCHAR(50)
);

select * from Students;

#Assignment 2: Insert Data

INSERT INTO Students VALUES
(101, 'Rahul', 20, 'M', 'Hyderabad'),
(102, 'Priya', 19, 'F', 'Chennai'),
(103, 'Arjun', 21, 'M', 'Bengaluru'),
(104, 'Sneha', 20, 'F', 'Mumbai'),
(105, 'Kiran', 22, 'M', 'Pune');

#Assignment 3: Retrieve Data
#1. Display all student records
select * from Students;

#2. Display only Name and City
select Name , City from Students;

#3. Display students whose age is greater than 20
select * from Students where age > 20;

#4. Display female students
select * from Students where Gender = 'F';

#5. Display students from Hyderabad
select * from Students where city = 'Hyderabad';

#Assignment 4: Sorting

#1. Name (A–Z).
select * from Students Order by Name asc;

#2. Age (highest first).

select * from Students Order by Age Desc;

#3. City and then Name.

select * from Students Order by City , Name;


#4. Assignment 5: Filtering

#1. between 19 and 21.
select * from Students where age between 19 and 21;

#2. name starts with 'R'.
select * from Students where Name like 'R%';

#3. city ends with 'i'.
select * from Students where City like '%i';

#4. age is 20 or 22.
select * from Students where age in (20 , 22 );

#Assignment 6: Update Data

#1. Rahul's city to Delhi.
update Students set City = 'Delhi' where Name = 'Rahul';

#2. Increase Arjun's age by 1.
update Students set Age = Age + 1 where Name = 'Arjun';

#3. Sneha's city to Kolkata.
update Students set City = 'Kolkata' where Name = 'Sneha';

#Assignment 7: Delete Data

#1. Delete the student whose StudentID is 105.
delete from Students where StudentID = 105;

#2.Delete all students from Chennai.
delete from Students where City = 'Chennai';






