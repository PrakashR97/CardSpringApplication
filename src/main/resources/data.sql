drop table cards if exists;

drop table customer if exists;

create table customer
(customer_id int auto_increment primary key);


create table cards
(card_id int auto_increment primary key,
customer_id int not null,
card_number bigint not null,
card_type varchar(100) not null,
expiry_date date default null);

insert into customer(customer_id) values(1);


insert into cards(customer_id,card_number,card_type,expiry_date)
values(1,3454,'credit card',curdate());


insert into cards(customer_id,card_number,card_type,expiry_date)
values(1,344654,'Debit card',curdate());

insert into cards(customer_id,card_number,card_type,expiry_date)
values(2,348754,'credit card',curdate());


insert into cards(customer_id,card_number,card_type,expiry_date)
values(2,3544654,'Debit card',curdate());