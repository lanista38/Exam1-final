# You sql follows
#table creation follows
#create table Students(region STRING, distrito STRING, Sid INT, nombreEscuela STRING, nivelEs
#cuela STRING, sexo STRING, STid INT) row format delimited fields terminated by ',';

#create table escuelas(regionEducativa STRING, distritoEscolar STRING, municipio STRING, Escu
#ela_ID INT, Escuela_Nombre STRING, Nivel STRING, CollegeBoard_ID INT) row format delimited fields
#terminated by ',';


select e.regionEducativa, e.municipio, count(*) from students as s, escuelas as e where s.Sid = e.Escuela_ID group by e.regionEducativa, e.municipio;
select e.municipio, s.nivelEscuela, count(*) from students as s, escuelas as e where s.sid = e.Escuela_ID group by e.municipio, s.nivelEscuela;
select count(*) from students as s, escuelas as e where e.escuela_ID = s.sid and e.municipio = "Ponce" and e.nivel = "Superior" and s.sexo = "F";
select e.regionEducativa, e.distritoEscolar , e.municipio, count(*) from students as s, escuelas as e where s.sid = e.escuela_ID and s.sexo = "M" group by e.regionEducativa, e.distritoEscolar, e.municipio;
