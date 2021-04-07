INSERT IGNORE INTO shops (shop_id,shop_name,shop_capacity) VALUES 
(1,'Collars Itaca', 50),
(2,'Collars Roma', 20);


INSERT IGNORE INTO pictures (picture_id,picture_author,picture_name,picture_price,shop_id) VALUES
(1,'Joan Gordi','Sun Flowers',50000.0,1),
(2,'Gerard Puig','Storm',29000.0,1),
(3,'Pere Masnou','River Bridge',25000.0,1),
(4,'Anonymous','Songs emotions',35000.0,1),
(5,'Anaïs Iglesias','Imigrants working',29000.0,1),
(6,'Anonymous','Amor de verano',25000.0,2),
(7,'Ramón Dalmau','Château enchanté',29000.0,2),
(8,'Joana Gracia','Sueño de Verano',21000.0,2),
(9,'Quique Mota','Olas en el mar',25000.0,2),
(10,'Anonymous','Apple face',50000.0,2),
(11,'Maria Camps','Fluid time',25000.0,2);