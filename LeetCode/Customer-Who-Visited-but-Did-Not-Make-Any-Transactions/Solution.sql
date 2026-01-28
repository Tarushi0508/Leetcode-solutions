1# Write your MySQL query statement below
2SELECT customer_id,COUNT(customer_id)AS count_no_trans from Visits v LEFT JOIN Transactions t
3ON v.visit_id =t.visit_id WHERE t.transaction_id is NULL
4GROUP BY v.customer_id