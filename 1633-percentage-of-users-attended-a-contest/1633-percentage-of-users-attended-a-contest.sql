# Write your MySQL query statement below

select r.contest_id,  
round(count(r.user_id) * 100 / (SELECT COUNT(DISTINCT u.user_id) FROM Users u), 2) as percentage
from Register r 
join Users u
on r.user_id = u.user_id
group by contest_id
order by percentage desc, r.contest_id asc

