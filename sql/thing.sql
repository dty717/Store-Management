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
  `����` varchar(255) DEFAULT NULL,
  `λ��` int(10) DEFAULT NULL,
  `ͼƬ·��` varchar(255) DEFAULT NULL,
  `����` bit(1) DEFAULT NULL,
  `����` int(10) DEFAULT NULL,
  `����` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=MyISAM AUTO_INCREMENT=18 DEFAULT CHARSET=gbk;

#
# Data for table "thing"
#

/*!40000 ALTER TABLE `thing` DISABLE KEYS */;
INSERT INTO `thing` VALUES (1,'����ǯ',1,'��',NULL,NULL,''),(2,'����',2,'��',NULL,NULL,''),(3,'����ͷ',3,NULL,NULL,NULL,''),(7,' ʮͨ��ŷ�',1,'',b'0',13,NULL),(8,'ʮ����˫��ע���',1,'',b'0',3,NULL),(9,'����غڿ�',1,'',b'0',7,NULL),(10,'�����',1,'',b'0',50,NULL),(11,'������',1,'',b'0',20,NULL),(12,'С����',1,'',b'0',27,NULL),(13,'��ͭ���ӿ�',1,'',b'0',100,NULL),(14,'���ͷ���',1,'',b'0',21,NULL),(15,'���ε����',2,'',b'1',2,NULL),(16,'Բ�λ�����',2,'',b'1',6,NULL),(17,'����ζ�����',2,'',b'0',1,NULL);
/*!40000 ALTER TABLE `thing` ENABLE KEYS */;
