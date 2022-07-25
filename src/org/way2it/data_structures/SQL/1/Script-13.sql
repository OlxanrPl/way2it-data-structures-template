/*- витягнути книги та посортувати за кількістю сторінок(проти алфавіту)*/
select b.* 
from library.book b order by b.pages desc