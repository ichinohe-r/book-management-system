DROP TABLE IF EXISTS book_info;
CREATE TABLE book_info (
    book_management_number INT PRIMARY KEY AUTO_INCREMENT,
    author VARCHAR,
    book_title VARCHAR,
    publisher VARCHAR,
    management_status VARCHAR,
    event_date_time DATETIME,
    update_time DATETIME
);

DROP TABLE IF EXISTS book_management_event;
CREATE TABLE book_management_event (
    event_id INT PRIMARY KEY AUTO_INCREMENT,
    book_management_number INT,
    event_info VARCHAR,
    record_date_time DATETIME
);