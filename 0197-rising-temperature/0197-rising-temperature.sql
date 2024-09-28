# Write your MySQL query statement below

# SELECT w1.id
# FROM Weather w1
# JOIN Weather w2
# ON w1.recordDate = w2.recordDate + INTERVAL 1 DAY
# WHERE w1.temperature > w2.temperature;

select w1.id
from Weather w1
join Weather w2
on w1.recordDate = w2.recordDate + INTERVAL 1 DAY
where w1.temperature > w2.temperature
