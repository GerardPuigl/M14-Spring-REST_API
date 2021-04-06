CREATE SCHEMA IF NOT EXISTS `m14_WhiteCollar`;

CREATE TABLE IF NOT EXISTS `m14_WhiteCollar`.`shops` (
  `shops_id` INT NOT NULL,
  `shops_name` VARCHAR(45) NOT NULL,
  `shops_capacity` INT NOT NULL,
  `shops_creationdata` DATETIME NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`shops_id`));

CREATE TABLE IF NOT EXISTS `m14_WhiteCollar`.`pictures` (
  `picture_id` INT NOT NULL AUTO_INCREMENT,
  `picture_author` VARCHAR(255) NULL DEFAULT NULL,
  `picture_name` VARCHAR(255) NULL DEFAULT NULL,
  `picture_price` DOUBLE NULL DEFAULT NULL,
  `picture_registrationdate` DATETIME NULL DEFAULT CURRENT_TIMESTAMP,
  `shops_id` INT NOT NULL,
  PRIMARY KEY (`picture_id`),
  INDEX `fk_pictures_shops_idx` (`shops_id` ASC) VISIBLE,
  CONSTRAINT `fk_pictures_shops`
    FOREIGN KEY (`shops_id`)
    REFERENCES `m14_WhiteCollar`.`shops` (`shops_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);