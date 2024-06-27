-- 코드를 입력하세요
SELECT book.book_id as '도서 ID', Date_FORMAT(published_date, '%Y-%m-%d') as '출판일' from book where year(published_date) = '2021' and category = '인문' order by book.published_date asc;