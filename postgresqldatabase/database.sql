drop table if exists kullanici;
drop table if exists movie;
drop table if exists liked;
drop table if exists watchlist;

create table if not exists Kullanici (
	username varchar (20) Primary key unique not null,
	password varchar (20) not null,
	name varchar (20) not null,
	surname varchar(20) not null,
	gender char (1) not null
);

create table if not exists movie (
	name varchar (50) Primary key not null,
	year int not null,
	director varchar(30) not null,
	likes int,
	genre text[][] not null,
	summary varchar(400)
);

create table if not exists liked (
	username varchar (20) not null,
	moviename varchar (50) not null	
);

create table if not exists watchlist (
	username varchar (20) not null,
	moviename varchar (50) not null
);