--TASK1
--Write the LEFT JOIN query where we can see the city and country names in
-- the city table and the country table together.
SELECT city.city,country.country FROM city
LEFT JOIN  country on city.country_id = country.country_id;

--TASK2
-- Write the RIGHT JOIN query where we can see the customer table and the payment_id in
-- the payment table and the first_name and last_name names in the customer table together.

SELECT payment.payment_id, customer.first_name, customer.last_name FROM customer
RIGHT JOIN payment on payment.customer_id = customer.customer_id;

--TASK3
--Write the FULL JOIN query where we can see the customer table and the rental_id
--in the rental table and the first_name and last_name names in the customer table together.

SELECT rental.rental_id, customer.first_name AS ADI, customer.last_name
 AS SOYADI from rental FULL JOIN customer on customer.customer_id = rental.customer_id


