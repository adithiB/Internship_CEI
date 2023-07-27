CREATE DATABASE crud;
USE crud;

create table users (
 id int NOT NULL auto_increment,
 name varchar(50) NOT NULL,
 email varchar(120) NOT NULL,
 age numeric,
 PRIMARY KEY (id)
);

drop table users;

alter table users auto_increment = 2;

insert into users values (6, "xyz", "xyz@gmail.com", 20);