CREATE TABLE IF NOT EXISTS `state` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `abbreviation` varchar(45) DEFAULT NULL,
  `hdi` double DEFAULT NULL,
  `demographic_density` double DEFAULT NULL,
  `capital` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
)