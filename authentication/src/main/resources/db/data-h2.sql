
DELETE FROM user;
INSERT INTO user (id, name,password,salt, age, email) VALUES
(1, 'test1','111','', 18, 'test1@baomidou.com'),
(2, 'test2','123','', 20, 'test2@baomidou.com'),
(3, 'test3', '142','',28, 'test3@baomidou.com'),
(4, 'test4','156','', 21, 'test4@baomidou.com'),
(5, 'test5','255','', 24, 'test5@baomidou.com');

DELETE FROM role;
INSERT INTO role (id, name,remark,create_time) VALUES
(1, 'admin','', '2019-5-30'),
(2, 'guest','', '2019-5-30'),
