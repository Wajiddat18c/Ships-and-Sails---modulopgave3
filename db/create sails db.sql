DROP DATABASE IF EXISTS sails;

-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema sails
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema sails
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `sails` DEFAULT CHARACTER SET utf8 ;
USE `sails` ;

-- -----------------------------------------------------
-- Table `sails`.`Skibe`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sails`.`Skibe` (
  `idSkib` INT NOT NULL AUTO_INCREMENT,
  `navn` VARCHAR(45) NOT NULL,
  `maxNoOfSailorsOnShip` INT NOT NULL,
  `maxSpeed` INT NOT NULL,
  `shipType` VARCHAR(45) NOT NULL,
  `gunsPrRow` INT NULL,
  `rowsOfGuns` INT NULL,
  `noOfSailorsNeededToShoot` INT NULL,
  `maxNoOfSails` INT NULL,
  `noOfSailorsNeededToSail` INT NULL,
  `maxHull` INT NULL,
  `maxSpeedChange` INT NULL,
  `maxSail` INT NULL,
  `noOfTurns` INT NULL,
  PRIMARY KEY (`idSkib`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sails`.`Scenarie`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sails`.`Scenarie` (
  `idScenarie` INT NOT NULL AUTO_INCREMENT,
  `navn` VARCHAR(45) NOT NULL,
  `sizeX` INT NULL,
  `sizeY` INT NOT NULL,
  PRIMARY KEY (`idScenarie`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sails`.`Skibspositioner`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sails`.`Skibspositioner` (
  `Skibe_idSkib` INT NOT NULL,
  `Scenarie_idScenarie` INT NOT NULL,
  `posX` INT NOT NULL,
  `posY` INT NOT NULL,
  `Nationalitet` VARCHAR(45) NULL,
  INDEX `fk_Skibspositioner_Skibe_idx` (`Skibe_idSkib` ASC) VISIBLE,
  INDEX `fk_Skibspositioner_Scenarie1_idx` (`Scenarie_idScenarie` ASC) VISIBLE,
  CONSTRAINT `fk_Skibspositioner_Skibe`
    FOREIGN KEY (`Skibe_idSkib`)
    REFERENCES `sails`.`Skibe` (`idSkib`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Skibspositioner_Scenarie1`
    FOREIGN KEY (`Scenarie_idScenarie`)
    REFERENCES `sails`.`Scenarie` (`idScenarie`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
