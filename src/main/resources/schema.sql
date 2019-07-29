create schema  if not exists student_schema;

set schema student_schema;


create table if not exists student
(
    id integer not null,
    name varchar(255) not null,
    passport_number varchar(255) not null,
);

insert into student
values(10001,'Ranga', 'gdsf');

insert into student
values(10002,'Ravi', 'gdfsgfd');

insert into student
values(10003,'Panga', 'das');

insert into student
values(10004,'Pavi', 'gfd');

insert into student
values(10005,'Yanga', 'hfg');

insert into student
values(10006,'Yavi', 'jgh');

insert into student
values(10007,'Danga', 'fsd');

insert into student
values(10008,'Mavi', 'hfg');
