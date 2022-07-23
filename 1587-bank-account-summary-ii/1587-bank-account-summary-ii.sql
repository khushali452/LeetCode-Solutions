# Write your MySQL query statement below
SELECT u.name as name,sum(t.amount) as balance 
from Users u
join Transactions t on u.account=t.account
GROUP BY t.account
HAVING balance>10000;