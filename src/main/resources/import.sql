DROP DATABASE IF EXISTS springbootdb;
CREATE DATABASE springbootdb CHARACTER SET utf8 COLLATE utf8_general_ci;

USE springbootdb;

DROP TABLE IF EXISTS ticket;
CREATE TABLE ticket
(
  ticket_Id      INT AUTO_INCREMENT
    PRIMARY KEY,
  passenger_name VARCHAR(100) NOT NULL,
  booking_date   TIMESTAMP    NOT NULL,
  source_station VARCHAR(100) NOT NULL,
  dest_station   VARCHAR(100) NOT NULL,
  email VARCHAR (100) NOT NULL,
  CONSTRAINT ticket_id_UNIQUE
    UNIQUE (ticket_id)
)
  ENGINE = innoDB
  DEFAULT CHARACTER SET = utf8
;
INSERT INTO ticket(passenger_name,booking_date,source_station,dest_station,email) VALUES('Sean','2017/07/14','Patna','Delhi','sean.s2017@yahoo.com');
