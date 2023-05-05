


//Queries to create Student table in database.

CREATE table Student(Name varchar(50),Subjects varchar(50),DOB date);

INSERT INTO Student (Name, Subjects,DOB) VALUES ("Tanishq","DBMS","06/03/2002");
INSERT INTO Student (Name, Subjects,DOB) VALUES ("Ram","Java","09/03/2002");
INSERT INTO Student (Name, Subjects,DOB) VALUES ("Jimmy","Python","023/03/2002");
INSERT INTO Student (Name, Subjects,DOB) VALUES ("Bolt","C++","31/03/2002");

SELECT *  
FROM Student
