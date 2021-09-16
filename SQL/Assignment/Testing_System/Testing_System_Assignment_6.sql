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
FOREIGN KEY(ExamID) REFERENCES Exam(ExamID) ON DELETE CASCADE,
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
                    ('Câu trả lời số 1',		5,			FALSE),
                    ('Câu trả lời số 1',		3,			FALSE),
                    ('Câu trả lời số 1',		4,			TRUE),
                    ('Câu trả lời số 1',		2,			FALSE),
                    ('Câu trả lời số 1',		6,			FALSE),
                    ('Câu trả lời số 1',		7,			TRUE),
                    ('Câu trả lời số 1',		10,			TRUE),
                    ('Câu trả lời số 1',		8,			FALSE),
                    ('Câu trả lời số 1',		9,			FALSE);
                    

                    
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
		

				
-- Question 1: Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các account thuộc phòng ban đó
DROP PROCEDURE IF EXISTS Pr_AccountInDepartment;
DELIMITER $$  
 CREATE PROCEDURE Pr_AccountInDepartment (IN in_DepartmentNameID TINYINT UNSIGNED )
 BEGIN 
						SELECT d.DepartmentName,a.AccountID,a.Email,a.Username,a.FullName,a.PositionID,a.CreateDate
						FROM Department d
						JOIN `Account` a On d.DepartmentID=a.DepartmentID
                        where d.DepartmentID=in_DepartmentNameID;
                        END $$
 DELIMITER ;   
call testingsystem_2.Pr_AccountInDepartment(1);


-- Question 3: Tạo store để thống kê mỗi type question có bao nhiêu question được tạo trong tháng hiện tại
DROP PROCEDURE IF EXISTS Pr_AccountInDepartment;
DELIMITER $$  
 CREATE PROCEDURE Pr_typeQuestion()
 BEGIN
	SELECT		COUNT(TypeID)
    FROM		Question
    WHERE		MONTH(CreateDate) = Month(NOW());
END $$
DELIMITER ;
call testingsystem_2.Pr_typeQuestion();

-- Question 4: Tạo store để trả ra id của type question có nhiều câu hỏi nhất
DROP PROCEDURE IF EXISTS Pr_idType;
DELIMITER $$
CREATE PROCEDURE Pr_idType()
BEGIN 
			SELECT T.*,COUNT(Q.TypeID)
			FROM Question Q 
			JOIN TypeQuestion T ON Q.TypeID=T.TypeID
			GROUP BY Q.TypeID
			ORDER BY COUNT(Q.TypeID) DESC
			LIMIT 1;
		END $$
	DELIMITER ;
call testingsystem_2.Pr_typeQuestion();

-- Question 5: Sử dụng store ở question 4 để tìm ra tên của type question


-- Question 6: Viết 1 store cho phép người dùng nhập vào 1 chuỗi và trả về group có tên  chứa chuỗi của người dùng nhập vào 
-- hoặc trả về user có username chứa chuỗi của người dùng nhập vào

DROP PROCEDURE IF EXISTS sp_nameOfGroupOrUserName;
DELIMITER $$
CREATE PROCEDURE Pr_NameGroup(IN in_GroupName VARCHAR(50), IN in_Usename VARCHAR(30))
BEGIN
	SELECT a.Username,a.FullName,g.GroupID,g.GroupName
    FROM `Account` a
    JOIN `Group` g ON a.AccountID=g.CreatorID
    WHERE g.GroupName=in_GroupName OR a.Username=in_Usename;

END$$
DELIMITER ;

-- Question 7: Viết 1 store cho phép người dùng nhập vào thông tin fullName, email và 
 -- trong store sẽ tự động gán:
