-- MySQL dump 10.13  Distrib 5.5.41, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: doocat_session
-- ------------------------------------------------------
-- Server version	5.5.41-0ubuntu0.14.10.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `session_type_lcp`
--

DROP TABLE IF EXISTS `session_type_lcp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `session_type_lcp` (
  `id` int(11) unsigned NOT NULL,
  `time` int(2) NOT NULL,
  `description` varchar(64) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `type` (`time`),
  UNIQUE KEY `type_2` (`time`),
  UNIQUE KEY `time` (`time`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `session_type_lcp`
--

LOCK TABLES `session_type_lcp` WRITE;
/*!40000 ALTER TABLE `session_type_lcp` DISABLE KEYS */;
INSERT INTO `session_type_lcp` VALUES (0,-1,'No expiration'),(1,60000,'Expires after 1 minutes'),(2,180000,'Expires after 3 minutes'),(3,300000,'Expires after 5 minutes'),(4,600000,'Expires after 10 minutes'),(5,1200000,'Expires after 20 minutes'),(6,1800000,'Expires after 30 minutes'),(7,3600000,'Expires after a hour'),(8,10800000,'Expires after 3 hours'),(9,21600000,'Expires after 6 hours');
/*!40000 ALTER TABLE `session_type_lcp` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stoken`
--

DROP TABLE IF EXISTS `stoken`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `stoken` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `token` varchar(128) NOT NULL,
  `session_type_id` int(2) unsigned NOT NULL,
  `last_access_time` bigint(20) unsigned NOT NULL,
  `last_activity_time` bigint(20) unsigned NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `user_email` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `token` (`token`),
  KEY `session_type_id` (`session_type_id`),
  CONSTRAINT `stoken_fk` FOREIGN KEY (`session_type_id`) REFERENCES `session_type_lcp` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stoken`
--

LOCK TABLES `stoken` WRITE;
/*!40000 ALTER TABLE `stoken` DISABLE KEYS */;
/*!40000 ALTER TABLE `stoken` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'doocat_session'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-05-05 16:34:28
