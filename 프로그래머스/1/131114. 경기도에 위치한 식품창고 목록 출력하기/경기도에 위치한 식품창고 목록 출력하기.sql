-- 코드를 입력하세요
select WAREHOUSE_ID, WAREHOUSE_NAME, ADDRESS, COALESCE(FREEZER_YN, 'N') from FOOD_WAREHOUSE WHERE WAREHOUSE_NAME LIKE '%경기%';