-- username sẽ giống email nhưng bỏ phần @..mail đi
-- positionID: sẽ có default là developer
-- departmentID: sẽ được cho vào 1 phòng chờ
-- Sau đó in ra kết quả tạo thành công
DROP PROCEDURE IF EXISTS Pr_Inster;
DELIMITER $$
CREATE PROCEDURE Pr_Inster(IN in_fullName VARCHAR(50), IN in_Email VARCHAR(30))
BEGIN
	DECLARE Username VARCHAR(50) DEFAULT SUBSTRING_INDEX(in_Email,'@',1);
    DECLARE PositionID TINYINT UNSIGNED DEFAULT 1;
    DECLARE DepartmentID TINYINT UNSIGNED DEFAULT 1;
    DECLARE CreateDate DATETIME DEFAULT NOW();
	
	INSERT INTO `Account` 	(Email		,Username, FullName		, DepartmentID,	PositionID,	CreateDate)
    VALUE					(in_email	,Username, in_fullName	, DepartmentID, PositionID, CreateDate);
	
    SELECT 	*
    FROM 	`Account`;
    

END$$
DELIMITER ;


-- Question 8: Viết 1 store cho phép người dùng nhập vào Essay hoặc Multiple-Choice
 -- để thống kê câu hỏi essay hoặc multiple-choice nào có content dài nhất
 
 
 DROP PROCEDURE IF EXISTS Pr_MaxContent;
 DELIMITER $$
CREATE PROCEDURE Pr_MaxContent(IN in_TypeName VARCHAR(15))
BEGIN 
	if (in_TypeName='Essay') then
			SELECT Q.QuestionID,Q.Content,Q.TypeID,T.TypeName,MAX(length(Q.Content))
			FROM Question Q
			JOIN TypeQuestion T ON Q.TypeID=T.TypeID
			WHERE Q.TypeID=2;
    ELSEIF (in_TypeName='Multiple-Choice') THEN
			SELECT Q.QuestionID,Q.Content,Q.TypeID,T.TypeName,MAX(length(Q.Content))
			FROM Question Q
			JOIN TypeQuestion T ON Q.TypeID=T.TypeID
			WHERE Q.TypeID=1;
    END IF;
END $$
DELIMITER ;



 -- Question 9: Viết 1 store cho phép người dùng xóa exam dựa vào ID
 DROP PROCEDURE IF EXISTS Pr_DelID;
 DELIMITER $$
CREATE PROCEDURE Pr_DelID(IN in_ExamID TINYINT UNSIGNED)
BEGIN 
	DELETE 
    FROM Exam
    WHERE ExamID=in_ExamID;
END $$
DELIMITER ;

-- Question 10: Tìm ra các exam được tạo từ 3 năm trước và xóa các exam đó đi (sử 
 -- dụng store ở câu 9 để xóa)
-- Sau đó in số lượng record đã remove từ các table liên quan trong khi removing
DROP PROCEDURE IF EXISTS sp_DeleteUser3Years;
DELIMITER $$
CREATE PROCEDURE Pr_ExamID()
BEGIN
	WITH Exam_3Year AS(
		SELECT 	ExamID
		FROM 	Exam
		WHERE	(YEAR(NOW()) - YEAR(CreateDate)) > 3
    )
	DELETE
    FROM 	Exam
    WHERE 	ExamID = (SELECT * FROM Exam_3Year);
END$$
DELIMITER ;

-- Question 11: Viết store cho phép người dùng xóa phòng ban bằng cách người dùng 
-- nhập vào tên phòng ban và các account thuộc phòng ban đó sẽ được chuyển về phòng ban default là phòng ban chờ việc
DROP PROCEDURE IF EXISTS Pr_Delete_Department;
DELIMITER $$
CREATE PROCEDURE Pr_Delete_Department(IN in_DepartmentName NVARCHAR(30))
BEGIN
	UPDATE 	`Account`
    SET		DepartmentID = 10
    WHERE	DepartmentID = (SELECT 	DepartmentID	
							FROM	Department
							WHERE 	DepartmentName = in_DepartmentName);
	DELETE 
    FROM	Department
    WHERE	DepartmentName = in_DepartmentName;
END$$
DELIMITER ;



