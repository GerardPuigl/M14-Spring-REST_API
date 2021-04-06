CREATE SCHEMA IF NOT EXISTS `m14_WhiteCollar` ;

CREATE TABLE IF NOT EXISTS `m14_WhiteCollar`.`pictures` (
  `picture_id` INT NOT NULL AUTO_INCREMENT,
  `picture_author` VARCHAR(255) NULL,
  `picture_name` VARCHAR(255) NULL,
  `picture_price` DOUBLE NULL,
  `picture_registrationdate` DATETIME NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`picture_id`));
