-- 3. Popular languages:
-- List languages with more than 50 films.

#que3
select name
from language join film
on language.language_id=film.language_id
group by name 
having count(title)>50
