CREATE TABLE User(
  id INT(8) NOT NULL AUTO_INCREMENT,
  userName VARCHAR(25) NOT NULL,
  age INT(3) NOT NULL,
  isAdmin BOOLEAN NOT NULL,
  createdDate TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id))
  ENGINE=InnoDB DEFAULT CHARSET=utf8;
