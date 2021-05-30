select * from movie where exists (select moviename from liked where username='username' and liked.moviename=movie.name);
select * from movie where exists (select moviename from watchlist where username='username' and watchlist.moviename=movie.name and 'bilim' = any("genre"));
select * from kullanici where username='username' and password='password';

insert into liked(username,moviename)
values('bilalkah','ben');

select count(*) from liked where username='bilalkah';

update kullanici set name='Bilal' where username='bilalkah';
select*from kullanici;