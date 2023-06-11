--TASK1
--In the film table, the movie length is shown in the length column.
--How many movies are longer than the average movie length?
SELECT COUNT(length) FROM film
WHERE length > ALL
(SELECT AVG(length) from film);