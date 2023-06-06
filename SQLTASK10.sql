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