
# IBT,CBT: `stoken`.`user_id` field remove:
# 	UNIQUE KEY `user_id` (`user_id`), ---> ()

DROP INDEX `user_id` ON `stoken`;