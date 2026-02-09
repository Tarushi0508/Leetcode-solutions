1SELECT 
2    a1.machine_id,
3    ROUND(AVG(a2.timestamp - a1.timestamp), 3) AS processing_time
4FROM Activity a1
5JOIN Activity a2
6  ON a1.machine_id = a2.machine_id
7 AND a1.process_id = a2.process_id
8 AND a1.activity_type = 'start'
9 AND a2.activity_type = 'end'
10GROUP BY a1.machine_id;
11