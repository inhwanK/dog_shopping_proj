SELECT * FROM dog;

SELECT id, kind, price, image, country, height, weight, content, readcount
FROM dog;

SELECT id, kind, price, image, country, height, weight, content, readcount
FROM shoppingmall.dog
WHERE id=5;

update dog set readcount = readcount +1 where id= ?;