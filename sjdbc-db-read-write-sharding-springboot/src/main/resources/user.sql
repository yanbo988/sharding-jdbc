# 垂直分库--读写分离，分别创建主从库
CREATE DATABASE `ds_0` CHARACTER SET 'utf8' COLLATE 'utf8_general_ci';
CREATE DATABASE `ds_0_0` CHARACTER SET 'utf8' COLLATE 'utf8_general_ci';

# 主从库分别创建该表
CREATE TABLE `user`(
	id bigint(64) not null,
	city varchar(20) not null,
	name varchar(20) not null,
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
