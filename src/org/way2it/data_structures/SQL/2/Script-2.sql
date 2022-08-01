
/*-змінити прізвище автора в 2х книжках*/
update  books_author set 
author = (case when books  = 9 then 8
               when books  = 14 then 1
          end)
where books in (9,14)        


