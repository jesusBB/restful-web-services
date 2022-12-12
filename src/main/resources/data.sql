/*
 * Copyright (c) Jaguar Land Rover Ltd 2022. All rights reserved
 */

insert into USER_DETAILS(id, birth_date, name)
VALUES(10001, current_date(), 'Jesuli');
insert into USER_DETAILS(id, birth_date, name)
VALUES(10002, current_date(), 'Virginia');
insert into USER_DETAILS(id, birth_date, name)
VALUES(10003, current_date(), 'Miguel');
insert into USER_DETAILS(id, birth_date, name)
VALUES(10004, current_date(), 'Pepe');

insert into POST(id, description, user_id)
VALUES(1, 'Message 1', 10001);
insert into POST(id, description, user_id)
VALUES(2, 'Message 2', 10001);
insert into POST(id, description, user_id)
VALUES(3, 'Message 1 user 2', 10002);
insert into POST(id, description, user_id)
VALUES(4, 'Message 1 user 3', 10003);
