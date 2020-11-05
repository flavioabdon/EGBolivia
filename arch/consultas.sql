/*Consulta si existe candEspecial*/
SELECT *
FROM geografia INNER JOIN candidaturaPresidente ON 
geografia.CODIGO_MESA = candidaturaPresidente.CODIGO_MESA 
INNER JOIN candidaturaUninominal ON 
geografia.CODIGO_MESA=candidaturaUninominal.CODIGO_MESA 
INNER JOIN candidaturaEspecial 
ON geografia.CODIGO_MESA=candidaturaUninominal.CODIGO_MESA 
WHERE geografia.CODIGO_MESA=27061 
AND candidaturaEspecial.CODIGO_MESA=27061;
/*Consulta si no existe candEspecial*/
use actas;
SELECT *
FROM geografia 
INNER JOIN candidaturaPresidente  ON geografia.CODIGO_MESA = candidaturaPresidente.CODIGO_MESA 
INNER JOIN candidaturaUninominal  ON geografia.CODIGO_MESA=candidaturaUninominal.CODIGO_MESA 
WHERE geografia.CODIGO_MESA=10001;
/**/
SELECT *
FROM geografia t1
inner JOIN candidaturaPresidente t2 ON t1.CODIGO_MESA = t2.CODIGO_MESA 
inner JOIN candidaturaUninominal t3 ON t1.CODIGO_MESA = t3.CODIGO_MESA
WHERE t1.CODIGO_MESA=10001;
/**/
use actas;
ALTER TABLE imagenes
    ADD CONSTRAINT `fk_relacion_img` FOREIGN KEY (CODIGO_MESA)
        REFERENCES geografia(CODIGO_MESA);
/*duplicados*/
SELECT CC,MAS_IPSP,CREEMOS, FPV, PAN_BOL, COUNT(*) Total
FROM candidaturaPresidente
GROUP BY CC, MAS_IPSP, CREEMOS,FPV,PAN_BOL
HAVING COUNT(*) > 1;
/**/
select * from cadidaturaPresidente where CODIGO_MESA=27136;
/*actas no disponibles 27136, 27248, 34187*/
/* subconsulta donde codigomesa coincide e 	n src imagenes*/
SELECT *
FROM
   imagenes
WHERE
   CODIGO_MESA
   IN
   (
   SELECT
   CODIGO_MESA
   FROM
   imagenes
   WHERE
   srcImagen LIKE '%.jpg'
);
/**/
SELECT *
FROM
   imagenes
WHERE
   CODIGO_MESA
   IN
   (
   SELECT
   CODIGO_MESA
   FROM
   imagenes
   WHERE
   srcImagen NOT LIKE '%.jpg';
)
/*Mas gana con el 100% */
SELECT *
FROM geografia t1
inner JOIN candidaturaPresidente t2 ON t1.CODIGO_MESA = t2.CODIGO_MESA 
WHERE g;

