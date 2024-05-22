-- 코드를 입력하세요
SELECT CATEGORY, SUM(B.sales)
FROM BOOK A left join BOOK_SALES B on A.BOOK_ID = B.BOOK_ID 
WHERE SALES_DATE LIKE "%2022-01%"
GROUP BY category
order by category ASC