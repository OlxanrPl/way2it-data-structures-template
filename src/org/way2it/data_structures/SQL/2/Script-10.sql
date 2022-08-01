/*- написати 3 запити, використавши різні види пошуку за співпадіннями(like)*/
select b.name ,b.description ,b.price, b.pages ,b.isbn ,
g.name as kategory, 
a.FirstName ,a.SecondName ,a.email , a.adres , a.birthDay ,a.awards  
from books b inner join books_author ba 
on ba.books =b.id 
inner join author a 
on ba.author =a.id 
inner join genre g 
on b.genre = g.id 
where b.description like '%бір%'
union 
select b.name ,b.description ,b.price, b.pages ,b.isbn ,
g.name as kategory, 
a.FirstName ,a.SecondName ,a.email , a.adres , a.birthDay ,a.awards  
from books b inner join books_author ba 
on ba.books =b.id 
inner join author a 
on ba.author =a.id 
inner join genre g 
on b.genre = g.id 
where b.description like '%олтав%'
union 
select b.name ,b.description ,b.price, b.pages ,b.isbn ,
g.name as kategory, 
a.FirstName ,a.SecondName ,a.email , a.adres , a.birthDay ,a.awards  
from books b inner join books_author ba 
on ba.books =b.id 
inner join author a 
on ba.author =a.id 
inner join genre g 
on b.genre = g.id 
where b.description like '_К%'