--insert

insert into phonebook values(address_no_seq.nextval,'김경호','123-4568');
insert into phonebook values(address_no_seq.nextval,'박경호','123-4568');
insert into phonebook values(address_no_seq.nextval,'최경호','123-4568');

commit;

--update(pk update)
update phonebook
set name = '김영희', phone = '343-7843'
where no = 2;

commit;

--delete (pk delete)
delete from phonebook
where no =3;

commit;

--select (pk select)
select no, name, phone
from phonebook
where no =1;

--select(all select)
select no, name, phone
from phonebook;



