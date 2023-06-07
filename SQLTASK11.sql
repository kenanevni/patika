--task1
--Let's sort all the data for the first_name columns in the actor and customer tables.
SELECT first_name FROM actor
UNION ALL
SELECT first_name FROM customer;

--task2
--Let's sort the intersecting data for the first_name columns in the actor and customer tables.
SELECT first_name FROM actor
INTERSECT
SELECT first_name FROM customer;

--TASK3
--For the first_name columns in the actor and customer tables,
--let's sort the data in the first table but not in the second table.

SELECT first_name FROM actor
EXCEPT
SELECT first_name FROM customer;