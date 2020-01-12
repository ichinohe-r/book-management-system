INSERT INTO book_info ( book_title, author, publisher, management_status, event_date_time, update_time ) VALUES (  'サンプル書籍', 'サンプルライター', 'サンプル出版社', 'alive', sysdate, sysdate );
INSERT INTO book_management_event ( event_id, book_management_number, event_info, record_date_time ) VALUES (  1, 1, 'entry', sysdate);
INSERT INTO book_info ( book_title, author, publisher, management_status, event_date_time, update_time ) VALUES (  'サンプル書籍２', 'サンプルライター２', 'サンプル出版社２', 'alive', sysdate, sysdate );
INSERT INTO book_management_event ( event_id, book_management_number, event_info, record_date_time ) VALUES (  2, 2, 'entry', sysdate);
INSERT INTO book_info ( book_title, author, publisher, management_status, event_date_time, update_time ) VALUES (  'サンプル書籍３', 'サンプルライター３', 'サンプル出版社３', 'alive', sysdate, sysdate );
INSERT INTO book_management_event ( event_id, book_management_number, event_info, record_date_time ) VALUES (  3, 3, 'entry', sysdate);