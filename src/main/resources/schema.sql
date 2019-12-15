DROP TABLE IF EXISTS book_info;
CREATE TABLE book_info (
    system_book_management_number INT PRIMARY KEY AUTO_INCREMENT,
    isbn VARCHAR(17),
    book_title VARCHAR,
    author VARCHAR,
    event_date_time DATETIME
);

DROP TABLE IF EXISTS book_management_event;
CREATE TABLE book_management_event (
    entry_event_id INT PRIMARY KEY AUTO_INCREMENT,
    system_book_management_number INT,
    event_info VARCHAR,
    event_date_time DATETIME
);