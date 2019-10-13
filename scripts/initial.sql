CREATE table users(
    id int auto_increment primary key,
    email varchar(255) unique,
    username varchar(255),
    password varchar(60)
);