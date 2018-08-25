use open;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `user_name` varchar(32) NOT NULL DEFAULT '' COMMENT '用户名称',
  `description` varchar(128) NOT NULL DEFAULT '' COMMENT '用户描述',
  `age` int(4) NOT NULL DEFAULT '0' COMMENT '年龄',
  `sex` int(4) NOT NULL DEFAULT '0' COMMENT '性别 1 男 2 女',
  `password` varchar(32) NOT NULL DEFAULT '' COMMENT '用户密码',
  `is_deleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT '删除标记',
  `deleted_at` timestamp NOT NULL DEFAULT '1970-01-01 08:00:01' COMMENT '删除时间',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uniq_user_name` (`user_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

CREATE TABLE `request` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `request_uri` varchar(32) NOT NULL DEFAULT '' COMMENT '请求类别',
  `is_deleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT '删除标记',
  `deleted_at` timestamp NOT NULL DEFAULT '1970-01-01 08:00:01' COMMENT '删除时间',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  KEY `idx_request_uri` (`request_uri`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='请求记录';

insert into user (user_name, description, age, sex, password) values ('merry', 'A Boy', 28, 1, '123456'),
 ('sky', 'A Boy', 28, 1, '123456'),
 ('ban', 'A girl', 28, 2, '123456');