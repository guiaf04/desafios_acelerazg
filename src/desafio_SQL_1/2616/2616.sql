SELECT c.id, c.name FROM customers as c
LEFt join locations as l 
on(c.id=l.id_customers)
where l.id_customers is NULL
