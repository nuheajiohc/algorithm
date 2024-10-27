-- 코드를 작성해주세요
SELECT DISTINCT ID, EMAIL, FIRST_NAME, LAST_NAME FROM DEVELOPERS D
    JOIN SKILLCODES S ON D.SKILL_CODE & S.CODE = S.CODE
    WHERE CATEGORY LIKE "F%"
    ORDER BY ID ASC;