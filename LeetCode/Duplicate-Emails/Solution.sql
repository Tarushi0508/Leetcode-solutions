1# Write your MySQL query statement below
2SELECT DISTINCT email as Email from Person Group By email HAVING count(email)>1;