DROP DATABASE IF EXISTS TestingSystem_2;
CREATE DATABASE TestingSystem_2;

USE TestingSystem_2;


CREATE TABLE Department(
DepartmentID 	TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
DepartmentName	NVARCHAR (30) UNIQUE
);

 CREATE TABLE `Position`(
 PositionID 	TINYINT  UNSIGNED PRIMARY KEY AUTO_INCREMENT,
 PositionName 	ENUM('Dev', 'Test', 'Scrum Master', 'PM','VT') 
 );
 
 CREATE TABLE `Account`(
 AccountID 		TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
 Email 			NVARCHAR(30) UNIQUE UNIQUE,
 Username 		NVARCHAR(30) UNIQUE,
 FullName 		NVARCHAR(30),
 DepartmentID 	TINYINT UNSIGNED,
 PositionID 	TINYINT UNSIGNED,
 CreateDate 	DATE,
 FOREIGN KEY(DepartmentID) REFERENCES Department(DepartmentID),
  FOREIGN KEY(PositionID) REFERENCES `Position`(PositionID)
 
 );
  CREATE TABLE `Group`(
  GroupID 		TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
  GroupName 	NVARCHAR(30) UNIQUE,
  CreatorID 	TINYINT UNSIGNED,
  CreateDate	 DATE,
  FOREIGN KEY(CreatorID) REFERENCES `Account`(AccountId)

  
  );
  
 CREATE TABLE GroupAccount(
 GroupID  		TINYINT UNSIGNED PRIMARY KEY, 
 AccountID 		TINYINT UNSIGNED,
 JoinDate		 DATE,
 FOREIGN KEY (AccountID) REFERENCES `Account`(AccountID),
 FOREIGN KEY(GroupID) REFERENCES `Group`(GroupID)
 );
 
 CREATE TABLE  TypeQuestion(
 TypeID 		TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
 TypeName 		ENUM ('Essay', 'Multiple-Choice')
 
 );
 
 CREATE TABLE CategoryQuestion(
 CategoryID  		TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
 CategoryName 		ENUM ('Java', '.NET', 'SQL', 'Postman', 'Ruby') UNIQUE
 
 );
 
 CREATE TABLE Question(
 QuestionID  		TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
 Content 			NVARCHAR(30) ,
 CategoryID 		TINYINT UNSIGNED,
 TypeID 			TINYINT UNSIGNED,
 CreatorID 			TINYINT UNSIGNED,
 CreateDate			 DATE,
 FOREIGN KEY( CategoryID) REFERENCES CategoryQuestion(CategoryID),
 FOREIGN KEY (TypeID)  REFERENCES TypeQuestion(TypeID),
 FOREIGN KEY(CreatorID) REFERENCES `Account`(AccountId) 

 
 
 );

 CREATE TABLE Answer (
 AnswerID  			TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
 Content 			NVARCHAR(50) ,
 QuestionID  		TINYINT UNSIGNED,
 isCorrect 			BOOLEAN,
 FOREIGN KEY (QuestionID) REFERENCES Question(QuestionID)
 );


CREATE TABLE Exam(
ExamID 			TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT, 
`Code` 			NVARCHAR(30) ,
Title 			NVARCHAR(50) ,
CategoryID 		TINYINT UNSIGNED , 
Duration 		ENUM('60','120','150','180') ,
CreatorID 		TINYINT UNSIGNED , 
CreateDate		 DATE,
FOREIGN KEY(CategoryID) REFERENCES CategoryQuestion(CategoryID),
 FOREIGN KEY(CreatorID) REFERENCES `Account`(AccountId)
);

CREATE TABLE ExamQuestion(
ExamID 			TINYINT UNSIGNED ,
QuestionID 		TINYINT UNSIGNED ,
FOREIGN KEY(QuestionID) REFERENCES Question(QuestionID),
FOREIGN KEY(ExamID) REFERENCES Exam(ExamID),
PRIMARY KEY (ExamID,QuestionID)

);


INSERT INTO Department(DepartmentName) VALUES	('Sale'),
												('Marketing'),
                                                ('Nh??n S???'),
                                                ('B???o V??? '),
                                                ('K??? To??n'),
                                                ('B??n H??ng'),
                                                ('K??? Thu???t'),
                                                ('T??i Ch??nh'),
                                                ('T?? V???n'),
                                                ('Th?? K??');
