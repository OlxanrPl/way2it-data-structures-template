/*- витягнути книги які було написано після '2000-01-01'*/
select b.*
from library.book b
where b.dateOfPublish >'2000-01-01'