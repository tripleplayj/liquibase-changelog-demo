drop table  if exists movie;

create table if not exists movie
(
    id integer not null,
    title varchar(255) not null,
);

insert into movie
values(10001,'Ranga');

insert into movie
values(10002,'Ravi');

insert into movie
values(10003,'Panga');

insert into movie
values(10004,'Pavi');

insert into movie
values(10005,'Yanga');

insert into movie
values(10006,'Yavi');

insert into movie
values(10007,'Danga');

insert into movie
values(10008,'Mavi');
