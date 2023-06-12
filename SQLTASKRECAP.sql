--task1
--From the film table, list the 4 movies with the longest and the lowest replacenet_cost, starting with the 'K' character.

SELECT title, length, replacement_cost FROM film
WHERE title LIKE 'K%'
ORDER BY length DESC, replacement_cost ASC
LIMIT 4;

--TASK2
--Which rating category has the largest number of movies in the film table?

SELECT COUNT(*),rating FROM film
GROUP BY rating
ORDER BY COUNT(*) DESC
LIMIT 1;

--task3
--What is the name of the customer who made the most purchases in the customer table?

SELECT payment.customer_id,customer.first_name, COUNT(customer.customer_id) FROM customer
JOIN payment ON customer.customer_id = payment.customer_id
GROUP BY payment.customer_id,customer.first_name
ORDER BY COUNT(customer.customer_id) DESC
LIMIT 1;

--TASK4
--Sort the category names and the number of movies per category from the category table.
