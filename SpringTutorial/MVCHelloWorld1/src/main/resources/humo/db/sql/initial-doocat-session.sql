-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.5.8


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema doocat_session
--

CREATE DATABASE IF NOT EXISTS doocat_session;
USE doocat_session;

--
-- Definition of table `session_type_lcp`
--

DROP TABLE IF EXISTS `session_type_lcp`;
CREATE TABLE `session_type_lcp` (
  `id` int(11) unsigned NOT NULL,
  `time` int(2) NOT NULL,
  `description` varchar(64) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `type` (`time`),
  UNIQUE KEY `type_2` (`time`),
  UNIQUE KEY `time` (`time`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `session_type_lcp`
--

/*!40000 ALTER TABLE `session_type_lcp` DISABLE KEYS */;
INSERT INTO `session_type_lcp` (`id`,`time`,`description`) VALUES 
 (0,-1,'No expiration'),
 (1,60000,'Expires after 1 minutes'),
 (2,180000,'Expires after 3 minutes'),
 (3,300000,'Expires after 5 minutes'),
 (4,600000,'Expires after 10 minutes'),
 (5,1200000,'Expires after 20 minutes'),
 (6,1800000,'Expires after 30 minutes'),
 (7,3600000,'Expires after a hour'),
 (8,10800000,'Expires after 3 hours'),
 (9,21600000,'Expires after 6 hours');
/*!40000 ALTER TABLE `session_type_lcp` ENABLE KEYS */;


--
-- Definition of table `stoken`
--

DROP TABLE IF EXISTS `stoken`;
CREATE TABLE `stoken` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `token` varchar(128) NOT NULL,
  `session_type_id` int(2) unsigned NOT NULL,
  `last_accessed_time` bigint(20) unsigned NOT NULL,
  `last_activity_time` bigint(20) unsigned NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `user_email` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `token` (`token`),
  KEY `session_type_id` (`session_type_id`),
  CONSTRAINT `stoken_fk` FOREIGN KEY (`session_type_id`) REFERENCES `session_type_lcp` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
