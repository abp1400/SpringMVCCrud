-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema shoedb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `shoedb` ;

-- -----------------------------------------------------
-- Schema shoedb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `shoedb` DEFAULT CHARACTER SET utf8 ;
USE `shoedb` ;

-- -----------------------------------------------------
-- Table `shoe`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `shoe` ;

CREATE TABLE IF NOT EXISTS `shoe` (
  `index` INT NOT NULL,
  `brand` VARCHAR(45) NOT NULL,
  `style` VARCHAR(100) NOT NULL,
  `color` VARCHAR(100) NOT NULL,
  `purchase_price` INT UNSIGNED NOT NULL,
  `resale_price` INT UNSIGNED NOT NULL,
  `image_url` VARCHAR(200) NOT NULL,
  PRIMARY KEY (`index`))
ENGINE = InnoDB;

SET SQL_MODE = '';
GRANT USAGE ON *.* TO user;
 DROP USER user;
SET SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';
CREATE USER 'user' IDENTIFIED BY 'user';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'user';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `shoe`
-- -----------------------------------------------------
START TRANSACTION;
USE `shoedb`;
INSERT INTO `shoe` (`index`, `brand`, `style`, `color`, `purchase_price`, `resale_price`, `image_url`) VALUES (1, 'Nike', 'Lebron 9', 'Cool Grey', 170, 350, 'pictures/A.jpg');
INSERT INTO `shoe` (`index`, `brand`, `style`, `color`, `purchase_price`, `resale_price`, `image_url`) VALUES (2, 'Jordan', 'Jordan 5', 'Black', 125, 1000, 'pictures/B.jpg');
INSERT INTO `shoe` (`index`, `brand`, `style`, `color`, `purchase_price`, `resale_price`, `image_url`) VALUES (3, 'Nike', 'Kobe 5 Bruce Lee', 'Yellow', 150, 600, 'pictures/C.jpg');
INSERT INTO `shoe` (`index`, `brand`, `style`, `color`, `purchase_price`, `resale_price`, `image_url`) VALUES (4, 'Adidas', 'Yeezy Boost 750', 'Black', 350, 1200, 'pictures/D.jpg');
INSERT INTO `shoe` (`index`, `brand`, `style`, `color`, `purchase_price`, `resale_price`, `image_url`) VALUES (5, 'Under Armour', 'Curry 2', 'Cobalt', 120, 225, 'pictures/E.jpg');
INSERT INTO `shoe` (`index`, `brand`, `style`, `color`, `purchase_price`, `resale_price`, `image_url`) VALUES (6, 'Nike', 'Galaxy Foamposite', 'Purple', 220, 1200, 'pictures/F.jpg');
INSERT INTO `shoe` (`index`, `brand`, `style`, `color`, `purchase_price`, `resale_price`, `image_url`) VALUES (7, 'Jordan', 'Jordan 11', 'Black-Red', 125, 465, 'pictures/G.jpg');
INSERT INTO `shoe` (`index`, `brand`, `style`, `color`, `purchase_price`, `resale_price`, `image_url`) VALUES (8, 'Adidas', 'Crazy 8', 'Black-White', 125, 350, 'pictures/H.jpg');
INSERT INTO `shoe` (`index`, `brand`, `style`, `color`, `purchase_price`, `resale_price`, `image_url`) VALUES (9, 'Jordan', 'Jordan 1', 'Red-White', 65, 2500, 'pictures/I.jpg');
INSERT INTO `shoe` (`index`, `brand`, `style`, `color`, `purchase_price`, `resale_price`, `image_url`) VALUES (10, 'Nike', 'Air Yeezy 2', 'Red', 245, 5500, 'pictures/J.jpg');
INSERT INTO `shoe` (`index`, `brand`, `style`, `color`, `purchase_price`, `resale_price`, `image_url`) VALUES (11, 'Nike', 'Air Mag Auto Lace', 'Grey', 10, 55000, 'pictures/K.jpg');
INSERT INTO `shoe` (`index`, `brand`, `style`, `color`, `purchase_price`, `resale_price`, `image_url`) VALUES (12, 'Adidas', 'Yeezy Boost 350 V2', 'Black', 220, 1150, 'pictures/L.jpg');

COMMIT;
