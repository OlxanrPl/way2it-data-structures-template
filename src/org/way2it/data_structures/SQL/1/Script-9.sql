/*- витягнути книги в яких кількість сторінок більше 200 та вік автора більше 25*/
select b.*  from library.book b where b.pages >200 and b.age >25