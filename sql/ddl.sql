create table sensori (
    id serial primary key,
    modello text,
    marca text,
    temperatura real
);

create table note (
    id serial primary key,
    titolo text,
    descrizione text
);

insert into sensori values (0, 'D6T', 'OMRON', 16.0);
insert into sensori values (1, 'D6T', 'OMRON', 20.0);
insert into sensori values (2, 'E52', 'OMRON', 20.0);