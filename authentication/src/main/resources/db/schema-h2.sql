
DROP TABLE IF EXISTS user;
CREATE TABLE user
(
	id BIGINT(20) NOT NULL COMMENT '主键ID',
	name VARCHAR(30) NULL DEFAULT NULL COMMENT '姓名',
	password VARCHAR(100) NULL DEFAULT NULL COMMENT '密码',
	salt VARCHAR(20) NULL DEFAULT NULL COMMENT '盐',
	age INT(11) NULL DEFAULT NULL COMMENT '年龄',
	email VARCHAR(50) NULL DEFAULT NULL COMMENT '邮箱',
	PRIMARY KEY (id)
);

DROP TABLE IF EXISTS role;
CREATE TABLE role (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  name varchar(100) DEFAULT NULL COMMENT '角色名称',
  remark varchar(100) DEFAULT NULL COMMENT '备注',
  create_time datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (id)
) ;

DROP TABLE IF EXISTS menu;
CREATE TABLE menu (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  parent_id bigint(20) NOT NULL COMMENT '父菜单ID，一级菜单为0',
  name varchar(50) DEFAULT NULL COMMENT '菜单名称',
  url varchar(200) DEFAULT NULL COMMENT '菜单URL',
  perms varchar(500) DEFAULT NULL COMMENT '授权(多个用逗号分隔，如：user:list,user:create)',
  type int(11) DEFAULT NULL COMMENT '类型   0：目录   1：菜单   2：按钮',
  icon varchar(50) DEFAULT NULL COMMENT '菜单图标',
  order_num int(11) DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (id)
) ;


DROP TABLE IF EXISTS role_menu;
CREATE TABLE role_menu (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  role_id bigint(20) DEFAULT NULL COMMENT '角色ID',
  menu_id bigint(20) DEFAULT NULL COMMENT '菜单ID',
  PRIMARY KEY (id)
) ;





