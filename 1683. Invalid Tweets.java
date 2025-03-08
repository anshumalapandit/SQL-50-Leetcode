# Write your MySQL query statement below
select tweet_id from Tweets where length(content)>15;

#ALSO WE CAN USE CHAR_LENGTH INSTEAD OF LENGTH 
LENGTH(content) → Bytes count karta hai (UTF-8 me special characters zyada bytes le sakte hain).
CHAR_LENGTH(content) → Characters count karta hai (Matlab actual letters count karega).
