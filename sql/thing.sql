# Host: localhost  (Version: 5.5.47)
# Date: 2018-09-16 21:52:45
# Generator: MySQL-Front 5.3  (Build 4.234)

/*!40101 SET NAMES gb2312 */;

#
# Structure for table "thing"
#

DROP TABLE IF EXISTS `thing`;
CREATE TABLE `thing` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `东西` varchar(255) DEFAULT NULL,
  `位置` int(10) DEFAULT NULL,
  `图片路径` varchar(255) DEFAULT NULL,
  `常用` bit(1) DEFAULT NULL,
  `数量` int(10) DEFAULT NULL,
  `特性` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=MyISAM AUTO_INCREMENT=18 DEFAULT CHARSET=gbk;

#
# Data for table "thing"
#

/*!40000 ALTER TABLE `thing` DISABLE KEYS */;
INSERT INTO `thing` VALUES (1,'剪线钳',1,'无',NULL,NULL,''),(2,'焊锡',2,'无',NULL,NULL,''),(3,'摄像头',3,NULL,NULL,NULL,''),(7,' 十通电磁阀',1,'',b'0',13,NULL),(8,'十毫升双孔注射泵',1,'',b'0',3,NULL),(9,'消解池黑壳',1,'',b'0',7,NULL),(10,'消解管',1,'',b'0',50,NULL),(11,'大电风扇',1,'',b'0',20,NULL),(12,'小风扇',1,'',b'0',27,NULL),(13,'黄铜两接口',1,'',b'0',100,NULL),(14,'中型风扇',1,'',b'0',21,NULL),(15,'方形电机板',2,'',b'1',2,NULL),(16,'圆形环阀板',2,'',b'1',6,NULL),(17,'电机滴定导线',2,'',b'0',1,NULL);
/*!40000 ALTER TABLE `thing` ENABLE KEYS */;
