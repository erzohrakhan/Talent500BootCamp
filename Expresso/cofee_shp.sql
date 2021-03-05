Use expresso;

INSERT INTO `coffee_type` (`name`, `price`) VALUES ('Americano', 150);
INSERT INTO `coffee_type` (`name`, `price`) VALUES ('Expresso ', 250);
INSERT INTO `coffee_type` (`name`, `price`) VALUES ('Latte    ', 200);
INSERT INTO `coffee_type` (`name`, `price`) VALUES ('Mocha    ', 175);

INSERT INTO `addon` (`type`, `price`) VALUES ('Cashew  ', 100);
INSERT INTO `addon` (`type`, `price`) VALUES ('Choclate', 80);
INSERT INTO `addon` (`type`, `price`) VALUES ('Cream   ', 70);
INSERT INTO `addon` (`type`, `price`) VALUES ('Hazelnut', 150);

INSERT INTO `discount_voucher` (`voucher`, `discount_rate`) VALUES ('101', 5);
INSERT INTO `discount_voucher` (`voucher`, `discount_rate`) VALUES ('01011', 10);
INSERT INTO `discount_voucher` (`voucher`, `discount_rate`) VALUES ('01', 2);
INSERT INTO `discount_voucher` (`voucher`, `discount_rate`) VALUES ('11', 3);