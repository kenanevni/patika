--task1
--Let's sort all the data for the first_name columns in the actor and customer tables.
SELECT first_name FROM actor
UNION ALL
SELECT first_name FROM customer;

--task2
--Let's sort the intersecting data for the first_name columns in the actor and customer tables.
