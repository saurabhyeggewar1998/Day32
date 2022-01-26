Enter password: ********
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 19
Server version: 8.0.26 MySQL Community Server - GPL

Copyright (c) 2000, 2021, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| amitdb             |
| batch6am           |
| batch7am           |
| batch9am           |
| information_schema |
| mysql              |
| payroll_service    |
| performance_schema |
| sys                |
+--------------------+
9 rows in set (0.00 sec)


mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| amitdb             |
| batch6am           |
| batch7am           |
| batch9am           |
| information_schema |
| mysql              |
| payroll_service    |
| performance_schema |
| sys                |
+--------------------+
9 rows in set (0.00 sec)

mysql> use payroll_service;
Database changed
mysql> create table payroll_service (id int not null auto_increment, name varchar(50) not null, salary double not null, start date not null, primary key(id));
Query OK, 0 rows affected (0.07 sec)

mysql> describe  payroll_service;
+--------+-------------+------+-----+---------+----------------+
| Field  | Type        | Null | Key | Default | Extra          |
+--------+-------------+------+-----+---------+----------------+
| id     | int         | NO   | PRI | NULL    | auto_increment |
| name   | varchar(50) | NO   |     | NULL    |                |
| salary | double      | NO   |     | NULL    |                |
| start  | date        | NO   |     | NULL    |                |
+--------+-------------+------+-----+---------+----------------+
4 rows in set (0.02 sec)

mysql> insert into  payroll_service (name, salary, start) values ('Saurabh', 100000.00, '2020-01-03');
Query OK, 1 row affected (0.03 sec)

mysql> insert into  payroll_service (name, salary, start) values ('Rabbu', 200000.00, '2020-01-05');
Query OK, 1 row affected (0.01 sec)

mysql> insert into  payroll_service (name, salary, start) values ('Prashant', 300000.00, '2021-01-08');
Query OK, 1 row affected (0.01 sec)

mysql> select * from employee_payroll;
ERROR 1146 (42S02): Table 'payroll_service.employee_payroll' doesn't exist
mysql> select * from payroll_service;
+----+----------+--------+------------+
| id | name     | salary | start      |
+----+----------+--------+------------+
|  1 | Saurabh  | 100000 | 2020-01-03 |
|  2 | Rabbu    | 200000 | 2020-01-05 |
|  3 | Prashant | 300000 | 2021-01-08 |
+----+----------+--------+------------+
3 rows in set (0.01 sec)

mysql> delete from  employee_payroll where name ='Rabbu';
ERROR 1146 (42S02): Table 'payroll_service.employee_payroll' doesn't exist
mysql> delete from   payroll_service where name ='Rabbu';
Query OK, 1 row affected (0.01 sec)

mysql> select * from payroll_service;
+----+----------+--------+------------+
| id | name     | salary | start      |
+----+----------+--------+------------+
|  1 | Saurabh  | 100000 | 2020-01-03 |
|  3 | Prashant | 300000 | 2021-01-08 |
+----+----------+--------+------------+
2 rows in set (0.01 sec)

