/*- витягнути книги які було написано до '2010-01-01'*/
select b.*
from library.book b
where b.dateOfPublish <'2000-01-01'