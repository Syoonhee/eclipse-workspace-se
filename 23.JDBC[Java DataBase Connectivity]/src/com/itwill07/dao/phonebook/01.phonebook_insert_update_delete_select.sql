--insert

insert into phonebook values(address_no_seq.nextval,'���ȣ','123-4568');
insert into phonebook values(address_no_seq.nextval,'�ڰ�ȣ','123-4568');
insert into phonebook values(address_no_seq.nextval,'�ְ�ȣ','123-4568');

commit;

--update(pk update)
update phonebook
set name = '�迵��', phone = '343-7843'
where no = 2;

commit;

--delete (pk delete)
delete from phonebook
where no =10;

commit;

--select (pk select)
select no, name, phone
from phonebook
where no =1;

--select(all select)
select no, name, phone
from phonebook;


