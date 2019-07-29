#
# Starting from this update the session DB for ibt, cbt and humo will have common schema!
# So different logic should be handled in client (java) code, not in table structure.
#
# Before this update the ibt, cbt and humo DBs have:
#   COMMON TABLES (3): one_time_password, qr_code, session_type_lcp
#   DIFFERENT TABLES (1): stoken
# Here the list of changes:

######### Table `stoken` amendments: #########

# CBT: `stoken`.`user_email` field change:
#   `user_email` varchar(100) DEFAULT NULL, ---> `user_email` varchar(100) NOT NULL,
# ALTER TABLE `stoken` CHANGE COLUMN `user_email` `user_email` VARCHAR(100) NULL;

# IBT: `stoken`.`user_id_2` field remove:
# 	UNIQUE KEY `user_id_2` (`user_id`), ---> ()
# DROP INDEX `user_id_2` ON `stoken`;

# HUMO: `stoken`.`user_id` field add:
# 	() ---> UNIQUE KEY `user_id` (`user_id`),
# ALTER TABLE `stoken` ADD UNIQUE (`user_id`);

###################################################### tests ##################################

CREATE TABLE IF NOT EXISTS `t1` (
    `col` VARCHAR(16) NOT NULL
) ENGINE=MEMORY;