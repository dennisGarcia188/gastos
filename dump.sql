CREATE DATABASE  IF NOT EXISTS `gastos` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `gastos`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: gastos
-- ------------------------------------------------------
-- Server version	5.7.21-log

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
-- Table structure for table `artista`
--

DROP TABLE IF EXISTS `artista`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `artista` (
  `id_artista` bigint(20) NOT NULL AUTO_INCREMENT,
  `href` varchar(255) DEFAULT NULL,
  `id` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `uri` varchar(255) DEFAULT NULL,
  `idexternal` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id_artista`),
  KEY `FK5ae09dhg2g2aww40hfyb5iu6v` (`idexternal`),
  CONSTRAINT `FK5ae09dhg2g2aww40hfyb5iu6v` FOREIGN KEY (`idexternal`) REFERENCES `externalurls` (`idexternal`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `artista`
--

LOCK TABLES `artista` WRITE;
/*!40000 ALTER TABLE `artista` DISABLE KEYS */;
INSERT INTO `artista` VALUES (1,'https://api.spotify.com/v1/artists/53A0W3U0s8diEn9RhXQhVz','53A0W3U0s8diEn9RhXQhVz','Keane','artist','spotify:artist:53A0W3U0s8diEn9RhXQhVz',2),(2,'https://api.spotify.com/v1/artists/5XN8KhxZVObkfRvTgsQFuN','5XN8KhxZVObkfRvTgsQFuN','Tania Mara','artist','spotify:artist:5XN8KhxZVObkfRvTgsQFuN',6),(3,'https://api.spotify.com/v1/artists/5XN8KhxZVObkfRvTgsQFuN','5XN8KhxZVObkfRvTgsQFuN','Tania Mara','artist','spotify:artist:5XN8KhxZVObkfRvTgsQFuN',8),(4,'https://api.spotify.com/v1/artists/5XN8KhxZVObkfRvTgsQFuN','5XN8KhxZVObkfRvTgsQFuN','Tania Mara','artist','spotify:artist:5XN8KhxZVObkfRvTgsQFuN',10),(5,'https://api.spotify.com/v1/artists/5XN8KhxZVObkfRvTgsQFuN','5XN8KhxZVObkfRvTgsQFuN','Tania Mara','artist','spotify:artist:5XN8KhxZVObkfRvTgsQFuN',12),(6,'https://api.spotify.com/v1/artists/5XN8KhxZVObkfRvTgsQFuN','5XN8KhxZVObkfRvTgsQFuN','Tania Mara','artist','spotify:artist:5XN8KhxZVObkfRvTgsQFuN',14);
/*!40000 ALTER TABLE `artista` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `cash_back` double DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,211.25,'Dennis');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `disco`
--

DROP TABLE IF EXISTS `disco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `disco` (
  `id_disco` bigint(20) NOT NULL AUTO_INCREMENT,
  `album_type` varchar(255) DEFAULT NULL,
  `available_markets` mediumblob,
  `href` varchar(255) DEFAULT NULL,
  `id` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `uri` varchar(255) DEFAULT NULL,
  `valor` decimal(19,2) DEFAULT NULL,
  `idexternal` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id_disco`),
  KEY `FKa9vog0hsnop6kcki1dir2v2wb` (`idexternal`),
  CONSTRAINT `FKa9vog0hsnop6kcki1dir2v2wb` FOREIGN KEY (`idexternal`) REFERENCES `externalurls` (`idexternal`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `disco`
--

LOCK TABLES `disco` WRITE;
/*!40000 ALTER TABLE `disco` DISABLE KEYS */;
INSERT INTO `disco` VALUES (1,'compilation','¬\í\0ur\0[Ljava.lang.String;­\ÒV\ç\é{G\0\0xp\0\0\0\0','https://api.spotify.com/v1/albums/41MnTivkwTO3UUJ8DrqEJJ','41MnTivkwTO3UUJ8DrqEJJ','The Best Of Keane (Deluxe Edition)','album','spotify:album:41MnTivkwTO3UUJ8DrqEJJ',100.00,1),(2,'album','¬\í\0ur\0[Ljava.lang.String;­\ÒV\ç\é{G\0\0xp\0\0\0Ot\0ADt\0AEt\0ARt\0ATt\0AUt\0BEt\0BGt\0BHt\0BOt\0BRt\0CAt\0CHt\0CLt\0COt\0CRt\0CYt\0CZt\0DEt\0DKt\0DOt\0DZt\0ECt\0EEt\0EGt\0ESt\0FIt\0FRt\0GBt\0GRt\0GTt\0HKt\0HNt\0HUt\0IDt\0IEt\0ILt\0INt\0ISt\0ITt\0JOt\0JPt\0KWt\0LBt\0LIt\0LTt\0LUt\0LVt\0MAt\0MCt\0MTt\0MXt\0MYt\0NIt\0NLt\0NOt\0NZt\0OMt\0PAt\0PEt\0PHt\0PLt\0PSt\0PTt\0PYt\0QAt\0ROt\0SAt\0SEt\0SGt\0SKt\0SVt\0THt\0TNt\0TRt\0TWt\0USt\0UYt\0VNt\0ZA','https://api.spotify.com/v1/albums/0u9flRsZidVTIWQOOyGhJA','0u9flRsZidVTIWQOOyGhJA','Ao Vivo - Falando De Amor (Ao Vivo Na Casa De Shows, Brazil / 2008)','album','spotify:album:0u9flRsZidVTIWQOOyGhJA',25.00,5),(3,'album','¬\í\0ur\0[Ljava.lang.String;­\ÒV\ç\é{G\0\0xp\0\0\0Ot\0ADt\0AEt\0ARt\0ATt\0AUt\0BEt\0BGt\0BHt\0BOt\0BRt\0CAt\0CHt\0CLt\0COt\0CRt\0CYt\0CZt\0DEt\0DKt\0DOt\0DZt\0ECt\0EEt\0EGt\0ESt\0FIt\0FRt\0GBt\0GRt\0GTt\0HKt\0HNt\0HUt\0IDt\0IEt\0ILt\0INt\0ISt\0ITt\0JOt\0JPt\0KWt\0LBt\0LIt\0LTt\0LUt\0LVt\0MAt\0MCt\0MTt\0MXt\0MYt\0NIt\0NLt\0NOt\0NZt\0OMt\0PAt\0PEt\0PHt\0PLt\0PSt\0PTt\0PYt\0QAt\0ROt\0SAt\0SEt\0SGt\0SKt\0SVt\0THt\0TNt\0TRt\0TWt\0USt\0UYt\0VNt\0ZA','https://api.spotify.com/v1/albums/0u9flRsZidVTIWQOOyGhJA','0u9flRsZidVTIWQOOyGhJA','Ao Vivo - Falando De Amor (Ao Vivo Na Casa De Shows, Brazil / 2008)','album','spotify:album:0u9flRsZidVTIWQOOyGhJA',25.00,7),(4,'album','¬\í\0ur\0[Ljava.lang.String;­\ÒV\ç\é{G\0\0xp\0\0\0Ot\0ADt\0AEt\0ARt\0ATt\0AUt\0BEt\0BGt\0BHt\0BOt\0BRt\0CAt\0CHt\0CLt\0COt\0CRt\0CYt\0CZt\0DEt\0DKt\0DOt\0DZt\0ECt\0EEt\0EGt\0ESt\0FIt\0FRt\0GBt\0GRt\0GTt\0HKt\0HNt\0HUt\0IDt\0IEt\0ILt\0INt\0ISt\0ITt\0JOt\0JPt\0KWt\0LBt\0LIt\0LTt\0LUt\0LVt\0MAt\0MCt\0MTt\0MXt\0MYt\0NIt\0NLt\0NOt\0NZt\0OMt\0PAt\0PEt\0PHt\0PLt\0PSt\0PTt\0PYt\0QAt\0ROt\0SAt\0SEt\0SGt\0SKt\0SVt\0THt\0TNt\0TRt\0TWt\0USt\0UYt\0VNt\0ZA','https://api.spotify.com/v1/albums/0u9flRsZidVTIWQOOyGhJA','0u9flRsZidVTIWQOOyGhJA','Ao Vivo - Falando De Amor (Ao Vivo Na Casa De Shows, Brazil / 2008)','album','spotify:album:0u9flRsZidVTIWQOOyGhJA',25.00,9),(5,'album','¬\í\0ur\0[Ljava.lang.String;­\ÒV\ç\é{G\0\0xp\0\0\0Ot\0ADt\0AEt\0ARt\0ATt\0AUt\0BEt\0BGt\0BHt\0BOt\0BRt\0CAt\0CHt\0CLt\0COt\0CRt\0CYt\0CZt\0DEt\0DKt\0DOt\0DZt\0ECt\0EEt\0EGt\0ESt\0FIt\0FRt\0GBt\0GRt\0GTt\0HKt\0HNt\0HUt\0IDt\0IEt\0ILt\0INt\0ISt\0ITt\0JOt\0JPt\0KWt\0LBt\0LIt\0LTt\0LUt\0LVt\0MAt\0MCt\0MTt\0MXt\0MYt\0NIt\0NLt\0NOt\0NZt\0OMt\0PAt\0PEt\0PHt\0PLt\0PSt\0PTt\0PYt\0QAt\0ROt\0SAt\0SEt\0SGt\0SKt\0SVt\0THt\0TNt\0TRt\0TWt\0USt\0UYt\0VNt\0ZA','https://api.spotify.com/v1/albums/0u9flRsZidVTIWQOOyGhJA','0u9flRsZidVTIWQOOyGhJA','Ao Vivo - Falando De Amor (Ao Vivo Na Casa De Shows, Brazil / 2008)','album','spotify:album:0u9flRsZidVTIWQOOyGhJA',25.00,11),(6,'album','¬\í\0ur\0[Ljava.lang.String;­\ÒV\ç\é{G\0\0xp\0\0\0Ot\0ADt\0AEt\0ARt\0ATt\0AUt\0BEt\0BGt\0BHt\0BOt\0BRt\0CAt\0CHt\0CLt\0COt\0CRt\0CYt\0CZt\0DEt\0DKt\0DOt\0DZt\0ECt\0EEt\0EGt\0ESt\0FIt\0FRt\0GBt\0GRt\0GTt\0HKt\0HNt\0HUt\0IDt\0IEt\0ILt\0INt\0ISt\0ITt\0JOt\0JPt\0KWt\0LBt\0LIt\0LTt\0LUt\0LVt\0MAt\0MCt\0MTt\0MXt\0MYt\0NIt\0NLt\0NOt\0NZt\0OMt\0PAt\0PEt\0PHt\0PLt\0PSt\0PTt\0PYt\0QAt\0ROt\0SAt\0SEt\0SGt\0SKt\0SVt\0THt\0TNt\0TRt\0TWt\0USt\0UYt\0VNt\0ZA','https://api.spotify.com/v1/albums/0u9flRsZidVTIWQOOyGhJA','0u9flRsZidVTIWQOOyGhJA','Ao Vivo - Falando De Amor (Ao Vivo Na Casa De Shows, Brazil / 2008)','album','spotify:album:0u9flRsZidVTIWQOOyGhJA',100.00,13);
/*!40000 ALTER TABLE `disco` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `disco_artists`
--

DROP TABLE IF EXISTS `disco_artists`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `disco_artists` (
  `disco_id_disco` bigint(20) NOT NULL,
  `artists_id_artista` bigint(20) NOT NULL,
  `id_artista` int(11) NOT NULL,
  PRIMARY KEY (`disco_id_disco`,`id_artista`),
  KEY `FKm9t00jhuflusrdm78y0hky1on` (`artists_id_artista`),
  CONSTRAINT `FKc8f3dbid6dhg1d880ka2htlhn` FOREIGN KEY (`disco_id_disco`) REFERENCES `disco` (`id_disco`),
  CONSTRAINT `FKm9t00jhuflusrdm78y0hky1on` FOREIGN KEY (`artists_id_artista`) REFERENCES `artista` (`id_artista`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `disco_artists`
--

LOCK TABLES `disco_artists` WRITE;
/*!40000 ALTER TABLE `disco_artists` DISABLE KEYS */;
INSERT INTO `disco_artists` VALUES (1,1,0),(2,2,0),(3,3,0),(4,4,0),(5,5,0),(6,6,0);
/*!40000 ALTER TABLE `disco_artists` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `disco_images`
--

DROP TABLE IF EXISTS `disco_images`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `disco_images` (
  `disco_id_disco` bigint(20) NOT NULL,
  `images_idimage` bigint(20) NOT NULL,
  `idimage` int(11) NOT NULL,
  PRIMARY KEY (`disco_id_disco`,`idimage`),
  UNIQUE KEY `UK_1x0ovcbvkkprqfnj5jooewoa2` (`images_idimage`),
  CONSTRAINT `FK9dygrnmkjoi4gndjnpnwc19x6` FOREIGN KEY (`images_idimage`) REFERENCES `image` (`idimage`),
  CONSTRAINT `FKi3tkgig5st2hotwkkhgrlsr5` FOREIGN KEY (`disco_id_disco`) REFERENCES `disco` (`id_disco`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `disco_images`
--

LOCK TABLES `disco_images` WRITE;
/*!40000 ALTER TABLE `disco_images` DISABLE KEYS */;
INSERT INTO `disco_images` VALUES (1,1,0),(1,2,1),(1,3,2),(2,4,0),(2,5,1),(2,6,2),(3,7,0),(3,8,1),(3,9,2),(4,10,0),(4,11,1),(4,12,2),(5,13,0),(5,14,1),(5,15,2),(6,16,0),(6,17,1),(6,18,2);
/*!40000 ALTER TABLE `disco_images` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `externalurls`
--

DROP TABLE IF EXISTS `externalurls`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `externalurls` (
  `idexternal` bigint(20) NOT NULL AUTO_INCREMENT,
  `key` varchar(255) DEFAULT NULL,
  `value` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idexternal`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `externalurls`
--

LOCK TABLES `externalurls` WRITE;
/*!40000 ALTER TABLE `externalurls` DISABLE KEYS */;
INSERT INTO `externalurls` VALUES (1,NULL,NULL),(2,NULL,NULL),(5,NULL,NULL),(6,NULL,NULL),(7,NULL,NULL),(8,NULL,NULL),(9,NULL,NULL),(10,NULL,NULL),(11,NULL,NULL),(12,NULL,NULL),(13,NULL,NULL),(14,NULL,NULL);
/*!40000 ALTER TABLE `externalurls` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `genero`
--

DROP TABLE IF EXISTS `genero`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `genero` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `dia_semana` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `percentual` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `genero`
--

LOCK TABLES `genero` WRITE;
/*!40000 ALTER TABLE `genero` DISABLE KEYS */;
INSERT INTO `genero` VALUES (1,'sabado','pop','25'),(2,'sexta','pop','18'),(3,'quinta','pop','13'),(4,'quarta','pop','8'),(5,'terca','pop','5'),(6,'segunda','pop','3'),(7,'domingo','pop','3'),(8,'sabado','classic','25'),(9,'sexta','classic','18'),(10,'quinta','classic','13'),(11,'quarta','classic','8'),(12,'terca','classic','5'),(13,'segunda','classic','3'),(14,'domingo','classic','3'),(15,'sabado','MPB','30'),(16,'sexta','MPB','25'),(17,'quinta','MPB','20'),(18,'quarta','MPB','15'),(19,'terca','MPB','10'),(20,'segunda','MPB','5'),(21,'domingo','MPB','30'),(22,'domingo','ROCK','40'),(23,'segunda','ROCK','10'),(24,'terca','ROCK','15'),(25,'quarta','ROCK','15'),(26,'quinta','ROCK','15'),(27,'sexta','ROCK','20'),(28,'sabado','ROCK','40');
/*!40000 ALTER TABLE `genero` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `image`
--

DROP TABLE IF EXISTS `image`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `image` (
  `idimage` bigint(20) NOT NULL AUTO_INCREMENT,
  `height` int(11) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `width` int(11) DEFAULT NULL,
  PRIMARY KEY (`idimage`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `image`
--

LOCK TABLES `image` WRITE;
/*!40000 ALTER TABLE `image` DISABLE KEYS */;
INSERT INTO `image` VALUES (1,640,'https://i.scdn.co/image/a761230915f38591b35fff364dc4bfb1626393d6',640),(2,300,'https://i.scdn.co/image/42969c0c627a2a9b851a29844a5b83388642cb6c',300),(3,64,'https://i.scdn.co/image/6dfad5a72a98662cd38cfb647301f33e6d35f2bc',64),(4,640,'https://i.scdn.co/image/f424871b03cf1e82c03e86595a398ad536358ebb',640),(5,300,'https://i.scdn.co/image/614d47575b44acbfca13c6770ac7bb20520ae6e9',300),(6,64,'https://i.scdn.co/image/3a38f0867acbc9256851008a76eba7033c4f2821',64),(7,640,'https://i.scdn.co/image/f424871b03cf1e82c03e86595a398ad536358ebb',640),(8,300,'https://i.scdn.co/image/614d47575b44acbfca13c6770ac7bb20520ae6e9',300),(9,64,'https://i.scdn.co/image/3a38f0867acbc9256851008a76eba7033c4f2821',64),(10,640,'https://i.scdn.co/image/f424871b03cf1e82c03e86595a398ad536358ebb',640),(11,300,'https://i.scdn.co/image/614d47575b44acbfca13c6770ac7bb20520ae6e9',300),(12,64,'https://i.scdn.co/image/3a38f0867acbc9256851008a76eba7033c4f2821',64),(13,640,'https://i.scdn.co/image/f424871b03cf1e82c03e86595a398ad536358ebb',640),(14,300,'https://i.scdn.co/image/614d47575b44acbfca13c6770ac7bb20520ae6e9',300),(15,64,'https://i.scdn.co/image/3a38f0867acbc9256851008a76eba7033c4f2821',64),(16,640,'https://i.scdn.co/image/f424871b03cf1e82c03e86595a398ad536358ebb',640),(17,300,'https://i.scdn.co/image/614d47575b44acbfca13c6770ac7bb20520ae6e9',300),(18,64,'https://i.scdn.co/image/3a38f0867acbc9256851008a76eba7033c4f2821',64);
/*!40000 ALTER TABLE `image` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `venda`
--

DROP TABLE IF EXISTS `venda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `venda` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `cash_back` decimal(19,2) DEFAULT NULL,
  `cliente` varchar(255) DEFAULT NULL,
  `valor` decimal(19,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venda`
--

LOCK TABLES `venda` WRITE;
/*!40000 ALTER TABLE `venda` DISABLE KEYS */;
INSERT INTO `venda` VALUES (1,4000.00,'Dennis',NULL),(2,40.00,'Dennis',100.00),(3,40.00,'Dennis',100.00),(4,15.00,'Dennis',100.00),(5,15.00,'Dennis',100.00),(6,15.00,'Dennis',100.00),(7,15.00,'Dennis',100.00),(8,15.00,'Dennis',100.00),(9,15.00,'Dennis',100.00),(10,15.00,'Dennis',100.00),(11,15.00,'Dennis',100.00),(12,15.00,'Dennis',100.00),(13,15.00,'Dennis',100.00),(14,3.75,'Dennis',25.00),(15,3.75,'Dennis',25.00),(16,3.75,'Dennis',25.00);
/*!40000 ALTER TABLE `venda` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-04 23:39:37
