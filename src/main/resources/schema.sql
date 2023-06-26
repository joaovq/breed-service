create database breed_db;

create table animal(
    id serial primary key,
    name varchar(30) not null
);

create table breed (
    id serial primary key,
    name varchar(30) not null unique,
    animal_id integer not null,
    created_date date not null,
    last_modified date not null
);

insert into animal(name) values ("dog")
insert into animal(name) values ("bird")
insert into animal(name) values ("cat")