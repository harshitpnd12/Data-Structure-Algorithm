/* Write your T-SQL query statement below */
select product_id, 'store1' As store, store1 as price
from Products
where store1 is not null

union all
select product_id, 'store2' As store, store2 as price 
from Products
where store2 is not null

union all
select product_id, 'store3' As store, store3 as price 
from Products
where store3 is not null
