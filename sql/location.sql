# Host: localhost  (Version: 5.5.47)
# Date: 2018-09-16 21:53:02
# Generator: MySQL-Front 5.3  (Build 4.234)

/*!40101 SET NAMES utf8 */;

#
# Structure for table "location"
#

DROP TABLE IF EXISTS `location`;
CREATE TABLE `location` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(255) DEFAULT NULL,
  `XYposition` varchar(255) DEFAULT NULL,
  `OftenUsed` bit(1) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=MyISAM AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

#
# Data for table "location"
#

/*!40000 ALTER TABLE `location` DISABLE KEYS */;
INSERT INTO `location` VALUES (1,'1号货架','0,0',b'0'),(2,'2号货架','0,10',b'1'),(3,'3号货架','0,20',b'1'),(4,'4号货架','0,30',b'0'),(5,'5号货架','0,40',b'0'),(6,'6号货架','0,50',b'0'),(7,'1号桌','10,10',b'1'),(8,'2号桌','10,20',b'0'),(9,'3号桌','10,30',b'0'),(10,'4号桌','10,40',b'0'),(11,'实验1号桌',NULL,b'1'),(12,'实验2号桌',NULL,b'1'),(13,'实验3号桌',NULL,b'1'),(14,'实验4号桌',NULL,b'1'),(15,'实验5号桌',NULL,b'1'),(16,'实验台',NULL,b'1'),(17,'水池',NULL,b'1');
/*!40000 ALTER TABLE `location` ENABLE KEYS */;
