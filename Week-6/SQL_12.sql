--1 Film tablosunda film uzunluğu length sütununda gösterilmektedir. Uzunluğu ortalama film uzunluğundan fazla kaç tane film vardır?

SELECT COUNT(*) FROM film
WHERE length > (SELECT AVG(length) FROM film );

--2 Film tablosunda en yüksek rental_rate değerine sahip kaç tane film vardır?

SELECT COUNT(*) FROM film 
WHERE rental_rate=(SELECT MAX(rental_rate) FROM film );

--3 Film tablosunda en düşük rental_rate ve en düşün replacement_cost değerlerine sahip filmleri sıralayınız.

SELECT * FROM film 
WHERE rental_rate=ALL(SELECT MIN(rental_rate) FROM film)AND replacement_cost=ALL(SELECT MIN(replacement_cost) FROM film);

--4 Payment tablosunda en fazla sayıda alışveriş yapan müşterileri(customer) sıralayınız.

SELECT payment.customer_id, customer.first_name, customer.last_name FROM payment 
INNER JOIN customer ON payment.customer_id=customer.customer_id
GROUP BY payment.customer_id, customer.first_name, customer.last_name
ORDER BY COUNT(*) DESC;