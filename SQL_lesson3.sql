-- create a table
CREATE TABLE employees (
  id INTEGER PRIMARY KEY,
  name VARCHAR(30),
  dob DATE,
  start_job DATE,
  position VARCHAR(30),
  grade VARCHAR(30),
  id_department INTEGER,
  salary NUMERIC,
  driving_license BOOLEAN
);
-- insert some values
INSERT INTO employees VALUES (1, 'Tommy Bufalo', '1985-12-01', '2000-05-06', 'manager', 'middle', 3, 500, True);
INSERT INTO employees VALUES (2, 'Jim Roy', '1990-11-03', '2005-07-24', 'manager', 'senior', 3, 800, True);
INSERT INTO employees VALUES (3, 'Kara May', '1980-10-22', '2010-09-19', 'manager', 'lead', 4, 1000, False);
INSERT INTO employees VALUES (4, 'Joice Moor', '2000-11-07', '2020-03-12', 'specialist', 'jun', 4, 200, False);
INSERT INTO employees VALUES (5, 'Chris Boom', '2005-01-21', '2021-11-16', 'specialist', 'jun', 3, 300, False);

-- fetch some values
SELECT * FROM employees;

-- create a TABLE 
CREATE TABLE department (
  id_department INTEGER PRIMARY KEY,
  name_departent VARCHAR(30),
  manager_name VARCHAR(30),
  number_employees INTEGER
);
-- insert some values
INSERT INTO department VALUES (3,'IT','Tommy Bufalo', 2);
INSERT INTO department VALUES (4,'Finance','Kara May', 1);

-- fetch some values
-- SELECT * FROM department;

-- create a TABLE 
CREATE TABLE bonus (
  id INTEGER PRIMARY KEY,
  name VARCHAR(30),
  first_q VARCHAR (2),
  second_q VARCHAR (2),
  third_q VARCHAR (2),
  forth_q VARCHAR (2)
);
-- insert some values
INSERT INTO bonus VALUES (1,'Tommy Bufalo','A','B','A','A');
INSERT INTO bonus VALUES (2, 'Jim Roy','E','D','D','D');
INSERT INTO bonus VALUES (3,'Kara May','B','B','C','C');
INSERT INTO bonus VALUES (4,'Joice Moor','A','A','A','A');
INSERT INTO bonus VALUES (5,'Chris Boom','C','B','B','B');


-- fetch some values
-- SELECT * FROM bonus;


INSERT INTO employees VALUES (6, 'Cortney Love', '1982-03-29', '2022-11-01', 'manager', 'lead', 5, 1200, True);
INSERT INTO employees VALUES (7, 'Eleanor Dola', '2001-11-07', '2022-11-01', 'specialist', 'middle', 5, 700, True);
INSERT INTO employees VALUES (8, 'Dean Merfy', '2004-01-21', '2022-11-01', 'specialist', 'jun', 5, 650, False);
-- SELECT * FROM employees;
INSERT INTO department VALUES (5,'AI','Cortney Love', 2);
-- SELECT * FROM department;
-- INSERT INTO bonus VALUES (6,'Cortney Love','B','B','C','C');
-- INSERT INTO bonus VALUES (7,'Eleonor Dola','A','A','A','A');
-- INSERT INTO bonus VALUES (8,'Dean Merfy','C','B','B','B');

-- Уникальный номер сотрудника, его ФИО и стаж работы – для всех сотрудников компании
SELECT
  id,
  name,
  start_job,
  CAST(current_date - start_job as TIME) as working_years
FROM employees;

-- Уникальный номер сотрудника, его ФИО и стаж работы – только первых 3-х сотрудников
SELECT
  id,
  name,
  start_job,
  CAST(current_date - start_job as TIME) as working_years
FROM employees LIMIT 3;

-- Уникальный номер сотрудников - водителей
SELECT
  id,
  name,
  driving_license
FROM employees 
where driving_license = 1;

-- Выведите номера сотрудников, которые хотя бы за 1 квартал получили оценку D или E
SELECT
  id,
  name,
  first_q
FROM bonus 
where (first_q = "D" OR first_q = "E") ;

--  Выведите самую высокую зарплату в компании.
SELECT
  id,
  name,
  salary
FROM 
employees
-- where salary >100;
where salary = (select max(salary) from employees);
-- ;
