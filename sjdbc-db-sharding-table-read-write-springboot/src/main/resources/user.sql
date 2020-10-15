# 分库分表读写分离
CREATE DATABASE `dss_0` CHARACTER SET 'utf8' COLLATE 'utf8_general_ci';
CREATE DATABASE `dss0slave` CHARACTER SET 'utf8' COLLATE 'utf8_general_ci';
CREATE DATABASE `dss_1` CHARACTER SET 'utf8' COLLATE 'utf8_general_ci';
CREATE DATABASE `dss1slave` CHARACTER SET 'utf8' COLLATE 'utf8_general_ci';

# 分别执行分表
CREATE TABLE `user_0`(
	id bigint(64) not null,
	city varchar(20) not null,
	name varchar(20) not null,
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `user_1`(
	id bigint(64) not null,
	city varchar(20) not null,
	name varchar(20) not null,
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `user_2`(
	id bigint(64) not null,
	city varchar(20) not null,
	name varchar(20) not null,
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
