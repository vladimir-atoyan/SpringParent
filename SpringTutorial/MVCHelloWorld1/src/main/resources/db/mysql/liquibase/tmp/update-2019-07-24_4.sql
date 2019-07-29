
# ALL: `stoken`.`user_id` field add:
# 	() ---> UNIQUE KEY `user_id` (`user_id`),

ALTER TABLE `stoken` ADD UNIQUE (`user_id`);
