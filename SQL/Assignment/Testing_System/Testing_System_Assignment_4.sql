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
                                                ('Nhân Sự'),
                                                ('Bảo Vệ '),
                                                ('Kế Toán'),
                                                ('Bán Hàng'),
                                                ('Kỹ Thuật'),
                                                ('Tài Chính'),
                                                ('Tư Vấn'),
                                                ('Thư Kí');
INSERT INTO `Position`(PositionID,PositionName) VALUES ('1','Dev'),
											('2','Test'),
											('3','Scrum Master'),
											('4','PM');
	

  INSERT INTO `Account`(Email,					Username,		FullName,			DepartmentID,		PositionID,				CreateDate)		 VALUES
					('nhaivu22@gmail.com',		'Nhài',			'Vũ Thị Nhài',			'1',					'1',			'2019-02-19'),
					('hoa@gmail.com',			'Hoa',			'Vũ Hoa',				'2',					'2',			'2019-03-20'),
					('huehue@gmail.com',		'Huệ',			'Trần Thanh Huệ',		'3',					'3',			'2018-03-01'),
					('taam@gmail.com',			'Tâm',			'Nguyễn Tâm',			'4',					'4',			'2019-04-08'),
					('hung@gmail.com',			'Hùng',			'Vũ Văn  Hùng',			'4',					'3',			'2020-09-12'),
                    ('cong@gmail.com',			'Công',			'Minh Thành Công',		'5',					'2',			'2017-08-12'),
                    ('hoan@gmail.com',			'Hoan',			'Tạ Võ Hoan ',			'6',					'4',			'2018-07-15'),
                    ('huy@gmail.com',			'Huy',			'Trần Văn Huy',			'7',					'1',			'2020-10-07'),
                    ('tham@gmail.com',			'Thắm',			'Nguyễn Thị Thắm',		'8',					'2',			'2018-01-05'),
                    ('tinh@gmail.com',			'Tính',			'Hoàng Xuân Tính',		'9',					'3',			'2019-06-13'),
                    ('ngat@gmail.com',			'Ngát',			'Tạ Thị Ngát',			'10',					'3',			'2019-02-18'); 
                    
                    
INSERT INTO `Group`(GroupName,				CreatorID,		CreateDate) VALUES
						('Bán hàng 01 ',		'1',		'2019-02-03'),
                        ('Bán Hàng 02',			'2',		'2018-02-06'),
                        ('Sale 01',				'3',		'2019-08-03'),
                        ('Sale 02',				'4',		'2019-12-08'),
                        ('TOT 01',				'5',		'2018-07-02'),
                        ('TOT 02',				'6',		'2017-05-03'),
                        ('UYT',					'9',		'2020-09-07'),
                        ('VOV',					'7',		'2020-12-18'),
                        ('Tư Vấn',				'10',		'2020-01-02'),
                        ('Vận Động',			'8',		'2019-03-03'),
                        ('Nói Chuyện',			'5',		'2019-04-12');
                        

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
						('Câu hỏi về java 01',			1,				2,			2,					'2020-01-02'),
                        ('Câu hỏi về .NET',				2,				1,			5,					'2020-02-03'),
                        ('Câu hỏi về SQL',				3,				2,			3,					'2020-03-02'),
                        ('Câu hỏi về Ruby ',			5,				1,			4,					'2020-04-09'),
                        ('Câu hỏi về Postman',			4,				1,			7,					'2020-08-07'),
                        ('Câu hỏi về java 02',			1,				1,			9,					'2020-09-02'),
                        ('Câu hỏi về NET',				2,				2,			6,					'2020-10-06'),
                        ('Câu hỏi về C++',				3,				1,			1,					'2020-11-12'),
                        ('Câu hỏi về Python',			4,				2,			8,					'2020-05-18'),
                        ('Câu hỏi về ADO.NET',			2,				1,			2,					'2020-06-13');
                        
                        
INSERT INTO Answer(Content, 			QuestionID,		isCorrect) VALUES
					('Câu trả lời số 1',		1,			TRUE),
                    ('Câu trả lời số 2',		5,			FALSE),
                    ('Câu trả lời số 3',		3,			FALSE),
                    ('Câu trả lời số 4',		4,			TRUE),
                    ('Câu trả lời số 5',		2,			FALSE),
                    ('Câu trả lời số 6',		6,			FALSE),
                    ('Câu trả lời số 7',		7,			TRUE),
                    ('Câu trả lời số 8',		10,			TRUE),
                    ('Câu trả lời số 9',		8,			FALSE),
                    ('Câu trả lời số 10',		9,			FALSE);
                    

                    
INSERT INTO Exam(ExamID,	`Code`,				Title,				CategoryID,			Duration,			CreatorID,			CreateDate) VALUES
				(1,			'MD01',			 'Đề thi java',				2,					'60',					1,			'2021-01-01'),	
				(2,			'MD02',			 'Đề thi C',				1,					'150',					4,			'2021-08-02'),	
				(3,			'MD03',		 	'Đề thi C++',				4,					'120',					6,			'2021-06-03'),	
				(4,			'MD04',		 	'Đề thi Python',			3,					'180',					5,			'2021-08-04'),	
				(5,			'MD05',		 	'Đề thi Postman',			5,					'120',					3,			'2021-02-05'),	
				(6,			'MD06',		 	'Đề thi ADO.NET',			2,					'60',					2,			'2021-07-06'),	
				(7,			'MD07',		 	'Đề thi javascrip',			1,					'150',					7,			'2021-11-07'),	
				(8,			'MD08',		 	'Đề thi SQl',				5,					'180',					10,			'2021-01-08'),	
				(9,			'MD09',		 	'Đề thi MySQL',				3,					'120',					8,			'2021-09-08'),
				(10,			'MD10',		 	'Đề thi TIB',				4,				'60',					9,			'2021-12-10');
                
		
        
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
		

	-- Question 1: Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của họ			
