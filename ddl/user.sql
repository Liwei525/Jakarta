CREATE TABLE `rui_user` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `user_name` varchar(64) DEFAULT '' COMMENT '用户名',
  `nickname` varchar(64) DEFAULT '' COMMENT '昵称',
  `user_psw` varchar(512) DEFAULT '' COMMENT '密码',
  `user_status` tinyint(2) DEFAULT '0' COMMENT '用户状态',
  `is_delete` tinyint(4) NOT NULL COMMENT '是否删除',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `create_by` varchar(64) NOT NULL DEFAULT '' COMMENT '创建者',
  `update_by` varchar(64) DEFAULT '' COMMENT '更新者',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='demo'
