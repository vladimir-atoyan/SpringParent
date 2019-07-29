-- Creating table rq_code
--
-- author Levon Tonoyan (levont@energizeglobal.com)

CREATE TABLE `qr_code` (
           `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
           `user_id` int(11) DEFAULT NULL,
           `token` varchar(255) NOT NULL,
           `session_type_id` int(2) unsigned DEFAULT NULL,
           `last_access_time` bigint(20) unsigned DEFAULT NULL,
           `last_activity_time` bigint(20) unsigned DEFAULT NULL,
           PRIMARY KEY (`id`),
           UNIQUE KEY `token` (`token`),
           KEY `session_type_id` (`session_type_id`),
           CONSTRAINT `qrcode_fk` FOREIGN KEY (`session_type_id`) REFERENCES `session_type_lcp` (`id`)
         ) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8