SELECT *
FROM `Account` Ac
JOIN Department Dp ON Ac.DepartmentID=Dp.DepartmentID;

                    
-- Question 2: Viết lệnh để lấy ra thông tin các account được tạo sau ngày 20/12/2010
	SELECT *
    FROM `Account`
    WHERE CreateDate > '2010-12-20';


-- Question 3: Viết lệnh để lấy ra tất cả các developer
SELECT *
FROM `Account` A
JOIN Position p ON A.PositionID= p.PositionID
WHERE p.PositionName='Dev';

-- Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên
SELECT A.Email,A.Username,A.FullName,A.DepartmentID,D.DepartmentName, COUNT(DepartmentName)AS SL
FROM `Account` A
JOIN Department D ON A.DepartmentID=D.DepartmentID
GROUP BY DepartmentName
HAVING SL>3;

-- Question 5: Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều nhất
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


-- Question 6: Thông kê mỗi category Question được sử dụng trong bao nhiêu Question
SELECT *,COUNT(*)
FROM CategoryQuestion C
JOIN Question Q ON C.CategoryID=Q.CategoryID
GROUP BY Q.CategoryID;

-- question 7: Thông kê mỗi Question được sử dụng trong bao nhiêu Exam
SELECT *,COUNT(*)
FROM Question Q
JOIN ExamQuestion E ON Q.QuestionID=E.QuestionID
GROUP BY E.QuestionID;

-- question 8: Lấy ra Question có nhiều câu trả lời nhất
SELECT 		Q.QuestionID, Q.Content, COUNT(A.QuestionID) 
FROM		Question Q 
INNER JOIN 	Answer A ON	Q.QuestionID = A.QuestionID
GROUP BY	A.QuestionID
HAVING		COUNT(A.QuestionID) =	(SELECT 	MAX(CountQ)
									 FROM		(SELECT 		COUNT(A.QuestionID) AS CountQ
												FROM			Answer A 
												RIGHT JOIN  Question Q ON A.QuestionID = Q.QuestionID 
												GROUP BY		A.QuestionID) AS MaxCountQ);
                                                
                                                
                                                
-- Question 9: Thống kê số lượng account trong mỗi group
SELECT *,COUNT(Gr.AccountID)
FROM `Group` G
JOIN GroupAccount Gr ON G.GroupID=Gr.GroupID
GROUP BY Gr.AccountID;

-- Question 10: Tìm chức vụ có ít người nhất
SELECT A.AccountID,A.Email,A.Username,A.FullName,P.PositionName,COUNT(PositionName)
FROM `Account` A
JOIN `Position` P ON A.PositionID=P.PositionID
GROUP BY P.PositionName
ORDER BY COUNT(PositionName) ASC
LIMIT 1;

-- Question 11: Thống kê mỗi phòng ban có bao nhiêu dev, test, scrum master, PM
SELECT d.DepartmentID,d.DepartmentName, p.PositionName, count(p.PositionName)
FROM `account` a
INNER JOIN department d ON a.DepartmentID = d.DepartmentID
INNER JOIN position p ON a.PositionID = p.PositionID
GROUP BY d.DepartmentID, p.PositionID;


-- Question 12: Lấy thông tin chi tiết của câu hỏi bao gồm: thông tin cơ bản của question, loại câu hỏi, ai là người tạo ra câu hỏi, câu trả lời là gì, …
SELECT Q.QuestionID,Q.Content,Q.CreateDate,C.CategoryName,T.TypeName,A.Username
 FROM Question Q
 JOIN CategoryQuestion C ON Q.CategoryID=C.CategoryID
 JOIN TypeQuestion T ON Q.TypeID=T.TypeID
 JOIN `Account` A ON Q.CreatorID=A.AccountId;
 
 -- Question 13: Lấy ra số lượng câu hỏi của mỗi loại tự luận hay trắc nghiệm
 SELECT *,COUNT(TypeName)
 FROM Question Q
JOIN TypeQuestion T ON Q.TypeID=T.TypeID
GROUP BY T.TypeName;

-- Question 14:Lấy ra group không có account nào
SELECT *
FROM `Group` G
LEFT JOIN `Account` A ON G.CreatorID=A.AccountID
WHERE A.AccountID IS NULL;

-- Question 16: Lấy ra question không có answer nào
SELECT *
FROM Question Q
LEFT JOIN Answer A ON Q.QuestionID=A.QuestionID
WHERE A.Content IS NULL;

-- a) Lấy các account thuộc nhóm thứ 1
-- b) Lấy các account thuộc nhóm thứ 2
-- c) Ghép 2 kết quả từ câu a) và câu b) sao cho không có record nào trùng nhau
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
-- a) Lấy các group có lớn hơn 5 thành viên
-- b) Lấy các group có nhỏ hơn 7 thành viên
-- c) Ghép 2 kết quả từ câu a) và câu b)

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