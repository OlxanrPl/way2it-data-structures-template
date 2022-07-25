/*- витягнути унікальні імена авторів*/
select distinct b.authorFirstName  
from library.book b order by b.authorFirstName 