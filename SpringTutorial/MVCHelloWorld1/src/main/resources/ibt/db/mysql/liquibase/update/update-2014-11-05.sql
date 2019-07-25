TRUNCATE TABLE `stoken`;

ALTER TABLE `stoken`
  ADD COLUMN `user_email` VARCHAR(100) NOT NULL;

ALTER TABLE `stoken`
  DROP COLUMN `user`;