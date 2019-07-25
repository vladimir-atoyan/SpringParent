/*
Creating table one_time_password

author Vahan Yeghyan
*/

CREATE TABLE `one_time_password` (
           `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
           `user_id` int(11) NOT NULL,
           `user_email` varchar(100) NOT NULL,
           `enc_otp` varchar(1024) NOT NULL,
           PRIMARY KEY (`id`)
         ) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8