insert into member (id, firstname, lastname, email) values 
	('1', 'thierry', 'villepreux', 'thierry@villepreux'),
	('2', 'ioana', 'ardelean', 'ioana@ardelean'),
	('3', 'patricia', 'leclerc', 'patricia@leclerc'),
	('4','anne so', 'leric', 'anneso@leric'),
	('5','nathalie', 'robert', 'nathalie@robert'),
	('6', 'lea', 'limelette', 'lea@limelette'),
	('7', 'tantely', 'andriamalala', 'tantely@andriamalala'),
	('8', 'david', 'deek', 'david@deek'),
	('9', 'remy', 'guilloux', 'remy@guilloux'),
	('10','louis', 'godlewski', 'louis@godlewski'),
	('11', 'richard', 'phonthibsvads', 'richard@phonthibsvads'),
	('12', 'pascal', 'dennu', 'pascal@dennu'),
	('13', 'philippe', 'amice', 'philippe@amice'),
	('14', 'jonathan', 'luminuku', 'jonathan@luminuku'),
	('15', 'steven', 'beaubrun', 'steven@beaubrun'),
	('16', 'alex', 'mokaddem', 'alex@mokaddem');
	
insert into team (name) values
	('Red Leader'), ('Red One'), ('Red Two');
	
insert into team_members(team_id, members_id) values
	(1,1), (1,2), (1,3),(1,4),(1,5),(2,6),(2,7),(2,8),
	(2,9),(2,10),(3,11),(3,12),(3,13),(3,14),(3,15),(3,16);
	