Use expresso;

INSERT INTO `coffee_type` (`name`, `price_small`, `price_med`, `price_large`) VALUES ('Americano', 150,200,250);
INSERT INTO `coffee_type` (`name`, `price_small`, `price_med`, `price_large`) VALUES ('Expresso ', 250, 300, 350);
INSERT INTO `coffee_type` (`name`, `price_small`, `price_med`, `price_large`) VALUES ('Latte    ', 200, 250, 300);
INSERT INTO `coffee_type` (`name`, `price_small`, `price_med`, `price_large`) VALUES ('Mocha    ', 175, 225, 275);

INSERT INTO `addon` (`type`, `price`) VALUES ('Cashew  ', 100);
INSERT INTO `addon` (`type`, `price`) VALUES ('Choclate', 80);
INSERT INTO `addon` (`type`, `price`) VALUES ('Cream   ', 70);
INSERT INTO `addon` (`type`, `price`) VALUES ('Hazelnut', 150);

INSERT INTO `discount_voucher` (`voucher`, `discount_rate`) VALUES ('1234', 5);
INSERT INTO `discount_voucher` (`voucher`, `discount_rate`) VALUES ('4567', 10);
INSERT INTO `discount_voucher` (`voucher`, `discount_rate`) VALUES ('7890', 2);
INSERT INTO `discount_voucher` (`voucher`, `discount_rate`) VALUES ('1263', 3);