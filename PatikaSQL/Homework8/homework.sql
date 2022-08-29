--1 -test veritabanınızda employee isimli sütun bilgileri 
--   id(INTEGER),name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.
CREATE TABLE employee(
    id INTEGER PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    birthday DATE,
    email varchar(100)
);

--2 -Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.
insert into employee (id, name, birthday, email) values (1, 'Lionello Crone', '2002-03-04', 'lcrone0@intel.com');
insert into employee (id, name, birthday, email) values (2, 'Lydon Jenman', '1998-03-16', 'ljenman1@berkeley.edu');
insert into employee (id, name, birthday, email) values (3, 'Colline Selvester', '2012-09-21', 'cselvester2@lycos.com');
insert into employee (id, name, birthday, email) values (4, 'Pail Satterlee', '2011-04-17', 'psatterlee3@wikimedia.org');
insert into employee (id, name, birthday, email) values (5, 'Tallou Gumme', '1991-01-13', 'tgumme4@jigsy.com');
insert into employee (id, name, birthday, email) values (6, 'Prisca Votier', null, 'pvotier5@scribd.com');
insert into employee (id, name, birthday, email) values (7, 'Suzie Stowe', '2014-03-27', 'sstowe6@go.com');
insert into employee (id, name, birthday, email) values (8, 'Lazare Chadwin', '1979-10-20', 'lchadwin7@sohu.com');
insert into employee (id, name, birthday, email) values (9, 'Marrilee Gherardelli', '2000-05-25', 'mgherardelli8@wired.com');
insert into employee (id, name, birthday, email) values (10, 'Marieann Tillman', '2010-05-14', 'mtillman9@wikipedia.org');
insert into employee (id, name, birthday, email) values (11, 'Dena Roeby', '1975-10-06', 'droebya@reddit.com');
insert into employee (id, name, birthday, email) values (12, 'Karyl Zealey', '2004-10-28', null);
insert into employee (id, name, birthday, email) values (13, 'Lay Brake', '1976-08-25', null);
insert into employee (id, name, birthday, email) values (14, 'Wallace Lonsdale', null, 'wlonsdaled@merriam-webster.com');
insert into employee (id, name, birthday, email) values (15, 'Gaelan Brotherwood', null, 'gbrotherwoode@cargocollective.com');
insert into employee (id, name, birthday, email) values (16, 'Erma Slayny', '1978-12-13', 'eslaynyf@reuters.com');
insert into employee (id, name, birthday, email) values (17, 'Honoria Poston', null, 'hpostong@washingtonpost.com');
insert into employee (id, name, birthday, email) values (18, 'Myrtia Laycock', '2007-12-09', 'mlaycockh@meetup.com');
insert into employee (id, name, birthday, email) values (19, 'Hilliary Hearsey', '1977-09-21', 'hhearseyi@csmonitor.com');
insert into employee (id, name, birthday, email) values (20, 'Cornelle Arons', '2005-02-01', 'caronsj@mtv.com');
insert into employee (id, name, birthday, email) values (21, 'Kathi Elmar', null, 'kelmark@shutterfly.com');
insert into employee (id, name, birthday, email) values (22, 'Darb Botright', '2007-06-26', 'dbotrightl@cnet.com');
insert into employee (id, name, birthday, email) values (23, 'Carmelia Smalcombe', '1998-12-22', 'csmalcombem@amazon.co.uk');
insert into employee (id, name, birthday, email) values (24, 'Bertina Laverick', '2022-05-06', 'blaverickn@mapy.cz');
insert into employee (id, name, birthday, email) values (25, 'Adelaide Bassindale', null, 'abassindaleo@booking.com');
insert into employee (id, name, birthday, email) values (26, 'Chery Lebel', '1999-06-14', 'clebelp@eventbrite.com');
insert into employee (id, name, birthday, email) values (27, 'Robb Caldecot', null, 'rcaldecotq@photobucket.com');
insert into employee (id, name, birthday, email) values (28, 'Jacintha Rosenbloom', null, null);
insert into employee (id, name, birthday, email) values (29, 'Danielle Measor', null, 'dmeasors@mysql.com');
insert into employee (id, name, birthday, email) values (30, 'Hans Manneville', '1998-08-25', 'hmannevillet@toplist.cz');
insert into employee (id, name, birthday, email) values (31, 'Pepe Canti', '2000-07-15', 'pcantiu@e-recht24.de');
insert into employee (id, name, birthday, email) values (32, 'Zane Yirrell', null, 'zyirrellv@g.co');
insert into employee (id, name, birthday, email) values (33, 'Isobel Klimecki', '1990-02-06', 'iklimeckiw@blog.com');
insert into employee (id, name, birthday, email) values (34, 'Alexander Sainter', '2017-06-02', 'asainterx@weebly.com');
insert into employee (id, name, birthday, email) values (35, 'Emmalee Mogenot', '2017-07-06', 'emogenoty@newyorker.com');
insert into employee (id, name, birthday, email) values (36, 'Bonni Perutto', '2017-06-22', 'bperuttoz@google.com.br');
insert into employee (id, name, birthday, email) values (37, 'Jud Shorton', '1983-06-14', 'jshorton10@goo.ne.jp');
insert into employee (id, name, birthday, email) values (38, 'Darcee Husband', null, 'dhusband11@soundcloud.com');
insert into employee (id, name, birthday, email) values (39, 'Phip Bank', '1985-05-10', 'pbank12@yellowbook.com');
insert into employee (id, name, birthday, email) values (40, 'Jess Mold', '1995-06-09', 'jmold13@jigsy.com');
insert into employee (id, name, birthday, email) values (41, 'Sigismundo Jirusek', '1984-11-12', 'sjirusek14@bloglovin.com');
insert into employee (id, name, birthday, email) values (42, 'Franklyn Lismore', '2016-03-04', 'flismore15@forbes.com');
insert into employee (id, name, birthday, email) values (43, 'Hagen Cannan', '2014-10-14', 'hcannan16@pbs.org');
insert into employee (id, name, birthday, email) values (44, 'Callie Ends', '2013-10-06', 'cends17@cnn.com');
insert into employee (id, name, birthday, email) values (45, 'Elora Baudain', null, 'ebaudain18@prweb.com');
insert into employee (id, name, birthday, email) values (46, 'Federica Champkins', '2014-02-02', 'fchampkins19@epa.gov');
insert into employee (id, name, birthday, email) values (47, 'Sheppard Dongate', '1975-12-18', 'sdongate1a@tumblr.com');
insert into employee (id, name, birthday, email) values (48, 'Luciana Standbridge', '1987-10-25', 'lstandbridge1b@cdc.gov');
insert into employee (id, name, birthday, email) values (49, 'Aili Helix', null, 'ahelix1c@uiuc.edu');
insert into employee (id, name, birthday, email) values (50, 'Rubia Saurin', null, 'rsaurin1d@gravatar.com');

--3 -Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.
UPDATE employee
SET email = 'xXxXx@XxXx.com'
WHERE name ILIKE 'L%';

UPDATE employee
SET name = 'aaabbbccc'
WHERE id > 10;

UPDATE employee
SET birthday = '1999-12-12'
WHERE email ILIKE 'x%';

UPDATE employee
SET name = 'abc def'
WHERE birthday = '1998-03-16';

--4 -Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.
DELETE FROM employee
WHERE id > 10;

DELETE FROM employee
WHERE name ~~* 'a%';

DELETE FROM employee
WHERE email ~~ 'x%';

DELETE FROM employee
WHERE birthday = '1999-12-12';