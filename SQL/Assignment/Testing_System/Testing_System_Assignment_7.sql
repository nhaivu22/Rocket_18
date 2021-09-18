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
				(10,			'MD10',		 'Đề thi TIB',				4,				'60',					9,			'2021-12-10');
                
		
        
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
		

-- Question 1: Tạo trigger không cho phép người dùng nhập vào Group có ngày tạo trước 1 năm trước
DROP TRIGGER IF EXISTS Trigger_Group;
DELIMITER $$
CREATE TRIGGER Trigger_Group
BEFORE INSERT ON `Group`
FOR EACH ROW
BEGIN
		IF NEW.CreateDate < datediff(yyyy,1,now()) THEN
        SIGNAL SQLSTATE '12345'
        SET MESSAGE_TEXT='CreateDate BẠN NHẬP KHÔNG ĐÚNG ,VƯỢT QUÁ THỜI GIAN HIỆN TẠI';
        END IF;
	
END $$
DELIMITER ;
INSERT INTO `Group`(GroupName,				CreatorID,		CreateDate) VALUES
						('Bán hàng 01 ',		'1',		'2020-02-03');
   
   
 -- Question 2: Tạo trigger Không cho phép người dùng thêm bất kỳ user nào vào department "Sale" nữa, khi thêm thì hiện ra thông báo "Department
-- "Sale" cannot add more user"  
DROP TRIGGER IF EXISTS Not_Insert_User;
DELIMITER $$
CREATE TRIGGER Not_Insert_User
BEFORE INSERT ON `Account`
FOR EACH ROW
BEGIN
		DECLARE dep_ID TINYINT UNSIGNED ;
        SELECT D.DepartmentID INTO dep_ID
        FROM Department D
        WHERE D.DepartmentName='Sale';
        IF(NEW.DepartmentID=dep_ID) THEN
        SIGNAL SQLSTATE '12345'
        SET MESSAGE_TEXT='BẠN KHÔNG THỂ THÊM USER INTO Department ';
        END IF;

END $$
DELIMITER ;
 INSERT INTO `Account`(Email,					Username,		FullName,			DepartmentID,		PositionID,				CreateDate)		 VALUES
					('@gmail.com',		'Nhi',			'Vũ  Nhài',			'1',					'1',			'2019-02-19');
  
  
-- Question 3: Cấu hình 1 group có nhiều nhất là 5 user
DROP TRIGGER IF EXISTS Group_5Account;
DELIMITER $$
CREATE TRIGGER Group_5Account
BEFORE INSERT ON `Group`
FOR EACH ROW
BEGIN
		DECLARE Count_group TINYINT;
        SELECT count(G.GroupID) INTO Count_group
        FROM GroupAccount  G
        WHERE G.GroupID=NEW.GroupID;
        IF( Count_group>5) THEN
        SIGNAL SQLSTATE '12345'
        SET MESSAGE_TEXT='BẠN KHÔNG THỂ THÊM USER INTO Group  Một group chỉ có tối đa 5 User';
        END IF;

END $$
DELIMITER ;
INSERT INTO GroupAccount(GroupID,	AccountID,		JoinDate) VALUES
						( 1, 		2,				'2019-03-05');
                        
SELECT *
from GroupAccount;

-- Question 4: Cấu hình 1 bài thi có nhiều nhất là 10 Question

DROP TRIGGER IF EXISTS Examquestion10;
DELIMITER $$
CREATE TRIGGER Examquestion10
 BEFORE INSERT ON ExamQuestion
 FOR EACH ROW
 BEGIN
		DECLARE CountQuesInExam TINYINT;
		SELECT count(E.ExamID) INTO CountQuesInExam 
        FROM ExamQuestion E
		WHERE E.ExamID = NEW.ExamID;
		IF (CountQuesInExam >10) THEN
		SIGNAL SQLSTATE '12345'
		SET MESSAGE_TEXT = '1 bài thi có nhiều nhất là 10 Question';
END IF; 
 END$$
DELIMITER ;
INSERT INTO ExamQuestion(`ExamID`, `QuestionID`) VALUES (2, 2);

SELECT *
FROM ExamQuestion;


-- Question 5: Tạo trigger không cho phép người dùng xóa tài khoản có email là  admin@gmail.com (đây là tài khoản admin, không cho phép user xóa), 
  -- còn lại các tài khoản khác thì sẽ cho phép xóa và sẽ xóa tất cả các thông tin liên quan tới user đó
  DELETE 
  FROM `Account`
  WHERE Email='admin@gmail.com';

