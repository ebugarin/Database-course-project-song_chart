create database song_chart;
use song_chart;
CREATE TABLE song (
   songID        INTEGER AUTO_INCREMENT,
   genre      VARCHAR(30),
   streams       BIGINT,
   song_name      VARCHAR(30),
   bpm        SMALLINT,
   album_name      VARCHAR(30),
   artist_name      VARCHAR(30),
   PRIMARY KEY (songID)
);
alter table song add(artistID INTEGER);
alter table song add FOREIGN KEY (artistID) REFERENCES artist(artistID);

CREATE TABLE artist (
   artistID        INTEGER AUTO_INCREMENT,
   nationality      VARCHAR(30),
   total_albums        SMALLINT,
   awards      SMALLINT,
   artist_name      VARCHAR(30),
   PRIMARY KEY (artistID)
);
CREATE TABLE album (
   albumID        INTEGER AUTO_INCREMENT,
   total_streams       BIGINT,
   album_name      VARCHAR(30),
   rating        SMALLINT,
   length TIME,
   artist_name      VARCHAR(30),
   artistID        INTEGER,
   PRIMARY KEY (albumID),
   FOREIGN KEY (artistID) REFERENCES artist(artistID)
);
CREATE TABLE top_chart (
   week_of        DATE,
   genre      VARCHAR(30),
   streams       BIGINT,
   song_name      VARCHAR(30),
   bpm        SMALLINT,
   album_name      VARCHAR(30),
   songID INTEGER,
   artist_name      VARCHAR(30),
   PRIMARY KEY (week_of),
   FOREIGN KEY (songID) REFERENCES song(songID)
);
CREATE TABLE tb_user 
(
  
  username VARCHAR(50) primary key,
  password VARCHAR(50) NOT NULL,
  email VARCHAR(50) NOT NULL
);
show tables;
INSERT INTO tb_user VALUES
('eric', 'pass','e@uic.edu'),
('john', 'pass1','j@uic.edu'),
('dom', 'pass2','d@uic.edu');

INSERT INTO top_chart VALUES #genre      VARCHAR(30), streams       BIGINT, song_name      VARCHAR(30),
   #bpm        SMALLINT, album_name      VARCHAR(30), artist_name      VARCHAR(30)
 ('2021-07-16', 'pop', 1600000000, 'blinding lights', 86, 'after hours', 4 ,'the weeknd'),
 ('2021-07-17', 'pop', 1600000000, 'save your tears', 118, 'after hours', 5 ,'the weeknd'),
 ('2019-07-17', 'rap', 1500000000, 'sicko mode', 78, 'astro world', 6 ,'travis scott');
 
 
INSERT INTO song VALUES #genre      VARCHAR(30), streams       BIGINT, song_name      VARCHAR(30),
   #bpm        SMALLINT, album_name      VARCHAR(30), artist_name      VARCHAR(30)
 (1, 'psychodelic', 829000000, 'the less i know the better', 117, 'currents', 'tame impala',1),
 (2, 'psychodelic', 144000000, 'new person, same old mistakes', 152, 'currents', 'tame impala',1),
 (3, 'psychodelic', 265000000, 'let it happen', 123, 'currents', 'tame impala',1);
  INSERT INTO song VALUES (4, 'pop', 1600000000 , 'blinding lights', 86, 'after hours', 'theweeknd',2);
  INSERT INTO song VALUES (5, 'pop', 600000000 , 'save your tears', 118, 'after hours', 'theweeknd',2);
  INSERT INTO song VALUES (6, 'rap', 1500000000 , 'sicko mode', 78, 'astro world', 'travis scott',3);


 INSERT INTO artist VALUES #genre      VARCHAR(30), streams       BIGINT, song_name      VARCHAR(30),
   #bpm        SMALLINT, album_name      VARCHAR(30), artist_name      VARCHAR(30)
 (1, 'australian', 4, 16, 'tame impala'),
 (2, 'canadian', 5, 59, 'the weeknd'),
 (3, 'american', 3, 0, 'travis scott');
 
 INSERT INTO album VALUES 
 (1, 1600000000, 'currents', 84, '00:51:12', 'tame impala',1),
 (2, 5600000000, 'after hours', 80, '00:56:19', 'the weeknd',2),
 (3, 6100000000, 'astroworld', 85, '00:58:33', 'travis scott',3);




