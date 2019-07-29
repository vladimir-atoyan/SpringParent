USE `doocat_session`;

ALTER TABLE `doocat_session`.`stoken`
CHANGE COLUMN `user_email` `user_email` VARCHAR(100) NULL ;
