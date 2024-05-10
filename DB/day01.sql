-- <- 주석 
/*
 * 여러줄 주석   
*/

CREATE TABLE TBL_MEMBER(
	NAME VARCHAR2(30),
	AGE NUMBER
);

CREATE TABLE TBL_CAR(
	ID NUMBER,
	BRAND VARCHAR2(100),
	COLOR VARCHAR2(100),
	PRICE NUMBER,
	CONSTRAINT CAR_PK PRIMARY KEY(ID)
);
-- 테이블 삭제
-- DROP TABLE 테이블명;
DROP TABLE TBL_CAR;
DROP TABLE TBL_MEMBER;
--제약조건 삭제하기
-- ALTER TABLE 테이블명 DROP CONSTRAINT 제약조건명;
ALTER TABLE TBL_CAR DROP CONSTRAINT CAR_PK;

--제약조건 추가하기 ALTER TABLE 테이블명 ADD CONSTRAINT 제약조건명 제약조건종류(컬럼);
ALTER TABLE TBL_CAR ADD CONSTRAINT ABC PRIMARY KEY(ID);

CREATE TABLE TBL_ANIMAL(
	ID NUMBER PRIMARY KEY, 
	"TYPE" VARCHAR2(100),
	AGE NUMBER(2),
	FEED VARCHAR2(100)
);


