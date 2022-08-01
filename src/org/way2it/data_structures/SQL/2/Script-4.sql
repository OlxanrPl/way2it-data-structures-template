
/*- вивести інформацію про книжку з найменшою кількістю сторінок*/
select b.id,b.name ,b.description ,b.price, b.pages ,b.isbn ,
g.name as kategory, 
a.FirstName ,a.SecondName ,a.email , a.adres , a.birthDay ,a.awards  
from books b inner join books_author ba 
on ba.books =b.id 
inner join author a 
on ba.author =a.id 
inner join genre g 
on b.genre = g.id
order by b.pages asc 
limit 1



