--TASK1
--Write the LEFT JOIN query where we can see the city and country names in
-- the city table and the country table together.
SELECT city.city,country.country FROM city
LEFT JOIN  country on city.country_id = country.country_id;