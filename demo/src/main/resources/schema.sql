drop table if exists ec2;

create table ec2 (
id long AUTO_INCREMENT PRIMARY KEY,
ami_id varchar(100),
instance_type varchar(100),
key_name varchar(100)
);

create table json_data (
id long AUTO_INCREMENT  PRIMARY KEY,
json_data json
);
