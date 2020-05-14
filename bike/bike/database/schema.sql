CREATE TABLE bike
( id INT(11) NOT NULL AUTO_INCREMENT,
  name VARCHAR(25) NOT NULL,
  email VARCHAR(20) not null,
  phone VARCHAR(25) NOT NULL,
  model VARCHAR(20),
  serial_number VARCHAR(25),
  purpache_price DECIMAL,
  purpache_date DATE,
  contact BOOLEAN,
  CONSTRAINT id_pk PRIMARY KEY (id)
);