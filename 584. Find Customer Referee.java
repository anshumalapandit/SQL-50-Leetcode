# Write your MySQL query statement below
select name from Customer where referee_id is null or referee_id<>2;


# important key points of null
  1. NULL Means "No Value," Not Zero or Empty String
  2. Comparison Operators (=, !=, <, >) Do Not Work with NULL
  3. Aggregation Functions Ignore NULL Values
  4.Use COALESCE() or IFNULL() to Replace NULL
  5.When using ORDER BY, NULL values appear first or last
  6.If you concatenate a NULL value with a string, the result will be NULL.
  Solution: Use COALESCE()
