
# IBT: `stoken`.`user_id_2` field remove:
# 	UNIQUE KEY `user_id_2` (`user_id`), ---> ()

DROP INDEX `user_id_2` ON `stoken`;