CREATE DATABASE mydataBase;
USE mydataBase;
CREATE TABLE DonutShop(name TEXT,price INTEGER);
INSERT INTO DonutShop(name,price) VALUES('Donut',123);
INSERT INTO DonutShop(name,price) VALUES('Sweet',120);
INSERT INTO DonutShop(name,price) VALUES('ChocolateDonut',130);
Select *from DonutShop;

create table car(id INTEGER PRIMARY KEY,brand Text,year INTEGER,price INTEGER,country TEXT);
INSERT INTO car(id,brand,year,price,country) VALUE(1,'Toyota',2019,21000,'Japan');
INSERT INTO car(id,brand,year,price,country) VALUE(2,'Opel',2009,5000,'Germany');
