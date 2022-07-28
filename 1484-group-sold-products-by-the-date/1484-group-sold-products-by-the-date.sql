# Write your MySQL query statement below
select sell_date,COUNT(DISTINCT product) as num_sold,
GROUP_CONCAT( DISTINCT product order by product ASC separator ',' ) as products
from Activities
GROUP BY 1