SELECT 
        b.book_id,
        a.author_name,
        DATE_FORMAT(b.PUBLISHED_DATE, '%Y-%m-%d')
FROM BOOK b left join AUTHOR A ON b.AUTHOR_ID = A.AUTHOR_ID
WHERE b.category = '경제'
ORDER BY b.PUBLISHED_DATE;