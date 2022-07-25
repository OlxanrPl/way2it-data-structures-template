/*- витягнути книги та посортувати за email автора*/
select b.* 
from library.book b order by trim(b.email)  