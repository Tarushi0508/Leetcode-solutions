1# Write your MySQL query statement below
2SELECT IFNULL(
3    (SELECT num
4     FROM MyNumbers
5     GROUP BY num
6     HAVING COUNT(num) = 1
7     ORDER BY num DESC
8     LIMIT 1),
9NULL
10) AS num;
11