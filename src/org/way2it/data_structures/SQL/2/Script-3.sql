
/*-підрахувати кількість книжок, в яких автори мають нагороди*/
select count(distinct(b.name)) 
from books b inner join books_author ba 
on ba.books =b.id 
inner join author a 
on ba.author =a.id 
inner join genre g 
on b.genre = g.id  
where a.awards!=""




