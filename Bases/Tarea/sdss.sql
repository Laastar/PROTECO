select c.clave_grupo, c.cupo_maximo, p.nombre,h.dia_semana,h.hora_inicio,h.hora_fin
from asignatura a
inn er join curso c
on a.asignatura_id=c.asignatura_id
inner join profesor p
on c.profesor_id=p.profesor_id
inner join curso_horario ch
on c.curso_id=ch.curso_id
inner join horario h
on ch.horario_id=h.horario_id
inner join semestre s
on c.semestre_id=s.semestre_id
where a.nombre='CALCULO 2' and s.anio=2008 and s.periodo=1;