INSERT INTO `Position`(PositionID,PositionName) VALUES ('1','Dev'),
											('2','Test'),
											('3','Scrum Master'),
											('4','PM');
	

  INSERT INTO `Account`(Email,					Username,		FullName,			DepartmentID,		PositionID,				CreateDate)		 VALUES
					('nhaivu22@gmail.com',		'Nh??i',			'V?? Th??? Nh??i',			'1',					'1',			'2019-02-19'),
					('hoa@gmail.com',			'Hoa',			'V?? Hoa',				'2',					'2',			'2019-03-20'),
					('huehue@gmail.com',		'Hu???',			'Tr???n Thanh Hu???',		'3',					'3',			'2018-03-01'),
					('taam@gmail.com',			'T??m',			'Nguy???n T??m',			'4',					'4',			'2019-04-08'),
					('hung@gmail.com',			'H??ng',			'V?? V??n  H??ng',			'4',					'3',			'2020-09-12'),
                    ('cong@gmail.com',			'C??ng',			'Minh Th??nh C??ng',		'5',					'2',			'2017-08-12'),
                    ('hoan@gmail.com',			'Hoan',			'T??? V?? Hoan ',			'6',					'4',			'2018-07-15'),
                    ('huy@gmail.com',			'Huy',			'Tr???n V??n Huy',			'7',					'1',			'2020-10-07'),
                    ('tham@gmail.com',			'Th???m',			'Nguy???n Th??? Th???m',		'8',					'2',			'2018-01-05'),
                    ('tinh@gmail.com',			'T??nh',			'Ho??ng Xu??n T??nh',		'9',					'3',			'2019-06-13'),
                    ('ngat@gmail.com',			'Ng??t',			'T??? Th??? Ng??t',			'10',					'3',			'2019-02-18'); 
                    
                    
INSERT INTO `Group`(GroupName,				CreatorID,		CreateDate) VALUES
						('B??n h??ng 01 ',		'1',		'2019-02-03'),
                        ('B??n H??ng 02',			'2',		'2018-02-06'),
                        ('Sale 01',				'3',		'2019-08-03'),
                        ('Sale 02',				'4',		'2019-12-08'),
                        ('TOT 01',				'5',		'2018-07-02'),
                        ('TOT 02',				'6',		'2017-05-03'),
                        ('UYT',					'9',		'2020-09-07'),
                        ('VOV',					'7',		'2020-12-18'),
                        ('T?? V???n',				'10',		'2020-01-02'),
                        ('V???n ?????ng',			'8',		'2019-03-03'),
                        ('N??i Chuy???n',			'5',		'2019-04-12');
                        

INSERT INTO GroupAccount(GroupID,	AccountID,		JoinDate) VALUES
						( 1 , 		1,				'2019-03-05'),
						( 2 ,		2,				'2020-03-07'),
						( 3 , 		3,				'2020-03-09'),
						( 4, 		4,				'2020-03-10'),
						( 5 ,		5,				'2020-03-28'),
						( 7 , 		3,				'2020-04-06'),
						( 6 , 		7,				'2020-04-07'),
						( 8 , 		3,				'2020-04-08'),
						( 9, 		9,				'2020-04-09'),
						( 10 , 		10,				'2020-04-09');
                      
INSERT INTO TypeQuestion(TypeName) VALUES
						('Essay'), 
                        ('Multiple-Choice');
                        
INSERT INTO CategoryQuestion(CategoryName) VALUES
							('Java'),
                            ('.NET'),
                            ('SQL'), 
                            ('Postman'), 
                            ('Ruby');
                            

    INSERT INTO Question(Content,				 CategoryID,		TypeID,		CreatorID,		 CreateDate) VALUES
						('C??u h???i v??? java 01',			1,				2,			2,					'2020-01-02'),
                        ('C??u h???i v??? .NET',				2,				1,			5,					'2020-02-03'),
                        ('C??u h???i v??? SQL',				3,				2,			3,					'2020-03-02'),
                        ('C??u h???i v??? Ruby ',			5,				1,			4,					'2020-04-09'),
                        ('C??u h???i v??? Postman',			4,				1,			7,					'2020-08-07'),
                        ('C??u h???i v??? java 02',			1,				1,			9,					'2020-09-02'),
                        ('C??u h???i v??? NET',				2,				2,			6,					'2020-10-06'),
                        ('C??u h???i v??? C++',				3,				1,			1,					'2020-11-12'),
                        ('C??u h???i v??? Python',			4,				2,			8,					'2020-05-18'),
                        ('C??u h???i v??? ADO.NET',			2,				1,			2,					'2020-06-13');
                        
                        
