DROP DATABASE IF EXISTS Fresher;
CREATE DATABASE Fresher;
USE Fresher;

CREATE TABLE Trainee(
TraineeID			TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
Full_Name			NVARCHAR(30),
Birth_Date			DATE,
Gender				ENUM('male', 'female','unknown'),
ET_IQ				FLOAT UNSIGNED,CHECK(ET_IQ<=20),
ET_Gmath			FLOAT UNSIGNED,CHECK(ET_Gmath<=20),
ET_English			FLOAT UNSIGNED,CHECK(ET_English<=50),
Training_Class		NVARCHAR(20),
Evaluation_Notes	NVARCHAR(50)
);

-- Qs2
ALTER TABLE Trainee
ADD COLUMN VTI_Account TINYINT UNIQUE NOT NULL;
INSERT INTO Trainee(Full_Name,			Birth_Date,			Gender,				ET_IQ,		ET_Gmath,	ET_English,		Training_Class,		Evaluation_Notes) VALUES
					('Vũ Thị Nhài',			'1999-02-03',		'male',			8,			12,			30,					'LH01',			'Nhận xét 1'),
                    ('Vũ Thanh Tú',			'1998-03-03',		'female',		12,			15,			25,					'LH02',			'Nhận xét 2'),
                    ('Nguyễn Thị Hoa',		'2000-09-03',		'male',			8.6,		13,			40,					'LH03',			'Nhận xét 3'),
                    ('Vũ Thị Huế',			'1999-02-03',		'female',		10,			18,			45,					'LH04',			'Nhận xét 4'),
                    ('Tống Huế',			'1998-03-08',		'female',		14,			19,			47,					'LH05',			'Nhận xét 5'),
                    ('Trần Đình Vũ',			'2000-02-12',		'male',			7,			11,			36,					'LH06',			'Nhận xét 6'),
                    ('Tạ Thị Trang',			'1996-12-03',		'male',			9,			12.6,		42,					'LH07',			'Nhận xét 7'),
                    ('Hoàng Vũ Hùng',			'1999-12-18',		'female',		16,			9.5,		38,					'LH08',			'Nhận xét 8'),
                    ('Trướng Văn Tính',			'1998-08-25',		'female',		17.5,		10,			25,					'LH09',			'Nhận xét 9'),
                    ('Tạ Thị Lan',			'2001-08-15',		'male',			9,			14,			36,					'LH10',			'Nhận xét 10');
   
   
   -- Question 3: Viết lệnh để lấy ra thực tập sinh có tên dài nhất, lấy ra các thông tin
SELECT * 
FROM Trainee
WHERE LENGTH(Full_Name) = (SELECT MAX(LENGTH(Full_Name)) FROM Trainee) 
ORDER BY Full_Name DESC;


-- Question 4: Viết lệnh để lấy ra tất cả các thực tập sinh là ET, 1 ET thực tập sinh là những người đã vượt qua bài test đầu vào và thỏa mãn số điểm như sau:
	--  ET_IQ + ET_Gmath>=20
--  ET_IQ>=8
--  ET_Gmath>=8
-- ET_English>=1

SELECT * 
FROM Trainee
WHERE (ET_IQ + ET_Gmath)>=20 AND ET_IQ>=8 AND ET_Gmath>=8 AND ET_English>=18;

-- Question 5: xóa thực tập sinh có TraineeID = 3
DELETE
FROM Trainee 
WHERE TraineeID = 3;


-- Question 6: Thực tập sinh có TraineeID = 5 được chuyển sang lớp "2". Hãy cập nhật thông tin vào database
UPDATE Trainee 
SET Training_Class=2
WHERE TraineeID = 5;

