--task1
--From the film table, list the 4 movies with the longest and the lowest replacenet_cost, starting with the 'K' character.

SELECT title, length, replacement_cost FROM film
WHERE title LIKE 'K%'
ORDER BY length DESC, replacement_cost ASC
LIMIT 4;

--TASK2
--Which rating category has the largest number of movies in the film table?

