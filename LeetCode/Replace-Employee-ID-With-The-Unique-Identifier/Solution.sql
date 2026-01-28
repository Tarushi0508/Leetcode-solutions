1# Write your MySQL query statement below
2SELECT unique_id,name from Employees e
3LEFT JOIN 
4EmployeeUNI u ON e.id=u.id