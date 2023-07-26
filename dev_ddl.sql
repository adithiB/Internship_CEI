create database dev_db;
#drop database dev_db;
create table dev_db.login (id numeric, username varchar(50), active_flag boolean);
alter table dev_db.login add constraint unique_1 unique (id);
alter table dev_db.login add constraint prkey_login_id primary key (id);