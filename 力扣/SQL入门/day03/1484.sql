CREATE TABLE `activities` (
  `sell_date` date DEFAULT NULL,
  `product` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO activities (sell_date, product) VALUES('2020-05-30', 'Headphone');
INSERT INTO activities (sell_date, product) VALUES('2020-06-01', 'Pencil');
INSERT INTO activities (sell_date, product) VALUES('2020-06-02', 'Mask');
INSERT INTO activities (sell_date, product) VALUES('2020-05-30', 'Basketball');
INSERT INTO activities (sell_date, product) VALUES('2020-06-01', 'Bible');
INSERT INTO activities (sell_date, product) VALUES('2020-06-02', 'Mask');
INSERT INTO activities (sell_date, product) VALUES('2020-05-30', 'T-Shirt');