-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: library
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `books_author`
--

DROP TABLE IF EXISTS `books_author`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `books_author` (
  `books` bigint NOT NULL,
  `author` bigint NOT NULL,
  PRIMARY KEY (`books`,`author`),
  KEY `books_author_FK_1` (`author`),
  CONSTRAINT `books_author_FK` FOREIGN KEY (`books`) REFERENCES `books` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `books_author_FK_1` FOREIGN KEY (`author`) REFERENCES `author` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `books_author`
--

LOCK TABLES `books_author` WRITE;
/*!40000 ALTER TABLE `books_author` DISABLE KEYS */;
INSERT INTO `books_author` VALUES (1,1),(14,1),(1,2),(3,3),(4,4),(5,5),(6,6),(7,7),(8,8),(9,8),(10,10),(11,11),(12,12),(13,13),(16,13),(15,15);
/*!40000 ALTER TABLE `books_author` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `books`
--

DROP TABLE IF EXISTS `books`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `books` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(120) NOT NULL,
  `description` text,
  `price` float NOT NULL DEFAULT '0',
  `pages` int NOT NULL,
  `isbn` varchar(30) NOT NULL,
  `genre` bigint NOT NULL,
  PRIMARY KEY (`id`),
  KEY `books_FK` (`genre`),
  CONSTRAINT `books_FK` FOREIGN KEY (`genre`) REFERENCES `genre` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `books`
--

LOCK TABLES `books` WRITE;
/*!40000 ALTER TABLE `books` DISABLE KEYS */;
INSERT INTO `books` VALUES (1,' Дневник. 1917-1921. Письма ','',700,544,'5-265-03471-4',4),(3,' Биосфера и ноосфера ','',1800,576,'5-8112-0320-9',5),(4,'Німецькі поселенці на українських землях: історичні та актуальні проблеми і перспективи','За результатами Міжнародної науково-практичної конференції, 16-17 трав. 2013 року : до 210-річниці появи перших німецьких поселенців у Полтаві / Полтавський ун-т економіки і торгівлі, Центр німецької мови і культури, Головне управління інформаційної та внутрішньої політики Полтавської облдержадміністрації, Магдебурзькийун-т ім. Отто фон Геррике, Ін-т мов м. Кассель. - Полтава : Полтавський літерат',300,240,'978-966-192-071-1',6),(5,' Полтавщина в одинадцятій п’ятирічці ',' Від рубежу до рубежу ',89,95,'978-966-12-007-0',4),(6,' В. І. Вернадський і Полтавщина ',': факти, документи, бібліографія / уклад ',350,260,'978-966-192-007-0 ',5),(7,'Гостинна Полтавщина','Короткий путівник-довідник',35,58,'5-81234-0320-9',8),(8,' Земля - берегиня: Полтавщиною - підземними ходами ',' В книзі з номером 1044348 - дарчий надпис автора ',210,79,'978-966-8350-31-3 ',6),(9,' Полтавщина: Лохвицький край ',' Назва обкл. : Лохвицький край ',206,108,'966-8285-13-1 ',6),(10,' Полтавська Петлюріана ',' Ч. 1 : Матеріали II Петлюрівських читань, проведених у Полтаві 15 серпня 1993 ',58,92,'966-8223485-13-1 ',4),(11,' Вогненна квітка ',' Леся  Українка і Полтавщина: деякі аспекти життя і творчості ',428,214,'966-7462-52-8 ',7),(12,' Полтавщина в роки другої світової війни (1939-1945)  ',' В книзі дарчий надпис автора ',566,288,'966-96206-4-8',4),(13,' Полтавщину славлю піснями ',' збірка пісень та ноти ',192,98,'966-8350-06-5 ',8),(14,' Євреї і Полтавщина ',' : історія... Імена... Долі  Б-ка товариства \"Єврейська спадщина ',200,100,'966-8250-11-7',6),(15,' Генеральний конструктор АК-47 і Полтавщина ',' документальний збірник ',116,58,'966-825750-11-7',5),(16,' Полтавщину славлю піснями 2 ',' Збірка пісень та ноти частина 2 ',187,98,'966-833450-06-5 ',8);
/*!40000 ALTER TABLE `books` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `genre`
--

DROP TABLE IF EXISTS `genre`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `genre` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `genre`
--

LOCK TABLES `genre` WRITE;
/*!40000 ALTER TABLE `genre` DISABLE KEYS */;
INSERT INTO `genre` VALUES (4,'Історія'),(5,'Наука '),(6,'Краєзнавство '),(7,'Література'),(8,'Культура');
/*!40000 ALTER TABLE `genre` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `author`
--

DROP TABLE IF EXISTS `author`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `author` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `FirstName` varchar(45) NOT NULL,
  `SecondName` varchar(45) NOT NULL,
  `email` varchar(50) NOT NULL,
  `adres` varchar(100) NOT NULL,
  `birthDay` date NOT NULL,
  `awards` varchar(120) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `author`
--

LOCK TABLES `author` WRITE;
/*!40000 ALTER TABLE `author` DISABLE KEYS */;
INSERT INTO `author` VALUES (1,'Ivan','Короленко ','korolenko@gmail.com','','1973-08-03',' Лауреат Сталинской премии I степени (1943). '),(2,'Владимир ','Короленко ','korolenko@gmail.com',' ','1853-07-25',' присвоєно звання «Праведник України» '),(3,'Владимир ',' Вернадский ','vernatskiy@gmail.com',' ','1863-02-28',' Лауреат Сталинской премии I степени (1943). '),(4,' Валентин ','Посухов ','posuchiy@gmail.com ',' ','1970-01-01',''),(5,' Василь ','Барабаш','barabash@gmail.com ',' ','1958-02-03',''),(6,'Володимир','Самородов','samorodov@gmail.com',' ','1977-08-03','Премія ім.. Короленка 1996 р.'),(7,'Петро ','Годзенко','godzenko@ukr.net',' ','1984-07-15',''),(8,' Валентин ',' Посухов ','posuhov@ukr.net',' ','1973-02-02',''),(9,'Олександр ',' Панченко ','panchenko@ukr.net ',' ','1960-03-05','Герой Полтавщини'),(10,'Микола','Кульчинський','kulsdfd@in.ua',' ','1954-03-06',''),(11,'Григорій','Шанько','sganko@ukr.net',' ','1994-02-05','Відзнака президента України 2020 р.'),(12,'Віктор','Ревегук','Reve67@meta.ua',' ','1955-04-06','Почесна грамота Обласної ради'),(13,'Михайло ','Савченко','Savchenko5634@meta.ua ',' ','1990-04-08',''),(14,'Анатолій','Мучник','muchikAnatol@meta.ua ',' ','1974-06-04',''),(15,'Петро ','Михайлик','petro@gmail.com',' ','1992-04-06','');
/*!40000 ALTER TABLE `author` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-08-01 16:38:05
