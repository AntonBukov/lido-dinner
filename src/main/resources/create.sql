CREATE TABLE `userorder` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `items` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
);
INSERT INTO userorder (id, items) VALUES (1, 'каша, суп, салат');