/*- витягнути книги та посортувати за назвою*/
select b.* 
from library.book b order by trim(b.name)  