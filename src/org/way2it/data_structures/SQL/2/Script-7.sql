select  count(b.isbn), g.name  
from books b 
inner join genre g 
on b.genre = g.id
group by g.name 