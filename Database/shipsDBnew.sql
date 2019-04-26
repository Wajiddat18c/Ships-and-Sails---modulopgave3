DROP DATABASE IF EXISTS sails;
CREATE DATABASE sails;
use sails;
CREATE TABLE `sails`.`ships` (
  `shipId` INT NOT NULL,
  `shipType` VARCHAR(45) NOT NULL,
  `nationality` VARCHAR(45) NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `coordinate` VARCHAR(45) NOT NULL,
  `direction` VARCHAR(5) NOT NULL,
  `speed` INT NOT NULL,
  `hull_health` INT NOT NULL,
  `sail_health` INT NOT NULL,
  `sailors` INT NOT NULL,
  `load` INT NOT NULL,
  `currentAmmoType` INT NOT NULL,
  PRIMARY KEY (`shipId`))
COMMENT = '		';

CREATE TABLE `sails`.`loadedShips` (
  `shipId` INT NOT NULL,
  `shipType` VARCHAR(45) NOT NULL,
  `nationality` VARCHAR(45) NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `coordinate` VARCHAR(45) NOT NULL,
  `direction` VARCHAR(5) NOT NULL,
  `speed` INT NOT NULL,
  `hull_health` INT NOT NULL,
  `sail_health` INT NOT NULL,
  `sailors` INT NOT NULL,
  `load` INT NOT NULL,
  `currentAmmoType` INT NOT NULL,
  PRIMARY KEY (`shipId`))
COMMENT = '		';