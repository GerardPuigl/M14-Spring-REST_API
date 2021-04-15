INSERT IGNORE INTO shops (shop_id,shop_name,shop_capacity) VALUES 
(1,'Joyeria VanGogh', 6),
(2,'Joyeria DaVinci', 10);


INSERT IGNORE INTO pictures (picture_id,picture_author,picture_name,picture_price,shop_id) VALUES
(1,'Caravaggio','Los discípulos de Emaús',400000,1),
(2,'El Greco','El entierro del conde de Orgaz',150000,1),
(3,'Vermeer','La chica del pendiente de perla',205000,1),
(4,'Anonymous','Songs emotions',350000,1),
(5,'Modiglian','Portrait of Jean Cocteau',290000,1),
(6,'Anonymous','Amor de verano',250000,1),
(7,'Goya','3 de Mayo en Madrid',2900000,2),
(8,'Bansky','Love Is in the Bin',120000,2),
(9,'Vincent van Gogh','La noche estrellada',250000,2),
(10,'Anonymous','Apple',50000,2),
(11,'Maria Camps','Fluid time',80000,2);