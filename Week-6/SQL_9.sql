--1 City tablosu ile country tablosunda bulunan şehir (city) ve ülke (country) isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.

SELECT city, country  FROM city 
INNER JOIN country ON city.country_id = country.country_id;

--2 Customer tablosu ile payment tablosunda bulunan payment_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.

SELECT payment_id, customer.first_name, customer.last_name  FROM payment 
INNER JOIN customer ON payment.customer_id = customer.customer_id;

--3 Customer tablosu ile rental tablosunda bulunan rental_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.

SELECT rental_id, first_name, last_name FROM rental 
INNER JOIN customer ON rental.customer_id =customer.customer_id;