
insert into role ( name, enable) values ( 'Admin', true);
insert into role (name, enable) values ('Chef', true);

insert into permission (id, name,description,table_name, enable) values (1, 'READ_USER','Este permiso permite al usuario ver o leer información de la tabla usuario','USER', true);
insert into permission (id, name,description,table_name, enable) values (2, 'WRITE_USER','Este permiso permite al usuario crear o modificar información en la tabla usuario','USER', true);
insert into permission (id, name,description,table_name, enable) values (3, 'DELETE_USER','Este permiso permite al usuario eliminar información de la tabla usuario','USER', true);
insert into permission (id, name,description,table_name, enable) values (4, 'READ_ROLE','Este permiso permite al usuario ver o leer información de la tabla rol','ROLE', true);
insert into permission (id, name,description,table_name, enable) values (5, 'WRITE_ROLE','Este permiso permite al usuario crear o modificar información en la tabla rol','ROLE', true);
insert into permission (id, name,description,table_name, enable) values (6, 'DELETE_ROLE','Este permiso permite al usuario eliminar información de la tabla rol','ROLE', true);
insert into permission (id, name,description,table_name, enable) values (7, 'READ_PERMISSION','Este permiso permite al usuario ver o leer información de la tabla permiso','PERMISSION', true);

insert into permission_role (role_id, permission_id) values (1, 1);
insert into permission_role (role_id, permission_id) values (1, 2);
insert into permission_role (role_id, permission_id) values (1, 3);
insert into permission_role (role_id, permission_id) values (1, 4);
insert into permission_role (role_id, permission_id) values (1, 5);
insert into permission_role (role_id, permission_id) values (1, 6);
insert into permission_role (role_id, permission_id) values (1, 7);
insert into permission_role (role_id, permission_id) values (2, 4);

insert into users(name,last_name,email,phone,username, password, enable, role_id) values ('Jenniffer','Granados','test@gmail.com','(503) 7714-8798','admin', '$2a$10$eGW9WJuDbUeEfAa060zptusUKtUWZIlra/SBBAG3hfR3Hfn1Y1Age', true, 1);
insert into users(name,last_name,email,phone,username, password, enable, role_id) values ('Jericho','Barrons','test2@gmail.com','(503) 7489-5478','barrons', '$2a$10$eGW9WJuDbUeEfAa060zptusUKtUWZIlra/SBBAG3hfR3Hfn1Y1Age', true, 1);

insert into table(capacity, description) values ('4','sala 1');
insert into table(capacity, description) values ('5','sala 3');
insert into table(capacity, description) values ('6','sala 2');