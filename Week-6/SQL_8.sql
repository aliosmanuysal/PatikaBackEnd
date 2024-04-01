--1-Test veritabanınızda çalışanın kayıtlı sütun bilgilerini id(INTEGER), isim VARCHAR(50), doğum günü DATE, e-posta VARCHAR(100) olan bir tablo oluşturalım.

  CREATE TABLE employee (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    birthday DATE DEFAULT CURRENT_DATE,
    email VARCHAR(100);

--2-Oluşturduğumuz çalışan tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.

insert into author (first_name, last_name, email, birthday) values ('Brod', 'MacVicar', 'bmacvicar0@mit.edu', '1975-08-08');
insert into author (first_name, last_name, email, birthday) values ('Jarid', 'Curwood', 'jcurwood1@storify.com', '1960-10-08');
insert into author (first_name, last_name, email, birthday) values ('Claiborn', 'Croizier', 'ccroizier2@digg.com', '1983-10-25');
insert into author (first_name, last_name, email, birthday) values ('Ebba', 'Beak', 'ebeak3@linkedin.com', '1973-12-22');
insert into author (first_name, last_name, email, birthday) values ('Meggy', 'Barstock', 'mbarstock4@com.com', '1936-04-20');
insert into author (first_name, last_name, email, birthday) values ('Had', 'Thyer', 'hthyer5@fema.gov', '1908-07-09');
insert into author (first_name, last_name, email, birthday) values ('Dory', 'Fawthrop', 'dfawthrop6@buzzfeed.com', '1987-02-15');
insert into author (first_name, last_name, email, birthday) values ('Gena', 'Garratty', 'ggarratty7@ted.com', '1968-05-19');
insert into author (first_name, last_name, email, birthday) values ('Even', 'Bellis', 'ebellis8@geocities.com', '1944-01-01');
insert into author (first_name, last_name, email, birthday) values ('Kamillah', 'Lewinton', 'klewinton9@list-manage.com', '1940-05-29');
insert into author (first_name, last_name, email, birthday) values ('Linell', 'Kasbye', 'lkasbyea@merriam-webster.com', null);
insert into author (first_name, last_name, email, birthday) values ('Shanon', 'Weatherill', 'sweatherillb@umich.edu', '1937-12-08');
insert into author (first_name, last_name, email, birthday) values ('Jermaine', 'Farley', 'jfarleyc@topsy.com', '1920-08-31');
insert into author (first_name, last_name, email, birthday) values ('Caddric', 'Bielfelt', 'cbielfeltd@sphinn.com', '1935-02-12');
insert into author (first_name, last_name, email, birthday) values ('Jedd', 'Whatman', 'jwhatmane@fda.gov', null);
insert into author (first_name, last_name, email, birthday) values ('Frans', 'Emanulsson', 'femanulssonf@paypal.com', '1937-09-28');
insert into author (first_name, last_name, email, birthday) values ('Clara', 'Rammell', null, '1961-03-02');
insert into author (first_name, last_name, email, birthday) values ('Cristy', 'Poznanski', 'cpoznanskih@shutterfly.com', null);
insert into author (first_name, last_name, email, birthday) values ('Shayla', 'Velez', 'svelezi@last.fm', '1949-11-03');
insert into author (first_name, last_name, email, birthday) values ('Wynne', 'Roscam', 'wroscamj@theguardian.com', '1969-06-08');
insert into author (first_name, last_name, email, birthday) values ('Samantha', 'Dislee', 'sdisleek@e-recht24.de', '1931-11-06');
insert into author (first_name, last_name, email, birthday) values ('Milissent', 'Bautiste', 'mbautistel@1688.com', null);
insert into author (first_name, last_name, email, birthday) values ('Margi', 'Trendle', 'mtrendlem@wsj.com', '1924-01-21');
insert into author (first_name, last_name, email, birthday) values ('Mari', 'Barense', null, '1979-05-13');
insert into author (first_name, last_name, email, birthday) values ('Salaidh', 'Muttitt', 'smuttitto@salon.com', '1958-06-02');
insert into author (first_name, last_name, email, birthday) values ('Tildie', 'Lening', 'tleningp@sitemeter.com', '1961-07-14');
insert into author (first_name, last_name, email, birthday) values ('Bradford', 'Gricewood', 'bgricewoodq@ask.com', '1959-02-19');
insert into author (first_name, last_name, email, birthday) values ('Isador', 'Itzik', 'iitzikr@storify.com', '1953-04-30');
insert into author (first_name, last_name, email, birthday) values ('Bryn', 'Sharnock', 'bsharnocks@un.org', null);
insert into author (first_name, last_name, email, birthday) values ('Merrick', 'Lodewick', 'mlodewickt@cdbaby.com', null);
insert into author (first_name, last_name, email, birthday) values ('Knox', 'Finnimore', 'kfinnimoreu@cafepress.com', '1953-05-16');
insert into author (first_name, last_name, email, birthday) values ('Clarey', 'Gerhts', 'cgerhtsv@wordpress.org', null);
insert into author (first_name, last_name, email, birthday) values ('Harv', 'Rampling', 'hramplingw@oracle.com', '1975-08-26');
insert into author (first_name, last_name, email, birthday) values ('Gage', 'Spoole', 'gspoolex@yolasite.com', '1957-08-30');
insert into author (first_name, last_name, email, birthday) values ('Alleyn', 'Dunrige', 'adunrigey@amazon.de', '1926-02-07');
insert into author (first_name, last_name, email, birthday) values ('Decca', 'Broad', 'dbroadz@hostgator.com', '1986-03-25');
insert into author (first_name, last_name, email, birthday) values ('Garnette', 'McMurty', 'gmcmurty10@cyberchimps.com', '1943-04-20');
insert into author (first_name, last_name, email, birthday) values ('Trish', 'Poltun', null, '1961-06-19');
insert into author (first_name, last_name, email, birthday) values ('Hamilton', 'Chang', 'hchang12@woothemes.com', null);
insert into author (first_name, last_name, email, birthday) values ('Karia', 'Grzelewski', 'kgrzelewski13@cdc.gov', '1996-12-14');
insert into author (first_name, last_name, email, birthday) values ('Jennee', 'Wetherill', 'jwetherill14@biglobe.ne.jp', '1942-01-14');
insert into author (first_name, last_name, email, birthday) values ('Clem', 'Ninnoli', 'cninnoli15@ameblo.jp', '1992-12-13');
insert into author (first_name, last_name, email, birthday) values ('Elwyn', 'Copnall', 'ecopnall16@xinhuanet.com', '1965-02-02');
insert into author (first_name, last_name, email, birthday) values ('Caprice', 'Duker', 'cduker17@posterous.com', '1994-12-13');
insert into author (first_name, last_name, email, birthday) values ('Halley', 'Lindenboim', 'hlindenboim18@cafepress.com', '1956-03-24');
insert into author (first_name, last_name, email, birthday) values ('Kaitlyn', 'Yurygyn', 'kyurygyn19@gravatar.com', null);
insert into author (first_name, last_name, email, birthday) values ('Clay', 'Dowtry', 'cdowtry1a@nytimes.com', '1910-09-07');
insert into author (first_name, last_name, email, birthday) values ('Sheryl', 'Yesenev', 'syesenev1b@slashdot.org', '1962-06-12');
insert into author (first_name, last_name, email, birthday) values ('Halsey', 'Gueinn', 'hgueinn1c@oakley.com', '1908-01-26');
insert into author (first_name, last_name, email, birthday) values ('Florina', 'Jurzyk', 'fjurzyk1d@java.com', '1996-12-08');
	  
--3-Sütunların ona göre diğer sütunlarını güncelleyecek 5 adet GÜNCELLEME işlemi yapılabilir.

UPDATE employee SET name = 'Ali' WHERE id = 18;
UPDATE employee SET name = '10.05.1993' WHERE id = 3;
UPDATE employee SET birthday = '04.01.1995' WHERE id = 7;
UPDATE employee SET birthday = 'Ayşe' WHERE id = 8;
UPDATE employee SET email = 'wasd@wasd' WHERE id = 22;

--4-Sütunların her birine göre ilgili veri tabanında 5 adet SİLME işlemi yapılabilir.

DELETE FROM employee
WHERE id = 1;

DELETE FROM employee
WHERE name LIKE '%a';

DELETE FROM employee
WHERE email IS NULL;

DELETE FROM employee
WHERE id > 30;

DELETE FROM employee
WHERE name ILIKE '%__a%' AND email IS NOT NULL;
	  