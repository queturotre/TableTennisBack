-- MySQL dump 10.13  Distrib 8.0.45, for Linux (x86_64)
--
-- Host: localhost    Database: TableTennis
-- ------------------------------------------------------
-- Server version	8.0.45-0ubuntu0.22.04.1

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
-- Table structure for table `Blade`
--

DROP TABLE IF EXISTS `Blade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Blade` (
  `idBlade` int NOT NULL AUTO_INCREMENT,
  `brand` varchar(50) NOT NULL,
  `model` varchar(50) NOT NULL,
  PRIMARY KEY (`idBlade`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Blade`
--

LOCK TABLES `Blade` WRITE;
/*!40000 ALTER TABLE `Blade` DISABLE KEYS */;
INSERT INTO `Blade` VALUES (1,'Stiga','CyberShape'),(2,'DHS','PG13'),(3,'Timo Boll','ALC');
/*!40000 ALTER TABLE `Blade` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Category`
--

DROP TABLE IF EXISTS `Category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Category` (
  `idCategory` int NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `level` tinyint NOT NULL,
  PRIMARY KEY (`idCategory`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Category`
--

LOCK TABLES `Category` WRITE;
/*!40000 ALTER TABLE `Category` DISABLE KEYS */;
INSERT INTO `Category` VALUES (1,'Primera Categoría',1),(2,'Segunda Categoría',2),(3,'Tercera Categoría',3),(4,'Cuarta Categoría',4),(5,'Categoría Única',1);
/*!40000 ALTER TABLE `Category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Club`
--

DROP TABLE IF EXISTS `Club`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Club` (
  `idClub` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `delegate` varchar(30) NOT NULL,
  PRIMARY KEY (`idClub`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Club`
--

LOCK TABLES `Club` WRITE;
/*!40000 ALTER TABLE `Club` DISABLE KEYS */;
INSERT INTO `Club` VALUES (1,'Tistch Tennis','Mario Fúquene'),(2,'White Ball','Manuel Ballesteros'),(3,'Pong Life','Daniel Martínez'),(4,'Splendor','Julián Cruz');
/*!40000 ALTER TABLE `Club` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Coach`
--

DROP TABLE IF EXISTS `Coach`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Coach` (
  `idCoach` int NOT NULL AUTO_INCREMENT,
  `idClub` int DEFAULT NULL,
  `name` varchar(100) NOT NULL,
  PRIMARY KEY (`idCoach`),
  KEY `idClub` (`idClub`),
  CONSTRAINT `Coach_ibfk_1` FOREIGN KEY (`idClub`) REFERENCES `Club` (`idClub`) ON DELETE SET NULL
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Coach`
--

LOCK TABLES `Coach` WRITE;
/*!40000 ALTER TABLE `Coach` DISABLE KEYS */;
INSERT INTO `Coach` VALUES (1,1,'Mario Fúquene'),(2,1,'Samuel Ríos'),(3,1,'Sofía Henriquez'),(4,1,'Jesús Barragán'),(5,2,'Manuel Ballesteros'),(6,2,'Tatiana Ballesteros'),(7,2,'Jerry Angulo'),(8,3,'Juan Abadia'),(9,3,'Cristian Acero'),(10,4,'Julián Cruz'),(11,4,'Alirio Cruz');
/*!40000 ALTER TABLE `Coach` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Game`
--

DROP TABLE IF EXISTS `Game`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Game` (
  `idGame` int NOT NULL AUTO_INCREMENT,
  `idTournament` int NOT NULL,
  `idHomePlayer` int NOT NULL,
  `idAwayPlayer` int NOT NULL,
  `homePoints` int DEFAULT '0',
  `awayPoints` int DEFAULT '0',
  `gameDate` datetime DEFAULT NULL,
  `court` varchar(50) NOT NULL,
  `homeYellowCards` tinyint DEFAULT '0',
  `awayYellowCards` tinyint DEFAULT '0',
  `homeYellowRedCards` tinyint DEFAULT '0',
  `awayYellowRedCards` tinyint DEFAULT '0',
  `homeTimeOut` tinyint(1) DEFAULT '0',
  `awayTimeOut` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`idGame`),
  KEY `idTournament` (`idTournament`),
  KEY `idHomePlayer` (`idHomePlayer`),
  KEY `idAwayPlayer` (`idAwayPlayer`),
  CONSTRAINT `Game_ibfk_1` FOREIGN KEY (`idTournament`) REFERENCES `Tournament` (`idTournament`),
  CONSTRAINT `Game_ibfk_2` FOREIGN KEY (`idHomePlayer`) REFERENCES `Player` (`idPlayer`),
  CONSTRAINT `Game_ibfk_3` FOREIGN KEY (`idAwayPlayer`) REFERENCES `Player` (`idPlayer`),
  CONSTRAINT `Game_chk_1` CHECK ((`homePoints` >= 0)),
  CONSTRAINT `Game_chk_2` CHECK ((`awayPoints` >= 0)),
  CONSTRAINT `Game_chk_3` CHECK ((`homeYellowCards` >= 0)),
  CONSTRAINT `Game_chk_4` CHECK ((`awayYellowCards` >= 0)),
  CONSTRAINT `Game_chk_5` CHECK ((`homeYellowRedCards` >= 0)),
  CONSTRAINT `Game_chk_6` CHECK ((`awayYellowRedCards` >= 0))
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Game`
--

LOCK TABLES `Game` WRITE;
/*!40000 ALTER TABLE `Game` DISABLE KEYS */;
INSERT INTO `Game` VALUES (1,1,13,14,0,0,NULL,'2',0,0,0,0,1,1),(2,2,15,16,0,0,NULL,'1',0,0,0,0,1,1),(3,1,17,18,0,0,NULL,'4',0,0,0,0,1,1),(4,2,19,20,0,0,NULL,'3',0,0,0,0,1,1);
/*!40000 ALTER TABLE `Game` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Modality`
--

DROP TABLE IF EXISTS `Modality`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Modality` (
  `idModality` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idModality`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Modality`
--

LOCK TABLES `Modality` WRITE;
/*!40000 ALTER TABLE `Modality` DISABLE KEYS */;
INSERT INTO `Modality` VALUES (1,'Individual Masculino'),(2,'Individual Femenino'),(3,'Dobles Masculino'),(4,'Dobles Femenino'),(5,'Dobles Mixtos'),(6,'Equipos Masculino'),(7,'Equipos Femenino'),(8,'Individual Mixto');
/*!40000 ALTER TABLE `Modality` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Player`
--

DROP TABLE IF EXISTS `Player`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Player` (
  `idPlayer` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `height` int DEFAULT NULL,
  `weight` int DEFAULT NULL,
  `gender` varchar(1) DEFAULT NULL,
  `advtg` int DEFAULT NULL,
  `idClub` int DEFAULT NULL,
  `idBlade` int DEFAULT NULL,
  `idBlackRubber` int DEFAULT NULL,
  `idColoredRubber` int DEFAULT NULL,
  `idCoach` int DEFAULT NULL,
  `hand` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`idPlayer`),
  KEY `idClub` (`idClub`),
  KEY `idBlade` (`idBlade`),
  KEY `idBlackRubber` (`idBlackRubber`),
  KEY `idRedRubber` (`idColoredRubber`),
  KEY `idCoach` (`idCoach`),
  CONSTRAINT `Player_ibfk_1` FOREIGN KEY (`idClub`) REFERENCES `Club` (`idClub`) ON DELETE SET NULL,
  CONSTRAINT `Player_ibfk_2` FOREIGN KEY (`idBlade`) REFERENCES `Blade` (`idBlade`) ON DELETE SET NULL,
  CONSTRAINT `Player_ibfk_3` FOREIGN KEY (`idBlackRubber`) REFERENCES `Rubber` (`idRubber`) ON DELETE SET NULL,
  CONSTRAINT `Player_ibfk_4` FOREIGN KEY (`idColoredRubber`) REFERENCES `Rubber` (`idRubber`) ON DELETE SET NULL,
  CONSTRAINT `Player_ibfk_5` FOREIGN KEY (`idCoach`) REFERENCES `Coach` (`idCoach`) ON DELETE SET NULL
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Player`
--

LOCK TABLES `Player` WRITE;
/*!40000 ALTER TABLE `Player` DISABLE KEYS */;
INSERT INTO `Player` VALUES (13,'Ricardo García',184,70,'M',-2,1,1,3,1,1,'Derecha'),(14,'Javier Pereira',182,82,'M',-2,1,2,4,2,2,'Derecha'),(15,'Laura Jurado',171,75,'F',6,1,3,5,3,3,'Derecha'),(16,'Cotufa Popeta',169,72,'M',-8,2,1,1,4,5,'Derecha'),(17,'Alejandro Mesa',173,60,'M',0,2,2,2,5,6,'Derecha'),(18,'Camilo Cely',178,65,'M',-6,2,3,3,1,6,'Derecha'),(19,'Juliana Quintana',174,64,'F',6,3,1,4,2,8,'Izquierda'),(20,'Fernando Fagua',168,66,'M',4,3,2,5,3,8,'Derecha'),(21,'Miguel Castro',189,90,'M',-2,3,3,1,4,9,'Izquierda'),(22,'María Forero',172,63,'F',4,4,1,2,5,10,'Derecha'),(23,'Andrea Montes',160,50,'F',0,4,2,3,1,11,'Izquierda'),(24,'Alejandra Orjuela',154,49,'F',-4,4,3,4,2,10,'Derecha'),(26,'Timo Boll',180,79,'M',-11,1,3,3,5,1,'Izquierda'),(27,'Truls Moregard',185,89,'M',-11,4,3,3,5,1,'Derecha'),(28,'Adri Camelo',158,50,'F',5,1,2,4,2,1,'Derecha'),(29,'Rigo',168,70,'M',2,4,1,1,2,10,'Derecha'),(30,'Silvana Solano',135,23,'F',6,3,3,3,2,9,'Derecha'),(31,'Gabriel García',170,70,'M',2,4,2,5,1,11,'Derecha'),(32,'Nelson Ruiz',183,80,'M',-2,1,1,2,3,2,'Derecha'),(33,'Frank Gallego',168,65,'M',2,2,1,1,1,6,'Derecha'),(34,'Juan Pérez',175,70,'M',0,2,2,2,3,6,'Izquierda'),(35,'Ma Long',180,75,'M',-11,4,2,1,2,11,'Derecha'),(36,'Bernadette Szocs',160,50,'F',-11,1,1,1,2,2,'Derecha'),(37,'Adriana Díaz',168,65,'F',-11,1,1,1,2,1,'Derecha'),(38,'Javier Alexander',180,80,'M',0,2,2,2,3,6,'Derecha'),(39,'Timo Boll',175,70,'M',-11,1,1,2,2,1,'Izquierda'),(40,'Nelson Pereira',182,85,'M',-2,1,2,2,2,1,'Derecha'),(41,'Alex Pedraza',180,80,'M',-2,2,2,1,2,5,'Derecha');
/*!40000 ALTER TABLE `Player` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PlayerGame`
--

DROP TABLE IF EXISTS `PlayerGame`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `PlayerGame` (
  `idPlayer` int NOT NULL,
  `idGame` int NOT NULL,
  `pointsWon` int NOT NULL DEFAULT '0',
  `pointsLost` int NOT NULL DEFAULT '0',
  `setsWon` int NOT NULL DEFAULT '0',
  `setsLost` int NOT NULL DEFAULT '0',
  `yellowCards` int DEFAULT '0',
  `yellowRedCards` int DEFAULT '0',
  `timeOuts` int DEFAULT '0',
  `pointsWonOnService` int DEFAULT '0',
  `pointsLostOnService` int DEFAULT '0',
  `pointsWonOnReceive` int DEFAULT '0',
  `pointsLostOnReceive` int DEFAULT '0',
  PRIMARY KEY (`idPlayer`,`idGame`),
  KEY `idGame` (`idGame`),
  CONSTRAINT `PlayerGame_ibfk_1` FOREIGN KEY (`idPlayer`) REFERENCES `Player` (`idPlayer`),
  CONSTRAINT `PlayerGame_ibfk_2` FOREIGN KEY (`idGame`) REFERENCES `Game` (`idGame`),
  CONSTRAINT `PlayerGame_chk_1` CHECK ((`pointsWon` >= 0)),
  CONSTRAINT `PlayerGame_chk_2` CHECK ((`pointsLost` >= 0)),
  CONSTRAINT `PlayerGame_chk_3` CHECK ((`setsWon` >= 0)),
  CONSTRAINT `PlayerGame_chk_4` CHECK ((`setsLost` >= 0)),
  CONSTRAINT `PlayerGame_chk_5` CHECK ((`yellowCards` >= 0)),
  CONSTRAINT `PlayerGame_chk_6` CHECK ((`yellowRedCards` >= 0)),
  CONSTRAINT `PlayerGame_chk_7` CHECK ((`timeOuts` >= 0))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PlayerGame`
--

LOCK TABLES `PlayerGame` WRITE;
/*!40000 ALTER TABLE `PlayerGame` DISABLE KEYS */;
INSERT INTO `PlayerGame` VALUES (13,1,85,76,3,2,1,0,1,43,30,42,46),(15,2,0,0,2,3,0,0,0,0,0,0,0);
/*!40000 ALTER TABLE `PlayerGame` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PlayerTournament`
--

DROP TABLE IF EXISTS `PlayerTournament`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `PlayerTournament` (
  `idPlayer` int NOT NULL,
  `idTournament` int NOT NULL,
  `gamesPlayed` int NOT NULL DEFAULT '0',
  `pointsWon` int DEFAULT '0',
  `pointsLost` int DEFAULT '0',
  `setsWon` int NOT NULL DEFAULT '0',
  `setsLost` int NOT NULL DEFAULT '0',
  `matchesWon` int NOT NULL DEFAULT '0',
  `matchesLost` int NOT NULL DEFAULT '0',
  `yellowCards` int DEFAULT '0',
  `yellowRedCards` int DEFAULT '0',
  `timeOuts` int DEFAULT '0',
  `pointsWonOnService` int DEFAULT '0',
  `pointsLostOnService` int DEFAULT '0',
  `pointsWonOnReceive` int DEFAULT '0',
  `pointsLostOnReceive` int DEFAULT '0',
  PRIMARY KEY (`idPlayer`,`idTournament`),
  KEY `idTournament` (`idTournament`),
  CONSTRAINT `PlayerTournament_ibfk_1` FOREIGN KEY (`idPlayer`) REFERENCES `Player` (`idPlayer`),
  CONSTRAINT `PlayerTournament_ibfk_2` FOREIGN KEY (`idTournament`) REFERENCES `Tournament` (`idTournament`),
  CONSTRAINT `PlayerTournament_chk_1` CHECK ((`pointsWon` >= 0)),
  CONSTRAINT `PlayerTournament_chk_2` CHECK ((`pointsLost` >= 0)),
  CONSTRAINT `PlayerTournament_chk_3` CHECK ((`setsWon` >= 0)),
  CONSTRAINT `PlayerTournament_chk_4` CHECK ((`setsLost` >= 0)),
  CONSTRAINT `PlayerTournament_chk_5` CHECK ((`matchesWon` >= 0)),
  CONSTRAINT `PlayerTournament_chk_6` CHECK ((`matchesLost` >= 0)),
  CONSTRAINT `PlayerTournament_chk_7` CHECK ((`yellowCards` >= 0)),
  CONSTRAINT `PlayerTournament_chk_8` CHECK ((`yellowRedCards` >= 0)),
  CONSTRAINT `PlayerTournament_chk_9` CHECK ((`timeOuts` >= 0))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PlayerTournament`
--

LOCK TABLES `PlayerTournament` WRITE;
/*!40000 ALTER TABLE `PlayerTournament` DISABLE KEYS */;
INSERT INTO `PlayerTournament` VALUES (13,1,7,154,97,21,4,7,0,0,0,5,113,34,56,48),(13,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0),(13,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0),(13,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0),(13,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0),(13,7,0,0,0,0,0,0,0,0,0,0,0,0,0,0),(13,8,0,0,0,0,0,0,0,0,0,0,0,0,0,0),(13,9,0,0,0,0,0,0,0,0,0,0,0,0,0,0),(36,8,0,0,0,0,0,0,0,0,0,0,0,0,0,0),(37,12,0,0,0,0,0,0,0,0,0,0,0,0,0,0),(40,8,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
/*!40000 ALTER TABLE `PlayerTournament` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Rubber`
--

DROP TABLE IF EXISTS `Rubber`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Rubber` (
  `idRubber` int NOT NULL AUTO_INCREMENT,
  `brand` varchar(50) NOT NULL,
  `model` varchar(50) NOT NULL,
  PRIMARY KEY (`idRubber`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Rubber`
--

LOCK TABLES `Rubber` WRITE;
/*!40000 ALTER TABLE `Rubber` DISABLE KEYS */;
INSERT INTO `Rubber` VALUES (1,'Donic','BlueFire JP01 Turbo'),(2,'DHS','Hurricane 3'),(3,'Butterfly','Tenergy 05'),(4,'Xiom','Vega pro'),(5,'DHS','Gold Arc 8');
/*!40000 ALTER TABLE `Rubber` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Tournament`
--

DROP TABLE IF EXISTS `Tournament`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Tournament` (
  `idTournament` int NOT NULL AUTO_INCREMENT,
  `idType` int NOT NULL,
  `idWinner` int DEFAULT NULL,
  `idStructure` int NOT NULL,
  `name` varchar(100) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idTournament`),
  KEY `idType` (`idType`),
  KEY `idWinner` (`idWinner`),
  KEY `idStructure` (`idStructure`),
  CONSTRAINT `Tournament_ibfk_1` FOREIGN KEY (`idType`) REFERENCES `TournamentType` (`idType`),
  CONSTRAINT `Tournament_ibfk_2` FOREIGN KEY (`idWinner`) REFERENCES `Player` (`idPlayer`),
  CONSTRAINT `Tournament_ibfk_3` FOREIGN KEY (`idStructure`) REFERENCES `TournamentStructure` (`idStructure`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Tournament`
--

LOCK TABLES `Tournament` WRITE;
/*!40000 ALTER TABLE `Tournament` DISABLE KEYS */;
INSERT INTO `Tournament` VALUES (1,1,13,1,'Ranking Bogotá 2025-1','Rankeo de los mejores jugadores Bogotá 2025-1'),(2,1,14,2,'Ranking Bogotá 2024-2','Rankeo de los mejores jugadores Bogotá 2024-2'),(3,2,17,3,'Copa por equipos',NULL),(4,3,24,4,'Torneo viernes 30/05/2025','Rankeo de los mejores jugadores del club'),(6,3,NULL,113,'Ascun Ind M 1ra',NULL),(7,3,NULL,81,'Copa tutifruti enero 21 2026','Torneo tipo copa categoría única individual mixto sin ventajas'),(8,2,NULL,220,'Nombre de prueba','Kiosk'),(9,3,NULL,221,'Copifruti','Torneo con ventajas tutifruti'),(12,4,NULL,224,'Yai','Sin descripción');
/*!40000 ALTER TABLE `Tournament` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `TournamentStructure`
--

DROP TABLE IF EXISTS `TournamentStructure`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `TournamentStructure` (
  `idStructure` int NOT NULL AUTO_INCREMENT,
  `idType` int NOT NULL,
  `idModality` int NOT NULL,
  `idCategory` int NOT NULL,
  PRIMARY KEY (`idStructure`),
  KEY `idType` (`idType`),
  KEY `idModality` (`idModality`),
  KEY `idCategory` (`idCategory`),
  CONSTRAINT `TournamentStructure_ibfk_1` FOREIGN KEY (`idType`) REFERENCES `TournamentType` (`idType`),
  CONSTRAINT `TournamentStructure_ibfk_2` FOREIGN KEY (`idModality`) REFERENCES `Modality` (`idModality`),
  CONSTRAINT `TournamentStructure_ibfk_3` FOREIGN KEY (`idCategory`) REFERENCES `Category` (`idCategory`)
) ENGINE=InnoDB AUTO_INCREMENT=227 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `TournamentStructure`
--

LOCK TABLES `TournamentStructure` WRITE;
/*!40000 ALTER TABLE `TournamentStructure` DISABLE KEYS */;
INSERT INTO `TournamentStructure` VALUES (1,1,1,4),(2,1,1,3),(3,1,1,2),(4,1,1,1),(5,1,2,4),(6,1,2,3),(7,1,2,2),(8,1,2,1),(9,1,3,4),(10,1,3,3),(11,1,3,2),(12,1,3,1),(13,1,4,4),(14,1,4,3),(15,1,4,2),(16,1,4,1),(17,1,5,4),(18,1,5,3),(19,1,5,2),(20,1,5,1),(21,1,6,4),(22,1,6,3),(23,1,6,2),(24,1,6,1),(25,1,7,4),(26,1,7,3),(27,1,7,2),(28,1,7,1),(42,1,8,4),(43,1,8,3),(44,1,8,2),(45,1,8,1),(46,2,1,5),(47,2,1,4),(48,2,1,3),(49,2,1,2),(50,2,1,1),(51,2,2,5),(52,2,2,4),(53,2,2,3),(54,2,2,2),(55,2,2,1),(56,2,3,5),(57,2,3,4),(58,2,3,3),(59,2,3,2),(60,2,3,1),(61,2,4,5),(62,2,4,4),(63,2,4,3),(64,2,4,2),(65,2,4,1),(66,2,5,5),(67,2,5,4),(68,2,5,3),(69,2,5,2),(70,2,5,1),(71,2,6,5),(72,2,6,4),(73,2,6,3),(74,2,6,2),(75,2,6,1),(76,2,7,5),(77,2,7,4),(78,2,7,3),(79,2,7,2),(80,2,7,1),(81,2,8,5),(82,2,8,4),(83,2,8,3),(84,2,8,2),(85,2,8,1),(109,3,1,5),(110,3,1,4),(111,3,1,3),(112,3,1,2),(113,3,1,1),(114,3,2,5),(115,3,2,4),(116,3,2,3),(117,3,2,2),(118,3,2,1),(119,3,3,5),(120,3,3,4),(121,3,3,3),(122,3,3,2),(123,3,3,1),(124,3,4,5),(125,3,4,4),(126,3,4,3),(127,3,4,2),(128,3,4,1),(129,3,5,5),(130,3,5,4),(131,3,5,3),(132,3,5,2),(133,3,5,1),(134,3,6,5),(135,3,6,4),(136,3,6,3),(137,3,6,2),(138,3,6,1),(139,3,7,5),(140,3,7,4),(141,3,7,3),(142,3,7,2),(143,3,7,1),(144,3,8,5),(145,3,8,4),(146,3,8,3),(147,3,8,2),(148,3,8,1),(172,5,1,5),(173,5,1,4),(174,5,1,3),(175,5,1,2),(176,5,1,1),(177,5,2,5),(178,5,2,4),(179,5,2,3),(180,5,2,2),(181,5,2,1),(182,5,3,5),(183,5,3,4),(184,5,3,3),(185,5,3,2),(186,5,3,1),(187,5,4,5),(188,5,4,4),(189,5,4,3),(190,5,4,2),(191,5,4,1),(192,5,5,5),(193,5,5,4),(194,5,5,3),(195,5,5,2),(196,5,5,1),(197,5,6,5),(198,5,6,4),(199,5,6,3),(200,5,6,2),(201,5,6,1),(202,5,7,5),(203,5,7,4),(204,5,7,3),(205,5,7,2),(206,5,7,1),(207,5,8,5),(208,5,8,4),(209,5,8,3),(210,5,8,2),(211,5,8,1),(212,1,1,5),(213,1,2,5),(214,1,3,5),(215,1,4,5),(216,1,5,5),(217,1,6,5),(218,1,7,5),(219,1,8,5),(220,2,3,2),(221,3,8,5),(222,1,1,3),(223,1,2,2),(224,4,5,5),(225,3,5,4),(226,3,1,1);
/*!40000 ALTER TABLE `TournamentStructure` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `TournamentType`
--

DROP TABLE IF EXISTS `TournamentType`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `TournamentType` (
  `idType` int NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idType`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `TournamentType`
--

LOCK TABLES `TournamentType` WRITE;
/*!40000 ALTER TABLE `TournamentType` DISABLE KEYS */;
INSERT INTO `TournamentType` VALUES (1,'Liga','Liga todos contra todos. Ida y vuelta o sólo ida, primeros puestos tienen clasificación, primer puesto campeón, últimos puestos descenso'),(2,'Copa','Copa llave de eliminación directa. Generalmente sólo ida aunque también se puede ida y vuelta.'),(3,'Champions','Grupos todos contra todos en primera ronda, primeros puestos clasifican a segunda ronda, donde ahora son llaves de eliminación directa.'),(4,'Amistoso','Amistoso sin eliminación, práctica libre'),(5,'Corbillón','Copa por equipos');
/*!40000 ALTER TABLE `TournamentType` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `User`
--

DROP TABLE IF EXISTS `User`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `User` (
  `idUser` int NOT NULL AUTO_INCREMENT,
  `username` varchar(100) NOT NULL,
  `password` varchar(255) NOT NULL,
  `idRole` int NOT NULL,
  PRIMARY KEY (`idUser`),
  UNIQUE KEY `username` (`username`),
  KEY `idRole` (`idRole`),
  CONSTRAINT `User_ibfk_1` FOREIGN KEY (`idRole`) REFERENCES `UserRole` (`idRole`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `User`
--

LOCK TABLES `User` WRITE;
/*!40000 ALTER TABLE `User` DISABLE KEYS */;
INSERT INTO `User` VALUES (5,'ricardoAdmin','$2a$10$KKxqrOdD0wwyqg7/3qOmXO.6bplqEq8Pom0PA2dsQVb2GNSirBzOy',4),(6,'ricardoPlayer','$2a$10$KwabahaxmADxQeGOCJKjauxEqc/r3LFKeGMbBRl61MdRvMq.qD4v.',3),(7,'ricardoUmpire','$2a$10$IAMC4uLcMXzRw01TFpBIV.MmIaaPIqycFmC9NPV2ig4qL/k2S/pwq',3),(8,'ricardoChiefUmpire','$2a$10$wVMfQwGXLNfRrVk.KwmqCezooWl4KseJyJjdXF9dHo3kVoi6cWfiy',3),(9,'testest','$2a$10$CsEfnA5CFxBaDgRZIXsgEOc147qp/If9GWv1ogzweYnboNC3oSxDC',3),(10,'creausuario','$2a$10$8diFsC/AcekzZcWXdBtBueb/WRqYTg9hd1eZKHu06j.ZjLoOcKW7C',3),(11,'nuevousuario','$2a$10$WhcePapHYzVRD2Q35lxFzu46xg9hy/DwYmtISYWxdvuLakNArnDT.',3),(12,'usuario2','$2a$10$43/SyDN7TkZIderMRqdKWeVytcRBbbq8wX6yo37LpWkjWKfFqnevG',3),(13,'testesta','$2a$10$F8sibLQ4tq3qW6o5E7w3ZO9KLIayR..AYpbe3h4mVw0BZh5WL3Kv2',3),(14,'testestab','$2a$10$EWu0HUXY6fU83tH352DGOeam9Axeq7WOsSc1tHbriiJ9qOVrEub7q',3),(16,'teste6','$2a$10$9LfE.Cpr8ukxWJEnUSya5ukSqofAB53NZ1nz8VF0xzt0USAiLJkFC',3),(17,'diodabolyi','$2a$10$I.Sti04/b2QwqAM6l4VvHuooqBe4Rv1./0HZw1hrYpOilwJR2mUXm',3),(18,'adriPlayer','$2a$10$jwiSXLHM6FH0ib/whIcDy.LK1N72K8QQHUEs5r7n4aYpPeDj8T9Da',3),(19,'rigoPlayer','$2a$10$TJZIC32zRrzOro7vt9mD2O6vgnfYwYNqNcNRLk2YA2xX/JnwAEfxy',3);
/*!40000 ALTER TABLE `User` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `UserRole`
--

DROP TABLE IF EXISTS `UserRole`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `UserRole` (
  `idRole` int NOT NULL AUTO_INCREMENT,
  `roleName` varchar(50) NOT NULL,
  PRIMARY KEY (`idRole`),
  UNIQUE KEY `roleName` (`roleName`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `UserRole`
--

LOCK TABLES `UserRole` WRITE;
/*!40000 ALTER TABLE `UserRole` DISABLE KEYS */;
INSERT INTO `UserRole` VALUES (4,'Admin'),(1,'ChiefUmpire'),(3,'Player'),(2,'Umpire');
/*!40000 ALTER TABLE `UserRole` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-02-26  0:04:38
