CREATE TABLE bike
( id INT(11) NOT NULL AUTO_INCREMENT,
  name VARCHAR(25) NOT NULL,
  email VARCHAR(20) not null,
  phone VARCHAR(25) NOT NULL,
  model VARCHAR(20),
  serialNumber VARCHAR(25),
  purpachePrice DECIMAL,
  purpacheDate DATE,
  contact BOOLEAN,
  CONSTRAINT id_pk PRIMARY KEY (id)
);