desc loggin;
desc stats;
-- TABLA LOGGIN ------------------------------------------------------------------------------------------------------
/* INSERTAR */
INSERT INTO loggin(nickname, contraseña, correo) 
VALUES ('usuario','usuario23','usuario@gmail.com')
;

/* MOSTRAR */
SELECT*FROM loggin; 

/* ACTUALIZAR */
UPDATE loggin SET nickname = 'chepe',contraseña = 'chepe33' WHERE id = 1;

/* ELIMINAR */
DELETE FROM loggin WHERE id = '9';

-- TABLA STATS ------------------------------------------------------------------------------------------------------
/* INSERTAR */
INSERT INTO stats(usuario, progreso, hrsJugadas) 
VALUES ('Cando','30%','100'),
('MIZI','80%','500'),
('Cando','10%','60')
;

/* MOSTRAR */
SELECT*FROM stats; 

/* ACTUALIZAR */
UPDATE stats SET progreso = '8%',hrsJugadas = '200' WHERE id = 2;

/* ELIMINAR */
DELETE FROM stats WHERE id = '3';
