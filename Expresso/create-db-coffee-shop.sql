DROP SCHEMA IF EXISTS `Expresso`;

CREATE SCHEMA `Expresso`;

use `Expresso`;

SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `coffee_type`;

CREATE TABLE `coffee_type` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `price` int DEFAULT 0,
  UNIQUE KEY `COFFEE_NAME` (`name`),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `addon`;

CREATE TABLE `addon` (
  `id` int NOT NULL AUTO_INCREMENT,
  `type` varchar(45) DEFAULT NULL,
  `price` int DEFAULT 0,
  PRIMARY KEY (`id`),
  UNIQUE KEY `ADDON_TYPE` (`type`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `bill`;
CREATE TABLE `bill` (
  `id` int NOT NULL AUTO_INCREMENT,
  `bill_date` varchar(50) NOT NULL,
  `totalvalue` int NOT NULL,
  `discount_voucher_id` int,
  `netvalue` int,
  `totalbill` int,
  `customer_id` int,
  PRIMARY KEY (`id`),
  FOREIGN KEY(`discount_voucher_id`) REFERENCES `discount_voucher`(`id`),
  FOREIGN KEY(`customer_id`) REFERENCES `customer`(`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `bill_details`;
CREATE TABLE `bill_details` (
`id` int NOT NULL AUTO_INCREMENT,
`coffee_type_name` varchar(50),
`addon_name` varchar(45),
`bill_id` int,
PRIMARY KEY (`id`),
FOREIGN KEY(`coffee_type_id`) REFERENCES `coffee_type`(`id`),
FOREIGN KEY(`addon_id`) REFERENCES `addon`(`id`),
FOREIGN KEY(`bill_id`) REFERENCES `bill`(`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `discount_voucher`;

CREATE TABLE `discount_voucher` (
  `id` int NOT NULL AUTO_INCREMENT,
  `voucher` varchar(128) DEFAULT NULL,
  `discount_rate` int,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
`id` int NOT NULL AUTO_INCREMENT,
`name` varchar(15) DEFAULT NULL,
`phone_no` varchar(15) DEFAULT NULL,
PRIMARY KEY (`id`), 
UNIQUE KEY `PHONE_NUMBER_UNIQUE` (`phone_no`)
)ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

SET FOREIGN_KEY_CHECKS = 1;
