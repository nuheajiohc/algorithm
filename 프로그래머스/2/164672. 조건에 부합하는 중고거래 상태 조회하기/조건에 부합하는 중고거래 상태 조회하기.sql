-- 2024-12-07
SELECT BOARD_ID, WRITER_ID, TITLE, PRICE, 
    CASE  
        WHEN STATUS='DONE' THEN "거래완료"
        WHEN STATUS='RESERVED' THEN "예약중"
        ELSE "판매중"
    END STATUS
    FROM USED_GOODS_BOARD
    WHERE CREATED_DATE = "2022-10-05"
    ORDER BY 1 DESC