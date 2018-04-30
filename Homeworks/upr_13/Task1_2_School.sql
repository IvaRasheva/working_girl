-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema school_hw
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema school_hw
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `school_hw` DEFAULT CHARACTER SET utf8 ;
USE `school_hw` ;

-- -----------------------------------------------------
-- Table `school_hw`.`addresses`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `school_hw`.`addresses` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `country` VARCHAR(50) NOT NULL,
  `city` VARCHAR(50) NOT NULL,
  `street` VARBINARY(50) NOT NULL,
  `number` INT(11) NOT NULL,
  `floor` INT(11) NOT NULL,
  `apartment_no` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `school_hw`.`disciplines`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `school_hw`.`disciplines` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(200) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `school_hw`.`students`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `school_hw`.`students` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(200) NOT NULL,
  `enrollment_date` DATE NOT NULL,
  `adress_Id` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `FK_student_adress` (`adress_Id` ASC),
  CONSTRAINT `FK_student_adress`
    FOREIGN KEY (`adress_Id`)
    REFERENCES `school_hw`.`addresses` (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `school_hw`.`disciplines_studied`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `school_hw`.`disciplines_studied` (
  `discipline_id` INT(11) NOT NULL,
  `student_id` INT(11) NOT NULL,
  PRIMARY KEY (`discipline_id`, `student_id`),
  INDEX `FK_students_studied` (`student_id` ASC),
  CONSTRAINT `FK_disciplines_studied`
    FOREIGN KEY (`discipline_id`)
    REFERENCES `school_hw`.`disciplines` (`id`),
  CONSTRAINT `FK_students_studied`
    FOREIGN KEY (`student_id`)
    REFERENCES `school_hw`.`students` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `school_hw`.`teachers`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `school_hw`.`teachers` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(200) NOT NULL,
  `email` VARCHAR(200) NOT NULL,
  `salery` INT(11) NOT NULL,
  `adress_Id` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `FK_teacher_address` (`adress_Id` ASC),
  CONSTRAINT `FK_teacher_address`
    FOREIGN KEY (`adress_Id`)
    REFERENCES `school_hw`.`addresses` (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `school_hw`.`disciplines_taught`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `school_hw`.`disciplines_taught` (
  `discipline_id` INT(11) NOT NULL,
  `teacher_id` INT(11) NOT NULL,
  PRIMARY KEY (`discipline_id`, `teacher_id`),
  INDEX `FK_teachers` (`teacher_id` ASC),
  CONSTRAINT `FK_disciplines`
    FOREIGN KEY (`discipline_id`)
    REFERENCES `school_hw`.`disciplines` (`id`),
  CONSTRAINT `FK_teachers`
    FOREIGN KEY (`teacher_id`)
    REFERENCES `school_hw`.`teachers` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
