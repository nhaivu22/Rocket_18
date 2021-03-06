DROP DATABASE IF EXISTS TestingSystem_2;
CREATE DATABASE TestingSystem_2;

USE TestingSystem_2;


CREATE TABLE Department(
DepartmentID 	TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
DepartmentName	NVARCHAR (30) UNIQUE
);

 CREATE TABLE `Position`(
 PositionID 	TINYINT  UNSIGNED PRIMARY KEY AUTO_INCREMENT,
 PositionName 	ENUM('Dev', 'Test', 'Scrum Master', 'PM') UNIQUE
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
                    ('C??u tr??? l???i s??? 2',		5,			FALSE),
                    ('C??u tr??? l???i s??? 3',		3,			FALSE),
                    ('C??u tr??? l???i s??? 4',		4,			TRUE),
                    ('C??u tr??? l???i s??? 5',		2,			FALSE),
                    ('C??u tr??? l???i s??? 6',		6,			FALSE),
                    ('C??u tr??? l???i s??? 7',		7,			TRUE),
                    ('C??u tr??? l???i s??? 8',		10,			TRUE),
                    ('C??u tr??? l???i s??? 9',		8,			FALSE),
                    ('C??u tr??? l???i s??? 10',		9,			FALSE);
                    

                    
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
		

	-- Question 1: Vi???t l???nh ????? l???y ra danh s??ch nh??n vi??n v?? th??ng tin ph??ng ban c???a h???			
SELECT *
FROM `Account` Ac
JOIN Department Dp ON Ac.DepartmentID=Dp.DepartmentID;

                    
-- Question 2: Vi???t l???nh ????? l???y ra th??ng tin c??c account ???????c t???o sau ng??y 20/12/2010
	SELECT *
    FROM `Account`
    WHERE CreateDate > '2010-12-20';


-- Question 3: Vi???t l???nh ????? l???y ra t???t c??? c??c developer
SELECT *
FROM `Account` A
JOIN Position p ON A.PositionID= p.PositionID
WHERE p.PositionName='Dev';

-- Question 4: Vi???t l???nh ????? l???y ra danh s??ch c??c ph??ng ban c?? >3 nh??n vi??n
SELECT A.Email,A.Username,A.FullName,A.DepartmentID,D.DepartmentName, COUNT(DepartmentName)AS SL
FROM `Account` A
JOIN Department D ON A.DepartmentID=D.DepartmentID
GROUP BY DepartmentName
HAVING SL>3;

-- Question 5: Vi???t l???nh ????? l???y ra danh s??ch c??u h???i ???????c s??? d???ng trong ????? thi nhi???u nh???t
SELECT 		Q.QuestionID, Q.Content, Q.CategoryID, Q.TypeID, Q.CreatorID, Q.CreateDate, Count(Q.Content) 
FROM		Question Q 
INNER JOIN 	ExamQuestion EQ ON Q.QuestionID = EQ.QuestionID
GROUP BY	Q.Content
HAVING		COUNT(Q.Content) = (SELECT	MAX(CountQ)
								FROM		
										(SELECT 		COUNT(Q.QuestionID) AS CountQ
										FROM			ExamQuestion EQ 
										INNER JOIN 		Question Q ON EQ.QuestionID = Q.QuestionID
										GROUP BY		Q.QuestionID) 
                                        AS MaxContent);


-- Question 6: Th??ng k?? m???i category Question ???????c s??? d???ng trong bao nhi??u Question
SELECT *,COUNT(*)
FROM CategoryQuestion C
JOIN Question Q ON C.CategoryID=Q.CategoryID
GROUP BY Q.CategoryID;

-- question 7: Th??ng k?? m???i Question ???????c s??? d???ng trong bao nhi??u Exam
SELECT *,COUNT(*)
FROM Question Q
JOIN ExamQuestion E ON Q.QuestionID=E.QuestionID
GROUP BY E.QuestionID;

-- question 8: L???y ra Question c?? nhi???u c??u tr??? l???i nh???t
SELECT 		Q.QuestionID, Q.Content, COUNT(A.QuestionID) 
FROM		Question Q 
INNER JOIN 	Answer A ON	Q.QuestionID = A.QuestionID
GROUP BY	A.QuestionID
HAVING		COUNT(A.QuestionID) =	(SELECT 	MAX(CountQ)
									 FROM		(SELECT 		COUNT(A.QuestionID) AS CountQ
												FROM			Answer A 
												RIGHT JOIN  Question Q ON A.QuestionID = Q.QuestionID 
												GROUP BY		A.QuestionID) AS MaxCountQ);
                                                
                                                
                                                
-- Question 9: Th???ng k?? s??? l?????ng account trong m???i group
SELECT *,COUNT(Gr.AccountID)
FROM `Group` G
JOIN GroupAccount Gr ON G.GroupID=Gr.GroupID
GROUP BY Gr.AccountID;

-- Question 10: T??m ch???c v??? c?? ??t ng?????i nh???t
SELECT A.AccountID,A.Email,A.Username,A.FullName,P.PositionName,COUNT(PositionName)
FROM `Account` A
JOIN `Position` P ON A.PositionID=P.PositionID
GROUP BY P.PositionName
ORDER BY COUNT(PositionName) ASC
LIMIT 1;

-- Question 11: Th???ng k?? m???i ph??ng ban c?? bao nhi??u dev, test, scrum master, PM
SELECT d.DepartmentID,d.DepartmentName, p.PositionName, count(p.PositionName)
FROM `Account` a
INNER JOIN Department d ON a.DepartmentID = d.DepartmentID
INNER JOIN `Position` p ON a.PositionID = p.PositionID
GROUP BY d.DepartmentID, p.PositionID;


-- Question 12: L???y th??ng tin chi ti???t c???a c??u h???i bao g???m: th??ng tin c?? b???n c???a question, lo???i c??u h???i, ai l?? ng?????i t???o ra c??u h???i, c??u tr??? l???i l?? g??, ???
SELECT Q.QuestionID,Q.Content,Q.CreateDate,C.CategoryName,T.TypeName,A.Username
 FROM Question Q
 JOIN CategoryQuestion C ON Q.CategoryID=C.CategoryID
 JOIN TypeQuestion T ON Q.TypeID=T.TypeID
 JOIN `Account` A ON Q.CreatorID=A.AccountId;
 
 -- Question 13: L???y ra s??? l?????ng c??u h???i c???a m???i lo???i t??? lu???n hay tr???c nghi???m
 SELECT *,COUNT(TypeName)
 FROM Question Q
JOIN TypeQuestion T ON Q.TypeID=T.TypeID
GROUP BY T.TypeName;

-- Question 14:L???y ra group kh??ng c?? account n??o
SELECT *
FROM `Group` G
LEFT JOIN `Account` A ON G.CreatorID=A.AccountID
WHERE A.AccountID IS NULL;

-- Question 16: L???y ra question kh??ng c?? answer n??o
SELECT *
FROM Question Q
LEFT JOIN Answer A ON Q.QuestionID=A.QuestionID
WHERE A.Content IS NULL;

-- a) L???y c??c account thu???c nh??m th??? 1
-- b) L???y c??c account thu???c nh??m th??? 2
-- c) Gh??p 2 k???t qu??? t??? c??u a) v?? c??u b) sao cho kh??ng c?? record n??o tr??ng nhau
SELECT *
FROM `Account` A
 JOIN GroupAccount G ON A.AccountID=G.AccountID
 WHERE G.GroupID =1
 UNION
SELECT *
FROM `Account` A
 JOIN GroupAccount G ON A.AccountID=G.AccountID
 WHERE G.GroupID =2;
 
-- Question 18: 
-- a) L???y c??c group c?? l???n h??n 5 th??nh vi??n
-- b) L???y c??c group c?? nh??? h??n 7 th??nh vi??n
-- c) Gh??p 2 k???t qu??? t??? c??u a) v?? c??u b)

SELECT *,COUNT(gr.GroupID)
FROM GroupAccount G
JOIN `Group` gr ON G.GroupID=gr.GroupID
GROUP BY gr.GroupID
HAVING (COUNT(gr.GroupID))>5
UNION
SELECT *,COUNT(gr.GroupID)
FROM GroupAccount G
JOIN `Group` gr ON G.GroupID=gr.GroupID
GROUP BY gr.GroupID
HAVING (COUNT(gr.GroupID))<=7;