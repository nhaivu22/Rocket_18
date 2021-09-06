CREATE DATABASE TestingSystem;

USE TestingSystem;


CREATE TABLE Department(
DepartmentID TINYINT,
DepartmentName VARCHAR(30)
);

 CREATE TABLE PositionID(
 PositionID INT,
 PositionName ENUM('Dev', 'Test', 'Scrum Master', 'PM')
 );
 
 CREATE TABLE `Account`(
 AccountID INT,
 Email VARCHAR(30),
 Username VARCHAR(30),
 FullName VARCHAR(30),
 DepartmentID INT,
 PositionID 	INT,
 CreateDate DATE
 
 );
  CREATE TABLE `Group`(
  GroupID INT,
  GroupName VARCHAR(30),
  CreateDate DATE
  );
  
 CREATE TABLE GroupAccount(
 GroupID  INT, 
 AccountID INT,
 JoinDate DATE
 );
 
 CREATE TABLE  TypeQuestion(
 TypeID INT,
 TypeName VARCHAR(30) 
 
 );
 
 CREATE TABLE CategoryQuestion(
 CategoryID  INT,
 CategoryName VARCHAR(30) 
 
 );
 
 CREATE TABLE Question(
 QuestionID  INT,
 Content VARCHAR(30) ,
 CategoryID INT,
 TypeID INT,
CreatorID INT,
 CreateDate DATE
 
 );

 CREATE TABLE Answer (
 AnswerID  INT,
 Content VARCHAR(30) ,
 QuestionID  INT,
 isCorrect VARCHAR(30) 
 );

CREATE TABLE Exam(
ExamID INT, 
`Code` VARCHAR(30) ,
Title VARCHAR(30) ,
CategoryID INT, 
Duration TIME,
CreatorID INT, 
CreateDate DATE
);

CREATE TABLE ExamQuestion(
ExamID INT,
QuestionID INT
);

 