/*- вивести книжки де ціна на проміжку: 1. 50-120, 2. не включаючи проміжок 200-600.*/
select b.name ,b.description ,b.price, b.pages ,b.isbn ,
g.name as kategory, 
a.FirstName ,a.SecondName ,a.email , a.adres , a.birthDay ,a.awards  
from books b inner join books_author ba 
on ba.books =b.id 
inner join author a 
on ba.author =a.id 
inner join genre g 
on b.genre = g.id 
where b.price between  50 and 120
