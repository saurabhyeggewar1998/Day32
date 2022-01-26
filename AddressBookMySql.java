Enter password: ********
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 20
Server version: 8.0.26 MySQL Community Server - GPL

Copyright (c) 2000, 2021, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> create database addressbook;
Query OK, 1 row affected (0.02 sec)

mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| addressbook        |
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
10 rows in set (0.02 sec)

mysql> use addressbook;
Database changed
mysql> clear
mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| addressbook        |
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
10 rows in set (0.00 sec)

mysql> use addressbook;
Database changed
mysql> create table  addressbook (id int not null auto_increment, firstname varchar(50) not null, lastname varchar(52) not null, address varchar(80) not null, city varchar(70) not null, state varchar(90) not null, zip varchar(15) not null, phonenumber varchar(20) not null, email varchar(85) not null,primary key(id));
Query OK, 0 rows affected (0.07 sec)

mysql> describe  addressbook;
+-------------+-------------+------+-----+---------+----------------+
| Field       | Type        | Null | Key | Default | Extra          |
+-------------+-------------+------+-----+---------+----------------+
| id          | int         | NO   | PRI | NULL    | auto_increment |
| firstname   | varchar(50) | NO   |     | NULL    |                |
| lastname    | varchar(52) | NO   |     | NULL    |                |
| address     | varchar(80) | NO   |     | NULL    |                |
| city        | varchar(70) | NO   |     | NULL    |                |
| state       | varchar(90) | NO   |     | NULL    |                |
| zip         | varchar(15) | NO   |     | NULL    |                |
| phonenumber | varchar(20) | NO   |     | NULL    |                |
| email       | varchar(85) | NO   |     | NULL    |                |
+-------------+-------------+------+-----+---------+----------------+
9 rows in set (0.02 sec)

mysql> inser into addressbook (firstname,lastname,address,city,state,zip,phonenumber,email) values ('Saurabh','Yeggewar','bhangram talodhi','Chandrpur','maharastra','442702','7057114002')
    -> ^C
mysql> insert into addressbook (firstname,lastname,address,city,state,zip,phonenumber,email) values ('Saurabh','Yeggewar','bhangram talodhi','Chandrpur','maharastra','442702','7057114002');
ERROR 1136 (21S01): Column count doesn't match value count at row 1
mysql> insert into addressbook (firstname,lastname,address,city,state,zip,phonenumber,email) values ('Saurabh','Yeggewar','bhangram talodhi','Chandrpur','maharastra','442702','7057114002','yeggewar@gmai.com');
Query OK, 1 row affected (0.01 sec)

mysql> select * from addressbook;
+----+-----------+----------+------------------+-----------+------------+--------+-------------+-------------------+
| id | firstname | lastname | address          | city      | state      | zip    | phonenumber | email             |
+----+-----------+----------+------------------+-----------+------------+--------+-------------+-------------------+
|  1 | Saurabh   | Yeggewar | bhangram talodhi | Chandrpur | maharastra | 442702 | 7057114002  | yeggewar@gmai.com |
+----+-----------+----------+------------------+-----------+------------+--------+-------------+-------------------+
1 row in set (0.01 sec)

mysql> insert into addressbook (firstname,lastname,address,city,state,zip,phonenumber,email) values ('Pooja','Yeggewar','bhangram talodhi','Chandrpur','maharastra','442702','9587114002','pooja@gmail.com');
Query OK, 1 row affected (0.01 sec)

mysql> select * from addressbook;
+----+-----------+----------+------------------+-----------+------------+--------+-------------+-------------------+
| id | firstname | lastname | address          | city      | state      | zip    | phonenumber | email             |
+----+-----------+----------+------------------+-----------+------------+--------+-------------+-------------------+
|  1 | Saurabh   | Yeggewar | bhangram talodhi | Chandrpur | maharastra | 442702 | 7057114002  | yeggewar@gmai.com |
|  2 | Pooja     | Yeggewar | bhangram talodhi | Chandrpur | maharastra | 442702 | 9587114002  | pooja@gmail.com   |
+----+-----------+----------+------------------+-----------+------------+--------+-------------+-------------------+
2 rows in set (0.00 sec)

