create database BankAccounts;
use BankAccounts;


create table Accounts(
user_id varchar(10),
password varchar(20),
user_name char(20),
address char(50),
city varchar(20),
account_balance decimal(10,2)
);


alter table Accounts add primary key (user_id);
insert into Accounts values('shree123','shre@123','Shreyash','njnkj','Nagpur',4500);
insert into Accounts values('Nac123','Nac@123','Nachiket','Ghar','Nagpur',10000);
select * from accounts;



create  table transactions(
user_id varchar(10),
transaction_date date,
user_amount decimal(10,2),
transactiontype varchar(20),
constraint f_k foreign key(user_id) references Accounts(user_id));

select * from transactions;

drop table transactions;

delete from transactions;

-- ---------------------------------------Bank-Accounts-----------------------------------------------
create database Bank_Accounts;
use Bank_Accounts;

create table Accounts(
user_id varchar(10) primary key,
password varchar(20),
user_name char(20),
address char(50),
city varchar(20),
account_balance decimal(10,2),
Approved_Status varchar(10),
RegisteredOn varchar(10),
ApprovedBy varchar(10),
ApprovedAt timestamp
);

create  table transactions(
user_id varchar(10),
transaction_date date,
user_amount decimal(10,2),
transactiontype varchar(20),
constraint f_k foreign key(user_id) references Accounts(user_id));

drop table Accounts;

create table log(
logtime timestamp,
task varchar(20),
userid varchar(10));

