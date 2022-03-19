drop database ecommerce_ifood;

create database ecommerce_ifood;

use ecommerce_ifood;

create table department(
	department_id integer not null auto_increment primary key,
    department_name varchar(50) not null, 
    floor integer
);

insert into department value
(null, "Departamento um", 1),
(null, "Departamento dois", 2),
(null, "Departamento três", 3),
(null, "Departamento quatro", 4),
(null, "Departamento cinco", 5);

create table customer(
	customer_id integer not null auto_increment primary key,
    customer_name varchar(100) not null,
    cpf varchar(11) not null unique,
    email varchar(50) not null unique,
    phone integer not null,
    public_place varchar(50) not null,
    address_number integer,
    complement varchar(30),
    neighborhood varchar(30) not null,
    city varchar(30) not null,
    state char(2) not null not null,
    zip_code char(8) not null
);

insert into client values
(null, "Cliente Um", "11100011101", "clienteum@email.com", 119990001, "Rua do Cliente Um", 1, "Complemento um", "Bairro do Cliente Um", "Cidade do cliente Um", "XX", "1100010"),
(null, "Cliente Dois", "22200022202", "clientedois@email.com", 229990002, "Rua do Cliente Dois", 2, "Complemento dois", "Bairro do Cliente Dois", "Cidade do cliente Dois", "XY", "2200020"),
(null, "Cliente Três", "33300033303", "clientetres@email.com", 339990003, "Rua do Cliente Três", 3, "Complemento três", "Bairro do Cliente Três", "Cidade do cliente Três", "YX", "3300030"),
(null, "Cliente Quatro", "44400044404", "clientequatro@email.com", 449990004, "Rua do Cliente Quatro", 4, "Complemento quatro", "Bairro do Cliente Quatro", "Cidade do cliente Quatro", "YY", "4400040"),
(null, "Cliente Cinco", "55500055505", "clientecinco@email.com", 559990005, "Rua do Cliente Cinco", 5, "Complemento cinco", "Bairro do Cliente Cinco", "Cidade do cliente Cinco", "XZ", "500050");

create table product(
	product_id integer not null auto_increment primary key,
    product_name varchar(50) not null,
    product_description text,
    price double not null,
    inventory integer,
    link_image varchar(255),
    department integer not null,
    
    constraint fk_department foreign key(department) references department(department_id)
);

insert into product values
(null, "Produto Um", "Descrição do produto um", 100.0, 10, "/produto1.jpg", 1),
(null, "Produto Dois", "Descrição do produto dois", 200.0, 20, "/produto2.jpg", 2),
(null, "Produto Três", "Descrição do produto três", 300.0, 30, "/produto3.jpg", 3),
(null, "Produto Quatro", "Descrição do produto quatro", 400.0, 40, "/produto4.jpg", 4),
(null, "Produto Cinco", "Descrição do produto cinco", 500.0, 50, "/produto5.jpg", 5);

create table demand(
	demand_id integer not null auto_increment primary key,
    demand_date date not null,
    total double not null,
    discount double,
    payment double not null,
    customer integer not null,
    
    constraint fk_customer foreign key(customer) references client(customer_id)
);

insert into demand values
(null, "2022-02-11", 100, 0, 100, 1),
(null, "2022-02-11", 200, 10, 190, 2),
(null, "2022-02-11", 300, 20, 280, 3),
(null, "2022-02-11", 400, 15, 385, 4),
(null, "2022-02-11", 500, 50, 450, 5),
(null, "2022-02-12", 600, 0, 600, 1),
(null, "2022-02-12", 700, 10, 690, 2),
(null, "2022-02-12", 800, 20, 720, 3),
(null, "2022-02-12", 900, 15, 885, 4),
(null, "2022-02-12", 1000, 50, 950, 5);

create table demand_product(
	demand_product_id integer not null auto_increment primary key,
    demand integer not null,
    product integer not null,
    product_amount integer not null,
    product_cost double not null,
    total double not null,
    
    constraint fk_demand foreign key(demand) references demand(demand_id),
    constraint fk_product foreign key(product) references product(product_id)
);