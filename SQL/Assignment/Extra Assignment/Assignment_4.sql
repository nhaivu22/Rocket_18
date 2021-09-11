DROP DATABASE IF EXISTS Manage;
CREATE DATABASE Manage;
USE Manage;

CREATE TABLE Department(
	Department_Number 	TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Department_Name		NVARCHAR(50) UNIQUE KEY NOT NULL
);



CREATE TABLE Employee_Table(
	Employee_Number 	TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Employee_Name		NVARCHAR(50) NOT NULL,
    Department_Number	TINYINT UNSIGNED NOT NULL,
    FOREIGN KEY(Department_Number) REFERENCES Department(Department_Number)
);


CREATE TABLE Employee_Skill_Table(
	Employee_Number 	TINYINT UNSIGNED AUTO_INCREMENT,
    Skill_Code			NVARCHAR(20) NOT NULL,
    Date_Registered		DATETIME DEFAULT NOW(),
    FOREIGN KEY(Employee_Number) REFERENCES Employee_Table(Employee_Number)
);

INSERT INTO Department	(Department_Name) 
VALUE 					(N'NTR'	),
						(N'Sale'		),
						(N'Marketing'		),
						(N'Kinh Doanh'		),
						(N'Bán Hàng'	),
						(N'Nhân sự'	),
						(N'Truyền Thông'),
						(N'Giám đốc'	),
						(N'Thư kí'		),
						(N'Nói Chuyện'	);


INSERT INTO Employee_Table 	(Employee_Name		, Department_Number	)
VALUE						('Vũ Thị Nhài'		,		1			),
							('Tạ Thị Hoa'		,		2			),
                            ('Tống Mạnh Dũng'	,		3			),
                            ('Thiên Văn'		,		5			),
                            ('Trọng Thanh Bình'	,		4			),
                            ('Trần Văn Thông'	,		5			),
                            ('Thanh Thúy Tú'	,		6			),
                            ('Hoàng Văn Phan'	,		7			),
                            ('Thanh Thị Thúy'	,		3			),
                            ('Đỗ Thanh Thị'		,		10			);


INSERT INTO Employee_Skill_Table 	( Skill_Code	, Date_Registered	)
VALUE								( 	'Java'		, '2021-02-01'		),
									( 	'ABT'		, '2019-07-03'		),
									( 	'BGR'		, '2020-09-02'		),
									( 	'Java'		, '2019-06-18'		),
									( 	'PJT'		, '2020-02-03'		),
									( 	'VTI'		, '2020-07-09'		),
									( 	'TDE'		, '2021-01-12'		),
									( 	'MNY'		, '2021-02-15'		),
									( 	'VRD'		, '2019-09-13'		),
									( 	'PHP'		, '2020-12-01'		);
                                    
               --  Question 3: Viết lệnh để lấy ra danh sách nhân viên (name) có skill Java
SELECT *
FROM Employee_Table Et
JOIN Employee_Skill_Table Es ON Et.Employee_Number=Es.Employee_Number
WHERE Es.Skill_Code='Java';
							
 -- Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên  
 SELECT *,COUNT(E.Department_Number)
 FROM Department D
 JOIN Employee_Table E ON D.Department_Number=E.Department_Number
 GROUP BY E.Department_Number
 HAVING COUNT(E.Department_Number)>1;

-- Question 5: Viết lệnh để lấy ra danh sách nhân viên của mỗi văn phòng ban. 	
SELECT *,COUNT(E.Department_Number)
 FROM Department D
 JOIN Employee_Table E ON D.Department_Number=E.Department_Number
 GROUP BY E.Department_Number;


-- Question 6: Viết lệnh để lấy ra danh sách nhân viên có > 1 skills.
SELECT *,count(Es.Employee_Number)
FROM Employee_Table Et
JOIN Employee_Skill_Table Es ON Et.Employee_Number=Es.Employee_Number
GROUP BY Es.Employee_Number
HAVING (count(Es.Employee_Number))>1;