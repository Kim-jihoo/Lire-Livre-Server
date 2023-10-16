/**
  * User
  * user_id, user_name, user_password, user_nickname, user_email, user_birthday, user_gender, user_address
 */
INSERT INTO USER (user_id, user_name, user_password, user_nickname, user_email, user_birthday, user_gender, user_address)
    VALUES ('sieunp06', 'sieun', 'sieunPW', 'sieunNN', 'sieun@test.com', '2001-06-06', '여성', '경기도 수원시');
INSERT INTO USER (user_id, user_name, user_password, user_nickname, user_email, user_birthday, user_gender, user_address)
    VALUES ('jihooKim', 'jihoo', 'jihooPW', 'jihooNN', 'jihoo@test.com', '2001-11-06', '여성', '경기도 수원시');

/*
 * Category
 * category_id, category_name
 */
INSERT INTO CATEGORY (category_id, category_name)
    VALUES (1, 'fantasy');

/*
 * Book
 * category_id, book_name, book_author, book_page, book_publisher, author_comment, publisher_comment, publishing_date
 */
-- INSERT INTO BOOK (category_id, book_name, book_author, book_page, book_publisher, author_comment, publisher_comment, publishing_date)
--     VALUES ()
