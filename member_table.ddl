create table if not exists wedrive.member
(
	id varchar(36) not null,
	user_id varchar(100) null,
	password varchar(50) null,
	name varchar(50) null,
	phone varchar(255) null,
	address varchar(200) null,
	detailed_address varchar(255) null
);

