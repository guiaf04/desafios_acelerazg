select c.name, ROUND((s.math*2 + s.specific*3 + s.project_plan*5)/10,2) as avg 
from candidate as c, score as s 
WHERE c.id=s.candidate_id
ORDER by avg DESC
