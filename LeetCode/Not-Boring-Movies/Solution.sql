1# Write your MySQL query statement below
2SELECT id,movie,description,rating From Cinema WHERE id%2=1 AND description!='boring' Order By rating DESC;