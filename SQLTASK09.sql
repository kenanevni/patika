--part one
SELECT city.city, country.country from city 
JOIN country ON city.country_id = country.country_id
--part two
--Write the INNER JOIN query where we can see the customer
--table and the payment_id in the payment table and the first_name and
--last_name names in the customer table together.

--part two
SELECT payment.payment_id,customer.first_name,customer.last_name from customer
JOIN payment ON payment.customer_id = customer.customer_id;

