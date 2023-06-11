--TASK1
--In the film table, the movie length is shown in the length column.
--How many movies are longer than the average movie length?

SELECT COUNT(length) FROM film
WHERE length > ALL
(SELECT AVG(length) from film);

--TASK2
--How many movies have the highest rental_rate in the film table?
SELECT MAX(rental_rate), COUNT(rental_rate) from film
where
rental_rate = (SELECT MAX(rental_rate) from film);

--task3
--In the film table, list the films with the lowest rental rate and the lowest replacement cost.

SELECT title, rental_rate, replacement_cost from film
WHERE rental_rate = (SELECT MIN(rental_rate) from film ) and
replacement_cost =(SELECT MIN(replacement_cost) from film );

--task4
--In the payment table, list the customers who make the most purchases.

SELECT COUNT(payment.customer_id), customer.first_name, customer.last_name FROM payment, customer
where customer.customer_id=payment.customer_id
GROUP BY  customer.first_name, customer.last_name
ORDER BY COUNT(payment.customer_id) DESC
LIMIT 10;