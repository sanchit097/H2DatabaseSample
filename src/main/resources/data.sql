DROP TABLE IF EXISTS  Electronic_Items;
CREATE TABLE Electronic_Items (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  description VARCHAR(250) NOT NULL,
  price VARCHAR(250) DEFAULT NULL
);

INSERT INTO Electronic_Items (name, description, price) VALUES
  ('IPHONE 11', 'Iphone 11 pro', '12200'),
  ('SAMSUNG S10 ', 'SAMSUNG S10 new edition', '11100');