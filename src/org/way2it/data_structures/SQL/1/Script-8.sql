/*- витягнути всіх книги які належать до певної категорії*/
select b.*  from library.book b where trim(b.kategories)  = "Краєзнавство"