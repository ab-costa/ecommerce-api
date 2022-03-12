drop database ecommerce_ifood;

create database ecommerce_ifood;

use ecommerce_ifood;

create table department(
	id integer not null auto_increment primary key,
    name varchar(50) not null, 
    floor integer
);

create table client(
	id integer not null auto_increment primary key,
    name varchar(100) not null,
    cpf varchar(11) not null unique,
    email varchar(50) not null unique,
    phone integer not null,
    public_place varchar(50) not null,
    number integer,
    complement varchar(30),
    neighborhood varchar(30) not null,
    city varchar(30) not null,
    state char(2) not null not null,
    zip_code char(8) not null
);

create table product(
	id integer not null auto_increment primary key,
    name varchar(50) not null,
    description text,
    price double not null,
    inventory integer,
    link_image varchar(255),
    department_id integer not null,
    
    constraint fk_department_id foreign key(department_id) references department(id)
);

create table demand(
	id integer not null auto_increment primary key,
    date date not null,
    total double not null,
    discount double,
    payment double not null,
    client_id integer not null,
    
    constraint fk_cliente_id foreign key(client_id) references client(id)
);

create table demand_product(
	id integer not null auto_increment primary key,
    product_id integer not null,
    demand_id integer not null,
    product_amount integer not null,
    product_cost double not null,
    total double not null,
    
    constraint fk_product_id foreign key(product_id) references product(id),
    constraint fk_demand_id foreign key(demand_id) references demand(id)
);