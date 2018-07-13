
Cтандартное CRUD приложение, которое отображает список всех юзеров в базе. 
С возможностью их удаления, редактирования, добавления новых. И поиска по уже существующим.

Приложение работает с базой us, логин user, пароль password.

Запрос для создания таблицы находиться в файле createTable.sql
Запрос на заполнение её тестовыми данными в файле addUser.sql

После деплоя в Томкэт приложение будет доступно на стандартном адресе:
http://localhost:8080/

===========================
Используемые технологии:
- Maven
- Spring
- Hibernate
- Tomcat
- Mysql.

P.S
Перед запуском приложения нужно сначала под рутом зайти в mysql, создать базу test, пользователя user и дать ему все права на базу.
Это можно сделать так:
  # mysql -u root
  mysql> create database test character set utf8;
  mysql> CREATE USER 'user'@'localhost' IDENTIFIED BY 'password';
  mysql> grant all privileges on test.* to user@localhost identified by 'password';
  