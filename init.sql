drop database if exists `quickstart`;
create database `quickstart` default character set utf8;
use `quickstart`;

create table `person` (
    id int(11) auto_increment not null,
    firstName varchar(255),
    LastName varchar(255),

    primary key(id)
) default charset=utf8;