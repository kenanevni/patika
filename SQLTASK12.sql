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