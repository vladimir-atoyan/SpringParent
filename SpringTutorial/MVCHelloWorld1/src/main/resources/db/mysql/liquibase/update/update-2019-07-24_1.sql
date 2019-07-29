
# CBT: `stoken`.`user_email` field change:
#   `user_email` varchar(100) DEFAULT NULL, ---> `user_email` varchar(100) NOT NULL,

ALTER TABLE `stoken` CHANGE COLUMN `user_email` `user_email` VARCHAR(100) NOT NULL;
