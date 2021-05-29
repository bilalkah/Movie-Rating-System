select * from movie where exists (select moviename from liked where username='bilalkah' and liked.moviename=movie.name);
select * from movie where exists (select moviename from watchlist where username='bilalkah' and watchlist.moviename=movie.name and 'bilim' = any("genre"));

insert into liked(username,moviename)
values('bilalkah','ben');

select count(*) from liked where username='bilalkah';

--update kullanici set name='Bilal' where username='bilalkah';
select*from kullanici;