-- 코드를 입력하세요
select fh.flavor
from first_half as fh
where total_order > 3000 and fh.flavor IN (select ii.flavor from ICECREAM_INFO as ii where INGREDIENT_TYPE = 'fruit_based');