# Host: localhost  (Version: 5.5.47)
# Date: 2018-09-16 21:52:00
# Generator: MySQL-Front 5.3  (Build 4.234)

/*!40101 SET NAMES gb2312 */;

#
# Structure for table "性质标签"
#

DROP TABLE IF EXISTS `性质标签`;
CREATE TABLE `性质标签` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `标签名` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=gbk;

#
# Data for table "性质标签"
#

/*!40000 ALTER TABLE `性质标签` DISABLE KEYS */;
INSERT INTO `性质标签` VALUES (1,'工具'),(2,'电线');
/*!40000 ALTER TABLE `性质标签` ENABLE KEYS */;