INSERT INTO Answer(Content, 			QuestionID,		isCorrect) VALUES
					('C??u tr??? l???i s??? 1',		1,			TRUE),
                    ('C??u tr??? l???i s??? 1',		5,			FALSE),
                    ('C??u tr??? l???i s??? 1',		3,			FALSE),
                    ('C??u tr??? l???i s??? 1',		4,			TRUE),
                    ('C??u tr??? l???i s??? 1',		2,			FALSE),
                    ('C??u tr??? l???i s??? 1',		6,			FALSE),
                    ('C??u tr??? l???i s??? 1',		7,			TRUE),
                    ('C??u tr??? l???i s??? 1',		10,			TRUE),
                    ('C??u tr??? l???i s??? 1',		8,			FALSE),
                    ('C??u tr??? l???i s??? 1',		9,			FALSE);
                    

                    
INSERT INTO Exam(ExamID,	`Code`,				Title,				CategoryID,			Duration,			CreatorID,			CreateDate) VALUES
				(1,			'MD01',			 '????? thi java',				2,					'60',					1,			'2021-01-01'),	
				(2,			'MD02',			 '????? thi C',				1,					'150',					4,			'2021-08-02'),	
				(3,			'MD03',		 	'????? thi C++',				4,					'120',					6,			'2021-06-03'),	
				(4,			'MD04',		 	'????? thi Python',			3,					'180',					5,			'2021-08-04'),	
				(5,			'MD05',		 	'????? thi Postman',			5,					'120',					3,			'2021-02-05'),	
				(6,			'MD06',		 	'????? thi ADO.NET',			2,					'60',					2,			'2021-07-06'),	
				(7,			'MD07',		 	'????? thi javascrip',			1,					'150',					7,			'2021-11-07'),	
				(8,			'MD08',		 	'????? thi SQl',				5,					'180',					10,			'2021-01-08'),	
				(9,			'MD09',		 	'????? thi MySQL',				3,					'120',					8,			'2021-09-08'),
				(10,			'MD10',		 	'????? thi TIB',				4,				'60',					9,			'2021-12-10');
                
		
        
INSERT INTO ExamQuestion(ExamID,	QuestionID) VALUES
						(1,			3),
                        (5,			2),
                        (3,			4),
                        (5,			3),
                        (7,			5),
                        (8,			7),
                        (9,			8),
                        (6,			9),
                        (4,			6),
                        (10,		1);
		
SELECT Email,Username,FullName FROM `Account`;
SELECT * FROM position;
INSERT INTO `Position`(PositionName) VALUES ('PM');
UPDATE `Position`
SET PositionName='PM'
WHERE PositionID=5;
                    
DELETE FROM `Position` WHERE PositionID=9;
	
INSERT INTO `Position`(PositionID,PositionName) VALUES ('8','Dev');

SELECT *
FROM `Account`;
INSERT INTO `Account`(Username) VALUES ('TUT');
SELECT * FROM department WHERE DepartmentID =5;
SELECT *
FROM Department
WHERE DepartmentName='sale';

UPDATE Department
SET DepartmentName='TFR'
WHERE DepartmentID=11;

DELETE 
FROM Department
WHERE DepartmentID=13;
SELECT *
FROM `Account`
WHERE AccountID=5;

 INSERT INTO `Account`(	Username)		 VALUES
					('Tu???n');
      
DELETE 
FROM `Account`
WHERE DepartmentID=13;
      
UPDATE `Account`
SET Username='HUY'
WHERE AccountID=12;

SELECT *
FROM `Account`;
DELETE FROM Department WHERE DepartmentID=10;
