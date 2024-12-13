select c.name, SUM(p.amount) as sum 
from products as p, categories as C 
WHERE c.id=p.id_categories
GROUP by c.name
