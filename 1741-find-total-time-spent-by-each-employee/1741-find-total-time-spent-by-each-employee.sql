/* Write your T-SQL query statement below */
select event_day as day, emp_id, sum(out_time)-sum(in_time) As total_time
from employees
group by emp_id,event_day