DROP TRIGGER IF EXISTS Trigger_Delete_email;
DELIMITER $$
CREATE TRIGGER Trigger_Delete_email
BEFORE DELETE ON `Account`
FOR EACH ROW
BEGIN
	DECLARE delete_email VARCHAR(30);
	SET v_Email = 'admin@gmail.com';
	IF (OLD.Email = delete_email) THEN
	SIGNAL SQLSTATE '12345'
	SET MESSAGE_TEXT = 'KHÔNG THỂ XÓA ACCOUNT CÓ EMAIL=admin@gmail.com';
 END IF;
END $$
DELIMITER ;
DELETE 
FROM `Account` 
WHERE Email='admin@gmail.com';


-- Question 6: Không sử dụng cấu hình default cho field DepartmentID của table  Account, hãy tạo trigger cho phép người dùng khi tạo account không điền 
 -- vào departmentID thì sẽ được phân vào phòng ban "waiting `Account` "
DROP TRIGGER IF EXISTS Trg_SetDepWaittingRoom;
DELIMITER $$
CREATE TRIGGER Trg_SetDepWaittingRoom
BEFORE INSERT ON `Account` 
FOR EACH ROW
BEGIN
	DECLARE Waitting_department VARCHAR(50);
	SELECT D.DepartmentID INTO Waitting_department
    FROM department D 
    WHERE D.DepartmentName = 'Waitting Department';
	IF (NEW.DepartmentID IS NULL ) THEN
	SET NEW.DepartmentID = Waitting_department;
 END IF;
END $$
DELIMITER ;
INSERT INTO `Account`  (Email, 			Username, FullName, PositionID,CreateDate) VALUES
						('thi@gmail.com','thu', 'Tạ Thị Thi', '2', '2018-12-06 ');


-- Question 7: Cấu hình 1 bài thi chỉ cho phép user tạo tối đa 4 answers cho mỗi  question, trong đó có tối đa 2 đáp án đúng.
-- Question 8: Viết trigger sửa lại dữ liệu cho đúng: Nếu người dùng nhập vào gender của account là nam, nữ, chưa xác định 
 -- Thì sẽ đổi lại thành M, F, U cho giống với cấu hình ở database

DROP TRIGGER IF EXISTS Gender_Account;
DELIMITER $$
CREATE TRIGGER Gender_Account
BEFORE INSERT ON `Account`
FOR EACH ROW
BEGIN
 IF NEW.Gender = 'Nam' THEN
 SET NEW.Gender = 'M';
 ELSEIF NEW.Gender = 'Nu' THEN
 SET NEW.Gender = 'F';
 ELSEIF NEW.Gender = 'Chưa xác định' THEN
 SET NEW.Gender = 'U';
 END IF ;
END $$
DELIMITER ;
-- Question 12: Lấy ra thông tin exam trong đó:
-- Duration <= 30 thì sẽ đổi thành giá trị "Short time"
-- 30 < Duration <= 60 thì sẽ đổi thành giá trị "Medium time"
-- Duration > 60 thì sẽ đổi thành giá trị "Long time"
DROP TRIGGER IF EXISTS Duration_exam;
DELIMITER $$
CREATE TRIGGER Duration_exam
BEFORE INSERT ON Exam
FOR EACH ROW
BEGIN
 IF NEW.Duration <= 30 THEN
 SET NEW.Duration = 'Short';
 ELSEIF 30< NEW.Duration <= '60' THEN
 SET NEW.Duration = 'Medium time';
 ELSEIF NEW.Duration >'60'  THEN
 SET NEW.Duration = 'Long time';
 END IF ;
END $$
DELIMITER ;

SELECT *
FROM Exam;
-- Question 14: Thống kê số mỗi phòng ban có bao nhiêu user, nếu phòng ban nào
-- không có user thì sẽ thay đổi giá trị 0 thành "Không có User"

SELECT D.DepartmentName, CASE 
 WHEN COUNT(A.DepartmentID) = 0 THEN 'Không có User'
 ELSE COUNT(A.DepartmentID)
END AS SL
FROM Department D 
LEFT JOIN account A ON D.DepartmentID = A.DepartmentID
GROUP BY d.DepartmentID;
