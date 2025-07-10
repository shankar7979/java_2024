show databases;
create database coforge_db;
use coforge_db;
show tables;
create table employee(id int primary key, name varchar(20), salary float(10,2));
describe employee;
desc employee;

insert into employee values(1001,'mohan kumar',34000.67676);

select * from employee;
select id, name from employee;

insert into employee values(1001,'amit kumar');


insert into employee (id,name) values(1001,'amit kumar');

insert into employee (id,name) values(1002,'amit kumar');

insert into employee (id,name) values(1002,'amit kumar');
 select * from employee where salary=34000.68;

 select * from employee where salary is null;



show databases;
use coforge_db;
create table customer (customer_id int, name varchar(20) not null unique, 
city varchar(20) not null default 'new delhi', salary float, check(salary>5000));
 insert into customer (customer_id,name,salary) values(10009,'vimal',10000);
 select * from customer;
 
 show tables;
 select * from employee;
 select * from employee where id=1001 or name='amit kumar';
select * from employee where id=1001 and name='amit kumar';

select * from employee where salary>=34000 and salary<90000;
-- same as above using between operator 

select * from employee where salary between 34000 and 90000;

-- using or for list of values 
select * from employee where name='shyam kumar' or name='mohan kumar'
 or name='sunil kumar';

-- using  in operator  for list of values 
select * from employee where name in ('shyam kumar' ,'mohan kumar'
 , 'sunil kumar');

desc  customer; 

select * from customer;  
-- parent table
create table examination (exam_id int , roll int unique, subject text, 
primary key(exam_id));
 -- child table
create table student( roll int, name varchar(20),location varchar(20),
primary key(roll), foreign key(roll) references examination(roll)
);
-- referential integrity 
select * from student;
select * from examination;

insert into examination values(1,90001,'math');
insert into student values(90001,'amirtesh','new delhi'); 
insert into student values(90002,'vimalesh','new delhi'); 
delete from examination;
delete from student;


SELECT current_date();
SELECT current_time();
SELECT NOW();
SELECT current_timestamp();
SELECT current_user();
CREATE TABLE  USER1
(id int  primary key auto_increment, uname text, dob date,entry_time time);
desc user1;
insert into user1 values(90001,'kamal kumar', current_date(), 
current_time());
select * from user1;
insert into user1 (uname,dob,entry_time) values
('vimal kumar', '1995-12-1','11:45');
show databases;
drop database db1;
create table test1(id int);
show tables;
drop table test1;
select * from employee;
delete from employee;
delete from employee where id=1002; 
desc employee;
insert into employee values(8787998, 'sri prithvi raj kapoor', 89000);
alter table employee modify name varchar(50);
 -- change will rename the column name
alter table employee change  name  emp_name varchar(50);
alter table employee modify id  int auto_increment; 
alter table employee add dob date;
show tables;
-- create another table as of same data and structure 
create table employee1 as select * from employee;
select * from employee2;
-- create another table as of  structure without data 
 create table employee2 as select * from employee where 1>100;
 
 insert into employee2 select * from employee;

 
 show databases;
 show tables;
 select * from employee1;
 update employee set salary=70000 where  id=1004;
update employee set salary=77000, emp_name='ramesh kumar' where  id=1004;
 
 
 create  table customer(customer_id int, name varchar(20), city text, salary float(10,2)); 
 
 
  alter table customer modify customer_id int primary key auto_increment;
  alter table customer add  dob date;
  alter table customer add  location text;
  desc customer;
  
 insert into customer (name,dob,location,city, salary) values
 ('anita sharma','2000-11-23','laxminagar','bhopal',20000.7667);

insert into customer (name,dob,location,city, salary) values
 ('surbhi sharma','2000-12-21','ganeshnagar','new delhi',90000.7667);
 
 insert into customer (name,dob,location,city, salary) values
 ('anita sharma','2001-10-23','preet vihar','new delhi',20000.7667);

 select * from customer;
 select distinct city from customer;
 select  city from customer;
  
 select id as "emp id ", emp_name, salary, salary-salary*0.02 "gross salary" from employee1;
 

select * from employee order by emp_name asc;
select * from employee order by emp_name desc;

 select * from employee where emp_name like 's%';
 select * from employee where emp_name like '%raj%' ;
 select * from employee where emp_name like '___a%' ;
 
select  avg(salary) "average salary", sum(salary) "total salary", min(salary) "minimum salary" , max(salary) "maximum salary" from employee;

