1# Write your MySQL query statement below
2UPDATE Salary
3    SET sex= CASE
4    WHEN sex='f'THEN 'm'
5    WHEN sex='m'THEN 'f'
6END;