mysql> alter table payroll_service add gender char(1) after name;
Query OK, 0 rows affected (0.08 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> select * from payroll_service;
+----+----------+--------+--------+------------+
| id | name     | gender | salary | start      |
+----+----------+--------+--------+------------+
|  1 | Saurabh  | NULL   | 100000 | 2020-01-03 |
|  3 | Prashant | NULL   | 300000 | 2021-01-08 |
+----+----------+--------+--------+------------+
2 rows in set (0.00 sec)

mysql> insert into  payroll_service (name, gender, salary, start) values ('Prashant','m', 300000.00, '2021-01-08');
Query OK, 1 row affected (0.01 sec)

mysql> select * from payroll_service;
+----+----------+--------+--------+------------+
| id | name     | gender | salary | start      |
+----+----------+--------+--------+------------+
|  1 | Saurabh  | NULL   | 100000 | 2020-01-03 |
|  3 | Prashant | NULL   | 300000 | 2021-01-08 |
|  4 | Prashant | m      | 300000 | 2021-01-08 |
+----+----------+--------+--------+------------+
3 rows in set (0.01 sec)

mysql> insert into  payroll_service (name, gender, salary, start) values ('Saurabh','m', 100000.00, '2020-01-03');
Query OK, 1 row affected (0.01 sec)

mysql> select * from payroll_service;
+----+----------+--------+--------+------------+
| id | name     | gender | salary | start      |
+----+----------+--------+--------+------------+
|  1 | Saurabh  | NULL   | 100000 | 2020-01-03 |
|  3 | Prashant | NULL   | 300000 | 2021-01-08 |
|  4 | Prashant | m      | 300000 | 2021-01-08 |
|  5 | Saurabh  | m      | 100000 | 2020-01-03 |
+----+----------+--------+--------+------------+
4 rows in set (0.00 sec)

mysql> update payroll_service set gender = 'm' where id=1;
Query OK, 1 row affected (0.02 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from payroll_service;
+----+----------+--------+--------+------------+
| id | name     | gender | salary | start      |
+----+----------+--------+--------+------------+
|  1 | Saurabh  | m      | 100000 | 2020-01-03 |
|  3 | Prashant | NULL   | 300000 | 2021-01-08 |
|  4 | Prashant | m      | 300000 | 2021-01-08 |
|  5 | Saurabh  | m      | 100000 | 2020-01-03 |
+----+----------+--------+--------+------------+
4 rows in set (0.00 sec)

mysql> update payroll_service set gender = 'm' where id=3;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from payroll_service;
+----+----------+--------+--------+------------+
| id | name     | gender | salary | start      |
+----+----------+--------+--------+------------+
|  1 | Saurabh  | m      | 100000 | 2020-01-03 |
|  3 | Prashant | m      | 300000 | 2021-01-08 |
|  4 | Prashant | m      | 300000 | 2021-01-08 |
|  5 | Saurabh  | m      | 100000 | 2020-01-03 |
+----+----------+--------+--------+------------+
4 rows in set (0.00 sec)

mysql>  delete from  employee_payroll where id =3;
ERROR 1146 (42S02): Table 'payroll_service.employee_payroll' doesn't exist
mysql>  delete from  payroll_service where id =3;
Query OK, 1 row affected (0.01 sec)

mysql> select * from payroll_service;
+----+----------+--------+--------+------------+
| id | name     | gender | salary | start      |
+----+----------+--------+--------+------------+
|  1 | Saurabh  | m      | 100000 | 2020-01-03 |
|  4 | Prashant | m      | 300000 | 2021-01-08 |
|  5 | Saurabh  | m      | 100000 | 2020-01-03 |
+----+----------+--------+--------+------------+
3 rows in set (0.00 sec)

mysql>  delete from  employee_payroll where id =5;
ERROR 1146 (42S02): Table 'payroll_service.employee_payroll' doesn't exist
mysql>  delete from  payroll_service where id =5;
Query OK, 1 row affected (0.01 sec)

mysql> select * from payroll_service;
+----+----------+--------+--------+------------+
| id | name     | gender | salary | start      |
+----+----------+--------+--------+------------+
|  1 | Saurabh  | m      | 100000 | 2020-01-03 |
|  4 | Prashant | m      | 300000 | 2021-01-08 |
+----+----------+--------+--------+------------+
2 rows in set (0.00 sec)

mysql> select sum(salary) from  payroll_service;
+-------------+
| sum(salary) |
+-------------+
|      400000 |
+-------------+
1 row in set (0.01 sec)

mysql> select sum(salary)as SUM_OF_SALARY from  payroll_service;
+---------------+
| SUM_OF_SALARY |
+---------------+
|        400000 |
+---------------+
1 row in set (0.00 sec)

mysql> select avg(salary)as AVG_OF_SALARY from  payroll_service;
+---------------+
| AVG_OF_SALARY |
+---------------+
|        200000 |
+---------------+
1 row in set (0.00 sec)