select count(*) from employee;
select count(id) from employee;
 
  create table garment_product(id int primary key auto_increment, 
  type varchar(20), cost float, location text);
   insert into garment_product (type,cost,location) values('shirt',1500,'new delhi');
 insert into garment_product (type,cost,location) values('pant',1900,'new delhi');
 insert into garment_product (type,cost,location) values('trouser',1050,'new delhi');
insert into garment_product (type,cost,location) values('shirt',4000,'bhopal');
insert into garment_product (type,cost,location) values('pant',45000,'bhopal');
insert into garment_product (type,cost,location) values('jeans',23000,'bhopal');
insert into garment_product (type,cost,location) values('jeans',1400,'noida');
insert into garment_product (type,cost,location) values('shirt',1800,'noida');
insert into garment_product (type,cost,location) values('trouser',1800,'kolkotta');
insert into garment_product (type,cost,location) values('shirt',1600,'kolkotta');


 select count(type), type   from garment_product group by type;  
 select count(location),  location   from garment_product group by location; 
 select count(location),  count(type), location   from garment_product
 group by location having location='bhopal';
 
select count(location),  count(type), location   from garment_product
 group by location ;

-- join 

create table product_customer(cust_id int, name varchar(20), 
location varchar(29), primary key(cust_id));

create table product_order(order_id int, pname varchar(20), cost float,
 customer_id int, primary key(order_id));
 
insert into product_customer values
(1,'amit kumar','gr noida'),(2,'vimal kumar','delhi'),
(3,'kamal kumar','gr noida'),(4,'priyanshu kumar','bhopal'),
(5,'suman kumar','bhumneswar'),(6,'saurabh kumar','jaipur');
insert into product_order values
(9001,'book',1200,1),(9002,'sweets',400,2),(9003,'shirt',1800,7),
(9005,'bike',340000,5),(9006,'mobile',19000,8);
-- cartesian join 
select * from product_customer, product_order;
-- inner join or equi join 
-- list of all customers who have placed orders 
select * from product_customer, product_order where 
product_customer.cust_id=product_order.customer_id;

select * from product_customer p, product_order  o where 
p.cust_id=o.customer_id;
-- old sql 
select p.cust_id, p.name, p.location, o.order_id, o.pname, o.cost 
from product_customer p, product_order  o where 
p.cust_id=o.customer_id;
-- new ansi sql

select p.cust_id, p.name, p.location, o.order_id, o.pname, o.cost 
from product_customer p inner join product_order  o on 
p.cust_id=o.customer_id;

-- left join  display all customers
select p.cust_id, p.name, p.location, o.order_id, o.pname, o.cost 
from product_customer p left join product_order  o on 
p.cust_id=o.customer_id;

-- customers who have not given the orders 
select p.cust_id, p.name, p.location, o.order_id, o.pname, o.cost 
from product_customer p left join product_order  o on 
p.cust_id=o.customer_id where o.order_id is null;

-- right  join  display all orders
select p.cust_id, p.name, p.location, o.order_id, o.pname, o.cost 
from product_customer p right join product_order  o on 
p.cust_id=o.customer_id;

 -- full outer join not supported is achieved by the union of 
 -- left and right join 
select p.cust_id, p.name, p.location, o.order_id, o.pname, o.cost 
from product_customer p left join product_order  o on 
p.cust_id=o.customer_id
union 
select p.cust_id, p.name, p.location, o.order_id, o.pname, o.cost 
from product_customer p right join product_order  o on 
p.cust_id=o.customer_id;

-- sub query
-- display the employee having highest salary 

select * from employee;
select max(salary) from employee;
-- combine both        
    -- outer query                           inner query 
select * from employee where salary=(select max(salary) from employee);
select * from employee where salary=(select min(salary) from employee);

-- list of customers who placed orders  using join

select p.cust_id, p.name, p.location, o.order_id, o.pname, o.cost 
from product_customer p inner join product_order  o on 
p.cust_id=o.customer_id;

-- list of customers who placed orders  using  subquery 
select * from product_customer where cust_id in 
(select customer_id from product_order);  

-- list of customers who have not  placed orders  using  subquery 
select * from product_customer where cust_id not in 
(select customer_id from product_order);  

-- get the customer who has ordered product and have  highest order cost 

select * from product_customer where cust_id=
(select customer_id from product_order where cost=
(select max(cost) from product_order));

-- exits operator 

select * from product_customer where exists (select customer_id from product_order);  
-- similar using left join

select p.cust_id, p.name, p.location, o.order_id, o.pname, o.cost 
from product_customer p left join product_order  o on 
p.cust_id=o.customer_id

select * from product_customer where not  exists (select customer_id from product_order); 
