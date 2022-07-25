# Write your MySQL query statement below
SELECT customer_id,COUNT(Visits.visit_id) as count_no_trans 
from Visits
left join transactions 
on Visits.visit_id=Transactions.visit_id
WHERE 
	Transactions.visit_id IS NULL
GROUP BY customer_id
