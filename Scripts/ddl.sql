-- 개_쇼핑몰
DROP SCHEMA IF EXISTS `shoppingmall`;

-- 개_쇼핑몰
CREATE SCHEMA `shoppingmall`;

-- dog
CREATE TABLE `shoppingmall`.`dog` (
	`id`        INT          NOT NULL COMMENT '아이디', -- 아이디
	`kind`      VARCHAR(12)  NULL     COMMENT 'kind', -- kind
	`price`     INT          NULL     COMMENT 'price', -- price
	`image`     VARCHAR(20)  NOT NULL COMMENT 'image', -- image
	`country`   VARCHAR(12)  NOT NULL COMMENT 'country', -- country
	`height`    INT          NULL     COMMENT 'height', -- height
	`weight`    INT          NULL     COMMENT 'weight', -- weight
	`content`   VARCHAR(400) NULL     COMMENT 'content', -- content
	`readcount` INT          NULL     COMMENT 'readcount' -- readcount
)
COMMENT 'dog';

-- dog
ALTER TABLE `shoppingmall`.`dog`
	ADD CONSTRAINT `PK_dog` -- dog 기본키
		PRIMARY KEY (
			`id` -- 아이디
		);

ALTER TABLE `shoppingmall`.`dog`
	MODIFY COLUMN `id` INT NOT NULL AUTO_INCREMENT COMMENT '아이디';