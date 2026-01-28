1SELECT user_id,CONCAT(UPPER(LEFT(name,1)),LOWER(SUBSTRING(name,2)))As name from Users order by user_id;
2