mysql> insert into addressbook (firstname,lastname,address,city,state,zip,phonenumber,email) values ('Vaibhav','Yeole','Gondpipri','Chandrpur','maharastra','442708','9857114002',Vaibhav1r@gmai.com');
    '> ^C
mysql> insert into addressbook (firstname,lastname,address,city,state,zip,phonenumber,email) values ('Vaibhav','Yeole','Gondpipri','Chandrpur','maharastra','442708','9857114002','Vaibhav1r@gmai.com');
Query OK, 1 row affected (0.01 sec)

mysql> select * from addressbook;
+----+-----------+----------+------------------+-----------+------------+--------+-------------+--------------------+
| id | firstname | lastname | address          | city      | state      | zip    | phonenumber | email              |
+----+-----------+----------+------------------+-----------+------------+--------+-------------+--------------------+
|  1 | Saurabh   | Yeggewar | bhangram talodhi | Chandrpur | maharastra | 442702 | 7057114002  | yeggewar@gmai.com  |
|  2 | Pooja     | Yeggewar | bhangram talodhi | Chandrpur | maharastra | 442702 | 9587114002  | pooja@gmail.com    |
|  3 | Vaibhav   | Yeole    | Gondpipri        | Chandrpur | maharastra | 442708 | 9857114002  | Vaibhav1r@gmai.com |
+----+-----------+----------+------------------+-----------+------------+--------+-------------+--------------------+
3 rows in set (0.00 sec)

mysql> select * from addressbook orderd by firstname;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'by firstname' at line 1
mysql> delete from addressbook where firstname='Vaibhav';
Query OK, 1 row affected (0.01 sec)

mysql> select * from addressbook;
+----+-----------+----------+------------------+-----------+------------+--------+-------------+-------------------+
| id | firstname | lastname | address          | city      | state      | zip    | phonenumber | email             |
+----+-----------+----------+------------------+-----------+------------+--------+-------------+-------------------+
|  1 | Saurabh   | Yeggewar | bhangram talodhi | Chandrpur | maharastra | 442702 | 7057114002  | yeggewar@gmai.com |
|  2 | Pooja     | Yeggewar | bhangram talodhi | Chandrpur | maharastra | 442702 | 9587114002  | pooja@gmail.com   |
+----+-----------+----------+------------------+-----------+------------+--------+-------------+-------------------+
2 rows in set (0.01 sec)

mysql> insert into addressbook (firstname,lastname,address,city,state,zip,phonenumber,email) values ('vishnu','kewle','higna','Nagpur','maharastra','442800','7574114002','vishnyr@gmai.com');
Query OK, 1 row affected (0.01 sec)

mysql> select * from addressbook;
+----+-----------+----------+------------------+-----------+------------+--------+-------------+-------------------+
| id | firstname | lastname | address          | city      | state      | zip    | phonenumber | email             |
+----+-----------+----------+------------------+-----------+------------+--------+-------------+-------------------+
|  1 | Saurabh   | Yeggewar | bhangram talodhi | Chandrpur | maharastra | 442702 | 7057114002  | yeggewar@gmai.com |
|  2 | Pooja     | Yeggewar | bhangram talodhi | Chandrpur | maharastra | 442702 | 9587114002  | pooja@gmail.com   |
|  4 | vishnu    | kewle    | higna            | Nagpur    | maharastra | 442800 | 7574114002  | vishnyr@gmai.com  |
+----+-----------+----------+------------------+-----------+------------+--------+-------------+-------------------+
3 rows in set (0.01 sec)

mysql> select firstname from addressbook orderd by firstname;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'by firstname' at line 1
mysql> update addressbook set =name 'Ramesh' where id =4;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '=name 'Ramesh' where id =4' at line 1
mysql> update addressbook set name = 'Ramesh' where id =4;
ERROR 1054 (42S22): Unknown column 'name' in 'field list'
mysql> update addressbook set firstname = 'Ramesh' where id =4;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from addressbook;
+----+-----------+----------+------------------+-----------+------------+--------+-------------+-------------------+
| id | firstname | lastname | address          | city      | state      | zip    | phonenumber | email             |
+----+-----------+----------+------------------+-----------+------------+--------+-------------+-------------------+
|  1 | Saurabh   | Yeggewar | bhangram talodhi | Chandrpur | maharastra | 442702 | 7057114002  | yeggewar@gmai.com |
|  2 | Pooja     | Yeggewar | bhangram talodhi | Chandrpur | maharastra | 442702 | 9587114002  | pooja@gmail.com   |
|  4 | Ramesh    | kewle    | higna            | Nagpur    | maharastra | 442800 | 7574114002  | vishnyr@gmai.com  |
+----+-----------+----------+------------------+-----------+------------+--------+-------------+-------------------+
3 rows in set (0.00 sec)

mysql> select firstname from user ORDER BY firstname;
ERROR 1146 (42S02): Table 'addressbook.user' doesn't exist
mysql> select firstname from addressbook ORDER BY firstname;
+-----------+
| firstname |
+-----------+
| Pooja     |
| Ramesh    |
| Saurabh   |
+-----------+
3 rows in set (0.01 sec)

mysql> select * from addressbook;
+----+-----------+----------+------------------+-----------+------------+--------+-------------+-------------------+
| id | firstname | lastname | address          | city      | state      | zip    | phonenumber | email             |
+----+-----------+----------+------------------+-----------+------------+--------+-------------+-------------------+
|  1 | Saurabh   | Yeggewar | bhangram talodhi | Chandrpur | maharastra | 442702 | 7057114002  | yeggewar@gmai.com |
|  2 | Pooja     | Yeggewar | bhangram talodhi | Chandrpur | maharastra | 442702 | 9587114002  | pooja@gmail.com   |
|  4 | Ramesh    | kewle    | higna            | Nagpur    | maharastra | 442800 | 7574114002  | vishnyr@gmai.com  |
+----+-----------+----------+------------------+-----------+------------+--------+-------------+-------------------+
3 rows in set (0.00 sec)

mysql> alter table addressbook add ContactType varchar(200);
Query OK, 0 rows affected (0.06 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> select * from addressbook;
+----+-----------+----------+------------------+-----------+------------+--------+-------------+-------------------+-------------+
| id | firstname | lastname | address          | city      | state      | zip    | phonenumber | email             | ContactType |
+----+-----------+----------+------------------+-----------+------------+--------+-------------+-------------------+-------------+
|  1 | Saurabh   | Yeggewar | bhangram talodhi | Chandrpur | maharastra | 442702 | 7057114002  | yeggewar@gmai.com | NULL        |
|  2 | Pooja     | Yeggewar | bhangram talodhi | Chandrpur | maharastra | 442702 | 9587114002  | pooja@gmail.com   | NULL        |
|  4 | Ramesh    | kewle    | higna            | Nagpur    | maharastra | 442800 | 7574114002  | vishnyr@gmai.com  | NULL        |
+----+-----------+----------+------------------+-----------+------------+--------+-------------+-------------------+-------------+
3 rows in set (0.01 sec)

mysql> update addressbook set ContactType = 'family' where id =1;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from addressbook;
+----+-----------+----------+------------------+-----------+------------+--------+-------------+-------------------+-------------+
| id | firstname | lastname | address          | city      | state      | zip    | phonenumber | email             | ContactType |
+----+-----------+----------+------------------+-----------+------------+--------+-------------+-------------------+-------------+
|  1 | Saurabh   | Yeggewar | bhangram talodhi | Chandrpur | maharastra | 442702 | 7057114002  | yeggewar@gmai.com | family      |
|  2 | Pooja     | Yeggewar | bhangram talodhi | Chandrpur | maharastra | 442702 | 9587114002  | pooja@gmail.com   | NULL        |
|  4 | Ramesh    | kewle    | higna            | Nagpur    | maharastra | 442800 | 7574114002  | vishnyr@gmai.com  | NULL        |
+----+-----------+----------+------------------+-----------+------------+--------+-------------+-------------------+-------------+
3 rows in set (0.00 sec)

mysql> update addressbook set ContactType = 'family' where id =2;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from addressbook;
+----+-----------+----------+------------------+-----------+------------+--------+-------------+-------------------+-------------+
| id | firstname | lastname | address          | city      | state      | zip    | phonenumber | email             | ContactType |
+----+-----------+----------+------------------+-----------+------------+--------+-------------+-------------------+-------------+
|  1 | Saurabh   | Yeggewar | bhangram talodhi | Chandrpur | maharastra | 442702 | 7057114002  | yeggewar@gmai.com | family      |
|  2 | Pooja     | Yeggewar | bhangram talodhi | Chandrpur | maharastra | 442702 | 9587114002  | pooja@gmail.com   | family      |
|  4 | Ramesh    | kewle    | higna            | Nagpur    | maharastra | 442800 | 7574114002  | vishnyr@gmai.com  | NULL        |
+----+-----------+----------+------------------+-----------+------------+--------+-------------+-------------------+-------------+
3 rows in set (0.01 sec)

mysql> update addressbook set ContactType = 'friend' where id =4;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from addressbook;
+----+-----------+----------+------------------+-----------+------------+--------+-------------+-------------------+-------------+
| id | firstname | lastname | address          | city      | state      | zip    | phonenumber | email             | ContactType |
+----+-----------+----------+------------------+-----------+------------+--------+-------------+-------------------+-------------+
|  1 | Saurabh   | Yeggewar | bhangram talodhi | Chandrpur | maharastra | 442702 | 7057114002  | yeggewar@gmai.com | family      |
|  2 | Pooja     | Yeggewar | bhangram talodhi | Chandrpur | maharastra | 442702 | 9587114002  | pooja@gmail.com   | family      |
|  4 | Ramesh    | kewle    | higna            | Nagpur    | maharastra | 442800 | 7574114002  | vishnyr@gmai.com  | friend      |
+----+-----------+----------+------------------+-----------+------------+--------+-------------+-------------------+-------------+
3 rows in set (0.00 sec)

mysql>  select count(*)  from  addressbook where ContactType = "friend";
+----------+
| count(*) |
+----------+
|        1 |
+----------+
1 row in set (0.01 sec)

mysql> insert into addressbook (firstname,lastname,address,city,state,zip,phonenumber,email) values ('Pranay','Bansod','Gadchiroli complex','Gadchiroli','maharastra','542800','8874114002','Basod@gmail.com');
Query OK, 1 row affected (0.01 sec)

mysql> select * from addressbook;
+----+-----------+----------+--------------------+------------+------------+--------+-------------+-------------------+-------------+
| id | firstname | lastname | address            | city       | state      | zip    | phonenumber | email             | ContactType |
+----+-----------+----------+--------------------+------------+------------+--------+-------------+-------------------+-------------+
|  1 | Saurabh   | Yeggewar | bhangram talodhi   | Chandrpur  | maharastra | 442702 | 7057114002  | yeggewar@gmai.com | family      |
|  2 | Pooja     | Yeggewar | bhangram talodhi   | Chandrpur  | maharastra | 442702 | 9587114002  | pooja@gmail.com   | family      |
|  4 | Ramesh    | kewle    | higna              | Nagpur     | maharastra | 442800 | 7574114002  | vishnyr@gmai.com  | friend      |
|  5 | Pranay    | Bansod   | Gadchiroli complex | Gadchiroli | maharastra | 542800 | 8874114002  | Basod@gmail.com   | NULL        |
+----+-----------+----------+--------------------+------------+------------+--------+-------------+-------------------+-------------+
4 rows in set (0.01 sec)

mysql> c